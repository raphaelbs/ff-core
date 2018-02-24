package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Calendar;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t1003")
public class ENTIDADE_DOCUMENTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1003")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_1003_1001", foreignKey = @ForeignKey(name = "r2_1003_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@ManyToOne
	@JoinColumn(name = "c3_1003_1002", foreignKey = @ForeignKey(name = "r3_1003_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO PRACA;

	@OneToOne
	@JoinColumn(name = "c4_1003_5002", foreignKey = @ForeignKey(name = "r4_1003_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_DOCUMENTO;

	@Column(name = "c5_1003")
	@JsonProperty("NUMERO_DOCUMENTO")
	@Size(max = 40, message = "NUMERO_DOCUMENTO deve possuir no máximo {max} caracteres.")
	private String NUMERO_DOCUMENTO;

	@ManyToOne
	@JoinColumn(name = "c6_1003_1001", foreignKey = @ForeignKey(name = "r6_1003_1001"))
	@JsonManagedReference
	private ENTIDADE ORGAO_EMISSOR;

	@Column(name = "c7_1003")
	@JsonProperty("DATA_DE_EMISSAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar DATA_DE_EMISSAO;

	@Column(name = "c8_1003")
	@JsonProperty("DATA_DE_VALIDADE")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar DATA_DE_VALIDADE;

	@OneToOne
	@JoinColumn(name = "c9_1003_5002", foreignKey = @ForeignKey(name = "r9_1003_5002"))
	@JsonManagedReference
	private TIPO_VALOR CATEGORIA;

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
	public ENTIDADE_ENDERECO getPRACA() {
		return this.PRACA;
	}

	public void setPRACA(ENTIDADE_ENDERECO PRACA) {
		this.PRACA = PRACA;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_DOCUMENTO() {
		return this.TIPO_DE_DOCUMENTO;
	}

	public void setTIPO_DE_DOCUMENTO(TIPO_VALOR TIPO_DE_DOCUMENTO) {
		this.TIPO_DE_DOCUMENTO = TIPO_DE_DOCUMENTO;
	}

	@JsonIgnore
	public String getNUMERO_DOCUMENTO() {
		return this.NUMERO_DOCUMENTO;
	}

	public void setNUMERO_DOCUMENTO(String NUMERO_DOCUMENTO) {
		this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
	}

	@JsonIgnore
	public ENTIDADE getORGAO_EMISSOR() {
		return this.ORGAO_EMISSOR;
	}

	public void setORGAO_EMISSOR(ENTIDADE ORGAO_EMISSOR) {
		this.ORGAO_EMISSOR = ORGAO_EMISSOR;
	}

	@JsonIgnore
	public Calendar getDATA_DE_EMISSAO() {
		return this.DATA_DE_EMISSAO;
	}

	public void setDATA_DE_EMISSAO(Calendar DATA_DE_EMISSAO) {
		this.DATA_DE_EMISSAO = DATA_DE_EMISSAO;
	}

	@JsonIgnore
	public Calendar getDATA_DE_VALIDADE() {
		return this.DATA_DE_VALIDADE;
	}

	public void setDATA_DE_VALIDADE(Calendar DATA_DE_VALIDADE) {
		this.DATA_DE_VALIDADE = DATA_DE_VALIDADE;
	}

	@JsonIgnore
	public TIPO_VALOR getCATEGORIA() {
		return this.CATEGORIA;
	}

	public void setCATEGORIA(TIPO_VALOR CATEGORIA) {
		this.CATEGORIA = CATEGORIA;
	}

}
