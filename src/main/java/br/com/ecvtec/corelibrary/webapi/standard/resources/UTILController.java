package br.com.ecvtec.corelibrary.webapi.standard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.UNIDADE_DA_FEDERACAO;
import br.com.ecvtec.corelibrary.util.Util;


@Path("UTIL")
public class UTILController {
	@GET
	@Path("FUNCOES_DATA_HORA/RETORNA_DATA_HORA_GMT")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response retornaDataHoraAtual() {
		Response response = null;
		
		Retorno r = new Retorno();
		r.setOperacao("RETORNA_DATA_HORA");
		
		try {
			
			String data = Util.getDataHoraAtualGMT("America/Sao_Paulo", "HH:mm:ss dd/MM/yyyy");
			
			r.setResultadoOperacao("SUCESSO");
			r.setRetorno("{ \"dataHoraGMT\" : \"" + data + "\"}");
			
		} catch (Exception e) {
			// TODO: handle exception
			r.setErro(e.getMessage());
			r.setOperacao("LOGIN");
		}
		
		response = Response.ok().entity(r).build();
		return response;
	}
	
	@GET
	@Path("UF/POPUPPESQUISA")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response retornaUFs() {
		Response response = null;
		
		Retorno r = new Retorno();
		r.setOperacao("RETORNA_UF");
		
		try {
			GenericDAOBdAplicacao<UNIDADE_DA_FEDERACAO> dao = new GenericDAOBdAplicacao<>(UNIDADE_DA_FEDERACAO.class); 
			r.setRetorno(dao.buscarListaDeHQL("SELECT ID__CHAVE_SEQUENCIAL, DESCRICAO, SIGLA FROM UNIDADE_DA_FEDERACAO "));
		} catch (Exception e) {
			r.setErro(e.getMessage());
			r.setOperacao("RETORNA_UF");
		}
		
		response = Response.ok().entity(r).build();
		return response;
	}
}
