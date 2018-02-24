package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "t9801")
// @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
// property="@menuJsonId")
public class MENU implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9801")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_9801")
	@NotNull
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@OneToMany(mappedBy = "MENU")
	@JsonProperty("MENU_MENU_ITEM")
	@JsonManagedReference
	private Set<MENU_ITEM> MENU_MENU_ITEMs;

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
	public Set<MENU_ITEM> getMENU_MENU_ITEMs() {
		return this.MENU_MENU_ITEMs;
	}

	public void setMENU_MENU_ITEMs(Set<MENU_ITEM> MENU_MENU_ITEM) {
		this.MENU_MENU_ITEMs = MENU_MENU_ITEM;
	}

}
