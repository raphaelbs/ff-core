package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t6101")
public class PAIS implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6101")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_6101")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO;

	@Column(name = "c3_6101")
	@Size(max = 40, message = "SIGLA deve possuir no máximo {max} caracteres.")
	private String SIGLA;

	@Column(name = "c4_6101")
	@Size(max = 40, message = "CODIGO_DDI deve possuir no máximo {max} caracteres.")
	private String CODIGO_DDI;

	@OneToMany(mappedBy = "PAIS")
	@JsonBackReference
	private Set<CIDADE> PAIS_CIDADEs;

	@OneToMany(mappedBy = "PAIS")
	@JsonBackReference
	private Set<UNIDADE_DA_FEDERACAO> PAIS_UNIDADE_DA_FEDERACAOs;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public String getSIGLA() {
		return this.SIGLA;
	}

	public void setSIGLA(String SIGLA) {
		this.SIGLA = SIGLA;
	}

	@JsonIgnore
	public String getCODIGO_DDI() {
		return this.CODIGO_DDI;
	}

	public void setCODIGO_DDI(String CODIGO_DDI) {
		this.CODIGO_DDI = CODIGO_DDI;
	}

	@JsonIgnore
	public Set<CIDADE> getPAIS_CIDADEs() {
		return this.PAIS_CIDADEs;
	}

	public void setPAIS_CIDADEs(Set<CIDADE> PAIS_CIDADEs) {
		this.PAIS_CIDADEs = PAIS_CIDADEs;
	}

	@JsonIgnore
	public Set<UNIDADE_DA_FEDERACAO> getPAIS_UNIDADE_DA_FEDERACAOs() {
		return this.PAIS_UNIDADE_DA_FEDERACAOs;
	}

	public void setPAIS_UNIDADE_DA_FEDERACAOs(Set<UNIDADE_DA_FEDERACAO> PAIS_UNIDADE_DA_FEDERACAOs) {
		this.PAIS_UNIDADE_DA_FEDERACAOs = PAIS_UNIDADE_DA_FEDERACAOs;
	}

}
