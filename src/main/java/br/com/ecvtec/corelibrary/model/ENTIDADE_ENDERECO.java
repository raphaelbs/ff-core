package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t1002")
public class ENTIDADE_ENDERECO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1002")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_1002_1001", foreignKey = @ForeignKey(name = "r2_1002_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@Column(name = "c3_1002")
	@JsonProperty("DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_")
	@Size(max = 40, message = "DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_ deve possuir no máximo {max} caracteres.")
	private String DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_;

	@OneToOne
	@JoinColumn(name = "c4_1002_5002", foreignKey = @ForeignKey(name = "r4_1002_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c5_1002_6001", foreignKey = @ForeignKey(name = "r5_1002_6001"))
	@JsonManagedReference
	private ENDERECO ENDERECO;

	@OneToMany(mappedBy = "REMETENTE_ENDERECO")
	@JsonBackReference
	private Set<CARGA> REMETENTE_ENDERECO_CARGAs;

	@OneToMany(mappedBy = "DESTINATARIO_ENDERECO")
	@JsonBackReference
	private Set<CARGA> DESTINATARIO_ENDERECO_CARGAs;

	@OneToMany(mappedBy = "COLIGADA_FILIAL")
	@JsonBackReference
	private Set<CARGA> COLIGADA_FILIAL_CARGAs;

	@OneToMany(mappedBy = "PRACA")
	@JsonBackReference
	private Set<ENTIDADE_CONTATO> PRACA_ENTIDADE_CONTATOs;

	@OneToMany(mappedBy = "PRACA")
	@JsonBackReference
	private Set<ENTIDADE_DOCUMENTO> PRACA_ENTIDADE_DOCUMENTOs;

	/*
	 * @OneToMany(mappedBy="TABELA_DE_PESSOA_PRACA_")
	 * 
	 * private Set<INSUMO_ENTIDADE> TABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs;
	 */
	/*
	 * @OneToMany(mappedBy="COLIGADA_FILIIAL")
	 * 
	 * private Set<VIAGEM> COLIGADA_FILIIAL_VIAGEMs;
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
	public String getDESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_() {
		return this.DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_;
	}

	public void setDESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_(String DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_) {
		this.DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_ = DESCRICAO_NOME_DA_FILIAL_OU_AGENCIA_;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_() {
		return this.TIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_;
	}

	public void setTIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_(
			TIPO_VALOR TIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_) {
		this.TIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_ = TIPO_DO_ENDERECO_COMERCIAL_RESIDENCIAL_E_ETC_;
	}

	@JsonIgnore
	public ENDERECO getENDERECO() {
		return this.ENDERECO;
	}

	public void setENDERECO(ENDERECO ENDERECO) {
		this.ENDERECO = ENDERECO;
	}

	@JsonIgnore
	public Set<CARGA> getREMETENTE_ENDERECO_CARGAs() {
		return this.REMETENTE_ENDERECO_CARGAs;
	}

	public void setREMETENTE_ENDERECO_CARGAs(Set<CARGA> REMETENTE_ENDERECO_CARGAs) {
		this.REMETENTE_ENDERECO_CARGAs = REMETENTE_ENDERECO_CARGAs;
	}

	@JsonIgnore
	public Set<CARGA> getDESTINATARIO_ENDERECO_CARGAs() {
		return this.DESTINATARIO_ENDERECO_CARGAs;
	}

	public void setDESTINATARIO_ENDERECO_CARGAs(Set<CARGA> DESTINATARIO_ENDERECO_CARGAs) {
		this.DESTINATARIO_ENDERECO_CARGAs = DESTINATARIO_ENDERECO_CARGAs;
	}

	@JsonIgnore
	public Set<CARGA> getCOLIGADA_FILIAL_CARGAs() {
		return this.COLIGADA_FILIAL_CARGAs;
	}

	public void setCOLIGADA_FILIAL_CARGAs(Set<CARGA> COLIGADA_FILIAL_CARGAs) {
		this.COLIGADA_FILIAL_CARGAs = COLIGADA_FILIAL_CARGAs;
	}

	@JsonIgnore
	public Set<ENTIDADE_CONTATO> getPRACA_ENTIDADE_CONTATOs() {
		return this.PRACA_ENTIDADE_CONTATOs;
	}

	public void setPRACA_ENTIDADE_CONTATOs(Set<ENTIDADE_CONTATO> PRACA_ENTIDADE_CONTATOs) {
		this.PRACA_ENTIDADE_CONTATOs = PRACA_ENTIDADE_CONTATOs;
	}

	@JsonIgnore
	public Set<ENTIDADE_DOCUMENTO> getPRACA_ENTIDADE_DOCUMENTOs() {
		return this.PRACA_ENTIDADE_DOCUMENTOs;
	}

	public void setPRACA_ENTIDADE_DOCUMENTOs(Set<ENTIDADE_DOCUMENTO> PRACA_ENTIDADE_DOCUMENTOs) {
		this.PRACA_ENTIDADE_DOCUMENTOs = PRACA_ENTIDADE_DOCUMENTOs;
	}
	/*
	 * public Set<INSUMO_ENTIDADE>
	 * getTABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs() { return
	 * this.TABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs; }
	 * 
	 * public void
	 * setTABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs(Set<INSUMO_ENTIDADE>
	 * TABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs) {
	 * this.TABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs =
	 * TABELA_DE_PESSOA_PRACA__INSUMO_ENTIDADEs; }
	 */
	/*
	 * public Set<VIAGEM> getCOLIGADA_FILIIAL_VIAGEMs() { return
	 * this.COLIGADA_FILIIAL_VIAGEMs; }
	 * 
	 * public void setCOLIGADA_FILIIAL_VIAGEMs(Set<VIAGEM>
	 * COLIGADA_FILIIAL_VIAGEMs) { this.COLIGADA_FILIIAL_VIAGEMs =
	 * COLIGADA_FILIIAL_VIAGEMs; }
	 */
}
