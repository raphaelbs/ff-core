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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t9503")
public class VIAGEM_CARGA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9503")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@OneToOne
	@JoinColumn(name = "c2_9503_9501", foreignKey = @ForeignKey(name = "r2_9503_9501"))
	@JsonManagedReference
	private VIAGEM VIAGEM;

	@ManyToOne
	@JoinColumn(name = "c3_9503_9401", foreignKey = @ForeignKey(name = "r3_9503_9401"))
	@JsonManagedReference
	private CARGA CARGA;

	@ManyToOne
	@JoinColumn(name = "c4_9503_9502", foreignKey = @ForeignKey(name = "r4_9503_9502"))
	@JsonManagedReference
	private VIAGEM_TRAJETO TRAJETO;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public VIAGEM getVIAGEM() {
		return this.VIAGEM;
	}

	public void setVIAGEM(VIAGEM VIAGEM) {
		this.VIAGEM = VIAGEM;
	}

	@JsonIgnore
	public CARGA getCARGA() {
		return this.CARGA;
	}

	public void setCARGA(CARGA CARGA) {
		this.CARGA = CARGA;
	}

	@JsonIgnore
	public VIAGEM_TRAJETO getTRAJETO() {
		return this.TRAJETO;
	}

	public void setTRAJETO(VIAGEM_TRAJETO TRAJETO) {
		this.TRAJETO = TRAJETO;
	}

}
