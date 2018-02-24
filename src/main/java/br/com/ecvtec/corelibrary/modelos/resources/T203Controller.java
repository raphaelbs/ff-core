package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T203;

@Path("T203")
public class T203Controller extends ControllerBd0<T203> {

	public T203Controller() {
		super(T203.class);
	}

	@Override
	public void alterarAntesDoMerge(T203 entidade, GenericDAO<T203> dao) throws Exception {
		entidade.setFilhos();
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T203> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
