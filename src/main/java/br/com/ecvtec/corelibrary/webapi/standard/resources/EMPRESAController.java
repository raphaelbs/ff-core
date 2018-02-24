package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ecvtec.corelibrary.model.EMPRESA;
import br.com.ecvtec.corelibrary.model.Retorno;


@Path("EMPRESA")
public class EMPRESAController {

	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response getEmpresa(){
		Response response = null;
		
		Retorno r = new Retorno();
		r.setOperacao("GET_MENU_LATERAL");
		
		try {
			
			EMPRESA itemEmpresa = new EMPRESA();
			itemEmpresa.setNomeEmpresa("ECV Tecnologia");
			
			ArrayList<EMPRESA> listaEmpresa = new ArrayList<EMPRESA>();
			listaEmpresa.add(itemEmpresa);
			
			HashMap<String, ArrayList<EMPRESA>> mapaEmpresa = new HashMap<String, ArrayList<EMPRESA>>();
			mapaEmpresa.put("listaEmpresa", listaEmpresa);
			
			ObjectMapper mapper = new ObjectMapper();
			String menuJSON = mapper.writeValueAsString(mapaEmpresa);
			
			r.setResultadoOperacao("SUCESSO");
			r.setRetorno(menuJSON);
			
		} catch (Exception e) {
			
			r.setResultadoOperacao("ERRO");
			r.setErro("{ \"mensagem\" : \"" + e.getMessage() + "\" }");
		}
		
		response = Response.ok().entity(r).build();
		
		return response;
	}
}
