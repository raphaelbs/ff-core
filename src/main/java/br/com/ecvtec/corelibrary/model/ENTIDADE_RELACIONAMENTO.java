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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t1007")
public class ENTIDADE_RELACIONAMENTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1007")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_1007_1001", foreignKey = @ForeignKey(name = "r2_1007_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@OneToOne
	@JoinColumn(name = "c3_1007_5002", foreignKey = @ForeignKey(name = "r3_1007_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_ENTIDADE;

	@ManyToOne
	@JoinColumn(name = "c4_1007_1001", foreignKey = @ForeignKey(name = "r4_1007_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA_RELACIONADA;

	@OneToOne
	@JoinColumn(name = "c5_1007_5002", foreignKey = @ForeignKey(name = "r5_1007_5002"))
	@JsonManagedReference
	private TIPO_VALOR STATUS;

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
	public TIPO_VALOR getTIPO_DE_ENTIDADE() {
		return this.TIPO_DE_ENTIDADE;
	}

	public void setTIPO_DE_ENTIDADE(TIPO_VALOR TIPO_DE_ENTIDADE) {
		this.TIPO_DE_ENTIDADE = TIPO_DE_ENTIDADE;
	}

	@JsonIgnore
	public ENTIDADE getPESSOA_RELACIONADA() {
		return this.PESSOA_RELACIONADA;
	}

	public void setPESSOA_RELACIONADA(ENTIDADE PESSOA_RELACIONADA) {
		this.PESSOA_RELACIONADA = PESSOA_RELACIONADA;
	}

	@JsonIgnore
	public TIPO_VALOR getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(TIPO_VALOR STATUS) {
		this.STATUS = STATUS;
	}

}
