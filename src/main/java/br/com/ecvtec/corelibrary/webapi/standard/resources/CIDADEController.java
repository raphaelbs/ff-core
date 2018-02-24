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
import br.com.ecvtec.corelibrary.model.CIDADE;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.util.GEOGRAFIAHelper;

/*
 * Resources dispon�ves para o verbo GET
 
 *CIDADE Listar Todas
 *CIDADE/{id} Buscar pelo Id

 *CIDADE/{id}/GETBAIRROS Listar Todos os bairros de uma cidade
 *CIDADE/{id}/GETBAIRROS/{idBarro} Buscar um determinado bairro pelo Id
 
 *CIDADE/{id}/GETENDERECOS Listar Todos os Endere�os de uma Determinada Cidade
 *CIDADE/{id}/GETENDERECOS/{idEndereco} Buscar um determinado endere�o de uma determinada Cidade
 
 * */

@Path("CIDADE")
public class CIDADEController {

    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGET() {
            Retorno r = new Retorno();
            r.setOperacao("GET_CIDADE");

            try {
                    r.setRetorno(GEOGRAFIAHelper.listarCidades());
                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
                    e.printStackTrace(System.out);
            }
            return Response.status(Status.OK).entity(r).build();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETPORID(@PathParam(value = "id") int id) {
            Retorno r = new Retorno();
            r.setOperacao("GET_CIDADE_POR_ID");

            try {
                    r.setRetorno(GEOGRAFIAHelper.recuperarCidadePorId(id));
                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
    }
    
    @GET
    @Path("{id}/GETBAIRROS")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETBAIRROS(@PathParam(value = "id") int id) {
            Retorno r = new Retorno();
            r.setOperacao("GET_BAIRROS_POR_CIDADE_ID");

            try {
                    r.setRetorno(GEOGRAFIAHelper.listarBairrosPorCidade(id));
                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
    }
    
    @GET
    @Path("{id}/GETBAIRROS/{idBairro}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETBAIRROPORID(
                    @PathParam(value = "id") int id,
                    @PathParam(value = "idBairro") int idBairro) {
            Retorno r = new Retorno();
            r.setOperacao("GET_BAIRRO_POR_ID");

            try {
                    r.setRetorno(GEOGRAFIAHelper.recuperarBairroPorId(id, idBairro));
                    r.setResultadoOperacao("SUCESSO");

            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
    }
    
    @GET
    @Path("{id}/GETENDERECOS")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETENDERECOS(@PathParam(value = "id") int id) {
            Retorno r = new Retorno();
            r.setOperacao("GET_ENDERECOS");

            try {
                    r.setRetorno(GEOGRAFIAHelper.listarEnderecosPorCidadeId(id));
                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
    }
    
    @GET
    @Path("{id}/GETENDERECOS/{idEndereco}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETENDERECOSPORID(
                    @PathParam(value = "id") int id,
                    @PathParam(value = "idEndereco") int idEndereco) {
            Retorno r = new Retorno();
            r.setOperacao("GET_ENDERECO_POR_ID");

            try {
                    r.setRetorno(GEOGRAFIAHelper.recuperarEnderecoPorId(id, idEndereco));
                    r.setResultadoOperacao("SUCESSO");

            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
    }
	
    @GET
	@Path("POPUPPESQUISA")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETPOPUPPESQUISA() {
            Retorno r = new Retorno();
            r.setOperacao("GET_CIDADE_POPUPPESQUISA");

            try {
                    StringBuilder queryHQL = new StringBuilder();
                    queryHQL.append("select ID__CHAVE_SEQUENCIAL, DESCRICAO, PAIS.DESCRICAO,UF.DESCRICAO, UF.SIGLA ");
                    queryHQL.append("from CIDADE ");

                    List<CIDADE> listaCidade = new GenericDAOBdAplicacao<CIDADE>(CIDADE.class).buscarListaDeHQL(queryHQL.toString());

                    r.setRetorno(listaCidade);
                    r.setResultadoOperacao("SUCESSO");
            } catch (Exception e) {
                    r.setResultadoOperacao("ERRO");
                    r.setErro(e.getMessage());
            }
            return Response.status(Status.OK).entity(r).build();
    }
    
    @GET
    @Path("POPUPPESQUISA/{ufId}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Response responseGETPOPUPPESQUISAPoRUF(@PathParam("ufId") int ufId) {
    	Retorno r = new Retorno();
    	r.setOperacao("GET_CIDADE_POPUPPESQUISA");
    	
    	try {
    		StringBuilder queryHQL = new StringBuilder();
    		queryHQL.append("select ID__CHAVE_SEQUENCIAL, DESCRICAO, PAIS.DESCRICAO,UF.DESCRICAO, UF.SIGLA ");
    		queryHQL.append("from CIDADE ");
    		queryHQL.append("WHERE UF.ID__CHAVE_SEQUENCIAL = " + String.valueOf(ufId));
    		
    		List<CIDADE> listaCidade = new GenericDAOBdAplicacao<CIDADE>(CIDADE.class).buscarListaDeHQL(queryHQL.toString());
    		
    		r.setRetorno(listaCidade);
    		r.setResultadoOperacao("SUCESSO");
    	} catch (Exception e) {
    		r.setResultadoOperacao("ERRO");
    		r.setErro(e.getMessage());
    	}
    	return Response.status(Status.OK).entity(r).build();
    }
	
}
