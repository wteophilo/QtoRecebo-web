package br.com.wtcode.qtorecebo.model;

import java.math.BigDecimal;

import br.com.wtcode.qtorecebo.util.Calculadora;
import br.com.wtcode.qtorecebo.util.ManipulaProperties;

public class Inss implements Desconto {
	private Salario salario;
	private ManipulaProperties manipulaProperties;
	private BigDecimal porcentagem;
	private BigDecimal desconto;
	public final static BigDecimal LIMITE = new BigDecimal("482.93");

	public Inss(Salario salario) {
		this.salario = salario;
		this.manipulaProperties = new ManipulaProperties();
	}

	@Override
	public BigDecimal calculaPorcentagem() {
		if (salario.getBruto().compareTo((new BigDecimal("1317.07"))) <= 0) {
			return manipulaProperties.buscaAliquota("inss.porcentagem.minimo");
		} else if (salario.getBruto().compareTo((new BigDecimal("1317.08"))) >= 0
				&& salario.getBruto().compareTo((new BigDecimal("2195.12"))) <= 0) {
			return manipulaProperties.buscaAliquota("inss.porcentagem.medio");
		} else if (salario.getBruto().compareTo((new BigDecimal("2195.13"))) >= 0
				&& salario.getBruto().compareTo((new BigDecimal("4390.24"))) <= 0) {
			return manipulaProperties.buscaAliquota("inss.porcentagem.maximo");
		} else {
			return manipulaProperties.buscaAliquota("inss.desconto.maximo");
		}
	}

	@Override
	public BigDecimal calculaValorDesconto() {
		porcentagem = calculaPorcentagem();
		desconto = calculaLimite(porcentagem);
		return Calculadora.sub(salario.getBruto(), desconto);
	}

	private BigDecimal calculaLimite(BigDecimal porcentagem2) {
		if (porcentagem.compareTo(LIMITE) == 0) {
			return LIMITE;
		} else {
			return Calculadora.mult(salario.getBruto(), porcentagem);
		}
	}

	public BigDecimal getPorcentagem() {
		return porcentagem;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

}