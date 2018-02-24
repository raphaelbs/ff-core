package br.com.ecvtec.corelibrary.util;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import br.com.ecvtec.corelibrary.webapi.standard.resources.FILEController;

public class Email {

	private Properties getProperties() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.ecvtec.com.br");
		props.put("mail.smtp.ssl.trust", "smtp.ecvtec.com.br"); 
		props.put("mail.smtp.socketFactory.port", "587");
//		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.socketFactory.fallback", "false");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		return props;
	}

	private Session getSession() {
		return Session.getDefaultInstance(getProperties(), new Authenticator() {
			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("leandro.martins@ecvtec.com.br", "ecv@2015++");
			}
		});
	}

	public void sendMail(String from, String to, String subject, String text, ArrayList<String> nomeArquivos) {
		ArrayList<String> recipient = new ArrayList<>();
		recipient.add(to);
		sendMail(from, recipient, subject, text, nomeArquivos);
	}

	public void sendMail(String from, ArrayList<String> to, String subject, String text, ArrayList<String> files) {
		try {
			Message message = new MimeMessage(getSession());
			message.setFrom(new InternetAddress(from));
			message.setSubject(subject);
			Address[] destinatarios = InternetAddress
					.parse(Arrays.toString(to.toArray()).replaceAll("\\[", "").replaceAll("\\]", ""));
			message.setRecipients(RecipientType.TO, destinatarios);

			Multipart multipart = new MimeMultipart();
			MimeBodyPart parteArquivos = null;
			MimeBodyPart parteHtml = new MimeBodyPart();

			// parte Texto da mensagem
			parteHtml.setContent(text, "text/html; charset=UTF-8");
			multipart.addBodyPart(parteHtml);

			// parte Arquivo da mensagem
			if (files != null) {
				for (String file : files) {
					file = FILEController.diretorioGravacao + file;
					parteArquivos = new MimeBodyPart();
					parteArquivos.setDataHandler(new DataHandler(new FileDataSource(file)));
					parteArquivos.setFileName(Paths.get(file).getFileName().toString());
					multipart.addBodyPart(parteArquivos);
				}
			}

			message.setContent(multipart);
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		
		
	}
}
