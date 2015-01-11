package br.com.wtcode.qtorecebo.model;

import java.math.BigDecimal;

import br.com.wtcode.qtorecebo.util.ManipulaProperties;

public abstract  class Desconto {
	protected  BigDecimal desconto;
	private  BigDecimal porcentagem;
	protected Salario salario;
	protected ManipulaProperties manipulaProperties;
	
	public Desconto(Salario salario) {
		this.salario = salario;
		this.manipulaProperties = new ManipulaProperties();
	}
	
	
	public  abstract BigDecimal calculaPorcentagem();
	public abstract BigDecimal calculaValorDesconto();
	
	
	public BigDecimal getDesconto() {
		return desconto;
	}
	
	public BigDecimal getPorcentagem() {
		return porcentagem;
	}


	public void setPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}
}
