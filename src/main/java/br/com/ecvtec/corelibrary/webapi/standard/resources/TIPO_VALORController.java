package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.ENUM_FLAG;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.TIPO;
import br.com.ecvtec.corelibrary.model.TIPO_VALOR;
import br.com.ecvtec.corelibrary.util.Serializacao;

@Path("TIPO_VALOR")
public class TIPO_VALORController {

	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGET() {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO_VALOR");

		try {
			GenericDAOBdAplicacao<TIPO_VALOR> dao = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);
			r.setRetorno(dao.getList());
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGET(@PathParam(value = "id") int id) {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO_VALOR");

		try {
			GenericDAOBdAplicacao<TIPO_VALOR> dao = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);
			r.setRetorno(dao.encontrar(id));
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}

	@GET
	@Path("PORTIPO/{idTipo}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETPorTipo(@PathParam(value = "idTipo") int id) {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO_VALOR_POR_TIPO");
		try {
			GenericDAOBdAplicacao<TIPO> tipoDAO = new GenericDAOBdAplicacao<>(TIPO.class);
			Set<TIPO_VALOR> listaTipoValor = tipoDAO.encontrar(id).getTIPO_DE_TIPO_TIPO_VALORs();
			r.setRetorno(listaTipoValor);
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED + "; charset=utf-8")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responsePOST(String entidade) {

		Retorno r = new Retorno();
		r.setOperacao("POST_TIPO_VALOR");

		try {
			Map<String, Object> modelView = Serializacao.getMapFromJSON(entidade);

			GenericDAOBdAplicacao<TIPO_VALOR> dao = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);

			StringBuilder queryHQL = new StringBuilder();
			queryHQL.append("select max(TV.CHAVE_DO_TIPO) ");
			queryHQL.append("from TIPO_VALOR as TV ");
			queryHQL.append(" where TV.TIPO_DE_TIPO.ID__CHAVE_SEQUENCIAL = ");
			queryHQL.append(modelView.get("TIPO"));
			queryHQL.append(" group by TV.TIPO_DE_TIPO.ID__CHAVE_SEQUENCIAL ");
			Integer proximaChave = (Integer) new GenericDAOBdAplicacao<Integer>(Integer.class).buscarObjetoDeHQL(queryHQL.toString());
			proximaChave = (proximaChave != null ? proximaChave : 0);

			int idPai = Integer.parseInt(modelView.get("TIPO").toString());
			TIPO tipoPai = new GenericDAOBdAplicacao<TIPO>(TIPO.class).encontrar(idPai);

			TIPO_VALOR instance = new TIPO_VALOR();
			instance.setDESCRICAO(modelView.get("DESCRICAO").toString());
			instance.setCHAVE_DO_TIPO(proximaChave + 1);

			String idConcat = (String.format("%d0", idPai)
					+ String.valueOf(proximaChave + 1));
			instance.setID__CHAVE_SEQUENCIAL(Integer.valueOf(idConcat));

			if (modelView.get("TIPO") == null) {
				instance.setTIPO_SISTEMA(dao.encontrar(ENUM_FLAG.NAO.valor));
			} else {
				instance.setTIPO_SISTEMA(dao.encontrar(Integer.valueOf(modelView.get("TIPO_DE_TIPO_ID").toString())));
			}

			instance.setTIPO_DE_TIPO(tipoPai);

			r.setRetorno(dao.salvar(instance));
			r.setResultadoOperacao("SUCESSO");

		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro("{ \"mensagem\" : \"" + e.getMessage() + "\" }");
		}
		return Response.status(Status.OK).entity(r).build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED + "; charset=utf-8")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responsePUT(String entidade) {
		Retorno r = new Retorno();
		r.setOperacao("POST_TIPO_VALOR");

		try {
			Map<String, Object> modelView = Serializacao.getMapFromJSON(entidade);

			GenericDAOBdAplicacao<TIPO_VALOR> dao = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);

			Integer idPai = Integer.parseInt(modelView.get("TIPO").toString());
			TIPO tipoPai = new GenericDAOBdAplicacao<TIPO>(TIPO.class).encontrar(idPai);

			TIPO_VALOR instance = new TIPO_VALOR();
			instance.setDESCRICAO(modelView.get("DESCRICAO").toString());
			instance.setCHAVE_DO_TIPO(Integer.parseInt(modelView.get("CHAVE_DO_TIPO").toString()));
			instance.setID__CHAVE_SEQUENCIAL(Integer.parseInt(modelView.get("ID__CHAVE_SEQUENCIAL").toString()));

			if (modelView.get("TIPO") == null) {
				instance.setTIPO_SISTEMA(dao.encontrar(ENUM_FLAG.NAO.valor));
			} else {
				instance.setTIPO_SISTEMA(dao.encontrar(Integer.valueOf(modelView.get("TIPO_DE_TIPO_ID").toString())));
			}

			instance.setTIPO_DE_TIPO(tipoPai);

			r.setRetorno(dao.salvar(instance));
			r.setResultadoOperacao("SUCESSO");

		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro("{ \"mensagem\" : \"" + e.getMessage() + "\" }");
		}
		return Response.status(Status.OK).entity(r).build();
	}

	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseDELETE(@PathParam("id") int id) {
		Retorno r = new Retorno();
		r.setOperacao("DELETE_TIPO_VALOR");

		try {
			new GenericDAOBdAplicacao<TIPO_VALOR>(TIPO_VALOR.class).remover(id);

			r.setRetorno("{ \"idRegistroExcluido\" : \"" + id + "\" }");
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro("{ \"mensagem\" : \"" + e.getMessage() + "\" }");
		}
		return Response.status(Status.OK).entity(r).build();
	}
}
