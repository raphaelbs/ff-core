package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Calendar;

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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t2003")
public class INSUMO_DOCUMENTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2003")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2003_2001", foreignKey = @ForeignKey(name = "r2_2003_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@ManyToOne
	@JoinColumn(name = "c3_2003_2002", foreignKey = @ForeignKey(name = "r3_2003_2002"))
	@JsonManagedReference
	private INSUMO_ENDERECO PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO;

	@OneToOne
	@JoinColumn(name = "c4_2003_5002", foreignKey = @ForeignKey(name = "r4_2003_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_;

	@Column(name = "c5_2003")
	@Size(max = 40, message = "NUMERO deve possuir no maximo {max} caracteres.")
	private String NUMERO;

	@ManyToOne
	@JoinColumn(name = "c6_2003_1001", foreignKey = @ForeignKey(name = "r6_2003_1001"))
	@JsonBackReference
	private ENTIDADE ORGAO_EMISSOR;

	@Column(name = "c7_2003")
	private Calendar DATA_EMISSAO;

	@Column(name = "c8_2003")
	private Calendar DATA_VALIDADE;

	@OneToOne
	@JoinColumn(name = "c9_2003_5002", foreignKey = @ForeignKey(name = "r9_2003_5002"))
	@JsonManagedReference
	private TIPO_VALOR CATEGORIA;

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
	public INSUMO_ENDERECO getPRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO() {
		return this.PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO;
	}

	public void setPRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO(
			INSUMO_ENDERECO PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO) {
		this.PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO = PRACA_QUANDO_IDENTIFICACAO_FOR_POR_ENDERECO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_() {
		return this.TIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_;
	}

	public void setTIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_(
			TIPO_VALOR TIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_) {
		this.TIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_ = TIPO__NRO_DE_SERIE_CHASSI_PLACA_RENAVAM_E_ETC_;
	}

	@JsonIgnore
	public String getNUMERO() {
		return this.NUMERO;
	}

	public void setNUMERO(String NUMERO) {
		this.NUMERO = NUMERO;
	}

	@JsonIgnore
	public ENTIDADE getORGAO_EMISSOR() {
		return this.ORGAO_EMISSOR;
	}

	public void setORGAO_EMISSOR(ENTIDADE ORGAO_EMISSOR) {
		this.ORGAO_EMISSOR = ORGAO_EMISSOR;
	}

	@JsonIgnore
	public Calendar getDATA_EMISSAO() {
		return this.DATA_EMISSAO;
	}

	public void setDATA_EMISSAO(Calendar DATA_EMISSAO) {
		this.DATA_EMISSAO = DATA_EMISSAO;
	}

	@JsonIgnore
	public Calendar getDATA_VALIDADE() {
		return this.DATA_VALIDADE;
	}

	public void setDATA_VALIDADE(Calendar DATA_VALIDADE) {
		this.DATA_VALIDADE = DATA_VALIDADE;
	}

	@JsonIgnore
	public TIPO_VALOR getCATEGORIA() {
		return this.CATEGORIA;
	}

	public void setCATEGORIA(TIPO_VALOR CATEGORIA) {
		this.CATEGORIA = CATEGORIA;
	}

}
