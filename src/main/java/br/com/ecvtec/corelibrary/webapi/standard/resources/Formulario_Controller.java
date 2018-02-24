package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import br.com.ecvtec.corelibrary.dao.FormularioDAO;
import br.com.ecvtec.corelibrary.dao.MapeamentoQueryObjetos;
import br.com.ecvtec.corelibrary.dao.QueryDAO;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.VetorJson;

@Path("FORMULARIO")
public class Formulario_Controller {
	
	@Context
	private ServletContext application;

	@GET
	@Path("BUSCAR")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response buscaFormularioPorID(
			@Context UriInfo info) {
		long t = System.currentTimeMillis();
		
		Retorno retorno = new Retorno();
		retorno.setOperacao("GET_FORMULARIO_POR_ID");
		retorno.setResultadoOperacao("SUCESSO");
		String fsPath = application.getRealPath("/formularios-criados/");
		
		String fileName = info.getQueryParameters().getFirst("id_form") + "-" + 
				info.getQueryParameters().getFirst("tipo_idioma") + "-" +
				info.getQueryParameters().getFirst("banco") + ".json";
		
		// Procura o arquivo antes..
		/*try {
			InputStream is = new FileInputStream(fsPath + fileName);
			String jsonTxt = IOUtils.toString(is);
			JSONObject json = new JSONObject(jsonTxt);
		} catch (IOException | JSONException e1) {
			*/// Se não achar, cria o arquivo
			try {
				retorno = FormularioDAO.getFormularioPorId(retorno, info.getQueryParameters(), fsPath);
			} catch (SQLException e) {
				retorno.setResultadoOperacao("ERRO");
				retorno.setErro("Houve um erro interno:\n" + e.getMessage());
			} 
		//}
		
			System.out.println(System.currentTimeMillis() - t + " ms");
		return Response.status(Status.OK).entity(retorno).build();
		
	}
	
	
	@GET
	@Path("MD_SELECT/{idQuery}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response buscaMDSELECTPorQuery(
			@PathParam("idQuery") int id,
			@Context UriInfo info) {
		
		Retorno retorno = new Retorno();
		retorno.setOperacao("GET_MD_SELECT");
		retorno.setResultadoOperacao("SUCESSO");
		try {
			String query = UtilitarioDAO.getQueryPorId(null, id, UtilitarioDAO.multivaluedMap(info.getQueryParameters()));
			retorno.setRetorno(
					new QueryDAO<VetorJson>(query)
					.setResultados(MapeamentoQueryObjetos.mapearQueryParaVetorJson)
					.executar());
		} catch (SQLException e) {
			retorno.setResultadoOperacao("ERRO");
			retorno.setErro("Houve um erro interno:\n " + e.getMessage());
		}
		return Response.status(Status.OK).entity(retorno).build();
	}
	
	
	@GET
	@Path("DADOS/{idQuery}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response buscaDADOSPorQuery(
			@PathParam("idQuery") int id,
			@Context UriInfo info) {
		
		Retorno retorno = new Retorno();
		retorno.setOperacao("GET_DADOS");
		retorno.setResultadoOperacao("SUCESSO");
		try {
			String query = UtilitarioDAO.getQueryPorId(null, id, UtilitarioDAO.multivaluedMap(info.getQueryParameters()));
			retorno.setRetorno(
					new QueryDAO<VetorJson>(query)
					.setResultados(MapeamentoQueryObjetos.mapearQueryParaVetorJson)
					.executar());
		} catch (SQLException e) {
			retorno.setResultadoOperacao("ERRO");
			retorno.setErro("Houve um erro interno:\n " + e.getMessage());
		}
		return Response.status(Status.OK).entity(retorno).build();
	}
	
}
