package br.com.wtcode.qtorecebo.util;

import org.hibernate.validator.constraints.NotBlank;


public class Remetente {
	@NotBlank
	private String emailRemetente;
	@NotBlank
	private String assunto;
	@NotBlank
	private String texto;
	@NotBlank
	private String nome;

	public String getEmailRemetente() {
		return emailRemetente;
	}

	public void setEmailRemetente(String emailRemetente) {
		this.emailRemetente = emailRemetente;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
