package br.com.ecvtec.corelibrary.dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.core.MultivaluedMap;

import br.com.ecvtec.corelibrary.dao.QueryDAO.Parametros;
import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;

@SuppressWarnings("unchecked")
public class UtilitarioDAO {

	/**
	 * Busca query por Id e substitui os parametros enviados no controler.
	 * 
	 * @param queryNumero - id da query
	 * @param parametros - parametros enviados via query params.
	 * @return {@link QueryDAO}
	 * @throws SQLException 
	 */
	@SuppressWarnings("rawtypes")
	public static String getQueryPorId(HashMap<Integer, Blob> queryBuffer, int queryNumero,
			ParametrizarQuery substituidor) throws SQLException {
		
		StringBuilder sb = new StringBuilder();
		
		// Confere se a query já existe no buffer
		if (queryBuffer != null && queryBuffer.get(queryNumero) != null) 
			sb.append(blobToStringParametrizado(queryBuffer.get(queryNumero), substituidor));
		else
			new QueryDAO("SELECT c4_5501 FROM bd_0.t5501 WHERE c1_5501 = ?")
			.setParametros(new Parametros() {
				@Override
				public void setParametros(PreparedStatement pstm) throws SQLException {
					pstm.setInt(1, queryNumero);
				}
			})
			.setResultados(new Resultados() {
				@Override
				public String lerResultSet(ResultSet rs) throws SQLException {
					if (rs.next()) {
						if (queryBuffer != null)
							queryBuffer.put(queryNumero, rs.getBlob(1));
						sb.append(blobToStringParametrizado(rs.getBlob(1), substituidor));	
					}
					return null;
				}
			}).executar();

		return sb.toString();
	}

	/**
	 * {@link Pattern} do tipo a ser subistituido.
	 */
	private static Pattern pattern = Pattern.compile("(\\[[^\\]]+\\])");

	/**
	 * UTILIDADES Confere se há parâmetros faltantes.
	 * @param retorno
	 * @param query
	 * @return
	 * @throws SQLException 
	 */
	private static String faltandoParametros(String query) throws SQLException {
		String parametros = "Faltando parâmetros: ";
		boolean error = false;
		Matcher m = pattern.matcher(query);
		while (m.find()) {
			error = true;
			parametros += m.group();
		}
		if (error) throw new SQLException(parametros);
		return query;
	}

	/**
	 * UTILIDADES Converte Blob e substitui parâmetros da query.
	 * @param retorno
	 * @param blob
	 * @param parametros
	 * @return
	 * @throws SQLException 
	 */
	private static String blobToStringParametrizado(Blob blob, ParametrizarQuery substituidor) throws SQLException {
		String query = "";
		try {
			// Converte blob pra string e adiciona espaços
			query = new String(blob.getBytes(1, (int) blob.length()), "ISO-8859-1");
			// Substitui as variaveis
			query = substituidor.substituirVariaveis(query);
			// Confere pra ver se não faltou nenhum parametro
			return faltandoParametros(query);
		} catch (SQLException e) {
			throw new SQLException("Houve um erro de SQL: " + e.getMessage());
		} catch (UnsupportedEncodingException eio) {
			throw new SQLException("Houve um erro ao ler o blob como string.");
		} catch (IOException e) {
			throw new SQLException("Houve um erro ao substituir as variaveis");
		}
	}

	/**
	 * Deixa livre a implementação da interpretação dos parâmetros lidos na
	 * query do banco.
	 * 
	 * @author Raphael Brandão
	 */
	public interface ParametrizarQuery {
		public String substituirVariaveis(String query) throws IOException;
	}

	/**
	 * Implementa uma chamada do {@link ParametrizarQuery} utilizando o
	 * {@link MultivaluedMap}.
	 * 
	 * @param parametros
	 * @return {@link String}
	 */
	public static ParametrizarQuery multivaluedMap(MultivaluedMap<String, String> parametros) {
		return new ParametrizarQuery() {
			@Override
			public String substituirVariaveis(String query) throws IOException {
				for (String parametro : parametros.keySet()) {
					query = query.replaceAll("\\[" + parametro + "\\]", " " + parametros.getFirst(parametro) + " "); // TODO verificar o replace com outros tipos, especialmente date
				}
				return query;
			}
		};
	}

	/**
	 * Implementa uma chamada do {@link ParametrizarQuery} utilizando o
	 * {@link HashMap}.
	 * 
	 * @param parametros
	 * @return {@link String}
	 */
	public static <K, V> ParametrizarQuery hashMap(HashMap<K, V> parametros) {
		return new ParametrizarQuery() {
			@Override
			public String substituirVariaveis(String query) throws IOException {
				for (K parametro : parametros.keySet()) {
					query = query.replaceAll("\\[" + parametro + "\\]", " " + parametros.get(parametro) + " ");
				}
				return query;
			}
		};
	}

}
