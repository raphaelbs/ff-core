package br.com.ecvtec.corelibrary.formulario;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Esta classe representa uma guia (aba) dentro de um {@link FormularioTela}.
 * @author Raphael Brandão
 */
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonInclude(Include.NON_EMPTY)
public final class FormularioGuia {
	
	private int id;
	private String nome;
	private String tipo;
	private int container;
	private String mapeamento;
	private List<FormularioComponente> componentes;

	
	public FormularioGuia(int id, String nome, String tipo, int container, String mapeamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.container = container;
		this.mapeamento = mapeamento;
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
	public void setContainer(int container) {
		this.container = container;
	}
	public void setComponentes(List<FormularioComponente> componentes) {
		this.componentes = componentes;
	}
	public void setMapeamento(String mapeamento) {
		this.mapeamento = mapeamento;
	}


	public int getId() {
		return id;
	}
	public List<FormularioComponente> getCampos() {
		return componentes;
	}	
}
