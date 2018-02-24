package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBdAplicacao;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T6202;

@Path("T6202")
public class T6202Controller extends ControllerBdAplicacao<T6202> {

	public T6202Controller() {
		super(T6202.class);
	}

	@Override
	public void alterarAntesDoMerge(T6202 entidade, GenericDAO<T6202> dao) throws Exception{
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T6202> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
