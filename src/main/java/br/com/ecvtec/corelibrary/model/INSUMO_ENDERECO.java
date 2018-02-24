package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t2002")
public class INSUMO_ENDERECO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2002")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2002_2001", foreignKey = @ForeignKey(name = "r2_2002_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@Column(name = "c3_2002")
	@Size(max = 40, message = "DESCRICAO_DA_PRACA deve possuir no máximo {max} caracteres.")
	private String DESCRICAO_DA_PRACA;

	@OneToOne
	@JoinColumn(name = "c4_2002_5002", foreignKey = @ForeignKey(name = "r4_2002_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_;

	@ManyToOne
	@JoinColumn(name = "c5_2002_6001", foreignKey = @ForeignKey(name = "r5_2002_6001"))
	@JsonManagedReference
	private ENDERECO TABELA_DE_ENDERECO;

	@OneToMany(mappedBy = "PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO")
	@JsonBackReference
	private Set<INSUMO_DOCUMENTO> PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs;

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
	public String getDESCRICAO_DA_PRACA() {
		return this.DESCRICAO_DA_PRACA;
	}

	public void setDESCRICAO_DA_PRACA(String DESCRICAO_DA_PRACA) {
		this.DESCRICAO_DA_PRACA = DESCRICAO_DA_PRACA;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_() {
		return this.TIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_;
	}

	public void setTIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_(TIPO_VALOR TIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_) {
		this.TIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_ = TIPO_DO_ENDERECO_RESIDENCIAL_COMERCIAL_ETC_;
	}

	@JsonIgnore
	public ENDERECO getTABELA_DE_ENDERECO() {
		return this.TABELA_DE_ENDERECO;
	}

	public void setTABELA_DE_ENDERECO(ENDERECO TABELA_DE_ENDERECO) {
		this.TABELA_DE_ENDERECO = TABELA_DE_ENDERECO;
	}

	@JsonIgnore
	public Set<INSUMO_DOCUMENTO> getPRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs() {
		return this.PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs;
	}

	public void setPRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs(
			Set<INSUMO_DOCUMENTO> PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs) {
		this.PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs = PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO_INSUMO_DOCUMENTOs;
	}

}
