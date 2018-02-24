package br.com.ecvtec.corelibrary.formulario;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.ecvtec.corelibrary.model.VetorJson;

/**
 * Esta classe representa o formulário Angular completo.
 * @author Raphael Brandão
 */
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonInclude(Include.NON_EMPTY)
public final class Formulario{
	
	public Formulario(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	private long validade;
	private String nome;
	private String tipo;
	private VetorJson crud;
	private List<FormularioTela> telas;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCrud(VetorJson crud) {
		this.crud = crud;
	}
	public void setTelas(List<FormularioTela> telas) {
		this.telas = telas;
	}
	public List<FormularioTela> getTelas() {
		return telas;
	}
	public void setValidade(long tempoApartirDeAgora) {
		this.validade = new Date().getTime() + tempoApartirDeAgora;
	}
	public String getNome() {
		return nome;
	}
}
