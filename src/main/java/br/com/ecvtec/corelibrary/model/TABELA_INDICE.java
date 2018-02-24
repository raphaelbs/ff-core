package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t105")
public class TABELA_INDICE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_105")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JsonManagedReference
	@JoinColumn(name = "c2_105_101", foreignKey = @ForeignKey(name = "r2_105_101"))
	@JsonProperty("TABELA")
	private TABELA TABELA;

	@Column(name = "c3_105")
	@Size(max = 80, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c4_105_5002", foreignKey = @ForeignKey(name = "r4_105_5002"))
	@JsonProperty("TIPO_DO_INDICE")
	private TIPO_VALOR TIPO_DO_INDICE;

	@Column(name = "c5_105")
	@Size(max = 40, message = "NOME_FISICO deve possuir no máximo {max} caracteres.")
	@JsonProperty("NOME_FISICO")
	private String NOME_FISICO;

	@OneToMany(mappedBy = "INDICE", cascade = CascadeType.ALL)
	@JsonProperty("INDICE_TABELA_INDICE_ITEMs")
	@JsonBackReference
	private Set<TABELA_INDICE_ITEM> INDICE_TABELA_INDICE_ITEMs;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public TABELA getTABELA() {
		return this.TABELA;
	}

	public void setTABELA(TABELA TABELA) {
		this.TABELA = TABELA;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DO_INDICE() {
		return this.TIPO_DO_INDICE;
	}

	public void setTIPO_DO_INDICE(TIPO_VALOR TIPO_DO_INDICE) {
		this.TIPO_DO_INDICE = TIPO_DO_INDICE;
	}

	@JsonIgnore
	public String getNOME_FISICO() {
		return this.NOME_FISICO;
	}

	public void setNOME_FISICO(String NOME_FISICO) {
		this.NOME_FISICO = NOME_FISICO;
	}

	@JsonIgnore
	public Set<TABELA_INDICE_ITEM> getINDICE_TABELA_INDICE_ITEM() {
		return this.INDICE_TABELA_INDICE_ITEMs;
	}

	public void setINDICE_TABELA_INDICE_ITEM(Set<TABELA_INDICE_ITEM> INDICE_TABELA_INDICE_ITEM) {
		this.INDICE_TABELA_INDICE_ITEMs = INDICE_TABELA_INDICE_ITEM;
	}

}
