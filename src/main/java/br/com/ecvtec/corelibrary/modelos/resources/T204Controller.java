package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T204;

@Path("T204")
public class T204Controller extends ControllerBd0<T204> {

	public T204Controller() {
		super(T204.class);
	}

	@Override
	public void alterarAntesDoMerge(T204 entidade, GenericDAO<T204> dao) throws Exception {
		entidade.setFilhos();
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T204> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
