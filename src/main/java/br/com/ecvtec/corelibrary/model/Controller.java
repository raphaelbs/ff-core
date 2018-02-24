package br.com.ecvtec.corelibrary.model;

import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;

public abstract class Controller<T> implements CRUD<T>{
	
	private final Class<T> classOfT;
	private final GenericDAO<T> dao;
	
	public Controller(Class<T> classOfT, GenericDAO<T> dao){
		this.classOfT = classOfT;
		this.dao = dao;
	}
	
	interface Proteger{
		void resposta(Retorno r) throws Exception;
	}
	
	/**
	 * Método padrão para executar as rotas.
	 * Encapsula o try para tratar o erro de forma genérica.
	 * @return {@link Retorno}
	 */
	private Retorno executar(String operacao, Proteger proteger){
		Retorno r = new Retorno();
		r.setOperacao(operacao + "_" + classOfT.getSimpleName());
		try {
			proteger.resposta(r);
			r.setResultadoOperacao(ResultadoOperacao.SUCESSO.toString());
		} catch (Exception e) {
			r.setErro(e.getMessage());
			r.setResultadoOperacao(ResultadoOperacao.ERRO.toString());
		}
		return r;
	}

	public abstract void alterarAntesDoMerge(T entidade, GenericDAO<T> dao) throws Exception;
	
	public Retorno responsePOST(T entidade, UriInfo info) {
		return executar("POST", new Proteger() {
			@Override
			public void resposta(Retorno r) throws Exception {
				alterarAntesDoMerge(entidade, dao);
				T ent = dao.atualizar(entidade);
				r.setRetorno(ent);
			}
		});
	}
	
	/**
	 * Método responsável por abstrair a ação de buscar todos os registros.
	 * Caso {@link Retorno#getRetorno()} for <b>null</b> será feita uma busca geral
	 * em todos os registros do tipo em questão.
	 * @param retorno
	 * @param dao
	 * @param info
	 * @throws Exception
	 */
	public abstract void responseGET(Retorno retorno, GenericDAO<T> dao, UriInfo info)
		throws Exception;
	
	
	public Retorno responseGET(UriInfo info) {
		return executar("GET", new Proteger() {
			@Override
			public void resposta(Retorno r) throws Exception {
				responseGET(r, dao, info);
				if(r.getRetorno() == null)
					r.setRetorno(dao.getList());
			}
		});
	}

	public Retorno responseGETID(int id, UriInfo info) {
		return executar("GET_ID", new Proteger() {
			@Override
			public void resposta(Retorno r) throws Exception {
				r.setRetorno(dao.encontrar(id));
			}
		});
	}

	public Retorno responseDELETE(T entidade, UriInfo info) {
		return executar("DELETE_ENTIDADE", new Proteger() {
			@Override
			public void resposta(Retorno r) throws Exception {
				dao.remover(entidade);
			}
		});
	}

	public Retorno responseDELETE(int id, UriInfo info) {
		return executar("DELETE_ID", new Proteger() {
			@Override
			public void resposta(Retorno r) throws Exception {
				dao.remover(id);
			}
		});
	}
}
