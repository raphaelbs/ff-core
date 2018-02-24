package br.com.ecvtec.corelibrary.dao;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import br.com.ecvtec.corelibrary.formulario.Formulario;
import br.com.ecvtec.corelibrary.formulario.FormularioComponente;
import br.com.ecvtec.corelibrary.formulario.FormularioComponenteFactory;
import br.com.ecvtec.corelibrary.formulario.FormularioDetalheFactory;
import br.com.ecvtec.corelibrary.formulario.FormularioDetalheFactory.Define;
import br.com.ecvtec.corelibrary.formulario.FormularioDetalheValidacao;
import br.com.ecvtec.corelibrary.formulario.FormularioFactory;
import br.com.ecvtec.corelibrary.formulario.FormularioGuia;
import br.com.ecvtec.corelibrary.formulario.FormularioGuiaFactory;
import br.com.ecvtec.corelibrary.formulario.FormularioTela;
import br.com.ecvtec.corelibrary.formulario.FormularioTelaFactory;
import br.com.ecvtec.corelibrary.model.GeradorDeArquivo;
import br.com.ecvtec.corelibrary.model.ObjetoJson;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.VetorJson;

public class FormularioDAO {
	
	public static final Define POSICAO = new Define() {
		@Override
		public void noPai(FormularioComponente componente, ObjetoJson dados) {
			componente.setPosicao(dados);
		}
	};
	public static final Define PREPARACAO = new Define() {
		@Override
		public void noPai(FormularioComponente componente, ObjetoJson dados) {
			componente.setPreparacao(dados);
		}
	};
	public static final Define ORDEM = new Define() {
		@Override
		public void noPai(FormularioComponente componente, ObjetoJson dados) {
			componente.setOrdem(dados);
		}
	};
	public static final Define OFFSET = new Define() {
		@Override
		public void noPai(FormularioComponente componente, ObjetoJson dados) {
			componente.setOffset(dados);
		}
	};
	public static final Define DETALHAMENTO = new Define() {
		@Override
		public void noPai(FormularioComponente componente, ObjetoJson dados) {
			componente.setDetalhamento(dados);
		}
	};
	
	/**
	 * Busca formulário por ID;
	 * @param retorno - {@link Retorno}
	 * @param queryNumero - id da query
	 * @param parametros - parametros enviados via query params.
	 * @return {@link Retorno}
	 * @throws SQLException 
	 * @throws NumberFormatException 
	 */
	public static Retorno getFormularioPorId(Retorno retorno, MultivaluedMap<String,String> parametros, String fileSystemPath) throws SQLException, NumberFormatException {
		HashMap<Integer, Blob> queryBuffer = new HashMap<>();
		long t = new Date().getTime();
		
		System.out.print("Buscando formulário... ");
		// Busca e executa query das informações do formulário
		FormularioFactory formularioFactory = new FormularioFactory(queryBuffer, UtilitarioDAO.multivaluedMap(parametros));
		final Formulario formulario = formularioFactory.executar();
		System.out.println("ok");
		
		System.out.print("Buscando componentes crud... ");
		String query = UtilitarioDAO.getQueryPorId(queryBuffer, 25, UtilitarioDAO.multivaluedMap(parametros));
		formulario.setCrud(new QueryDAO<VetorJson>(query)
				.setResultados(MapeamentoQueryObjetos.mapearQueryParaVetorJson)
				.executar());
		System.out.println("ok");
		
		System.out.print("Buscando telas... ");
		// Busca e executa query das telas do formulário
		new FormularioTelaFactory(formulario, queryBuffer, UtilitarioDAO.multivaluedMap(parametros)).executar();
		System.out.println("ok");
		
		HashMap<String, Object> param = new HashMap<>();
		param.put("banco", parametros.getFirst("banco"));
		param.put("tipo_idioma", Integer.valueOf(parametros.getFirst("tipo_idioma")));
		
		// Busca e insere as querys de guias na fila assincrona de execução
		System.out.print("Buscando telas async... ");
		List<FormularioGuiaFactory> guiaFactorys = new ArrayList<>();
		for(FormularioTela tela : formulario.getTelas()){
			param.put("id_tela", tela.getId());
			FormularioGuiaFactory fgf = new FormularioGuiaFactory(tela, queryBuffer, UtilitarioDAO.hashMap(param));
			fgf.assincrono();
			guiaFactorys.add(fgf);
		}
		// Pega o resultado assincrono das querys de guias
		for(FormularioGuiaFactory guiaFactory : guiaFactorys) {
			guiaFactory.getResultadoDoFuturo();
			System.out.print("ok ");
		}
		param.remove("id_tela");
			
		// Busca e insere as querys de componentes na fila assincrona de execução
		System.out.print("\nBuscando componentes... ");
		List<FormularioComponenteFactory> componenteFactorys = new ArrayList<>();
		for(FormularioTela tela : formulario.getTelas()){
			for(FormularioGuia guia : tela.getGuias()){
				param.put("id_aba", guia.getId());
				FormularioComponenteFactory fcf = new FormularioComponenteFactory(guia, queryBuffer, UtilitarioDAO.hashMap(param));
				fcf.assincrono();
				componenteFactorys.add(fcf);
			}
		}
		// Pega o resultado assincrono das querys de componentes
		for(FormularioComponenteFactory componenteFactory : componenteFactorys) {
			componenteFactory.getResultadoDoFuturo();
			System.out.print("ok ");
		}
		param.remove("id_aba");
		
		System.out.println(new Date().getTime()-t);
		System.out.print("\nBuscando detalhes dos componentes... ");
		// Busca e executa query dos detalhes dos componentes das guias das telas do formulário
		List<FormularioDetalheFactory> detalheFactorys = new ArrayList<>();
		for(FormularioTela tela : formulario.getTelas()){
			for(FormularioGuia guia : tela.getGuias()){
				for(FormularioComponente componente : guia.getCampos()){
					param.put("id_componente", componente.getId());
					
					// busca posição do componente
					buscaDetalheComponente(param, Tipos_Query.POSICAO,
							componente, Tipos_Query.LISTA_POSICAO_POR_COMPONENTE, 
							queryBuffer, POSICAO, detalheFactorys);
					
					// busca preparação do componente
					buscaDetalheComponente(param, Tipos_Query.PREPARACAO, 
							componente, Tipos_Query.LISTA_POSICAO_POR_COMPONENTE, 
							queryBuffer, PREPARACAO, detalheFactorys);
					
					// busca ordem do componente
					buscaDetalheComponente(param, Tipos_Query.ORDEM, 
							componente, Tipos_Query.LISTA_POSICAO_POR_COMPONENTE, 
							queryBuffer, ORDEM, detalheFactorys);
					
					// busca offset do componente
					buscaDetalheComponente(param, Tipos_Query.OFFSET, 
							componente, Tipos_Query.LISTA_POSICAO_POR_COMPONENTE, 
							queryBuffer, OFFSET, detalheFactorys);
					
					// busca validação do componente
					param.put("tipo_posicao", Tipos_Query.VALIDACAO);
					FormularioDetalheValidacao fdv = new FormularioDetalheValidacao(componente, queryBuffer, UtilitarioDAO.hashMap(param));
					fdv.assincrono();
					detalheFactorys.add(fdv);

					// busca detalhamento do componente
					buscaDetalheComponente(param, 0, 
							componente, Tipos_Query.LISTA_DETALHAMENTO_POR_COMPONENTE, 
							queryBuffer, DETALHAMENTO, detalheFactorys);
				}
			}
		}
		for(FormularioDetalheFactory detalheFactory : detalheFactorys) {
			detalheFactory.getResultadoDoFuturo();
			System.out.print("ok ");
		}
		param.remove("id_componente");
		System.out.println("\nTerminado");
	
		long validade = parametros.getFirst("validade") != null ? Long.valueOf(parametros.getFirst("validade")) : 300000;
		formulario.setValidade(validade); //5min
		GeradorDeArquivo.salvarJSON(fileSystemPath, 
				parametros.getFirst("id_form") + "-" + parametros.getFirst("tipo_idioma") + "-" + parametros.getFirst("banco"), 
				formulario);
		retorno.setRetorno(formulario);
		return retorno;
	}
	
	/**
	 * Facilita a busca dos detalhes do componente.
	 * @param param
	 * @param tipoBuscado
	 * @param componente
	 * @param queryId
	 * @param queryBuffer
	 * @param define
	 * @param detalheFactorys
	 * @throws SQLException
	 */
	private static void buscaDetalheComponente(HashMap<String, Object> param, int tipoBuscado, 
			FormularioComponente componente, int queryId,
			HashMap<Integer, Blob> queryBuffer, Define define, List<FormularioDetalheFactory> detalheFactorys) throws SQLException{
		param.put("tipo_posicao", tipoBuscado);
		FormularioDetalheFactory fdf = new FormularioDetalheFactory(componente, queryId, queryBuffer, 
				UtilitarioDAO.hashMap(param), define);
		fdf.assincrono();
		detalheFactorys.add(fdf);
	}

}