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
@Table(name = "t206")
@JsonPropertyOrder({ "ID__CHAVE_SEQUENCIAL", "DOMINIO", "TIPO_DE_DETALHE", "DETALHE_TABELADO", "DESCRICAO" })
public class DOMINIO_DETALHE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_206")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_206_201", foreignKey = @ForeignKey(name = "r2_206_201"))
	@JsonManagedReference
	private DOMINIO DOMINIO;

	@OneToOne
	@JoinColumn(name = "c3_206_5002", foreignKey = @ForeignKey(name = "r3_206_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_DETALHE;

	@OneToOne
	@JoinColumn(name = "c4_206_5002", foreignKey = @ForeignKey(name = "r4_206_5002"))
	@JsonManagedReference
	private TIPO_VALOR DETALHE_TABELADO;

	@Column(name = "c5_206")
	@JsonProperty("DESCRICAO")
	@Size(max = 160, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	private String DESCRICAO;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public DOMINIO getDOMINIO() {
		return this.DOMINIO;
	}

	public void setDOMINIO(DOMINIO DOMINIO) {
		this.DOMINIO = DOMINIO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_DETALHE() {
		return this.TIPO_DE_DETALHE;
	}

	public void setTIPO_DE_DETALHE(TIPO_VALOR TIPO_DE_DETALHE) {
		this.TIPO_DE_DETALHE = TIPO_DE_DETALHE;
	}

	@JsonIgnore
	public TIPO_VALOR getDETALHE_TABELADO() {
		return this.DETALHE_TABELADO;
	}

	public void setDETALHE_TABELADO(TIPO_VALOR DETALHE_TABELADO) {
		this.DETALHE_TABELADO = DETALHE_TABELADO;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

}
