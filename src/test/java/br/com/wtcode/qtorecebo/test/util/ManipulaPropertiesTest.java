package br.com.wtcode.qtorecebo.test.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.util.ManipulaProperties;

public class ManipulaPropertiesTest {
	private String aliquotaMinimaInss;
	private String aliquotaMinimaIrrf;
	private ManipulaProperties manipula;
	private BigDecimal inss;
	
	@Before
	public void setUp(){
		aliquotaMinimaInss = "inss.porcentagem.minimo";
		aliquotaMinimaIrrf ="irrf.porcentagem.minimo";
		manipula = new ManipulaProperties();
	}

	@Test
	public void buscaAliquotaMinimaInss() {
		inss = manipula.buscaAliquota(aliquotaMinimaInss);
		assertEquals(new BigDecimal("0.08"), inss);
	}
	
	@Test
	public void buscaAliquotaMinimaIrrf() {
		inss = manipula.buscaAliquota(aliquotaMinimaIrrf);
		assertEquals(new BigDecimal("0.075"), inss);
	}

}
