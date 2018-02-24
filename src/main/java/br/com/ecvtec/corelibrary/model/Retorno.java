package br.com.ecvtec.corelibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Retorno {
	@JsonProperty("Operacao")
	private String Operacao;

	@JsonProperty("Resultado")
	private String Resultado;

	@JsonProperty("Retorno")
	private Object Retorno;

	@JsonProperty("Erro")
	private String Erro;

	@JsonIgnore
	public String getOperacao() {
		return Operacao;
	}

	public void setOperacao(String operacao) {
		this.Operacao = operacao;
	}

	@JsonIgnore
	public String getResultadoOperacao() {
		return Resultado;
	}

	public void setResultadoOperacao(String resultado) {
		this.Resultado = resultado;
	}

	@JsonIgnore
	public Object getRetorno() {
		return Retorno;
	}

	public void setRetorno(Object retorno) {
		this.Retorno = retorno;
	}

	@JsonIgnore
	public String getErro() {
		return Erro;
	}

	public void setErro(String erro) {
		this.Erro = erro;
	}

	public String toJSON() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(this);
		return json;
	}
}
