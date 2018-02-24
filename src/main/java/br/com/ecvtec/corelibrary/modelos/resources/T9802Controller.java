package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T9802;

@Path("T9802")
public class T9802Controller extends ControllerBd0<T9802> {

	public T9802Controller() {
		super(T9802.class);
	}

	@Override
	public void alterarAntesDoMerge(T9802 entidade, GenericDAO<T9802> dao) throws Exception{
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T9802> dao, UriInfo info) throws Exception{
		String query = "SELECT A FROM T9802 A WHERE A.c2_9802_9801.c1_9801 = 4 order by A.c5_9802_9802 DESC, A.c7_9802";
		retorno.setRetorno(dao.buscarListaDeHQL(query));
	}

}
