package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T201;

@Path("T201")
public class T201Controller extends ControllerBd0<T201> {

	public T201Controller() {
		super(T201.class);
	}

	@Override
	public void alterarAntesDoMerge(T201 entidade, GenericDAO<T201> dao) throws Exception {
		entidade.setFilhos();
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T201> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
