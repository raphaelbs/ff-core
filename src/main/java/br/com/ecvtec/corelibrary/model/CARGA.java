package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t9401")
public class CARGA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9401")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@ManyToOne
	@JoinColumn(name = "c2_9401_1001", foreignKey = @ForeignKey(name = "r2_9401_1001"))
	@JsonManagedReference
	private ENTIDADE COLIGADA;

	@OneToOne
	@JoinColumn(name = "c3_9401_5002", foreignKey = @ForeignKey(name = "r3_9401_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DOCUMENTO;

	@ManyToOne
	@JoinColumn(name = "c4_9401_1001", foreignKey = @ForeignKey(name = "r4_9401_1001"))
	@JsonManagedReference
	private ENTIDADE REMETENTE;

	@ManyToOne
	@JoinColumn(name = "c5_9401_1002", foreignKey = @ForeignKey(name = "r5_9401_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO REMETENTE_ENDERECO;

	@Column(name = "c6_9401")

	@Size(max = 40, message = "NUMERO_DOCUMENTO deve possuir no máximo {max} caracteres.")
	private String NUMERO_DOCUMENTO;

	@Column(name = "c7_9401")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar DATA_EMISSAO;

	@ManyToOne
	@JoinColumn(name = "c8_9401_1001", foreignKey = @ForeignKey(name = "r8_9401_1001"))
	@JsonManagedReference
	private ENTIDADE DESTINATARIO;

	@ManyToOne
	@JoinColumn(name = "c9_9401_1002", foreignKey = @ForeignKey(name = "r9_9401_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO DESTINATARIO_ENDERECO;

	@OneToOne
	@JoinColumn(name = "c10_9401_5002", foreignKey = @ForeignKey(name = "r10_9401_5002"))
	@JsonManagedReference
	private TIPO_VALOR STATUS;

	@Column(name = "c11_9401")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private Integer DESCRICAO;

	@Column(name = "c12_9401")
	@Size(max = 20, message = "PESO deve possuir no máximo {max} caracteres.")
	private BigDecimal PESO;

	@OneToOne
	@JoinColumn(name = "c13_9401_5002", foreignKey = @ForeignKey(name = "r13_9401_5002"))
	@JsonManagedReference
	private TIPO_VALOR MOEDA;

	@Column(name = "c14_9401")
	@Size(max = 20, message = "VALOR deve possuir no máximo {max} caracteres.")
	private BigDecimal VALOR;

	@ManyToOne
	@JoinColumn(name = "c15_9401_1002", foreignKey = @ForeignKey(name = "r15_9401_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO COLIGADA_FILIAL;

	@ManyToOne
	@JoinColumn(name = "c16_9401_6201", foreignKey = @ForeignKey(name = "r16_9401_6201"))
	@JsonManagedReference
	private CIDADE CIDADE_ORIGEM;

	@ManyToOne
	@JoinColumn(name = "c17_9401_6201", foreignKey = @ForeignKey(name = "r17_9401_6201"))
	@JsonManagedReference
	private CIDADE CIDADE_DESTINO;

	@OneToOne(mappedBy = "CARGA")
	@JsonManagedReference
	private CARGA_DETALHE CARGA_CARGA_DETALHE;

	/*
	 * @OneToMany(mappedBy="CARGA")
	 * 
	 * private Set<VIAGEM_CARGA> CARGA_VIAGEM_CARGAs;
	 */
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public ENTIDADE getCOLIGADA() {
		return this.COLIGADA;
	}

	public void setCOLIGADA(ENTIDADE COLIGADA) {
		this.COLIGADA = COLIGADA;
	}

	public TIPO_VALOR getTIPO_DOCUMENTO() {
		return this.TIPO_DOCUMENTO;
	}

	public void setTIPO_DOCUMENTO(TIPO_VALOR TIPO_DOCUMENTO) {
		this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
	}

	public ENTIDADE getREMETENTE() {
		return this.REMETENTE;
	}

	public void setREMETENTE(ENTIDADE REMETENTE) {
		this.REMETENTE = REMETENTE;
	}

	public ENTIDADE_ENDERECO getREMETENTE_ENDERECO() {
		return this.REMETENTE_ENDERECO;
	}

	public void setREMETENTE_ENDERECO(ENTIDADE_ENDERECO REMETENTE_ENDERECO) {
		this.REMETENTE_ENDERECO = REMETENTE_ENDERECO;
	}

	public String getNUMERO_DOCUMENTO() {
		return this.NUMERO_DOCUMENTO;
	}

	public void setNUMERO_DOCUMENTO(String NUMERO_DOCUMENTO) {
		this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
	}

	public Calendar getDATA_EMISSAO() {
		return this.DATA_EMISSAO;
	}

	public void setDATA_EMISSAO(Calendar DATA_EMISSAO) {
		this.DATA_EMISSAO = DATA_EMISSAO;
	}

	public ENTIDADE getDESTINATARIO() {
		return this.DESTINATARIO;
	}

	public void setDESTINATARIO(ENTIDADE DESTINATARIO) {
		this.DESTINATARIO = DESTINATARIO;
	}

	public ENTIDADE_ENDERECO getDESTINATARIO_ENDERECO() {
		return this.DESTINATARIO_ENDERECO;
	}

	public void setDESTINATARIO_ENDERECO(ENTIDADE_ENDERECO DESTINATARIO_ENDERECO) {
		this.DESTINATARIO_ENDERECO = DESTINATARIO_ENDERECO;
	}

	public TIPO_VALOR getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(TIPO_VALOR STATUS) {
		this.STATUS = STATUS;
	}

	public Integer getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(Integer DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	public BigDecimal getPESO() {
		return this.PESO;
	}

	public void setPESO(BigDecimal PESO) {
		this.PESO = PESO;
	}

	public TIPO_VALOR getMOEDA() {
		return this.MOEDA;
	}

	public void setMOEDA(TIPO_VALOR MOEDA) {
		this.MOEDA = MOEDA;
	}

	public BigDecimal getVALOR() {
		return this.VALOR;
	}

	public void setVALOR(BigDecimal VALOR) {
		this.VALOR = VALOR;
	}

	public ENTIDADE_ENDERECO getCOLIGADA_FILIAL() {
		return this.COLIGADA_FILIAL;
	}

	public void setCOLIGADA_FILIAL(ENTIDADE_ENDERECO COLIGADA_FILIAL) {
		this.COLIGADA_FILIAL = COLIGADA_FILIAL;
	}

	public CIDADE getCIDADE_ORIGEM() {
		return this.CIDADE_ORIGEM;
	}

	public void setCIDADE_ORIGEM(CIDADE CIDADE_ORIGEM) {
		this.CIDADE_ORIGEM = CIDADE_ORIGEM;
	}

	public CIDADE getCIDADE_DESTINO() {
		return this.CIDADE_DESTINO;
	}

	public void setCIDADE_DESTINO(CIDADE CIDADE_DESTINO) {
		this.CIDADE_DESTINO = CIDADE_DESTINO;
	}

	public CARGA_DETALHE getCARGA_CARGA_DETALHE() {
		return this.CARGA_CARGA_DETALHE;
	}

	public void setCARGA_CARGA_DETALHE(CARGA_DETALHE CARGA_CARGA_DETALHE) {
		this.CARGA_CARGA_DETALHE = CARGA_CARGA_DETALHE;
	}
	/*
	 * public Set<VIAGEM_CARGA> getCARGA_VIAGEM_CARGAs() { return
	 * this.CARGA_VIAGEM_CARGAs; }
	 * 
	 * public void setCARGA_VIAGEM_CARGAs(Set<VIAGEM_CARGA>
	 * CARGA_VIAGEM_CARGAs) { this.CARGA_VIAGEM_CARGAs = CARGA_VIAGEM_CARGAs; }
	 */
}
