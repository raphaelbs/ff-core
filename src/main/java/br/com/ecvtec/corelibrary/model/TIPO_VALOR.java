package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t5002")
public class TIPO_VALOR implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_5002")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c2_5002_5001", foreignKey = @ForeignKey(name = "r2_5002_5001"))
	@JsonProperty("TIPO_DE_TIPO")
	private TIPO TIPO_DE_TIPO;

	@Column(name = "c3_5002")
	@JsonProperty("CHAVE_DO_TIPO")
	private Integer CHAVE_DO_TIPO;

	@Column(name = "c4_5002")
	@Size(max = 400, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@OneToOne
	@JoinColumn(name = "c5_5002_5002")
	@JsonProperty("TIPO_SISTEMA")
	@JsonBackReference(value = "TIPO_SISTEMA")
	private TIPO_VALOR TIPO_SISTEMA;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public TIPO getTIPO_DE_TIPO() {
		return this.TIPO_DE_TIPO;
	}

	public void setTIPO_DE_TIPO(TIPO TIPO_DE_TIPO) {
		this.TIPO_DE_TIPO = TIPO_DE_TIPO;
	}

	@JsonIgnore
	public Integer getCHAVE_DO_TIPO() {
		return this.CHAVE_DO_TIPO;
	}

	public void setCHAVE_DO_TIPO(Integer CHAVE_DO_TIPO) {
		this.CHAVE_DO_TIPO = CHAVE_DO_TIPO;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_SISTEMA() {
		return this.TIPO_SISTEMA;
	}

	public void setTIPO_SISTEMA(TIPO_VALOR TIPO_SISTEMA) {
		this.TIPO_SISTEMA = TIPO_SISTEMA;
	}

}
