package br.com.wtcode.qtorecebo.test.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.wtcode.qtorecebo.util.ManipulaProperties;

public class ManipulaPropertiesTest {
	private String aliquotaMinimaInss;
	private String aliquotaMinimaIrrf;
	private ManipulaProperties manipula;
	
	@Before
	public void setUp(){
		aliquotaMinimaInss = "inss.porcentagem.minimo";
		aliquotaMinimaIrrf ="irrf.porcentagem.minimo";
		manipula = new ManipulaProperties();
	}

	@Test
	public void buscaAliquotaMinimaInss() {
		String inss = manipula.buscaAliquota(aliquotaMinimaInss);
		assertEquals("0.08", inss);
	}
	
	@Test
	public void buscaAliquotaMinimaIrrf() {
		String inss = manipula.buscaAliquota(aliquotaMinimaIrrf);
		assertEquals("0.075", inss);
	}

}
