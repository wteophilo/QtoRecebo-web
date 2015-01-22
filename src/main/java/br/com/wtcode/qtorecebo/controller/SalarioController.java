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
import br.com.wtcode.qtorecebo.model.Transporte;

@Resource
public class SalarioController {

	private Result result;
	private Validator validator;
	private Desconto inss;
	private Desconto irrf;
	private Desconto transporte;

	public SalarioController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}

	public void formulario() {}

	public void calcula(Salario salario,boolean trans) {
		this.validator.validate(salario);
		this.validator.onErrorRedirectTo(this).formulario();
		this.inss = calculaDesconto(salario, new Inss(salario));
		salario = calculaDescontoDependentes(salario);
		this.irrf = calculaDesconto(salario, new Irrf(salario));
		if (trans){
			this.transporte = calculaDesconto(salario, new Transporte(salario));
		}
		incluiDadosPagina(salario);
	}

	private Salario calculaDescontoDependentes(Salario salario) {
		return new DescontoDependente().calculaDesconto(salario);
	}
	
	private Desconto calculaDesconto(Salario salario, Desconto desconto){
		salario.setLiquido(desconto.calculaValorDesconto());
		desconto = alteraPorcetagem(desconto);
		return desconto;
	}

	private Desconto alteraPorcetagem(Desconto desconto){
		desconto.setPorcentagem(desconto.getPorcentagem().multiply(new BigDecimal("100")));
		return desconto;
	}

	private void incluiDadosPagina(Salario salario) {
		result.include(salario);
		result.include(this.inss);
		result.include(this.irrf);
		result.include(this.transporte);
		result.of(this).formulario();
	}
}
