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
@Table(name = "t2008")
public class INSUMO_IMAGEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2008")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2008_2001", foreignKey = @ForeignKey(name = "r2_2008_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@OneToOne
	@JoinColumn(name = "c3_2008_5002", foreignKey = @ForeignKey(name = "r3_2008_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_FOTO_ETC_;

	@ManyToOne
	@JoinColumn(name = "c4_2008_5501", foreignKey = @ForeignKey(name = "r4_2008_5501"))
	@JsonManagedReference
	private MIDIA TABELA_DE_FOTOS;

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
	public TIPO_VALOR getTIPO_FOTO_ETC_() {
		return this.TIPO_FOTO_ETC_;
	}

	public void setTIPO_FOTO_ETC_(TIPO_VALOR TIPO_FOTO_ETC_) {
		this.TIPO_FOTO_ETC_ = TIPO_FOTO_ETC_;
	}

	@JsonIgnore
	public MIDIA getTABELA_DE_FOTOS() {
		return this.TABELA_DE_FOTOS;
	}

	public void setTABELA_DE_FOTOS(MIDIA TABELA_DE_FOTOS) {
		this.TABELA_DE_FOTOS = TABELA_DE_FOTOS;
	}

}
