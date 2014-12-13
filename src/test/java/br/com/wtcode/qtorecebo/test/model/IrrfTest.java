package br.com.wtcode.qtorecebo.test.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.model.Inss;
import br.com.wtcode.qtorecebo.model.Irrf;
import br.com.wtcode.qtorecebo.model.Salario;

public class IrrfTest {
	private Inss inss;
	private Irrf irrf;
	private Salario salarioMinimo;
	private Salario salarioMedio;
	private Salario salarioAlto;
	private Salario salarioMaximo;
	private Salario salarioIsento;
	private BigDecimal valorDescontoIrrf;
	
	
	@Before
	public void setUp(){
		this.salarioIsento = new Salario(new BigDecimal("724.00"));
		this.salarioMinimo = new Salario(new BigDecimal("2000.00"));
		this.salarioMedio = new Salario(new BigDecimal("3200.00"));
		this.salarioAlto = new Salario(new BigDecimal("4400.00"));
		this.salarioMaximo = new Salario(new BigDecimal("5200.99"));
	}
	
	@Test
	public void ValorIsentoIrrfSemDependentes(){
		salarioIsento.setNumeroDeDependentes(new Integer(0));
		inss = new  Inss(salarioIsento);
		salarioIsento.setLiquido(inss.calculaValorDesconto());
		irrf = new Irrf(salarioIsento);
		valorDescontoIrrf = irrf.calculaValorDesconto();
		assertEquals(new BigDecimal("0.00") ,irrf.getPorcentagem());
		assertEquals(new BigDecimal("0.00"), irrf.getDesconto());
		assertEquals(new BigDecimal("666.08"), valorDescontoIrrf);
	}
	
	@Test
	public void porcentagemMinimaIrrfSemDependentes(){
		salarioMinimo.setNumeroDeDependentes(new Integer(0));
		inss = new  Inss(salarioMinimo);
		salarioMinimo.setLiquido(inss.calculaValorDesconto());
		irrf = new Irrf(salarioMinimo);
		valorDescontoIrrf = irrf.calculaValorDesconto();
		assertEquals(new BigDecimal("0.075") ,irrf.getPorcentagem());	
		assertEquals(new BigDecimal("2.42"), irrf.getDesconto());
		assertEquals(new BigDecimal("1817.58"),valorDescontoIrrf);
	}

	@Test
	public void porcentagemMaisDe2KIrrfSemDependentes(){
		salarioMedio.setNumeroDeDependentes(new Integer(0));
		inss = new  Inss(salarioMedio);
		salarioMedio.setLiquido(inss.calculaValorDesconto());
		irrf = new Irrf(salarioMedio);
		valorDescontoIrrf = irrf.calculaValorDesconto();
		assertEquals(new BigDecimal("0.15"),irrf.getPorcentagem());
		assertEquals(new BigDecimal("92.17"), irrf.getDesconto());
		assertEquals(new BigDecimal("2755.83"),valorDescontoIrrf);

	}
	
	@Test
	public void porcentagemMaisDe4KIrrfSemDependentes(){
		salarioAlto.setNumeroDeDependentes(new Integer(0));
		inss = new  Inss(salarioAlto);
		salarioAlto.setLiquido(inss.calculaValorDesconto());
		irrf = new Irrf(salarioAlto);
		valorDescontoIrrf = irrf.calculaValorDesconto();
		assertEquals(new BigDecimal("0.225"),irrf.getPorcentagem());
		assertEquals(new BigDecimal("278.38"),irrf.getDesconto());	
		assertEquals(new BigDecimal("3638.69"), valorDescontoIrrf);
	}
	
	@Test
	public void porcentagemMaximoIrrfSemDependentes(){
		salarioMaximo.setNumeroDeDependentes(new Integer(0));		
		inss = new  Inss(salarioMaximo);
		salarioMaximo.setLiquido(inss.calculaValorDesconto());
		irrf = new Irrf(salarioMaximo);
		valorDescontoIrrf = irrf.calculaValorDesconto();
		assertEquals(new BigDecimal("0.275"),irrf.getPorcentagem());
		assertEquals(new BigDecimal("471.32"),irrf.getDesconto());
		assertEquals(new BigDecimal("4246.74"),valorDescontoIrrf);

	}
}
