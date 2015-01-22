package br.com.wtcode.qtorecebo.model;

import java.math.BigDecimal;

import br.com.wtcode.qtorecebo.util.Calculadora;
import br.com.wtcode.qtorecebo.util.ManipulaProperties;

public class Transporte extends Desconto {
	
	public Transporte(Salario salario) {
		super(salario);
	}

	private ManipulaProperties manipulaProperties = new ManipulaProperties();  

	@Override
	public BigDecimal calculaPorcentagem() {
		return manipulaProperties.buscaAliquota("transporte.porcentagem");
	}

	@Override
	public BigDecimal calculaValorDesconto() {
		setPorcentagem(calculaPorcentagem());
		desconto = Calculadora.mult(salario.getBruto(), getPorcentagem());
		return  Calculadora.sub(salario.getLiquido(), desconto);
	}
}
