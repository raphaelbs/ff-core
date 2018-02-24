package br.com.ecvtec.corelibrary.model;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;

public abstract class ControllerBdAplicacao<T> extends Controller<T> implements CRUD<T>{

	public ControllerBdAplicacao(Class<T> classOfT) {
		super(classOfT, new GenericDAOBdAplicacao<T>(classOfT));
	}
}
