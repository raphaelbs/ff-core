package br.com.ecvtec.corelibrary.webapi.standard.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.LOG;
import br.com.ecvtec.corelibrary.model.MIDIA;
import br.com.ecvtec.corelibrary.model.Retorno;
import br.com.ecvtec.corelibrary.util.Log;

@Path("ARQUIVO")
public class FILEController {

	public static final String diretorioGravacao = "c:\\temp\\";
	
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response file(
			@FormDataParam("arquivo") InputStream uploadedInputStream,
			@FormDataParam("arquivo") FormDataContentDisposition fileDetail,
			@FormDataParam("nomeArquivo") String nomeArquivo,
			@Context HttpServletRequest req) {

		ServletContext servletContext = req.getSession().getServletContext();
		String absoluteDiskPath = servletContext.getRealPath(".");
		System.out.println(absoluteDiskPath);				
		
		Retorno r = new Retorno();
		r.setOperacao("UPLOAD_ARQUIVO");

		try {
			
			writeToFile(uploadedInputStream, diretorioGravacao + req.getSession().getId(), nomeArquivo);
			r.setResultadoOperacao("SUCESSO");
			r.setRetorno("{ \"mensagem\" : \"Arquivo criado com sucesso.\" }");
			
		} catch (Exception e) {
			LOG log = new LOG();
			log.setCOMENTARIO("Erro ao criar arquivo.\nDetalhes: " + e.getStackTrace());
			
			r.setResultadoOperacao("ERRO");
			r.setErro("{ \"mensagem\" : \"Erro ao processar Solicitação.\" }");
		}
		
		return Response.status(Status.OK).entity(r).build();
	}
	
	@DELETE
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public Response fileDelete(
			@FormDataParam("nomeArquivo") String nomeArquivo,
			@Context HttpServletRequest req) {

		Retorno r = new Retorno();
		r.setOperacao("EXCLUSAO_ARQUIVO");
		
		try {
			
			File file = new File(diretorioGravacao + req.getSession().getId() + "//" + nomeArquivo);
			if(file.exists()){
				file.delete();
			}
			
			r.setResultadoOperacao("SUCESSO");
			r.setRetorno("{ \"mensagem\" : \"Arquivo excluido com sucesso.\" }");
			
		} catch (Exception e) {
			LOG log = new LOG();
			log.setCOMENTARIO("Erro ao criar arquivo.\nDetalhes: " + e.getStackTrace());
			
			r.setResultadoOperacao("ERRO");
			r.setErro("{ \"mensagem\" : \"Erro ao processar Solicita��o.\" }");
		}
		
		return Response.status(Status.OK).entity(r).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	@Path("{id}")
	public Response responseGET(@PathParam("id") int midiaId, @Context HttpServletRequest req) {
		FileInputStream stream = null;
		File f = null;
		
		GenericDAOBdAplicacao<MIDIA> dao = new GenericDAOBdAplicacao<>(MIDIA.class);
		
		try {
			MIDIA midia = dao.encontrar(midiaId);
			f = new File(diretorioGravacao + midia.getURL());
			stream = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		LOG log = new LOG();
		log.setFORM("/ARQUIVO/" + Integer.toString(midiaId));
		log.setHORA_INICIO(Calendar.getInstance());
		log.setMAQUINA(req.getRemoteHost());
		log.setMAQUINA_IP(req.getRemoteAddr());
		log.setCOMENTARIO("Download de arquivo");
		log.setUSUARIO((Integer) req.getSession().getAttribute("id"));
		log.setTIPO(810);
		Log.writeToLog(log, req.getSession().toString());
		
		return Response.ok(stream, MediaType.APPLICATION_OCTET_STREAM)
	            .header("content-disposition","attachment; filename = " + f.getName())
	            .build();
	}

	@SuppressWarnings("resource")
	private void writeToFile(InputStream uploadedInputStream, String uploadedFileLocation, String uploadedFileName) {
		try {
			boolean diretorioCriado = false;
			
			java.nio.file.Path path = Paths.get(uploadedFileLocation);
			
			if (!Files.exists(path)) {
				try {
					Files.createDirectories(path);
					diretorioCriado = true;
				} catch (Exception e) {
					e.printStackTrace(System.out);
				}
			} else {
				diretorioCriado = true;
			}
			
			
			if(diretorioCriado){
				OutputStream out = new FileOutputStream(new File(uploadedFileLocation) + "//" + uploadedFileName);
				int read = 0;
				byte[] bytes = new byte[1024];

				out = new FileOutputStream(new File(uploadedFileLocation) + "//" + uploadedFileName);
				while ((read = uploadedInputStream.read(bytes)) != -1) {
					out.write(bytes, 0, read);
				}
				out.flush();
				out.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
}
