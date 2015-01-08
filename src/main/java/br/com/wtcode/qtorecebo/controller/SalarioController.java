package br.com.wtcode.qtorecebo.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.wtcode.qtorecebo.model.Desconto;
import br.com.wtcode.qtorecebo.model.Inss;
import br.com.wtcode.qtorecebo.model.Irrf;
import br.com.wtcode.qtorecebo.model.Salario;

@Resource
public class SalarioController {

	private Result result;
	private Validator validator;

	public SalarioController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}

	public void formulario() {}

	public void calcula(final Salario salario) {
		validator.validate(salario);
		validator.onErrorRedirectTo(this).formulario();
		
		Desconto inss = new Inss(salario);
		salario.setLiquido(inss.calculaValorDesconto());
		Desconto irrf = new Irrf(salario);
		salario.setLiquido(irrf.calculaValorDesconto());
		incluiDadosPagina(salario, inss, irrf);
	}

	private void incluiDadosPagina(Salario salario, Desconto inss, Desconto irrf) {
		result.include(salario);
		result.include(inss);
		result.include(irrf);
		result.of(this).formulario();
	}
}
