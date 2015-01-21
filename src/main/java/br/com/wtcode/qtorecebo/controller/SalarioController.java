package br.com.wtcode.qtorecebo.controller;

import java.math.BigDecimal;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.wtcode.qtorecebo.model.Desconto;
import br.com.wtcode.qtorecebo.model.DescontoDependente;
import br.com.wtcode.qtorecebo.model.Inss;
import br.com.wtcode.qtorecebo.model.Irrf;
import br.com.wtcode.qtorecebo.model.Salario;

@Resource
public class SalarioController {

	private Result result;
	private Validator validator;
	private Desconto inss;
	private Desconto irrf;

	public SalarioController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}

	public void formulario() {}

	public void calcula(Salario salario) {
		this.validator.validate(salario);
		this.validator.onErrorRedirectTo(this).formulario();
		this.inss = calculaInss(salario);
		salario = calculaDescontoDependentes(salario);
		this.irrf = calculaIrrf(salario);
		incluiDadosPagina(salario);
	}

	private Salario calculaDescontoDependentes(Salario salario) {
		return new DescontoDependente().calculaDesconto(salario);
	}

	private Desconto calculaIrrf(final Salario salario) {
		Desconto irrf = new Irrf(salario);
		salario.setLiquido(irrf.calculaValorDesconto());
		irrf = alteraPorcetagem(irrf);
		return irrf;
	}

	private Desconto calculaInss(final Salario salario) {
		Desconto inss = new Inss(salario);
		salario.setLiquido(inss.calculaValorDesconto());
		inss = alteraPorcetagem(inss);
		return inss;
	}
	
	private Desconto alteraPorcetagem(Desconto desconto){
		desconto.setPorcentagem(desconto.getPorcentagem().multiply(new BigDecimal("100")));
		return desconto;
	}

	private void incluiDadosPagina(Salario salario) {
		result.include(salario);
		result.include(this.inss);
		result.include(this.irrf);
		result.of(this).formulario();
	}
}
