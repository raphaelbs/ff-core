package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ecvtec.corelibrary.dao.MenuDAO;
import br.com.ecvtec.corelibrary.model.MENU_ITEM;
import br.com.ecvtec.corelibrary.model.Retorno;

@Path("MENU_LATERAL")
public class MENU_LATERALController {

	@GET
	@Path("{menuId}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response getMenuLateralPorDominio(@HeaderParam("AUTHORIZATION") String AUTHORIZATION,
			@PathParam("menuId") int menuId, @Context HttpServletRequest req) {

		Response response;
		Integer idUsuario = (Integer) req.getSession().getAttribute("id");

		Retorno r = new Retorno();
		r.setOperacao("GET_MENU_LATERAL_POR_DOMINIO");

		CacheControl cache = new CacheControl();
		cache.setMaxAge(86400);
		cache.setPrivate(true);

		if (AUTHORIZATION == null) {
			response = Response.status(401).build();
			return response;
		} else {
			try {

				MenuDAO menuDAO = new MenuDAO();
				List<MENU_ITEM> menuLateral = menuDAO.getMenuPorId(menuId, idUsuario);

				HashMap<String, List<MENU_ITEM>> mapaMenu = new HashMap<>();
				mapaMenu.put("menu", menuLateral);

				ObjectMapper mapper = new ObjectMapper();
				String menuJSON = mapper.writeValueAsString(mapaMenu);

				r.setResultadoOperacao("SUCESSO");
				r.setRetorno(menuJSON);
			} catch (Exception e) {

				r.setResultadoOperacao("ERRO");
				r.setErro("{ \"mensagem\" : \"" + e.getMessage() + "\" }");
			}

			response = Response.ok().cacheControl(cache).entity(r).build();

			return response;
		}

	}

}
