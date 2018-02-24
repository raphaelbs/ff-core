package br.com.ecvtec.corelibrary.dao;

public class GenericDAOBd0<T> extends GenericDAO<T>{
	
	public GenericDAOBd0() {
		super(PERSISTENCE_UNIT.BD_0);
	}

	public GenericDAOBd0(Class<T> persistedClass) {
		super(PERSISTENCE_UNIT.BD_0, persistedClass);
	}	
}