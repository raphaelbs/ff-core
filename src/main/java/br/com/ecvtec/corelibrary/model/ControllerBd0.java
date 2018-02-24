package br.com.ecvtec.corelibrary.model;

import br.com.ecvtec.corelibrary.dao.GenericDAOBd0;

public abstract class ControllerBd0<T> extends Controller<T> implements CRUD<T>{

	public ControllerBd0(Class<T> classOfT) {
		super(classOfT, new GenericDAOBd0<T>(classOfT));
	}
}
