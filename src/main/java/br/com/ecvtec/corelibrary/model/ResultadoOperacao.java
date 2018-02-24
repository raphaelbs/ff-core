package br.com.ecvtec.corelibrary.model;

public enum ResultadoOperacao {
	SUCESSO("SUCESSO"),
	ERRO("ERRO");
	
	private final String texto;
	
	private ResultadoOperacao(final String texto) {
		this.texto = texto;
	}
	
	public String toString() {
		return texto;
	}
}
