package br.com.ecvtec.corelibrary.modelos.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.Path;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.GenericDAO;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO;
import br.com.ecvtec.corelibrary.model.ControllerBdAplicacao;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.T1001;
import br.com.ecvtec.corelibrary.model.T1002;
import br.com.ecvtec.corelibrary.model.T1003;
import br.com.ecvtec.corelibrary.model.T1004;
import br.com.ecvtec.corelibrary.model.T1005;
import br.com.ecvtec.corelibrary.model.T1006;
import br.com.ecvtec.corelibrary.model.T1007;
import br.com.ecvtec.corelibrary.model.T1008;

@Path("T1001")
public class T1001Controller extends ControllerBdAplicacao<T1001> {

	public T1001Controller() {
		super(T1001.class);
	}

	@Override
	public void alterarAntesDoMerge(T1001 entidade, GenericDAO<T1001> dao)  throws Exception{
		// Busca array de t1003s
		Set<T1003> t1003s = entidade.getT1003C2();
		if(t1003s == null) {
			t1003s = new HashSet<>();
			entidade.setT1003C2(t1003s);
		}else{
			for (T1003 t1003 : t1003s)
				t1003.setC2_1003_1001(entidade);
		}
		// Busca array de t1004s
		Set<T1004> t1004s = entidade.getT1004C2();
		if(t1004s == null) {
			t1004s = new HashSet<>();
			entidade.setT1004C2(t1004s);
		}else{
			for (T1004 t1004 : t1004s)
				t1004.setC2_1004_1001(entidade);
		}
		// Busca array de t1005s
		Set<T1005> t1005s = entidade.getT1005C2();
		if(t1005s == null) {
			t1005s = new HashSet<>();
			entidade.setT1005C2(t1005s);
		}else{
			for (T1005 t1005 : t1005s)
				t1005.setC2_1005_1001(entidade);
		}
		// Busca array de t1006s
		Set<T1006> t1006s = entidade.getT1006C2();
		if(t1006s == null) {
			t1006s = new HashSet<>();
			entidade.setT1006C2(t1006s);
		}else{
			for (T1006 t1006 : t1006s)
				t1006.setC2_1006_1001(entidade);
		}
		// Busca array de t1007s
		Set<T1007> t1007s = entidade.getT1007C2();
		if(t1007s == null) {
			t1007s = new HashSet<>();
			entidade.setT1007C2(t1007s);
		}else{
			for (T1007 t1007 : t1007s)
				t1007.setC2_1007_1001(entidade);
		}
		// Busca array de t1008s
		Set<T1008> t1008s = entidade.getT1008C2();
		if(t1008s == null) {
			t1008s = new HashSet<>();
			entidade.setT1008C2(t1008s);
		}else{
			for (T1008 t1008 : t1008s)
				t1008.setC2_1008_1001(entidade);
		}
	
		// Insere referencia T1001 em T1003, t1004 e t1005
		for (T1002 t1002 : entidade.getT1002C2()) {
			if (t1002.getT1003C3() != null)
				for (T1003 t1003 : t1002.getT1003C3()){
					t1003s.add(t1003);
					t1003.setC2_1003_1001(entidade);
				}
			if (t1002.getT1004C3() != null)
				for (T1004 t1004 : t1002.getT1004C3()){
					t1004s.add(t1004);
					t1004.setC2_1004_1001(entidade);
				}
			if (t1002.getT1005C3() != null)
				for (T1005 t1005 : t1002.getT1005C3()){
					t1005s.add(t1005);
					t1005.setC2_1005_1001(entidade);
				}
		}
	}

	@Override
	public void responseGET(Retorno retorno, GenericDAO<T1001> dao, UriInfo info) throws Exception{
		String queryId = info.getQueryParameters().getFirst("queryId");
		String tipoT1001 = info.getQueryParameters().getFirst("tipoT1001");
		if(queryId==null) throw new Exception("Faltando parâmetros: [queryId]");
		if(tipoT1001==null) throw new Exception("Faltando parâmetros: [tipoT1001]");
		String query = UtilitarioDAO.getQueryPorId(null, Integer.valueOf(queryId), UtilitarioDAO.multivaluedMap(info.getQueryParameters()));
		retorno.setRetorno(dao.buscarListaDeHQL(query));
	}

}
