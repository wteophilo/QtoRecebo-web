package br.com.wtcode.qtorecebo.model;

import java.math.BigDecimal;

public interface Desconto {
	public BigDecimal calculaPorcentagem();
	public BigDecimal calculaValorDesconto();
}
