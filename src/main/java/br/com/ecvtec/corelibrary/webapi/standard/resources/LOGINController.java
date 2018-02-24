package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ecvtec.corelibrary.dao.DominioDAO;
import br.com.ecvtec.corelibrary.dao.LoginDAO;
import br.com.ecvtec.corelibrary.model.DOMINIO;
import br.com.ecvtec.corelibrary.model.ENUM_STATUS__GERAL;
import br.com.ecvtec.corelibrary.model.LOG;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.model.UsuarioLogin;
import br.com.ecvtec.corelibrary.util.Log;

@Path("LOGIN")
public class LOGINController {

	@POST
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response validaLogin(UsuarioLogin usuario, @Context HttpServletRequest req) {
		Response response;

		LOG log = new LOG();
		log.setFORM("LOGIN.html");

		try {
			Retorno r = new Retorno();
			r.setOperacao("LOGIN");

			DOMINIO dominio = new DominioDAO().buscarInformacoesDominio(usuario.getDominio());
			if (dominio == null) {
				r.setResultadoOperacao("ERRO");
				r.setErro("{ \"mensagem\" : \"Dominio Inexistente.\" }");
			} else {
				if (dominio.getSTATUS_DO_DOMINIO_ATIVO__INATIVO_()
						.getID__CHAVE_SEQUENCIAL() == ENUM_STATUS__GERAL.ATIVO.valor) {
					boolean loginSenhaValido = new LoginDAO().isLoginSenhaValido(usuario.getUsuario(),
							usuario.getSenha());

					if (loginSenhaValido) {
						HttpSession session = req.getSession();

						UsuarioLogin usuarioLogin = new LoginDAO().getInfoUsuario(usuario.getUsuario(),
								usuario.getSenha());
						session.setAttribute("senha", usuarioLogin.getSenha());
						session.setAttribute("id", usuarioLogin.getId());
						usuarioLogin.setSenha(null);
						usuarioLogin.setMenuId(String.valueOf(dominio.getMenuId()));

						HashMap<String, Object> mapaRetorno = new HashMap<>();

						if (usuarioLogin.getTipoUsuario().equals("3903")) { // login de rádio
							mapaRetorno.put("url", "MINHACAIXA.html");
						} else {
							mapaRetorno.put("url", "INDEX.html");
						}

						mapaRetorno.put("usuarioInfo", usuarioLogin);
						mapaRetorno.put("idSessao", session.getId());

						// return
						// Response.seeOther(location).entity(createResponseItems(model)).build();

						ObjectMapper mapper = new ObjectMapper();
						String retornoJSON = mapper.writeValueAsString(mapaRetorno);

						r.setResultadoOperacao("SUCESSO");
						r.setRetorno(retornoJSON);

						log.setCOMENTARIO("validaLogin SUCESSO");

					} else {
						r.setResultadoOperacao("ERRO");
						r.setErro("{ \"mensagem\" : \"Usuário ou senha inválidos.\" }");
					}
				} else {
					r.setResultadoOperacao("ERRO");
					r.setErro(
							"{ \"mensagem\" : \"Dominio Inativo favor entrar em contato com o Administrador do Sistema.\" }");
				}
			}

			response = Response.ok().entity(r).build();

		} catch (Exception e) {

			Retorno r = new Retorno();
			r.setErro(e.getMessage());
			r.setOperacao("LOGIN");
			response = Response.serverError().entity(r).status(500).build();

			log.setCOMENTARIO("validaLogin ERRO.\nDetalhes:" + e.getMessage());
		}

//		Log.writeToLog(log, req.getSession().toString());
		return response;
	}

	@Path("/LOGOUT/{idSessao}")
	@POST
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response logout(@PathParam(value = "idSessao") String idSessao, @Context HttpServletRequest req) {

		LOG log = new LOG();
		log.setFORM("LOGIN.html");

		if (idSessao.equals(req.getSession().getId())) {
			req.getSession().invalidate();
		}

		Response response;
		Retorno r = new Retorno();
		r.setOperacao("LOGOUT");

		try {

			if (true) {
				r.setResultadoOperacao("SUCESSO");
				r.setRetorno("{ \"url\" : \"LOGIN.html\" } ");
				// r.setRetorno("{ \"url\" :
				// \"http://localhost:8002/ecv_models/views/LOGIN.html\" } ");
			}

			response = Response.ok().entity(r).build();

			log.setCOMENTARIO("logout SUCESSO");

		} catch (Exception e) {
			r.setErro(e.getMessage());
			response = Response.ok().entity(r).build();

			log.setCOMENTARIO("validaLogin ERRO.\nDetalhes:" + e.getMessage());
		}

		Log.writeToLog(log, req.getSession().toString());
		return response;
	}
}
