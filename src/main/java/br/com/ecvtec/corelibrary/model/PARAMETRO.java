package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t5101")
public class PARAMETRO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_5101")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_5101")
	@Size(max = 40, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	private String DESCRICAO;

	@Column(name = "c3_5101")
	@Size(max = 40, message = "VALOR deve possuir no maximo {max} caracteres.")
	private String VALOR;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public String getVALOR() {
		return this.VALOR;
	}

	public void setVALOR(String VALOR) {
		this.VALOR = VALOR;
	}

}
