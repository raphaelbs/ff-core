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
@Table(name = "t1005")
public class ENTIDADE_AGENDA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1005")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_1005_1001", foreignKey = @ForeignKey(name = "r2_1005_1001"))
	@JsonManagedReference
	private ENTIDADE ENTIDADE;

	@ManyToOne
	@JoinColumn(name = "c7_1005_1004", foreignKey = @ForeignKey(name = "r7_1005_1004"))
	@JsonManagedReference
	private ENTIDADE_CONTATO CONTATO;

	@OneToOne
	@JoinColumn(name = "c4_1005_5002", foreignKey = @ForeignKey(name = "r4_1005_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_AGENDA;

	@Column(name = "c5_1005")
	@Size(max = 80, message = "NUMERO_OU_CONTA deve possuir no maximo {max} caracteres.")
	@JsonProperty("NUMERO_OU_CONTA")
	private String NUMERO_OU_CONTA;

	@ManyToOne
	@JoinColumn(name = "c6_1005_1001", foreignKey = @ForeignKey(name = "r6_1005_1001"))
	@JsonManagedReference
	private ENTIDADE OPERADORA;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public ENTIDADE getENTIDADE() {
		return this.ENTIDADE;
	}

	public void setENTIDADE(ENTIDADE ENTIDADE) {
		this.ENTIDADE = ENTIDADE;
	}

	@JsonIgnore
	public ENTIDADE_CONTATO getCONTATO() {
		return this.CONTATO;
	}

	public void setCONTATO(ENTIDADE_CONTATO CONTATO) {
		this.CONTATO = CONTATO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_AGENDA() {
		return this.TIPO_DE_AGENDA;
	}

	public void setTIPO_DE_AGENDA(TIPO_VALOR TIPO_DE_AGENDA) {
		this.TIPO_DE_AGENDA = TIPO_DE_AGENDA;
	}

	@JsonIgnore
	public String getNUMERO_OU_CONTA() {
		return this.NUMERO_OU_CONTA;
	}

	public void setNUMERO_OU_CONTA(String NUMERO_OU_CONTA) {
		this.NUMERO_OU_CONTA = NUMERO_OU_CONTA;
	}

	@JsonIgnore
	public ENTIDADE getOPERADORA() {
		return this.OPERADORA;
	}

	public void setOPERADORA(ENTIDADE OPERADORA) {
		this.OPERADORA = OPERADORA;
	}

}
