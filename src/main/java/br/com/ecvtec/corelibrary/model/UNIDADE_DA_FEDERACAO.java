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
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t6102")
public class UNIDADE_DA_FEDERACAO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6102")
	@JsonProperty
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_6102_6101", foreignKey = @ForeignKey(name = "r2_6102_6101"))
	@JsonManagedReference
	private PAIS PAIS;

	@Column(name = "c3_6102")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty
	private String DESCRICAO;

	@Column(name = "c4_6102")
	@Size(max = 40, message = "SIGLA deve possuir no máximo {max} caracteres.")
	@JsonProperty
	private String SIGLA;

	@ManyToOne
	@JoinColumn(name = "c5_6102_5002", foreignKey = @ForeignKey(name = "r5_6102_5002"))
	@JsonManagedReference
	private TIPO_VALOR REGIAO;

	@OneToMany(mappedBy = "UF")
	@JsonBackReference
	private Set<CIDADE> UF_CIDADEs;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public PAIS getPAIS() {
		return this.PAIS;
	}

	public void setPAIS(PAIS PAIS) {
		this.PAIS = PAIS;
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
	public Set<CIDADE> getUF_CIDADEs() {
		return this.UF_CIDADEs;
	}

	public void setUF_CIDADEs(Set<CIDADE> UF_CIDADEs) {
		this.UF_CIDADEs = UF_CIDADEs;
	}

	public TIPO_VALOR getREGIAO() {
		return REGIAO;
	}

	public void setREGIAO(TIPO_VALOR REGIAO) {
		this.REGIAO = REGIAO;
	}

}
