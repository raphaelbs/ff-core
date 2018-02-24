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
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t102")
public class TABELA_CAMPO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_102")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c2_102_101", foreignKey = @ForeignKey(name = "r2_102_101"))
	@JsonProperty("TABELA")
	private TABELA TABELA;

	@Column(name = "c3_102")
	@Size(max = 80, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c4_102_5002", foreignKey = @ForeignKey(name = "r4_102_5002"))
	@JsonProperty("TIPO_DO_CAMPO")
	private TIPO_VALOR TIPO_DO_CAMPO;

	@Column(name = "c5_102")
	@Size(max = 40, message = "TAMANHO deve possuir no maximo {max} caracteres.")
	@JsonProperty("TAMANHO")
	private String TAMANHO;

	@ManyToOne
	@JoinColumn(name = "c6_102_5002", foreignKey = @ForeignKey(name = "r6_102_5002"))
	@JsonProperty("OBRIGATORIO")
	private TIPO_VALOR OBRIGATORIO;

	@Column(name = "c7_102")
	@JsonProperty("ORDEM")
	private Integer ORDEM;

	@Column(name = "c8_102")
	@Size(max = 40, message = "NOME_FISICO deve possuir no maximo {max} caracteres.")
	@JsonProperty("NOME_FISICO")
	private String NOME_FISICO;

	@OneToMany(mappedBy = "CAMPO", cascade = CascadeType.ALL)
	@JsonProperty("CAMPO_TABELA_INDICE_ITEMs")
	@JsonBackReference
	private Set<TABELA_INDICE_ITEM> CAMPO_TABELA_INDICE_ITEMs;

	@OneToMany(mappedBy = "CAMPO", cascade = CascadeType.ALL)
	@JsonProperty("CAMPO_TABELA_REFERENCIA_ITEMs")
	@JsonBackReference
	private Set<TABELA_REFERENCIA_ITEM> CAMPO_TABELA_REFERENCIA_ITEMs;

	/*
	 * @OneToMany(mappedBy="ID_TABELA_ESTRANGEIRA")
	 * 
	 * @JsonProperty("ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs")
	 * //@JsonManagedReference(value =
	 * "ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs")
	 * 
	 * @JsonBackReference private Set<TABELA_REFERENCIA_ITEM>
	 * ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs;
	 */

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
	public TIPO_VALOR getTIPO_DO_CAMPO() {
		return this.TIPO_DO_CAMPO;
	}

	public void setTIPO_DO_CAMPO(TIPO_VALOR TIPO_DO_CAMPO) {
		this.TIPO_DO_CAMPO = TIPO_DO_CAMPO;
	}

	@JsonIgnore
	public String getTAMANHO() {
		return this.TAMANHO;
	}

	public void setTAMANHO(String TAMANHO) {
		this.TAMANHO = TAMANHO;
	}

	@JsonIgnore
	public TIPO_VALOR getOBRIGATORIO() {
		return this.OBRIGATORIO;
	}

	public void setOBRIGATORIO(TIPO_VALOR OBRIGATORIO) {
		this.OBRIGATORIO = OBRIGATORIO;
	}

	@JsonIgnore
	public Integer getORDEM() {
		return this.ORDEM;
	}

	public void setORDEM(Integer ORDEM) {
		this.ORDEM = ORDEM;
	}

	@JsonIgnore
	public String getNOME_FISICO() {
		return this.NOME_FISICO;
	}

	public void setNOME_FISICO(String NOME_FISICO) {
		this.NOME_FISICO = NOME_FISICO;
	}

	@JsonIgnore
	public Set<TABELA_INDICE_ITEM> getCAMPO_TABELA_INDICE_ITEMs() {
		return this.CAMPO_TABELA_INDICE_ITEMs;
	}

	public void setCAMPO_TABELA_INDICE_ITEMs(Set<TABELA_INDICE_ITEM> CAMPO_TABELA_INDICE_ITEMs) {
		this.CAMPO_TABELA_INDICE_ITEMs = CAMPO_TABELA_INDICE_ITEMs;
	}

	@JsonIgnore
	public Set<TABELA_REFERENCIA_ITEM> getCAMPO_TABELA_REFERENCIA_ITEMs() {
		return this.CAMPO_TABELA_REFERENCIA_ITEMs;
	}

	public void setCAMPO_TABELA_REFERENCIA_ITEMs(Set<TABELA_REFERENCIA_ITEM> CAMPO_TABELA_REFERENCIA_ITEMs) {
		this.CAMPO_TABELA_REFERENCIA_ITEMs = CAMPO_TABELA_REFERENCIA_ITEMs;
	}

	/*
	 * @JsonIgnore public Set<TABELA_REFERENCIA_ITEM>
	 * getID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs() { return
	 * this.ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs; }
	 * 
	 * public void setID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs(Set<
	 * TABELA_REFERENCIA_ITEM> ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs) {
	 * this.ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs =
	 * ID_TABELA_ESTRANGEIRA_TABELA_REFERENCIA_ITEMs; }
	 */
}
