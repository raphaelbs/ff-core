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

@Entity
@Table(name = "t2097")
public class INSUMO_COMBUSTIVEL implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2097")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2097_2001", foreignKey = @ForeignKey(name = "r2_2097_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@ManyToOne
	@JoinColumn(name = "c3_2097_2001", foreignKey = @ForeignKey(name = "r3_2097_2001"))
	@JsonManagedReference
	private INSUMO COMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public INSUMO getTABELA_DE_INSUMO() {
		return this.TABELA_DE_INSUMO;
	}

	public void setTABELA_DE_INSUMO(INSUMO TABELA_DE_INSUMO) {
		this.TABELA_DE_INSUMO = TABELA_DE_INSUMO;
	}

	@JsonIgnore
	public INSUMO getCOMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_() {
		return this.COMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_;
	}

	public void setCOMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_(
			INSUMO COMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_) {
		this.COMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_ = COMBUSTIVEL_GASOLINA_GAS_DIESEL_ALCOOL_LENHA_ETC_;
	}

}
