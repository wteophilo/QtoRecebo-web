package br.com.wtcode.qtorecebo.test.util;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;

import br.com.wtcode.qtorecebo.util.CarregaProperties;

public class CarregaPropertiesTest {
	
	@Test
	public void carregaProperties() {
		CarregaProperties carregaProperties = new CarregaProperties();
		Properties aliquotas = carregaProperties.carregar();
		assertNotNull(aliquotas);
	}

}
