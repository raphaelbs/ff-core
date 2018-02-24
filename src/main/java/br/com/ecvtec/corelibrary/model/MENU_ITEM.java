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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "t9802")
// @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
// property="@menu_itemJsonId")
public class MENU_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9802")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "c2_9802_9801", foreignKey = @ForeignKey(name = "r2_9802_9801"))
	@JsonProperty("MENU")
	private MENU MENU;

	@Column(name = "c3_9802")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "c4_9802_5002", foreignKey = @ForeignKey(name = "r4_9802_5002"))
	@JsonProperty("TIPO")
	private TIPO_VALOR TIPO;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "c5_9802_9802", foreignKey = @ForeignKey(name = "r5_9802_9802"))
	@JsonProperty("MENU_SUPERIOR")
	private MENU_ITEM MENU_SUPERIOR;

	@Column(name = "c6_9802")
	@Size(max = 160, message = "FORM deve possuir no máximo {max} caracteres.")
	@JsonProperty("FORM")
	private String FORM;

	@Column(name = "c7_9802")
	@NotNull
	@JsonProperty("ORDERNACAO")
	private Integer ORDERNACAO;

	@OneToMany(mappedBy = "MENU_SUPERIOR")
	@JsonProperty("MENU_SUPERIOR_MENU_ITEMs")
	@JsonManagedReference
	private Set<MENU_ITEM> MENU_SUPERIOR_MENU_ITEMs;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public MENU getMENU() {
		return this.MENU;
	}

	public void setMENU(MENU MENU) {
		this.MENU = MENU;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO() {
		return this.TIPO;
	}

	public void setTIPO(TIPO_VALOR TIPO) {
		this.TIPO = TIPO;
	}

	@JsonIgnore
	public MENU_ITEM getMENU_SUPERIOR() {
		return this.MENU_SUPERIOR;
	}

	public void setMENU_SUPERIOR(MENU_ITEM MENU_SUPERIOR) {
		this.MENU_SUPERIOR = MENU_SUPERIOR;
	}

	@JsonIgnore
	public String getFORM() {
		return this.FORM;
	}

	public void setFORM(String FORM) {
		this.FORM = FORM;
	}

	@JsonIgnore
	public Integer getORDERNACAO() {
		return this.ORDERNACAO;
	}

	public void setORDERNACAO(Integer ORDERNACAO) {
		this.ORDERNACAO = ORDERNACAO;
	}

	@JsonIgnore
	public Set<MENU_ITEM> getMENU_SUPERIOR_MENU_ITEMs() {
		return this.MENU_SUPERIOR_MENU_ITEMs;
	}

	public void setMENU_SUPERIOR_MENU_ITEMs(Set<MENU_ITEM> MENU_SUPERIOR_MENU_ITEMs) {
		this.MENU_SUPERIOR_MENU_ITEMs = MENU_SUPERIOR_MENU_ITEMs;
	}

}
