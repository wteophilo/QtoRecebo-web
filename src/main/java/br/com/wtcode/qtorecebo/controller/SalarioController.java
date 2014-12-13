package br.com.wtcode.qtorecebo.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.wtcode.qtorecebo.model.Inss;
import br.com.wtcode.qtorecebo.model.Salario;

@Resource
public class SalarioController {
	
	public void formulario(){}
	
	public void  calcula(Salario salario,Result result){
		Inss inss = new Inss(salario);
		salario.setLiquido(inss.calculaValorDesconto());
		result.include(salario);
		result.include(inss);
		result.of(this).formulario();
	}
}
