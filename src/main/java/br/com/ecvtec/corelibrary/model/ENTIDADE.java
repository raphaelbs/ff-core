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
@Table(name = "t1001")
public class ENTIDADE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1001")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_1001")
	@JsonProperty("DESCRICAO")
	@Size(max = 160, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO;

	@Column(name = "c3_1001")
	@JsonProperty("NOME_FANTASIA_OU_APELIDO")
	@Size(max = 40, message = "NOME_FANTASIA_OU_APELIDO deve possuir no máximo {max} caracteres.")
	private String NOME_FANTASIA_OU_APELIDO;

	@ManyToOne
	@JoinColumn(name = "c4_1001_5002", foreignKey = @ForeignKey(name = "r4_1001_5002"))
	@JsonProperty("TIPO_DE_PESSOA_FISICA_OU_JURIDICA_")
	@JsonManagedReference
	private TIPO_VALOR TIPO_DE_PESSOA_FISICA_OU_JURIDICA_;

	@OneToMany(mappedBy = "COLIGADA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("COLIGADA_CARGAs")
	private Set<CARGA> COLIGADA_CARGAs;

	@OneToMany(mappedBy = "REMETENTE", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("REMETENTE_CARGAs")
	private Set<CARGA> REMETENTE_CARGAs;

	@OneToMany(mappedBy = "DESTINATARIO", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("DESTINATARIO_CARGAs")
	private Set<CARGA> DESTINATARIO_CARGAs;

	@OneToMany(mappedBy = "ENTIDADE", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("TABELA_ENTIDADE_AGENDAs")
	private Set<ENTIDADE_AGENDA> TABELA_ENTIDADE_AGENDAs;

	@OneToMany(mappedBy = "OPERADORA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("OPERADORA_ENTIDADE_AGENDAs")
	private Set<ENTIDADE_AGENDA> OPERADORA_ENTIDADE_AGENDAs;

	@OneToMany(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("TABELA_ENTIDADE_CONTATOs")
	private Set<ENTIDADE_CONTATO> TABELA_ENTIDADE_CONTATOs;

	@OneToMany(mappedBy = "ENTIDADE")
	@JsonBackReference
	@JsonProperty("ENTIDADE_ENTIDADE_COORDENADAs")
	private Set<ENTIDADE_COORDENADA> ENTIDADE_ENTIDADE_COORDENADAs;

	@OneToMany(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PESSOA_ENTIDADE_DETALHEs")
	private Set<ENTIDADE_DETALHE> PESSOA_ENTIDADE_DETALHEs;

	@OneToMany(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PESSOA_ENTIDADE_DOCUMENTOs")
	private Set<ENTIDADE_DOCUMENTO> PESSOA_ENTIDADE_DOCUMENTOs;

	@OneToMany(mappedBy = "ORGAO_EMISSOR", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("ORGAO_EMISSOR_ENTIDADE_DOCUMENTOs")
	private Set<ENTIDADE_DOCUMENTO> ORGAO_EMISSOR_ENTIDADE_DOCUMENTOs;

	@OneToOne(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PESSOA_ENTIDADE_ENDERECO")
	private ENTIDADE_ENDERECO PESSOA_ENTIDADE_ENDERECO;

	@OneToMany(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PESSOA_ENTIDADE_IMAGEMs")
	private Set<ENTIDADE_IMAGEM> PESSOA_ENTIDADE_IMAGEMs;

	@OneToMany(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PESSOA_ENTIDADE_RELACIONAMENTOs")
	private Set<ENTIDADE_RELACIONAMENTO> PESSOA_ENTIDADE_RELACIONAMENTOs;

	@OneToMany(mappedBy = "PESSOA_RELACIONADA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs")
	private Set<ENTIDADE_RELACIONAMENTO> PESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs;

	@OneToOne(mappedBy = "PESSOA", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("PERFIL_USUARIO")
	private ENTIDADE_USUARIO_PERFIL PERFIL_USUARIO;

	/*
	 * 
	 * @OneToMany(mappedBy="ORGAO_EMISSOR") private Set<INSUMO_DOCUMENTO>
	 * ORGAO_EMISSOR_INSUMO_DOCUMENTOs;
	 * 
	 * @OneToMany(mappedBy="COLIGADA") private Set<VIAGEM> COLIGADA_VIAGEMs;
	 * 
	 * @OneToMany(mappedBy="CONTRATADO") private Set<VIAGEM>
	 * CONTRATADO_VIAGEMs;
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
	public String getNOME_FANTASIA_OU_APELIDO() {
		return this.NOME_FANTASIA_OU_APELIDO;
	}

	public void setNOME_FANTASIA_OU_APELIDO(String NOME_FANTASIA_OU_APELIDO) {
		this.NOME_FANTASIA_OU_APELIDO = NOME_FANTASIA_OU_APELIDO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DE_PESSOA_FISICA_OU_JURIDICA_() {
		return this.TIPO_DE_PESSOA_FISICA_OU_JURIDICA_;
	}

	public void setTIPO_DE_PESSOA_FISICA_OU_JURIDICA_(TIPO_VALOR TIPO_DE_PESSOA_FISICA_OU_JURIDICA_) {
		this.TIPO_DE_PESSOA_FISICA_OU_JURIDICA_ = TIPO_DE_PESSOA_FISICA_OU_JURIDICA_;
	}

	@JsonIgnore
	public Set<CARGA> getCOLIGADA_CARGAs() {
		return this.COLIGADA_CARGAs;
	}

	public void setCOLIGADA_CARGAs(Set<CARGA> COLIGADA_CARGAs) {
		this.COLIGADA_CARGAs = COLIGADA_CARGAs;
	}

	@JsonIgnore
	public Set<CARGA> getREMETENTE_CARGAs() {
		return this.REMETENTE_CARGAs;
	}

	public void setREMETENTE_CARGAs(Set<CARGA> REMETENTE_CARGAs) {
		this.REMETENTE_CARGAs = REMETENTE_CARGAs;
	}

	@JsonIgnore
	public Set<CARGA> getDESTINATARIO_CARGAs() {
		return this.DESTINATARIO_CARGAs;
	}

	public void setDESTINATARIO_CARGAs(Set<CARGA> DESTINATARIO_CARGAs) {
		this.DESTINATARIO_CARGAs = DESTINATARIO_CARGAs;
	}

	@JsonIgnore
	public Set<ENTIDADE_AGENDA> getTABELA_ENTIDADE_AGENDAs() {
		return this.TABELA_ENTIDADE_AGENDAs;
	}

	public void setTABELA_ENTIDADE_AGENDAs(Set<ENTIDADE_AGENDA> TABELA_ENTIDADE_AGENDAs) {
		this.TABELA_ENTIDADE_AGENDAs = TABELA_ENTIDADE_AGENDAs;
	}

	@JsonIgnore
	public Set<ENTIDADE_AGENDA> getOPERADORA_ENTIDADE_AGENDAs() {
		return this.OPERADORA_ENTIDADE_AGENDAs;
	}

	public void setOPERADORA_ENTIDADE_AGENDAs(Set<ENTIDADE_AGENDA> OPERADORA_ENTIDADE_AGENDAs) {
		this.OPERADORA_ENTIDADE_AGENDAs = OPERADORA_ENTIDADE_AGENDAs;
	}

	@JsonIgnore
	public Set<ENTIDADE_CONTATO> getTABELA_ENTIDADE_CONTATOs() {
		return this.TABELA_ENTIDADE_CONTATOs;
	}

	public void setTABELA_ENTIDADE_CONTATOs(Set<ENTIDADE_CONTATO> TABELA_ENTIDADE_CONTATOs) {
		this.TABELA_ENTIDADE_CONTATOs = TABELA_ENTIDADE_CONTATOs;
	}

	@JsonIgnore
	public Set<ENTIDADE_COORDENADA> getENTIDADE_ENTIDADE_COORDENADAs() {
		return this.ENTIDADE_ENTIDADE_COORDENADAs;
	}

	public void setENTIDADE_ENTIDADE_COORDENADAs(Set<ENTIDADE_COORDENADA> ENTIDADE_ENTIDADE_COORDENADAs) {
		this.ENTIDADE_ENTIDADE_COORDENADAs = ENTIDADE_ENTIDADE_COORDENADAs;
	}

	@JsonIgnore
	public Set<ENTIDADE_DETALHE> getPESSOA_ENTIDADE_DETALHEs() {
		return this.PESSOA_ENTIDADE_DETALHEs;
	}

	public void setPESSOA_ENTIDADE_DETALHEs(Set<ENTIDADE_DETALHE> PESSOA_ENTIDADE_DETALHEs) {
		this.PESSOA_ENTIDADE_DETALHEs = PESSOA_ENTIDADE_DETALHEs;
	}

	@JsonIgnore
	public Set<ENTIDADE_DOCUMENTO> getPESSOA_ENTIDADE_DOCUMENTOs() {
		return this.PESSOA_ENTIDADE_DOCUMENTOs;
	}

	public void setPESSOA_ENTIDADE_DOCUMENTOs(Set<ENTIDADE_DOCUMENTO> PESSOA_ENTIDADE_DOCUMENTOs) {
		this.PESSOA_ENTIDADE_DOCUMENTOs = PESSOA_ENTIDADE_DOCUMENTOs;
	}

	@JsonIgnore
	public Set<ENTIDADE_DOCUMENTO> getORGAO_EMISSOR_ENTIDADE_DOCUMENTOs() {
		return this.ORGAO_EMISSOR_ENTIDADE_DOCUMENTOs;
	}

	public void setORGAO_EMISSOR_ENTIDADE_DOCUMENTOs(Set<ENTIDADE_DOCUMENTO> ORGAO_EMISSOR_ENTIDADE_DOCUMENTOs) {
		this.ORGAO_EMISSOR_ENTIDADE_DOCUMENTOs = ORGAO_EMISSOR_ENTIDADE_DOCUMENTOs;
	}

	@JsonIgnore
	public ENTIDADE_ENDERECO getPESSOA_ENTIDADE_ENDERECO() {
		return this.PESSOA_ENTIDADE_ENDERECO;
	}

	public void setPESSOA_ENTIDADE_ENDERECO(ENTIDADE_ENDERECO PESSOA_ENTIDADE_ENDERECO) {
		this.PESSOA_ENTIDADE_ENDERECO = PESSOA_ENTIDADE_ENDERECO;
	}

	@JsonIgnore
	public Set<ENTIDADE_IMAGEM> getPESSOA_ENTIDADE_IMAGEMs() {
		return this.PESSOA_ENTIDADE_IMAGEMs;
	}

	public void setPESSOA_ENTIDADE_IMAGEMs(Set<ENTIDADE_IMAGEM> PESSOA_ENTIDADE_IMAGEMs) {
		this.PESSOA_ENTIDADE_IMAGEMs = PESSOA_ENTIDADE_IMAGEMs;
	}

	@JsonIgnore
	public Set<ENTIDADE_RELACIONAMENTO> getPESSOA_ENTIDADE_RELACIONAMENTOs() {
		return this.PESSOA_ENTIDADE_RELACIONAMENTOs;
	}

	public void setPESSOA_ENTIDADE_RELACIONAMENTOs(Set<ENTIDADE_RELACIONAMENTO> PESSOA_ENTIDADE_RELACIONAMENTOs) {
		this.PESSOA_ENTIDADE_RELACIONAMENTOs = PESSOA_ENTIDADE_RELACIONAMENTOs;
	}

	@JsonIgnore
	public Set<ENTIDADE_RELACIONAMENTO> getPESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs() {
		return this.PESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs;
	}

	public void setPESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs(
			Set<ENTIDADE_RELACIONAMENTO> PESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs) {
		this.PESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs = PESSOA_RELACIONADA_ENTIDADE_RELACIONAMENTOs;
	}

	public ENTIDADE_USUARIO_PERFIL getPERFIL_USUARIO() {
		return PERFIL_USUARIO;
	}

	public void setPERFIL_USUARIO(ENTIDADE_USUARIO_PERFIL pERFIL_USUARIO) {
		PERFIL_USUARIO = pERFIL_USUARIO;
	}

	/*
	 * 
	 * 
	 * public Set<INSUMO_DOCUMENTO> getORGAO_EMISSOR_INSUMO_DOCUMENTOs() {
	 * return this.ORGAO_EMISSOR_INSUMO_DOCUMENTOs; }
	 * 
	 * public void setORGAO_EMISSOR_INSUMO_DOCUMENTOs(Set<INSUMO_DOCUMENTO>
	 * ORGAO_EMISSOR_INSUMO_DOCUMENTOs) { this.ORGAO_EMISSOR_INSUMO_DOCUMENTOs =
	 * ORGAO_EMISSOR_INSUMO_DOCUMENTOs; }
	 * 
	 * public Set<VIAGEM> getCOLIGADA_VIAGEMs() { return this.COLIGADA_VIAGEMs;
	 * }
	 * 
	 * public void setCOLIGADA_VIAGEMs(Set<VIAGEM> COLIGADA_VIAGEMs) {
	 * this.COLIGADA_VIAGEMs = COLIGADA_VIAGEMs; }
	 * 
	 * public Set<VIAGEM> getCONTRATADO_VIAGEMs() { return
	 * this.CONTRATADO_VIAGEMs; }
	 * 
	 * public void setCONTRATADO_VIAGEMs(Set<VIAGEM> CONTRATADO_VIAGEMs) {
	 * this.CONTRATADO_VIAGEMs = CONTRATADO_VIAGEMs; }
	 */
}
