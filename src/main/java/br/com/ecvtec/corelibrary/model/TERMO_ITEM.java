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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "t802")
@JsonPropertyOrder({ "ID__CHAVE_SEQUENCIAL", "TERMO", "IDIOMA", "DESCRICAO" })
public class TERMO_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_802")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_802_801", foreignKey = @ForeignKey(name = "r2_802_801"))
	@JsonManagedReference
	private TERMO TERMO;

	@OneToOne
	@JoinColumn(name = "c3_802_5002", foreignKey = @ForeignKey(name = "r3_802_5002"))
	@JsonManagedReference
	private TIPO_VALOR IDIOMA;

	@Column(name = "c4_802")
	@JsonProperty("DESCRICAO")
	@Size(max = 400, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	private String DESCRICAO;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public TERMO getTERMO() {
		return this.TERMO;
	}

	public void setTERMO(TERMO TERMO) {
		this.TERMO = TERMO;
	}

	@JsonIgnore
	public TIPO_VALOR getIDIOMA() {
		return this.IDIOMA;
	}

	public void setIDIOMA(TIPO_VALOR IDIOMA) {
		this.IDIOMA = IDIOMA;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

}
