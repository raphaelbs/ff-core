package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t1006")
public class ENTIDADE_DETALHE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1006")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_1006_1001", foreignKey = @ForeignKey(name = "r2_1006_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@OneToOne
	@JoinColumn(name = "c3_1006_5002", foreignKey = @ForeignKey(name = "r3_1006_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_DETALHE;

	@OneToOne
	@JoinColumn(name = "c4_1006_5002", foreignKey = @ForeignKey(name = "r4_1006_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_TIPO;

	@Column(name = "c5_1006")
	@JsonProperty("DESCRICAO")
	@Size(max = 160, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public ENTIDADE getPESSOA() {
		return this.PESSOA;
	}

	public void setPESSOA(ENTIDADE PESSOA) {
		this.PESSOA = PESSOA;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_DETALHE() {
		return this.TIPO_DE_DETALHE;
	}

	public void setTIPO_DE_DETALHE(TIPO_VALOR TIPO_DE_DETALHE) {
		this.TIPO_DE_DETALHE = TIPO_DE_DETALHE;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_TIPO() {
		return this.TIPO_DE_TIPO;
	}

	public void setTIPO_DE_TIPO(TIPO_VALOR TIPO_DE_TIPO) {
		this.TIPO_DE_TIPO = TIPO_DE_TIPO;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

}
