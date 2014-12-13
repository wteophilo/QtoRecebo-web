package br.com.wtcode.qtorecebo.model;

import java.math.BigDecimal;

public class Salario {
	private BigDecimal bruto;
	private Integer numeroDeDependentes;
	private BigDecimal liquido;

	public Salario() {}

	
	public Salario(BigDecimal bruto) {
		this.bruto = bruto;
	}
	
	
	public BigDecimal getBruto() {
		return bruto;
	}

	public void setBruto(BigDecimal bruto) {
		this.bruto = bruto;
	}

	public Integer getNumeroDeDependentes() {
		return numeroDeDependentes;
	}

	public void setNumeroDeDependentes(Integer numeroDeDependentes) {
		this.numeroDeDependentes = numeroDeDependentes;
	}

	public BigDecimal getLiquido() {
		return liquido;
	}

	public void setLiquido(BigDecimal liquido) {
		this.liquido = liquido;
	}

}
