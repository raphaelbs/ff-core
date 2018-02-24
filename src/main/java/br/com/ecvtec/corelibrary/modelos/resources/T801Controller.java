package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T801;

@Path("T801")
public class T801Controller extends ControllerBd0<T801> {

	public T801Controller() {
		super(T801.class);
	}

	@Override
	public void alterarAntesDoMerge(T801 entidade, GenericDAO<T801> dao) throws Exception{
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T801> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
