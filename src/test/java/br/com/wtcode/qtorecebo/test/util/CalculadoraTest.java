package br.com.wtcode.qtorecebo.test.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.util.Calculadora;

public class CalculadoraTest {
	BigDecimal num2;
	BigDecimal num;
	
	@Before
	public void init(){
		num= new BigDecimal("10.755");
		num2 = new BigDecimal("10.755");
	}

	@Test
	public void adicionaDoisNumerosComMaisDeTresCasasDecimais(){
		assertEquals(new BigDecimal("21.51"), Calculadora.add(num, num2));
	}
	
	@Test
	public void multiplicaDoiusNumerosComMaisDeTresCasasDecimais(){
		assertEquals(new BigDecimal("21.51"), Calculadora.mult(num,new BigDecimal("2")));
	}
	
	@Test
	public void divideDoiusNumerosComMaisDeTresCasasDecimais(){
		num= new BigDecimal("21.511");
		num2 = new BigDecimal("2");
		assertEquals(new BigDecimal("10.76"), Calculadora.div(num,num2));
	}
	
	@Test
	public void subtraiDoiusNumerosComMaisDeTresCasasDecimais(){
		num= new BigDecimal("21.511");
		num2 = new BigDecimal("7.987");
		assertEquals(new BigDecimal("13.52"), Calculadora.sub(num,num2));
	}

}
