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

@Entity
@Table(name = "t6001")
public class ENDERECO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6001")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_6001")
	@Size(max = 400, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	private String DESCRICAO;

	@OneToOne
	@JoinColumn(name = "c5_6001_5002", foreignKey = @ForeignKey(name = "r5_6001_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DO_LOGRADOURO;

	@Column(name = "c6_6001")
	@Size(max = 160, message = "LOGRADOURO deve possuir no máximo {max} caracteres.")
	private String LOGRADOURO;

	@Column(name = "c7_6001")
	@Size(max = 40, message = "NUMERO deve possuir no máximo {max} caracteres.")
	private String NUMERO;

	@OneToOne
	@JoinColumn(name = "c8_6001_5002", foreignKey = @ForeignKey(name = "r8_6001_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DO_COMPLEMENTO;

	@Column(name = "c9_6001")
	@Size(max = 40, message = "COMPLEMENTO deve possuir no máximo {max} caracteres.")
	private String COMPLEMENTO;

	@ManyToOne
	@JoinColumn(name = "c10_6001_6202", foreignKey = @ForeignKey(name = "r10_6001_6202"))
	@JsonManagedReference
	private CIDADE_BAIRRO BAIRRO;

	@Column(name = "c11_6001")
	@Size(max = 160, message = "DESCRICAO_DO_BAIRRO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO_DO_BAIRRO;

	@ManyToOne
	@JoinColumn(name = "c12_6001_6201", foreignKey = @ForeignKey(name = "r12_6001_6201"))
	@JsonManagedReference
	private CIDADE CIDADE;

	@Column(name = "c13_6001")

	@Size(max = 40, message = "NUMERO_DO_CEP deve possuir no máximo {max} caracteres.")
	private String NUMERO_DO_CEP;

	@Column(name = "c14_6001")
	@Size(max = 160, message = "REFERENCIA deve possuir no máximo {max} caracteres.")
	private String REFERENCIA;

	@OneToOne
	@JoinColumn(name = "c15_6001_5002", foreignKey = @ForeignKey(name = "r15_6001_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_COORDENADA;

	@Column(name = "c16_6001")
	@Size(max = 40, message = "LATITUDE deve possuir no máximo {max} caracteres.")
	private String LATITUDE;

	@Column(name = "c17_6001")
	@Size(max = 40, message = "LONGITUDE deve possuir no máximo {max} caracteres.")
	private String LONGITUDE;

	@OneToMany(mappedBy = "ENDERECO", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<ENTIDADE_ENDERECO> ENDERECO_ENTIDADE_ENDERECOs;

	/*
	 * @OneToMany(mappedBy="TABELA_DE_ENDERECO")
	 * 
	 * 
	 * TABELA_DE_ENDERECO_INSUMO_ENDERECOs;
	 */

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
	public TIPO_VALOR getTIPO_DO_LOGRADOURO() {
		return this.TIPO_DO_LOGRADOURO;
	}

	public void setTIPO_DO_LOGRADOURO(TIPO_VALOR TIPO_DO_LOGRADOURO) {
		this.TIPO_DO_LOGRADOURO = TIPO_DO_LOGRADOURO;
	}

	@JsonIgnore
	public String getLOGRADOURO() {
		return this.LOGRADOURO;
	}

	public void setLOGRADOURO(String LOGRADOURO) {
		this.LOGRADOURO = LOGRADOURO;
	}

	@JsonIgnore
	public String getNUMERO() {
		return this.NUMERO;
	}

	public void setNUMERO(String NUMERO) {
		this.NUMERO = NUMERO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DO_COMPLEMENTO() {
		return this.TIPO_DO_COMPLEMENTO;
	}

	public void setTIPO_DO_COMPLEMENTO(TIPO_VALOR TIPO_DO_COMPLEMENTO) {
		this.TIPO_DO_COMPLEMENTO = TIPO_DO_COMPLEMENTO;
	}

	@JsonIgnore
	public String getCOMPLEMENTO() {
		return this.COMPLEMENTO;
	}

	public void setCOMPLEMENTO(String COMPLEMENTO) {
		this.COMPLEMENTO = COMPLEMENTO;
	}

	@JsonIgnore
	public CIDADE_BAIRRO getBAIRRO() {
		return this.BAIRRO;
	}

	public void setBAIRRO(CIDADE_BAIRRO BAIRRO) {
		this.BAIRRO = BAIRRO;
	}

	@JsonIgnore
	public String getDESCRICAO_DO_BAIRRO() {
		return this.DESCRICAO_DO_BAIRRO;
	}

	public void setDESCRICAO_DO_BAIRRO(String DESCRICAO_DO_BAIRRO) {
		this.DESCRICAO_DO_BAIRRO = DESCRICAO_DO_BAIRRO;
	}

	@JsonIgnore
	public CIDADE getCIDADE() {
		return this.CIDADE;
	}

	public void setCIDADE(CIDADE CIDADE) {
		this.CIDADE = CIDADE;
	}

	@JsonIgnore
	public String getNUMERO_DO_CEP() {
		return this.NUMERO_DO_CEP;
	}

	public void setNUMERO_DO_CEP(String NUMERO_DO_CEP) {
		this.NUMERO_DO_CEP = NUMERO_DO_CEP;
	}

	@JsonIgnore
	public String getREFERENCIA() {
		return this.REFERENCIA;
	}

	public void setREFERENCIA(String REFERENCIA) {
		this.REFERENCIA = REFERENCIA;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_COORDENADA() {
		return this.TIPO_DE_COORDENADA;
	}

	public void setTIPO_DE_COORDENADA(TIPO_VALOR TIPO_DE_COORDENADA) {
		this.TIPO_DE_COORDENADA = TIPO_DE_COORDENADA;
	}

	@JsonIgnore
	public String getLATITUDE() {
		return this.LATITUDE;
	}

	public void setLATITUDE(String LATITUDE) {
		this.LATITUDE = LATITUDE;
	}

	@JsonIgnore
	public String getLONGITUDE() {
		return this.LONGITUDE;
	}

	public void setLONGITUDE(String LONGITUDE) {
		this.LONGITUDE = LONGITUDE;
	}

	@JsonIgnore
	public Set<ENTIDADE_ENDERECO> getENDERECO_ENTIDADE_ENDERECOs() {
		return this.ENDERECO_ENTIDADE_ENDERECOs;
	}

	public void setENDERECO_ENTIDADE_ENDERECOs(Set<ENTIDADE_ENDERECO> ENDERECO_ENTIDADE_ENDERECOs) {
		this.ENDERECO_ENTIDADE_ENDERECOs = ENDERECO_ENTIDADE_ENDERECOs;
	}
	/*
	 * public Set<INSUMO_ENDERECO> getTABELA_DE_ENDERECO_INSUMO_ENDERECOs() {
	 * return this.TABELA_DE_ENDERECO_INSUMO_ENDERECOs; }
	 * 
	 * public void setTABELA_DE_ENDERECO_INSUMO_ENDERECOs(Set<INSUMO_ENDERECO>
	 * TABELA_DE_ENDERECO_INSUMO_ENDERECOs) {
	 * this.TABELA_DE_ENDERECO_INSUMO_ENDERECOs =
	 * TABELA_DE_ENDERECO_INSUMO_ENDERECOs; }
	 */
}
