package br.com.wtcode.qtorecebo.test.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.model.Inss;
import br.com.wtcode.qtorecebo.model.Salario;

public class InssTest {
	private Salario salarioMinimo;
	private Salario salarioMedio;
	private Salario salarioAlto;
	private Salario salarioMaximo;
	private Inss inss;

	@Before
	public void setUp(){
		this.salarioMinimo = new Salario(new BigDecimal("724.00"));
		this.salarioMedio = new Salario(new BigDecimal("1317.08"));
		this.salarioAlto = new Salario(new BigDecimal("3000.00"));
		this.salarioMaximo = new Salario(new BigDecimal("4395.24"));
		
	}
	
	@Test
	public void calculaDescontoMinimo(){
		inss = new Inss(salarioMinimo);
		assertEquals(new BigDecimal("0.08"), inss.calculaPorcentagem());	
		assertEquals(new BigDecimal("666.08"), inss.calculaValorDesconto());
	}
	
	@Test
	public void calculaValorDescontoMedio(){
		inss= new Inss(salarioMedio);
		assertEquals(new BigDecimal("0.09"),inss.calculaPorcentagem());
		assertEquals(new BigDecimal("1198.54"), inss.calculaValorDesconto());
	}
	
	@Test
	public void calculaValorDescontoMaximo(){
		inss= new Inss(salarioAlto);
		assertEquals(new BigDecimal("0.11"),inss.calculaPorcentagem());
		assertEquals(new BigDecimal("2670.00"),inss.calculaValorDesconto());	
	}
	
	@Test
	public void calculaValorDescontoLimite(){
		inss = new Inss(salarioMaximo);
		assertEquals(new BigDecimal("3912.31"),inss.calculaValorDesconto());
		
	}

}
