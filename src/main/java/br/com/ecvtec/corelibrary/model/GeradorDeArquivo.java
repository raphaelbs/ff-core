package br.com.ecvtec.corelibrary.model;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeradorDeArquivo {

	/**
	 * Salva JSON em um arquivo.
	 * @param caminhoCompleto
	 * @param arquivo
	 * @return
	 */
	public static boolean salvarJSON(String caminho, String nome, Object arquivo){
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(caminho + "/" + nome + ".json"), arquivo);
			return true;
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
