package br.com.wtcode.qtorecebo.controller;

import org.apache.commons.mail.EmailException;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.wtcode.qtorecebo.util.Email;
import br.com.wtcode.qtorecebo.util.Remetente;

@Resource
public class SobreController {
	
	private Result result;
	private Validator validator;

	public SobreController(Result result, Validator validator){
		this.result = result;
		this.validator = validator;
	}
	
	public void informacoes(){}
	
	public void enviar(final Remetente remetente){
		this.validator.validate(remetente);
		this.validator.onErrorRedirectTo(this).informacoes();
		Email email = new Email(remetente);
		try {
			email.enviar();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		result.of(this).informacoes();
	}

}
