package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name = "t5006")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@tipo_detalheJsonId")
public class TIPO_DETALHE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_5006")
	@JsonProperty("CHAVE_SEQUENCIAL_PRIMARIA")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@Column(name = "c2_5006_5001")
	@NotNull
	@JsonProperty("TIPO")
	private Integer TIPO;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "c3_5006_5002", foreignKey = @ForeignKey(name = "r3_5006_5002"))
	@JsonProperty("VALOR")
	private TIPO_VALOR VALOR;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "c4_5006_5002", foreignKey = @ForeignKey(name = "r4_5006_5002"))
	@JsonProperty("TIPO_DETALHE")
	private TIPO_VALOR TIPO_DETALHE;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "c5_5006_5002", foreignKey = @ForeignKey(name = "r5_5006_5002"))
	@JsonProperty("TIPO_DE_TIPO")
	private TIPO_VALOR TIPO_DE_TIPO;

	@Column(name = "c6_5006")
	@Size(max = 160, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public Integer getTIPO() {
		return this.TIPO;
	}

	public void setTIPO(Integer TIPO) {
		this.TIPO = TIPO;
	}

	@JsonIgnore
	public TIPO_VALOR getVALOR() {
		return this.VALOR;
	}

	public void setVALOR(TIPO_VALOR VALOR) {
		this.VALOR = VALOR;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DETALHE() {
		return this.TIPO_DETALHE;
	}

	public void setTIPO_DETALHE(TIPO_VALOR TIPO_DETALHE) {
		this.TIPO_DETALHE = TIPO_DETALHE;
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
