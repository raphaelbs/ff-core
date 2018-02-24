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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t106")
public class TABELA_INDICE_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_106")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c2_106_101", foreignKey = @ForeignKey(name = "r2_106_101"))
	@JsonProperty("TABELA")
	private TABELA TABELA;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c3_106_105", foreignKey = @ForeignKey(name = "r3_106_105"))
	@JsonProperty("INDICE")
	private TABELA_INDICE INDICE;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c4_106_102", foreignKey = @ForeignKey(name = "r4_106_102"))
	@JsonProperty("CAMPO")
	private TABELA_CAMPO CAMPO;

	@Column(name = "c5_106")
	@JsonProperty("ORDEM")
	private Integer ORDEM;

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
	public TABELA_INDICE getINDICE() {
		return this.INDICE;
	}

	public void setINDICE(TABELA_INDICE INDICE) {
		this.INDICE = INDICE;
	}

	@JsonIgnore
	public TABELA_CAMPO getCAMPO() {
		return this.CAMPO;
	}

	public void setCAMPO(TABELA_CAMPO CAMPO) {
		this.CAMPO = CAMPO;
	}

	@JsonIgnore
	public Integer getORDEM() {
		return this.ORDEM;
	}

	public void setORDEM(Integer ORDEM) {
		this.ORDEM = ORDEM;
	}

}
