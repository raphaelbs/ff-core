package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.DOMINIO;
import br.com.ecvtec.corelibrary.model.DOMINIO_DETALHE;
import br.com.ecvtec.corelibrary.model.ENUM_STATUS__GERAL;
import br.com.ecvtec.corelibrary.model.Retorno;

/*
 * Resources disponives para o verbo GET
 
 *DOMINIO Listar todos os Dominios
 *DOMINIO/{id} Buscar um Dominio pelo Id
 *DOMINIO/GETPORNOME/{nome} Buscar um Dominio pelo Nome
 *DOMINIO/ATIVO/{nome} Buscar um Dominio pelo Nome

 *DOMINIO/{id}/GETDETALHES Listar Todos os Detalhes
 *DOMINIO/{id}/GETDETALHES/{idDetalhe} Buscar um Detalhe de determinado Dominio pelo id do Detalhe

 * */

@Path("DOMINIO")
public class DOMINIOController {

	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGET() {
		Retorno r = new Retorno();
		r.setOperacao("GET_DOMINIO");

		try {
			GenericDAOBdAplicacao<DOMINIO> dao = new GenericDAOBdAplicacao<>(DOMINIO.class);
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
		r.setOperacao("GET_DOMINIO");

		try {
			GenericDAOBdAplicacao<DOMINIO> dao = new GenericDAOBdAplicacao<>(DOMINIO.class);
			r.setRetorno(dao.encontrar(id));
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
	
	@GET
	@Path("GETPORNOME/{nomeDominio}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETDOMINIOPORNOME(
			@PathParam(value = "nomeDominio") String nomeDominio) {
		Retorno r = new Retorno();
		r.setOperacao("GET_DOMINIO_POR_NOME");

		try {
			StringBuilder queryHQL = new StringBuilder();
			queryHQL.append("from DOMINIO as D ");
			queryHQL.append(" where D.NOME_DO_DOMINIO = '");
                        queryHQL.append(nomeDominio);
                        queryHQL.append("' ");
			
			List<DOMINIO> listaItens = new GenericDAOBdAplicacao<DOMINIO>(DOMINIO.class).buscarListaDeHQL(queryHQL.toString());
			
			r.setRetorno(listaItens);
			r.setResultadoOperacao("SUCESSO");
			
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
	
	@GET
	@Path("ATIVO/{nomeDominio}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETATIVO(
			@PathParam(value = "nomeDominio") String nomeDominio) {
		Retorno r = new Retorno();
		r.setOperacao("GET_DOMINIO_ATIVO");

		try {
			StringBuilder queryHQL = new StringBuilder();
			queryHQL.append("from DOMINIO as D ");
			queryHQL.append(" where D.NOME_DO_DOMINIO = '");
                        queryHQL.append(nomeDominio);
                        queryHQL.append("'");
			
			List<DOMINIO> listaItens = new GenericDAOBdAplicacao<DOMINIO>(DOMINIO.class).buscarListaDeHQL(queryHQL.toString());
			boolean ativo = (listaItens.get(0).getSTATUS_DO_DOMINIO_ATIVO__INATIVO_().getID__CHAVE_SEQUENCIAL() == ENUM_STATUS__GERAL.ATIVO.valor);
			r.setRetorno(" { \"statusDominio\" : " + ativo + " } ");
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}

	@GET
	@Path("{id}/GETDETALHES")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETDETALHES(@PathParam(value = "id") int id) {
		Retorno r = new Retorno();
		r.setOperacao("GET_DOMINIO_GET_DETALHES");

		try {
			GenericDAOBdAplicacao<DOMINIO> dao = new GenericDAOBdAplicacao<>(DOMINIO.class);
			DOMINIO instance = dao.encontrar(id);
			r.setRetorno(instance.getDOMINIO_DOMINIO_DETALHEs());
			r.setResultadoOperacao("SUCESSO");
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
	
	@GET
	@Path("{id}/GETDETALHES/{idDetalhe}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response responseGETDETALHESPORID(
			@PathParam(value = "id") int id,
			@PathParam(value = "idDetalhe") int idDetalhe) {
		Retorno r = new Retorno();
		r.setOperacao("GET_DOMINIO_GET_DETALHES_POR_ID");

		try {
			StringBuilder queryHQL = new StringBuilder();
			queryHQL.append("from DOMINIO_DETALHE as DT ");
			queryHQL.append(" where DT.DOMINIO.ID__CHAVE_SEQUENCIAL = ");
                        queryHQL.append(id);
			queryHQL.append(" and DT.ID__CHAVE_SEQUENCIAL = ");
                        queryHQL.append(idDetalhe);
			
			List<DOMINIO_DETALHE> listaItens = new GenericDAOBdAplicacao<DOMINIO_DETALHE>(DOMINIO_DETALHE.class).buscarListaDeHQL(queryHQL.toString());
			
			r.setRetorno(listaItens);
			r.setResultadoOperacao("SUCESSO");
			
		} catch (Exception e) {
			r.setResultadoOperacao("ERRO");
			r.setErro(e.getMessage());
		}
		return Response.status(Status.OK).entity(r).build();
	}
}
