package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.util.List;
import java.util.Map;

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
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.TIPO;
import br.com.ecvtec.corelibrary.model.TIPO_VALOR;
import br.com.ecvtec.corelibrary.util.Serializacao;

/*
 * Resources disponives para o verbo GET
 
 *TIPO Listar todos os tipos
 *TIPO/{id} Buscar um tipo pelo Id

 *TIPO/{id}/GETTIPOVALOR Listar Todos os Tipos Valor
 *TIPO/{id}/GETTIPOVALOR/{idTipoValor} Buscar um Tipo Valor de determinado Tipo pelo id do Tipo Valor

 * */

@Path("TIPO")
public class TIPOController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGET() {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO");

		try {
			GenericDAOBdAplicacao<TIPO> dao = new GenericDAOBdAplicacao<>(TIPO.class);
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
	public Response responseGETPORID(@PathParam(value = "id") int id) {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO");

		try {
			GenericDAOBdAplicacao<TIPO> dao = new GenericDAOBdAplicacao<>(TIPO.class);
			TIPO instance = dao.encontrar(id);
			r.setRetorno(instance);
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
	
	@GET
	@Path("{id}/GETTIPOVALOR")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETTIPOVALOR(
			@PathParam(value = "id") int id) {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO_GET_TIPO_VALOR");

		try {

			StringBuilder queryHQL = new StringBuilder();
			queryHQL.append("from TIPO_VALOR as TV ");
			queryHQL.append(" where TV.TIPO_DE_TIPO.ID__CHAVE_SEQUENCIAL = ");
                        queryHQL.append(id);
			
			List<TIPO_VALOR> listaItens = new GenericDAOBdAplicacao<TIPO_VALOR>(TIPO_VALOR.class).buscarListaDeHQL(queryHQL.toString());
			
			r.setRetorno(listaItens);
			r.setResultadoOperacao("sucesso");
		} catch (Exception e) {
			r.setResultadoOperacao("erro");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
	
	@GET
	@Path("{id}/GETTIPOVALOR/{idTipoValor}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETTIPOVALORPORID(
			@PathParam(value = "id") int id,
			@PathParam(value = "idTipoValor") int idTipoValor) {
		Retorno r = new Retorno();
		r.setOperacao("GET_TIPO_GET_TIPO_VALOR_POR_ID");

		try {
			
			StringBuilder queryHQL = new StringBuilder();
			queryHQL.append("from TIPO_VALOR as TV ");
			queryHQL.append(" where TV.TIPO_DE_TIPO.ID__CHAVE_SEQUENCIAL = ");
                        queryHQL.append(id);
			queryHQL.append(" and TV.ID__CHAVE_SEQUENCIAL = ");
                        queryHQL.append(idTipoValor);
			
			List<TIPO_VALOR> listaItens = new GenericDAOBdAplicacao<TIPO_VALOR>(TIPO_VALOR.class).buscarListaDeHQL(queryHQL.toString());
			
			r.setRetorno(listaItens);
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
	public Response responsePOSTurlEncoded(String entidade) {
            Retorno r = new Retorno();
            r.setOperacao("POST_TIPO");
            try {
                    Map<String,Object> modelView = Serializacao.getMapFromJSON(entidade);
                    TIPO instance = new TIPO();
                    GenericDAOBdAplicacao<TIPO> dao = new GenericDAOBdAplicacao<>(TIPO.class);

                    Serializacao.serializaoGenericaPorReflexao(instance, modelView);
                    instance.setID__CHAVE_SEQUENCIAL(null);

                    dao.salvar(instance);
                    r.setRetorno(instance);

                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED + "; charset=utf-8")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responsePUTurlEncoded(String entidade) {
            Retorno r = new Retorno();
            r.setOperacao("POST_TIPO");
            try {
                    Map<String,Object> modelView = Serializacao.getMapFromJSON(entidade);
                    TIPO instance = new TIPO();
                    GenericDAOBdAplicacao<TIPO> dao = new GenericDAOBdAplicacao<>(TIPO.class);

                    Serializacao.serializaoGenericaPorReflexao(instance, modelView);

                    dao.atualizar(instance);
                    r.setRetorno(instance);

                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
	}	

	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED + "; charset=utf-8")
	public Response responseDELETE(@PathParam("id") int id) {
		Retorno r = new Retorno();
		r.setOperacao("DELETE_TIPO");

		try {
			new GenericDAOBdAplicacao<TIPO>(TIPO.class).remover(id); 
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
}
