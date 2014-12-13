package br.com.wtcode.qtorecebo.test.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.model.TabelaDescontoIrrf;

public class TabelaDescontoIrrfTest {
	private TabelaDescontoIrrf tabelaDescontoIrrf;
	
	@Before
	public void setUp(){
		this.tabelaDescontoIrrf = new TabelaDescontoIrrf();
	}
	
	@Test
	public void retornaValorMinimo(){
		assertEquals(new BigDecimal("134.08"), 
				tabelaDescontoIrrf.buscaParcelaDeducaoDoImposto(new BigDecimal("0.075")));
	}
	
	@Test
	public void retornaValorMaximo(){
		assertEquals(new BigDecimal("826.15"), 
				tabelaDescontoIrrf.buscaParcelaDeducaoDoImposto(new BigDecimal("0.275")));
	}



}
