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
@Table(name = "t104")
// @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
// property="@tabela_referencia_itemJsonId")
public class TABELA_REFERENCIA_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_104")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "c2_104_101", foreignKey = @ForeignKey(name = "r2_104_101"))
	@JsonProperty("TABELA")
	private TABELA TABELA;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c3_104_103", foreignKey = @ForeignKey(name = "r3_104_103"))
	@JsonProperty("REFERENCIA")
	private TABELA_REFERENCIA REFERENCIA;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c4_104_102", foreignKey = @ForeignKey(name = "r4_104_102"))
	@JsonProperty("CAMPO")
	private TABELA_CAMPO CAMPO;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c5_104_102", foreignKey = @ForeignKey(name = "r5_104_102"))
	@JsonProperty("ID_TABELA_ESTRANGEIRA")
	private TABELA_CAMPO ID_TABELA_ESTRANGEIRA;

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
	public TABELA_REFERENCIA getREFERENCIA() {
		return this.REFERENCIA;
	}

	public void setREFERENCIA(TABELA_REFERENCIA REFERENCIA) {
		this.REFERENCIA = REFERENCIA;
	}

	@JsonIgnore
	public TABELA_CAMPO getCAMPO() {
		return this.CAMPO;
	}

	public void setCAMPO(TABELA_CAMPO CAMPO) {
		this.CAMPO = CAMPO;
	}

	@JsonIgnore
	public TABELA_CAMPO getID_TABELA_ESTRANGEIRA() {
		return this.ID_TABELA_ESTRANGEIRA;
	}

	public void setID_TABELA_ESTRANGEIRA(TABELA_CAMPO ID_TABELA_ESTRANGEIRA) {
		this.ID_TABELA_ESTRANGEIRA = ID_TABELA_ESTRANGEIRA;
	}

}
