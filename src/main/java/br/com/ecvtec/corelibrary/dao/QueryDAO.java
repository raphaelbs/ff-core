package br.com.ecvtec.corelibrary.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.com.ecvtec.corelibrary.util.ConfigPropHelper;

/**
 * Classe responsável por executar querys de forma responsável.
 * A instância dessa classe pode ser atribuida para execução assincrona através do 
 * método estático {@link QueryDAO#multiQuerys(List)}.
 * 
 * @author Raphael Brandão
 */
public class QueryDAO <T> implements Callable<T>{
	
	private String query;
	protected Parametros parametros;
	protected Resultados<T> resultados;
	protected Future<T> future;
	protected T resultado;
	
	private QueryDAO(){}
	
	public QueryDAO(String query){
		this();
		this.query = query;
	}
	
	/**
	 * Busca query na T5501 por ID e prepara este {@link QueryDAO} para executar a query.
	 * @param queryId
	 * @throws SQLException
	 */
	public QueryDAO(int queryId) throws SQLException{
		QueryDAO<String> qd = new QueryDAO<String>(getQueryPorId(String.valueOf(queryId)));
		this.query = qd.executar();
	}
	
	/**
	 * Expõe o {@link PreparedStatement} através da interface {@link Parametros}.
	 * @param parametros
	 */
	public QueryDAO<T> setParametros(Parametros parametros) {
		this.parametros = parametros;
		return this;
	}
	/**
	 * Mapeia o {@link ResultSet} e retorna o objeto na chamada da função {@link QueryDAO#executar()}.
	 * @param resultados
	 */
	public QueryDAO<T> setResultados(Resultados<T> resultados) {
		this.resultados = resultados;
		return this;
	}
	/**
	 * Executa a query criada e realiza as ações com base nas interfaces definidas.<br>
	 * Se o método {@link QueryDAO#setResultados(Resultados)} tiver sido implementado, o retorno 
	 * deste método será o mapeamento, caso contrário será <b>null</b>.
	 * @return
	 * @throws SQLException
	 */
	public T executar() throws SQLException{
		Connection conn = Conexao.buscarDoPooling();
		PreparedStatement pstm = conn.prepareStatement(query);
		if (parametros != null)
			parametros.setParametros(pstm);
		ResultSet rs = pstm.executeQuery();
		if(resultados != null)
			this.resultado = resultados.lerResultSet(rs);
		rs.close();
		pstm.close();
		conn.close();
		return this.resultado;
	}
	
	/**
	 * Envia a query para ser executada em uma thread separada.
	 * Retorna um {@link Future} com a promessa da resposta.<br>
	 * Chame {@link Future#get()} para buscar a resposta.
	 * @return {@link Future}
	 * @throws SQLException
	 */
	public Future<T> assincrono() throws SQLException{
		initExecutors();
		return this.future = executors.submit(this);
	}
	
	
	/**
	 * Retorna a promessa da query se o método {@link QueryDAO#assincrono()} já estiver sido chamado, 
	 * caso contrário irá retornar <b>null</b>.
	 * @return {@link Future}
	 */
	public Future<T> getFuture() {
		return future;
	}

	/**
	 * Retorna o resultado da query caso a query já tenha sido realizada (tanto síncrona ou assincrona),
	 * caso contrário irá retornar <b>null</b>.
	 * @return {@link T}
	 */
	public T getResultado() {
		return resultado;
	}

	/**
	 * Retorna o resultado da query caso a query já tenha sido realizada (tanto síncrona ou assincrona),
	 * caso contrário irá retornar <b>null</b>.
	 * @return {@link T}
	 * @throws SQLException 
	 */
	public T getResultadoDoFuturo() throws SQLException {
		try {
			return future.get();
		} catch (InterruptedException | ExecutionException e) {
			throw new SQLException(e.getMessage());
		} catch (NullPointerException npe){
			throw new SQLException("Houve uma tentativa de buscar o resultado futuro de uma query porém a query não foi "
					+ "executada utilizando o método assincrono().");
		}
	}
	
	/**
	 * Busca query por Id.
	 * 
	 * @param queryNumero - id da query
	 * @return {@link QueryDAO}
	 * @throws SQLException 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String getQueryPorId(String queryNumero) throws SQLException {
		
		StringBuilder sb = new StringBuilder();
		
		new QueryDAO("SELECT c4_5501 FROM bd_0.t5501 WHERE c1_5501 = ?")
		.setParametros(new Parametros() {
			@Override
			public void setParametros(PreparedStatement pstm) throws SQLException {
				pstm.setString(1, queryNumero);
			}
		})
		.setResultados(new Resultados() {
			@Override
			public String lerResultSet(ResultSet rs) throws SQLException {
				if (rs.next()) {
					BufferedReader br = new BufferedReader(
							new InputStreamReader(rs.getBlob(1).getBinaryStream()));
					try {
						String aux;
						while ((aux = br.readLine()) != null) {
							sb.append(aux);
						}
					} catch (IOException e) {
						throw new SQLException(e.getMessage());
					}
						
				}
				return null;
			}
		}).executar();

		return sb.toString();
	}


	/**
	 * Gerenciador de threads para execução de multiquerys.
	 */
	private static ExecutorService executors;
	
	/**
	 * Inicializa o pool de threads internamente no mesmo tamanho do pool de conexões do {@link Conexao}.
	 * @throws SQLException
	 */
	private static void initExecutors() throws SQLException{
		if(executors == null){
			String maximoConexoes;
			try {
				maximoConexoes = ConfigPropHelper.getValorPropriedadePorNome("maximoConexoes");
			} catch (IOException e) {
				throw new SQLException("Arquivo de configuracoes nao foi encontrado." + e.getMessage());
			}
			int qtd = 5;
			if(maximoConexoes != null) qtd = Integer.valueOf(maximoConexoes);
			executors = Executors.newFixedThreadPool(qtd);
		}
	}
	
	
	@Override
	public T call() throws Exception {
		return executar();
	}
	
	
	/**
	 * Interface responsável por expor o {@link PreparedStatement} para
	 * parametrização da query.
	 * 
	 * @author Raphael Brandão
	 */
	public interface Parametros {
		public void setParametros(PreparedStatement pstm) throws SQLException;
	}
	
	/**
	 * Interface para permitir a conversão do result set em qualquer tipo de
	 * lista desejado.
	 * @author Raphael Brandão
	 * @param <T>
	 */
	public interface Resultados<T>{
		public T lerResultSet(ResultSet rs) throws SQLException;
	}
}
