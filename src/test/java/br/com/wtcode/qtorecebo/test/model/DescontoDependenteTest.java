package br.com.wtcode.qtorecebo.test.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.model.DescontoDependente;
import br.com.wtcode.qtorecebo.model.Salario;

public class DescontoDependenteTest {

	private Salario salario;
	private DescontoDependente dependente;
	
	@Before
	public void setUp() {
		this.salario = new Salario(new BigDecimal("2000.00"));
		this.salario.setLiquido(new BigDecimal("2000.00"));
		this.salario.setNumeroDeDependentes(1);
		dependente = new DescontoDependente();
	}

	@Test
	public void calculaDescontoSemDependente(){
		this.salario.setNumeroDeDependentes(0);
		assertEquals(new BigDecimal("2000.00"), this.dependente.calculaDesconto(salario).getLiquido());
	}
	
	@Test
	public void calculaDescontoComUmDependenteESalarioIgual2K() {
		assertEquals(new BigDecimal("1820.29"), dependente.calculaDesconto(salario).getLiquido());
	}
	
	@Test
	public void calculaDescontoComUmDependenteESalarioMininoK() {
		salario.setBruto(new BigDecimal("724.50"));
		salario.setNumeroDeDependentes(2);
		assertEquals(new BigDecimal("724.50"), dependente.calculaDesconto(salario).getBruto());
	}


}
