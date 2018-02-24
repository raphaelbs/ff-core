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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "t801")
@JsonPropertyOrder({ "ID__CHAVE_SEQUENCIAL", "DESCRICAO" })
public class TERMO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_801")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_801")

	@Size(max = 40, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@OneToMany(mappedBy = "TERMO")
	@JsonBackReference
	private Set<TERMO_ITEM> TERMO_TERMO_ITEMs;

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
	public Set<TERMO_ITEM> getTERMO_TERMO_ITEMs() {
		return this.TERMO_TERMO_ITEMs;
	}

	public void setTERMO_TERMO_ITEMs(Set<TERMO_ITEM> TERMO_TERMO_ITEMs) {
		this.TERMO_TERMO_ITEMs = TERMO_TERMO_ITEMs;
	}

}
