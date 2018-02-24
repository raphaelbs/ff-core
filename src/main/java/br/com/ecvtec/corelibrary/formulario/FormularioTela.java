package br.com.ecvtec.corelibrary.formulario;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Esta classe representa uma tela dentro do {@link Formulario}.
 * @author Raphael Brandão
 */
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonInclude(Include.NON_EMPTY)
public class FormularioTela{
	private int id;
	private String nome;
	private String tipo;
	private List<FormularioGuia> guias;
	
	public FormularioTela(int id, String nome, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setGuias(List<FormularioGuia> guias) {
		this.guias = guias;
	}

	public int getId() {
		return id;
	}
	public List<FormularioGuia> getGuias() {
		return guias;
	}
}