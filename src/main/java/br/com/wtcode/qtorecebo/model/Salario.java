package br.com.wtcode.qtorecebo.model;

import java.math.BigDecimal;

public class Salario {
	private BigDecimal bruto;
	private Integer numeroDeDependetes;
	private BigDecimal liquido;

	public BigDecimal getBruto() {
		return bruto;
	}

	public void setBruto(BigDecimal bruto) {
		this.bruto = bruto;
	}

	public Integer getNumeroDeDependetes() {
		return numeroDeDependetes;
	}

	public void setNumeroDeDependetes(Integer numeroDeDependetes) {
		this.numeroDeDependetes = numeroDeDependetes;
	}

	public BigDecimal getLiquido() {
		return liquido;
	}

	public void setLiquido(BigDecimal liquido) {
		this.liquido = liquido;
	}

}
