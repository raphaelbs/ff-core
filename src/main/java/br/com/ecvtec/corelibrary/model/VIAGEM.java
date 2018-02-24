package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t9501")
public class VIAGEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9501")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@ManyToOne
	@JoinColumn(name = "c2_9501_1001", foreignKey = @ForeignKey(name = "r2_9501_1001"))
	@JsonManagedReference
	private ENTIDADE COLIGADA;

	@Column(name = "c3_9501")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO;

	@OneToOne
	@JoinColumn(name = "c4_9501_5002", foreignKey = @ForeignKey(name = "r4_9501_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_VIAGEM;

	@OneToOne
	@JoinColumn(name = "c5_9501_5002", foreignKey = @ForeignKey(name = "r5_9501_5002"))
	@JsonManagedReference
	private TIPO_VALOR STATUS;

	@Column(name = "c6_9501")
	private Calendar DATA_INICIO;

	@OneToOne
	@JoinColumn(name = "c7_9501_5002", foreignKey = @ForeignKey(name = "r7_9501_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_COORDENADA;

	@ManyToOne
	@JoinColumn(name = "c8_9501_1002", foreignKey = @ForeignKey(name = "r8_9501_1002"))
	@JsonManagedReference
	private ENTIDADE_ENDERECO COLIGADA_FILIIAL;

	@ManyToOne
	@JoinColumn(name = "c9_9501_1001", foreignKey = @ForeignKey(name = "r9_9501_1001"))
	@JsonManagedReference
	private ENTIDADE CONTRATADO;

	@ManyToOne
	@JoinColumn(name = "c10_9501_2001", foreignKey = @ForeignKey(name = "r10_9501_2001"))
	@JsonManagedReference
	private INSUMO VEICULO;

	@OneToOne(mappedBy = "VIAGEM")
	@JsonManagedReference
	private VIAGEM_CARGA VIAGEM_VIAGEM_CARGA;

	@OneToOne(mappedBy = "VIAGEM")
	@JsonManagedReference
	private VIAGEM_COORDENADA VIAGEM_VIAGEM_COORDENADA;

	@OneToOne(mappedBy = "VIAGEM")
	@JsonManagedReference
	private VIAGEM_TRAJETO VIAGEM_VIAGEM_TRAJETO;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public ENTIDADE getCOLIGADA() {
		return this.COLIGADA;
	}

	public void setCOLIGADA(ENTIDADE COLIGADA) {
		this.COLIGADA = COLIGADA;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_VIAGEM() {
		return this.TIPO_VIAGEM;
	}

	public void setTIPO_VIAGEM(TIPO_VALOR TIPO_VIAGEM) {
		this.TIPO_VIAGEM = TIPO_VIAGEM;
	}

	@JsonIgnore
	public TIPO_VALOR getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(TIPO_VALOR STATUS) {
		this.STATUS = STATUS;
	}

	@JsonIgnore
	public Calendar getDATA_INICIO() {
		return this.DATA_INICIO;
	}

	public void setDATA_INICIO(Calendar DATA_INICIO) {
		this.DATA_INICIO = DATA_INICIO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_COORDENADA() {
		return this.TIPO_COORDENADA;
	}

	public void setTIPO_COORDENADA(TIPO_VALOR TIPO_COORDENADA) {
		this.TIPO_COORDENADA = TIPO_COORDENADA;
	}

	@JsonIgnore
	public ENTIDADE_ENDERECO getCOLIGADA_FILIIAL() {
		return this.COLIGADA_FILIIAL;
	}

	public void setCOLIGADA_FILIIAL(ENTIDADE_ENDERECO COLIGADA_FILIIAL) {
		this.COLIGADA_FILIIAL = COLIGADA_FILIIAL;
	}

	@JsonIgnore
	public ENTIDADE getCONTRATADO() {
		return this.CONTRATADO;
	}

	public void setCONTRATADO(ENTIDADE CONTRATADO) {
		this.CONTRATADO = CONTRATADO;
	}

	@JsonIgnore
	public INSUMO getVEICULO() {
		return this.VEICULO;
	}

	public void setVEICULO(INSUMO VEICULO) {
		this.VEICULO = VEICULO;
	}

	@JsonIgnore
	public VIAGEM_CARGA getVIAGEM_VIAGEM_CARGA() {
		return this.VIAGEM_VIAGEM_CARGA;
	}

	public void setVIAGEM_VIAGEM_CARGA(VIAGEM_CARGA VIAGEM_VIAGEM_CARGA) {
		this.VIAGEM_VIAGEM_CARGA = VIAGEM_VIAGEM_CARGA;
	}

	@JsonIgnore
	public VIAGEM_COORDENADA getVIAGEM_VIAGEM_COORDENADA() {
		return this.VIAGEM_VIAGEM_COORDENADA;
	}

	public void setVIAGEM_VIAGEM_COORDENADA(VIAGEM_COORDENADA VIAGEM_VIAGEM_COORDENADA) {
		this.VIAGEM_VIAGEM_COORDENADA = VIAGEM_VIAGEM_COORDENADA;
	}

	@JsonIgnore
	public VIAGEM_TRAJETO getVIAGEM_VIAGEM_TRAJETO() {
		return this.VIAGEM_VIAGEM_TRAJETO;
	}

	public void setVIAGEM_VIAGEM_TRAJETO(VIAGEM_TRAJETO VIAGEM_VIAGEM_TRAJETO) {
		this.VIAGEM_VIAGEM_TRAJETO = VIAGEM_VIAGEM_TRAJETO;
	}

}
