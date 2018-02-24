package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T202;

@Path("T202")
public class T202Controller extends ControllerBd0<T202> {

	public T202Controller() {
		super(T202.class);
	}

	@Override
	public void alterarAntesDoMerge(T202 entidade, GenericDAO<T202> dao) throws Exception {
		entidade.setFilhos();
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T202> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
