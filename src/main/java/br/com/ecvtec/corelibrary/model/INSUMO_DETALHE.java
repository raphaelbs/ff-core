package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t2006")
public class INSUMO_DETALHE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2006")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2006_2001", foreignKey = @ForeignKey(name = "r2_2006_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@OneToOne
	@JoinColumn(name = "c3_2006_5002", foreignKey = @ForeignKey(name = "r3_2006_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DO_DETALHE_TIPO_79;

	@OneToOne
	@JoinColumn(name = "c4_2006_5002", foreignKey = @ForeignKey(name = "r4_2006_5002"))
	@JsonManagedReference
	private TIPO_VALOR RELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO;

	@Column(name = "c5_2006")
	@Size(max = 160, message = "DESCRICAO_DO_DETALHE deve possuir no maximo {max} caracteres.")
	private String DESCRICAO_DO_DETALHE;

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
	public TIPO_VALOR getTIPO_DO_DETALHE_TIPO_79() {
		return this.TIPO_DO_DETALHE_TIPO_79;
	}

	public void setTIPO_DO_DETALHE_TIPO_79(TIPO_VALOR TIPO_DO_DETALHE_TIPO_79) {
		this.TIPO_DO_DETALHE_TIPO_79 = TIPO_DO_DETALHE_TIPO_79;
	}

	@JsonIgnore
	public TIPO_VALOR getRELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO() {
		return this.RELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO;
	}

	public void setRELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO(
			TIPO_VALOR RELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO) {
		this.RELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO = RELACIONA_COM_UM_TIPO_DE_TIPO_PRE_ESTABELECIDO;
	}

	@JsonIgnore
	public String getDESCRICAO_DO_DETALHE() {
		return this.DESCRICAO_DO_DETALHE;
	}

	public void setDESCRICAO_DO_DETALHE(String DESCRICAO_DO_DETALHE) {
		this.DESCRICAO_DO_DETALHE = DESCRICAO_DO_DETALHE;
	}

}
