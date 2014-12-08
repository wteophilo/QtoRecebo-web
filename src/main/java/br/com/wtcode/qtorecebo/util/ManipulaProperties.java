package br.com.wtcode.qtorecebo.util;

import java.util.Properties;

public class ManipulaProperties {
	private Properties aliquotas;
	private CarregaProperties carregaProperties = new CarregaProperties();
	
	public String buscaAliquota(String aliquota){
		aliquotas =  carregaProperties.carregar();
		return aliquotas.getProperty(aliquota);
	}

}
