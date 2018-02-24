/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecvtec.corelibrary.util;

/**
 *
 * @author Renato
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigPropHelper {

	private static InputStream inputStream;
	private static Properties prop;
	private static final String PROP_FILE_NAME = "config.properties";

	private static Properties getProperties() throws IOException {
		if (prop != null)
			return prop;
		prop = new Properties();
		inputStream = ConfigPropHelper.class.getClassLoader().getResourceAsStream(PROP_FILE_NAME);
		prop.load(inputStream);
		return prop;
	}

	public static String getValorPropriedadePorNome(String chave) throws IOException {
		return getProperties().getProperty(chave);
	}
}
