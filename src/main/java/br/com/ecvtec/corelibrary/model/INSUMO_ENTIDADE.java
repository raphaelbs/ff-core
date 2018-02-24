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
@Table(name = "t2007")
public class INSUMO_ENTIDADE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2007")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2007_2001", foreignKey = @ForeignKey(name = "r2_2007_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@OneToOne
	@JoinColumn(name = "c3_2007_5002", foreignKey = @ForeignKey(name = "r3_2007_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC;

	@ManyToOne
	@JoinColumn(name = "c4_2007_1002", foreignKey = @ForeignKey(name = "r4_2007_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO TABELA_DE_PESSOA_PRACA_;

	@OneToOne
	@JoinColumn(name = "c5_2007_5002", foreignKey = @ForeignKey(name = "r5_2007_5002"))
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
	public INSUMO getTABELA_DE_INSUMO() {
		return this.TABELA_DE_INSUMO;
	}

	public void setTABELA_DE_INSUMO(INSUMO TABELA_DE_INSUMO) {
		this.TABELA_DE_INSUMO = TABELA_DE_INSUMO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC() {
		return this.TIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC;
	}

	public void setTIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC(
			TIPO_VALOR TIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC) {
		this.TIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC = TIPO_FABRICANTE_MARCA_PROPRIETARIO_LOCATARIO_MOTORISTA_E_ETC;
	}

	@JsonIgnore
	public ENTIDADE_ENDERECO getTABELA_DE_PESSOA_PRACA_() {
		return this.TABELA_DE_PESSOA_PRACA_;
	}

	public void setTABELA_DE_PESSOA_PRACA_(ENTIDADE_ENDERECO TABELA_DE_PESSOA_PRACA_) {
		this.TABELA_DE_PESSOA_PRACA_ = TABELA_DE_PESSOA_PRACA_;
	}

	@JsonIgnore
	public TIPO_VALOR getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(TIPO_VALOR STATUS) {
		this.STATUS = STATUS;
	}

}
