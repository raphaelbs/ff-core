package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T206;

@Path("T206")
public class T206Controller extends ControllerBd0<T206> {

	public T206Controller() {
		super(T206.class);
	}

	@Override
	public void alterarAntesDoMerge(T206 entidade, GenericDAO<T206> dao) throws Exception {
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T206> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
