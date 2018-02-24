package br.com.ecvtec.corelibrary.modelos.resources;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.model.ControllerBdAplicacao;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T6201;
import br.com.ecvtec.corelibrary.model.T6202;
import br.com.ecvtec.corelibrary.model.T6206;

@Path("T6201")
public class T6201Controller extends ControllerBdAplicacao<T6201> {

	public T6201Controller() {
		super(T6201.class);
	}

	@Override
	public void alterarAntesDoMerge(T6201 entidade, GenericDAO<T6201> dao) throws Exception{
		if(entidade.getT6202C2() != null)
			for(T6202 t6202 : entidade.getT6202C2())
				t6202.setC2_6202_6201(entidade);
		
		if(entidade.getT6206C2() != null)
			for(T6206 t6206 : entidade.getT6206C2())
				t6206.setC2_6206_6201(entidade);
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T6201> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
