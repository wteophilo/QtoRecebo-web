package br.com.wtcode.qtorecebo.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.wtcode.qtorecebo.model.Desconto;
import br.com.wtcode.qtorecebo.model.Inss;
import br.com.wtcode.qtorecebo.model.Irrf;
import br.com.wtcode.qtorecebo.model.Salario;

@Resource
public class SalarioController {
	
	public void formulario(){}
	
	public void  calcula(Salario salario,Result result){
		Desconto inss = new Inss(salario);
		salario.setLiquido(inss.calculaValorDesconto());
		Desconto irrf = new Irrf(salario);
		salario.setLiquido(irrf.calculaValorDesconto());
		incluiDadosPagina(salario, result, inss,irrf);
	}

	private void incluiDadosPagina(Salario salario, Result result, Desconto inss,Desconto irrf) {
		result.include(salario);
		result.include(inss);
		result.include(irrf);
		result.of(this).formulario();
	}
}
