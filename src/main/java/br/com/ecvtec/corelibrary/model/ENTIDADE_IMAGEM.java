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
@Table(name = "t1008")
public class ENTIDADE_IMAGEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1008")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_1008_1001", foreignKey = @ForeignKey(name = "r2_1008_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@OneToOne
	@JoinColumn(name = "c3_1008_5002", foreignKey = @ForeignKey(name = "r3_1008_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_IMAGEM;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "c4_1008_5501", foreignKey = @ForeignKey(name =
	 * "r4_1008_5501"))
	 * 
	 * private MIDIA IMAGEM;
	 */

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
	public TIPO_VALOR getTIPO_DE_IMAGEM() {
		return this.TIPO_DE_IMAGEM;
	}

	public void setTIPO_DE_IMAGEM(TIPO_VALOR TIPO_DE_IMAGEM) {
		this.TIPO_DE_IMAGEM = TIPO_DE_IMAGEM;
	}
	/*
	 * public MIDIA getIMAGEM() { return this.IMAGEM; }
	 * 
	 * public void setIMAGEM(MIDIA IMAGEM) { this.IMAGEM = IMAGEM; }
	 */
}
