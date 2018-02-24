package br.com.ecvtec.corelibrary.model;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

public interface CRUD<T> {
	@POST
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	Retorno responsePOST(T entidade, @Context UriInfo info);

	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	Retorno responseGET(@Context UriInfo info);

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	Retorno responseGETID(@PathParam("id") int id, @Context UriInfo info);

	@DELETE
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	Retorno responseDELETE(T entidade, @Context UriInfo info);
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
	Retorno responseDELETE(@PathParam("id") int id, @Context UriInfo info);
}
