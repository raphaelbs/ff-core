package br.com.ecvtec.corelibrary.dao;

public class GenericDAOBdAplicacao<T> extends GenericDAO<T>{

	public GenericDAOBdAplicacao() {
		super(PERSISTENCE_UNIT.BD_APLICACAO);
	}

	public GenericDAOBdAplicacao(Class<T> persistedClass) {
		super(PERSISTENCE_UNIT.BD_APLICACAO, persistedClass);
	}		
}