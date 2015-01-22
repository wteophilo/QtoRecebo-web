package br.com.wtcode.qtorecebo.test.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.model.Salario;
import br.com.wtcode.qtorecebo.model.Transporte;

public class TransporteTest {

	private Transporte transporte;
	private Salario salario;

	@Before
	public void setUp() {
		salario = new Salario(new BigDecimal("724.00"));
		salario.setLiquido(new BigDecimal("724"));
		transporte = new Transporte(salario);
	}
		
	@Test
	public void calculaPorcetagem(){
		assertEquals(new BigDecimal("0.06"), transporte.calculaPorcentagem());
	}

	@Test
	public void calculaDescontoComSalarioMinimo(){
		assertEquals(new BigDecimal("680.56"), transporte.calculaValorDesconto());
	}
}
