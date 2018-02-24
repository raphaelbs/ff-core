package br.com.ecvtec.corelibrary.formulario;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.ecvtec.corelibrary.model.ObjetoJson;

/**
 * Esta classe representa os dados dos campos (componentes) presentes no {@link Formulario}.
 * @author Raphael Brandão
 */
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonInclude(Include.NON_EMPTY)
public final class FormularioComponente {
	private int id;
	private String alias;
	private String referencia;
	private int vinculo;
	private String descricao;
	private String tipo;
	private String mascara;
	private boolean habilitado;
	private boolean visivel;
	private String icone;
	private String valor;
	
	private ObjetoJson posicao;
	private ObjetoJson preparacao;
	private ObjetoJson ordem;
	private ObjetoJson offset;
	private ObjetoJson validacao;
	private ObjetoJson detalhamento;

	
	
	public int getId() {
		return id;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public void setPosicao(ObjetoJson posicao) {
		this.posicao = posicao;
	}

	public void setOrdem(ObjetoJson ordem) {
		this.ordem = ordem;
	}

	public void setOffset(ObjetoJson offset) {
		this.offset = offset;
	}

	public void setValidacao(ObjetoJson validacao) {
		this.validacao = validacao;
	}
	public void setDetalhamento(ObjetoJson detalhamento) {
		this.detalhamento = detalhamento;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	public void setPreparacao(ObjetoJson preparacao) {
		this.preparacao = preparacao;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	

	public void setVinculo(int vinculo) {
		this.vinculo = vinculo;
	}

	public FormularioComponente(int id, String alias, String referencia, int vinculo, String descricao, String tipo, boolean habilitado,
			boolean visivel, String icone, String mascara, String valor) {
		super();
		this.id = id;
		this.alias = alias;
		this.referencia = referencia;
		this.descricao = descricao;
		this.tipo = tipo;
		this.habilitado = habilitado;
		this.visivel = visivel;
		this.icone = icone;
		this.mascara = mascara;
		this.valor = valor;
		this.vinculo = vinculo;
	}
}
