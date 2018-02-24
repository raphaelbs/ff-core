package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name = "t1004")
public class ENTIDADE_CONTATO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1004")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_1004_1001", foreignKey = @ForeignKey(name = "r2_1004_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@ManyToOne
	@JoinColumn(name = "c3_1004_1002", foreignKey = @ForeignKey(name = "r3_1004_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO PRACA;

	@OneToOne
	@JoinColumn(name = "c4_1004_5002", foreignKey = @ForeignKey(name = "r4_1004_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_CONTATO;

	@Column(name = "c5_1004")
	@JsonProperty("NOME_DO_CONTATO")
	@Size(max = 80, message = "NOME_DO_CONTATO deve possuir no máximo {max} caracteres.")
	private String NOME_DO_CONTATO;

	@OneToOne
	@JoinColumn(name = "c6_1004_5002", foreignKey = @ForeignKey(name = "r6_1004_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_TRATAMENTO;

	@Column(name = "c7_1004")
	@JsonProperty("DATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO")
	private Calendar DATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO;

	@OneToOne
	@JoinColumn(name = "c8_1004_5002", foreignKey = @ForeignKey(name = "r8_1004_5002"))
	@JsonManagedReference
	private TIPO_VALOR SEXO;

	@OneToOne
	@JoinColumn(name = "c9_1004_5002", foreignKey = @ForeignKey(name = "r9_1004_5002"))
	@JsonManagedReference
	private TIPO_VALOR ESTADO_CIVIL;

	@OneToOne
	@JoinColumn(name = "c10_1004_5002", foreignKey = @ForeignKey(name = "r10_1004_5002"))
	@JsonManagedReference
	private TIPO_VALOR RELIGIAO;

	@Column(name = "c11_1004_6201")
	@JsonProperty("NATURAL_DE")
	private Integer NATURAL_DE;

	@OneToMany(mappedBy = "CONTATO", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<ENTIDADE_AGENDA> CONTATO_ENTIDADE_AGENDAs;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public ENTIDADE getPESSOA() {
		return this.PESSOA;
	}

	public void setPESSOA(ENTIDADE PESSOA) {
		this.PESSOA = PESSOA;
	}

	@JsonIgnore
	public ENTIDADE_ENDERECO getPRACA() {
		return this.PRACA;
	}

	public void setPRACA(ENTIDADE_ENDERECO PRACA) {
		this.PRACA = PRACA;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_CONTATO() {
		return this.TIPO_DE_CONTATO;
	}

	public void setTIPO_DE_CONTATO(TIPO_VALOR TIPO_DE_CONTATO) {
		this.TIPO_DE_CONTATO = TIPO_DE_CONTATO;
	}

	@JsonIgnore
	public String getNOME_DO_CONTATO() {
		return this.NOME_DO_CONTATO;
	}

	public void setNOME_DO_CONTATO(String NOME_DO_CONTATO) {
		this.NOME_DO_CONTATO = NOME_DO_CONTATO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_TRATAMENTO() {
		return this.TIPO_DE_TRATAMENTO;
	}

	public void setTIPO_DE_TRATAMENTO(TIPO_VALOR TIPO_DE_TRATAMENTO) {
		this.TIPO_DE_TRATAMENTO = TIPO_DE_TRATAMENTO;
	}

	@JsonIgnore
	public Calendar getDATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO() {
		return this.DATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO;
	}

	public void setDATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO(Calendar DATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO) {
		this.DATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO = DATA_DE_ANIVERSARIO_OU_DATA_DE_NASCIMENTO;
	}

	@JsonIgnore
	public TIPO_VALOR getSEXO() {
		return this.SEXO;
	}

	public void setSEXO(TIPO_VALOR SEXO) {
		this.SEXO = SEXO;
	}

	@JsonIgnore
	public TIPO_VALOR getESTADO_CIVIL() {
		return this.ESTADO_CIVIL;
	}

	public void setESTADO_CIVIL(TIPO_VALOR ESTADO_CIVIL) {
		this.ESTADO_CIVIL = ESTADO_CIVIL;
	}

	@JsonIgnore
	public TIPO_VALOR getRELIGIAO() {
		return this.RELIGIAO;
	}

	public void setRELIGIAO(TIPO_VALOR RELIGIAO) {
		this.RELIGIAO = RELIGIAO;
	}

	@JsonIgnore
	public Integer getNATURAL_DE() {
		return this.NATURAL_DE;
	}

	public void setNATURAL_DE(Integer NATURAL_DE) {
		this.NATURAL_DE = NATURAL_DE;
	}

	@JsonIgnore
	public Set<ENTIDADE_AGENDA> getCONTATO_ENTIDADE_AGENDAs() {
		return this.CONTATO_ENTIDADE_AGENDAs;
	}

	public void setCONTATO_ENTIDADE_AGENDAs(Set<ENTIDADE_AGENDA> CONTATO_ENTIDADE_AGENDAs) {
		this.CONTATO_ENTIDADE_AGENDAs = CONTATO_ENTIDADE_AGENDAs;
	}

}
