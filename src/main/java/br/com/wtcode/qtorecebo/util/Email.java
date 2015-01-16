package br.com.wtcode.qtorecebo.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Email {
	private final String EMAILUSER = "user@gmail.com";
	private final String SENHAUSER = "senhaUser";
	private Remetente remetente;
	private SimpleEmail email = new SimpleEmail();

	public Email(Remetente remetente) {
		this.remetente = remetente;
	}

	public void enviar() throws EmailException {
			this.email.setHostName("smtp.gmail.com");
			this.email.setSmtpPort(25);
			this.email.setSSLOnConnect(true);
			this.email.setAuthentication(EMAILUSER, SENHAUSER);
			this.email.addTo(remetente.getEmailRemetente(),remetente.getNome());
			this.email.setFrom(EMAILUSER,"Me");
			this.email.setSubject(remetente.getAssunto());
			this.email.setMsg(remetente.getTexto());
			this.email.getSentDate();
			this.email.send();
			System.out.println("Enviado");
	}
}
