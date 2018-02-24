package br.com.ecvtec.corelibrary.modelos.resources;

import javax.persistence.Query;
import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.dao.GenericDAO.Complemente;
import br.com.ecvtec.corelibrary.model.ControllerBd0;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T5002;

@Path("T5002")
public class T5002Controller extends ControllerBd0<T5002> {

	public T5002Controller() {
		super(T5002.class);
	}

	@Override
	public void alterarAntesDoMerge(T5002 entidade, GenericDAO<T5002> dao) throws Exception{
		if(entidade.getC3_5002() > 0) return;
		int id5001 = entidade.getC2_5002_5001().getC1_5001();
		String query = "SELECT A FROM T5002 A WHERE A.c2_5002_5001.c1_5001 = :id5001 ORDER BY A.c3_5002 DESC";
		T5002 ultimoDoTipo = dao.buscarObjetoDeHQL(query, new Complemente() {
			@Override
			public void estaQuery(Query query) {
				query.setParameter("id5001", id5001);
				query.setMaxResults(1);
			}
		});
		int c1 = id5001*100 + 1;
		int c3 = 1;
		if(ultimoDoTipo != null){
			c1 = ultimoDoTipo.getC1_5002() + 1;
			c3 = ultimoDoTipo.getC3_5002() + 1;
		}
		entidade.setC1_5002(c1);
		entidade.setC3_5002(c3);
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T5002> dao, UriInfo info) throws Exception{
		retorno.setRetorno(dao.getList());
	}

}
