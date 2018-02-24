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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "t201")
@JsonPropertyOrder({ "ID__CHAVE_SEQUENCIAL", "NOME_DO_DOMINIO", "STATUS_DO_DOMINIO_ATIVO__INATIVO_" })
public class DOMINIO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_201")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_201")
	@JsonProperty("NOME_DO_DOMINIO")
	@NotNull
	@Size(max = 40, message = "NOME_DO_DOMINIO deve possuir no maximo {max} caracteres.")
	private String NOME_DO_DOMINIO;

	@OneToOne
	@JoinColumn(name = "c3_201_5002", foreignKey = @ForeignKey(name = "r3_201_5002"))
	@JsonManagedReference
	private TIPO_VALOR STATUS_DO_DOMINIO_ATIVO__INATIVO_;

	@OneToMany(mappedBy = "DOMINIO")
	@JsonBackReference
	private Set<DOMINIO_DETALHE> DOMINIO_DOMINIO_DETALHEs;

	@Transient
	private int menuId;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public String getNOME_DO_DOMINIO() {
		return this.NOME_DO_DOMINIO;
	}

	public void setNOME_DO_DOMINIO(String NOME_DO_DOMINIO) {
		this.NOME_DO_DOMINIO = NOME_DO_DOMINIO;
	}

	@JsonIgnore
	public TIPO_VALOR getSTATUS_DO_DOMINIO_ATIVO__INATIVO_() {
		return this.STATUS_DO_DOMINIO_ATIVO__INATIVO_;
	}

	public void setSTATUS_DO_DOMINIO_ATIVO__INATIVO_(TIPO_VALOR STATUS_DO_DOMINIO_ATIVO__INATIVO_) {
		this.STATUS_DO_DOMINIO_ATIVO__INATIVO_ = STATUS_DO_DOMINIO_ATIVO__INATIVO_;
	}

	@JsonIgnore
	public Set<DOMINIO_DETALHE> getDOMINIO_DOMINIO_DETALHEs() {
		return this.DOMINIO_DOMINIO_DETALHEs;
	}

	public void setDOMINIO_DOMINIO_DETALHEs(Set<DOMINIO_DETALHE> DOMINIO_DOMINIO_DETALHEs) {
		this.DOMINIO_DOMINIO_DETALHEs = DOMINIO_DOMINIO_DETALHEs;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

}
