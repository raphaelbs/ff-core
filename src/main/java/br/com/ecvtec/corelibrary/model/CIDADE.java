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
@Table(name = "t6201")
public class CIDADE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6201")
	@JsonProperty
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_6201")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty
	private String DESCRICAO;

	@ManyToOne
	@JoinColumn(name = "c3_6201_6101", foreignKey = @ForeignKey(name = "r3_6201_6101"))
	@JsonManagedReference
	private PAIS PAIS;

	@ManyToOne
	@JoinColumn(name = "c4_6201_6102", foreignKey = @ForeignKey(name = "r4_6201_6102"))
	@JsonManagedReference
	private UNIDADE_DA_FEDERACAO UF;

	/*
	 * @Column(name = "c5_6201")
	 * 
	 * @Size(max = 40, message =
	 * "CODIGO_DDD deve possuir no máximo {max} caracteres.")
	 * 
	 * @JsonProperty private String CODIGO_DDD;
	 * 
	 * @Column(name = "c6_6201")
	 * 
	 * @JsonProperty private Integer FUSO_HORARIO;
	 */

	@OneToMany(mappedBy = "CIDADE_ORIGEM")
	@JsonBackReference
	private Set<CARGA> CIDADE_ORIGEM_CARGAs;

	@OneToMany(mappedBy = "CIDADE_DESTINO")
	@JsonBackReference
	private Set<CARGA> CIDADE_DESTINO_CARGAs;

	@OneToMany(mappedBy = "CIDADE")
	@JsonBackReference
	private Set<CIDADE_BAIRRO> CIDADE_CIDADE_BAIRROs;

	@OneToMany(mappedBy = "CIDADE")
	@JsonBackReference
	private Set<ENDERECO> CIDADE_ENDERECOs;

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
	public PAIS getPAIS() {
		return this.PAIS;
	}

	public void setPAIS(PAIS PAIS) {
		this.PAIS = PAIS;
	}

	@JsonIgnore
	public UNIDADE_DA_FEDERACAO getUF() {
		return this.UF;
	}

	public void setUF(UNIDADE_DA_FEDERACAO UF) {
		this.UF = UF;
	}

	/*
	 * @JsonIgnore public String getCODIGO_DDD() { return this.CODIGO_DDD; }
	 * 
	 * public void setCODIGO_DDD(String CODIGO_DDD) { this.CODIGO_DDD =
	 * CODIGO_DDD; }
	 * 
	 * @JsonIgnore public Integer getFUSO_HORARIO() { return this.FUSO_HORARIO;
	 * }
	 * 
	 * public void setFUSO_HORARIO(Integer FUSO_HORARIO) { this.FUSO_HORARIO =
	 * FUSO_HORARIO; }
	 */

	@JsonIgnore
	public Set<CARGA> getCIDADE_ORIGEM_CARGAs() {
		return this.CIDADE_ORIGEM_CARGAs;
	}

	public void setCIDADE_ORIGEM_CARGAs(Set<CARGA> CIDADE_ORIGEM_CARGAs) {
		this.CIDADE_ORIGEM_CARGAs = CIDADE_ORIGEM_CARGAs;
	}

	@JsonIgnore
	public Set<CARGA> getCIDADE_DESTINO_CARGAs() {
		return this.CIDADE_DESTINO_CARGAs;
	}

	public void setCIDADE_DESTINO_CARGAs(Set<CARGA> CIDADE_DESTINO_CARGAs) {
		this.CIDADE_DESTINO_CARGAs = CIDADE_DESTINO_CARGAs;
	}

	@JsonIgnore
	public Set<CIDADE_BAIRRO> getCIDADE_CIDADE_BAIRROs() {
		return this.CIDADE_CIDADE_BAIRROs;
	}

	public void setCIDADE_CIDADE_BAIRROs(Set<CIDADE_BAIRRO> CIDADE_CIDADE_BAIRROs) {
		this.CIDADE_CIDADE_BAIRROs = CIDADE_CIDADE_BAIRROs;
	}

	@JsonIgnore
	public Set<ENDERECO> getCIDADE_ENDERECOs() {
		return this.CIDADE_ENDERECOs;
	}

	public void setCIDADE_ENDERECOs(Set<ENDERECO> CIDADE_ENDERECOs) {
		this.CIDADE_ENDERECOs = CIDADE_ENDERECOs;
	}
}
