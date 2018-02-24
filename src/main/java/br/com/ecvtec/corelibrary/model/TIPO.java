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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t5001")
public class TIPO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_5001")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_5001")
	@NotNull
	@Size(max = 40, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "c3_5001_5002", foreignKey = @ForeignKey(name = "r3_5001_5002"))
	@JsonIgnore
	private TIPO_VALOR TIPO;

	@OneToMany(mappedBy = "TIPO_DE_TIPO")
	@JsonProperty("TIPO_DE_TIPO_TIPO_VALORs")
	@JsonBackReference
	@PrimaryKeyJoinColumn(name = "c2_5002_5001")
	private Set<TIPO_VALOR> TIPO_DE_TIPO_TIPO_VALORs;

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
	public TIPO_VALOR getTIPO() {
		return this.TIPO;
	}

	public void setTIPO(TIPO_VALOR TIPO) {
		this.TIPO = TIPO;
	}

	@JsonIgnore
	public Set<TIPO_VALOR> getTIPO_DE_TIPO_TIPO_VALORs() {
		return this.TIPO_DE_TIPO_TIPO_VALORs;
	}

	public void setTIPO_DE_TIPO_TIPO_VALORs(Set<TIPO_VALOR> TIPO_DE_TIPO_TIPO_VALORs) {
		this.TIPO_DE_TIPO_TIPO_VALORs = TIPO_DE_TIPO_TIPO_VALORs;
	}

}
