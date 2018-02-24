package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t103")
public class TABELA_REFERENCIA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_103")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JsonManagedReference
	@JoinColumn(name = "c2_103_101", foreignKey = @ForeignKey(name = "r2_103_101"))
	@JsonProperty("TABELA")
	private TABELA TABELA;

	@Column(name = "c3_103")
	@Size(max = 80, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c4_103_5002", foreignKey = @ForeignKey(name = "r4_103_5002"))
	@JsonProperty("TIPO_REFERENCIA")
	private TIPO_VALOR TIPO_REFERENCIA;

	@Column(name = "c5_103")
	@Size(max = 40, message = "NOME_FISICO deve possuir no maximo {max} caracteres.")
	@JsonProperty("NOME_FISICO")
	private String NOME_FISICO;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c6_103_5002", foreignKey = @ForeignKey(name = "r6_103_5002"))
	@JsonProperty("TIPO_CARDINALIDADE")
	private TIPO_VALOR TIPO_CARDINALIDADE;

	@OneToMany(mappedBy = "REFERENCIA", cascade = CascadeType.ALL)
	@JsonProperty("REFERENCIA_TABELA_REFERENCIA_ITEM")
	@JsonBackReference
	private Set<TABELA_REFERENCIA_ITEM> REFERENCIA_TABELA_REFERENCIA_ITEM;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public TABELA getTABELA() {
		return this.TABELA;
	}

	public void setTABELA(TABELA TABELA) {
		this.TABELA = TABELA;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_REFERENCIA() {
		return this.TIPO_REFERENCIA;
	}

	public void setTIPO_REFERENCIA(TIPO_VALOR TIPO_REFERENCIA) {
		this.TIPO_REFERENCIA = TIPO_REFERENCIA;
	}

	@JsonIgnore
	public String getNOME_FISICO() {
		return this.NOME_FISICO;
	}

	public void setNOME_FISICO(String NOME_FISICO) {
		this.NOME_FISICO = NOME_FISICO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_CARDINALIDADE() {
		return this.TIPO_CARDINALIDADE;
	}

	public void setTIPO_CARDINALIDADE(TIPO_VALOR TIPO_CARDINALIDADE) {
		this.TIPO_CARDINALIDADE = TIPO_CARDINALIDADE;
	}

	@JsonIgnore
	public Set<TABELA_REFERENCIA_ITEM> getREFERENCIA_TABELA_REFERENCIA_ITEM() {
		return this.REFERENCIA_TABELA_REFERENCIA_ITEM;
	}

	public void setREFERENCIA_TABELA_REFERENCIA_ITEM(Set<TABELA_REFERENCIA_ITEM> REFERENCIA_TABELA_REFERENCIA_ITEM) {
		this.REFERENCIA_TABELA_REFERENCIA_ITEM = REFERENCIA_TABELA_REFERENCIA_ITEM;
	}

}
