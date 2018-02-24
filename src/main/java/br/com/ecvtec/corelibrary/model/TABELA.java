package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t101")
public class TABELA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_101")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_101")
	@NotNull
	@Size(max = 80, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@Column(name = "c3_101")
	@NotNull
	@Size(max = 40, message = "NOME_FISICO deve possuir no maximo {max} caracteres.")
	@JsonProperty("NOME_FISICO")
	private String NOME_FISICO;

	@OneToMany(mappedBy = "TABELA", cascade = CascadeType.ALL)
	@JsonProperty("TABELA_TABELA_CAMPOs")
	@JsonBackReference
	private Set<TABELA_CAMPO> TABELA_TABELA_CAMPOs;

	@OneToMany(mappedBy = "TABELA", cascade = CascadeType.ALL)
	@JsonProperty("TABELA_TABELA_INDICEs")
	@JsonBackReference
	private Set<TABELA_INDICE> TABELA_TABELA_INDICEs;

	@OneToMany(mappedBy = "TABELA", cascade = CascadeType.ALL)
	@JsonProperty("TABELA_TABELA_INDICE_ITEMs")
	@JsonBackReference
	private Set<TABELA_INDICE_ITEM> TABELA_TABELA_INDICE_ITEMs;

	@OneToMany(mappedBy = "TABELA", cascade = CascadeType.ALL)
	@JsonProperty("TABELA_TABELA_REFERENCIAs")
	@JsonBackReference
	private Set<TABELA_REFERENCIA> TABELA_TABELA_REFERENCIAs;

	@OneToMany(mappedBy = "TABELA", cascade = CascadeType.ALL)
	@JsonProperty("TABELA_TABELA_REFERENCIA_ITEMs")
	@JsonBackReference
	private Set<TABELA_REFERENCIA_ITEM> TABELA_TABELA_REFERENCIA_ITEMs;

	public TABELA() {
		super();
	}

	public TABELA(String id) {
		super();
		this.setID__CHAVE_SEQUENCIAL(Integer.parseInt(id));
	}

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
	public String getNOME_FISICO() {
		return this.NOME_FISICO;
	}

	public void setNOME_FISICO(String NOME_FISICO) {
		this.NOME_FISICO = NOME_FISICO;
	}

	@JsonIgnore
	public Set<TABELA_CAMPO> getTABELA_TABELA_CAMPOs() {
		return this.TABELA_TABELA_CAMPOs;
	}

	public void setTABELA_TABELA_CAMPOs(Set<TABELA_CAMPO> TABELA_TABELA_CAMPOs) {
		this.TABELA_TABELA_CAMPOs = TABELA_TABELA_CAMPOs;
	}

	@JsonIgnore
	public Set<TABELA_INDICE> getTABELA_TABELA_INDICE() {
		return this.TABELA_TABELA_INDICEs;
	}

	public void setTABELA_TABELA_INDICEs(Set<TABELA_INDICE> TABELA_TABELA_INDICE) {
		this.TABELA_TABELA_INDICEs = TABELA_TABELA_INDICE;
	}

	@JsonIgnore
	public Set<TABELA_INDICE_ITEM> getTABELA_TABELA_INDICE_ITEM() {
		return this.TABELA_TABELA_INDICE_ITEMs;
	}

	public void setTABELA_TABELA_INDICE_ITEMs(Set<TABELA_INDICE_ITEM> TABELA_TABELA_INDICE_ITEM) {
		this.TABELA_TABELA_INDICE_ITEMs = TABELA_TABELA_INDICE_ITEM;
	}

	@JsonIgnore
	public Set<TABELA_REFERENCIA> getTABELA_TABELA_REFERENCIA() {
		return this.TABELA_TABELA_REFERENCIAs;
	}

	public void setTABELA_TABELA_REFERENCIA(Set<TABELA_REFERENCIA> TABELA_TABELA_REFERENCIA) {
		this.TABELA_TABELA_REFERENCIAs = TABELA_TABELA_REFERENCIA;
	}

	@JsonIgnore
	public Set<TABELA_REFERENCIA_ITEM> getTABELA_TABELA_REFERENCIA_ITEM() {
		return this.TABELA_TABELA_REFERENCIA_ITEMs;
	}

	public void setTABELA_TABELA_REFERENCIA_ITEM(Set<TABELA_REFERENCIA_ITEM> TABELA_TABELA_REFERENCIA_ITEM) {
		this.TABELA_TABELA_REFERENCIA_ITEMs = TABELA_TABELA_REFERENCIA_ITEM;
	}

}
