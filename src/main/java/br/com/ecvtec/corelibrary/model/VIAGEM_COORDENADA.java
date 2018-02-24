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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t9504")
public class VIAGEM_COORDENADA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9504")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@OneToOne
	@JoinColumn(name = "c2_9504_9501", foreignKey = @ForeignKey(name = "r2_9504_9501"))
	@JsonManagedReference
	private VIAGEM VIAGEM;

	@ManyToOne
	@JoinColumn(name = "c3_9504_9502", foreignKey = @ForeignKey(name = "r3_9504_9502"))
	@JsonManagedReference
	private VIAGEM_TRAJETO TRAJETO;

	@Column(name = "c4_9504")
	@NotNull
	private Calendar HORARIO;

	@Column(name = "c5_9504")
	@Size(max = 40, message = "LATITUDE deve possuir no maximo {max} caracteres.")
	private String LATITUDE;

	@Column(name = "c6_9504")
	@NotNull
	@Size(max = 40, message = "LONGITUDE deve possuir no maximo {max} caracteres.")
	private String LONGITUDE;

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
	public VIAGEM_TRAJETO getTRAJETO() {
		return this.TRAJETO;
	}

	public void setTRAJETO(VIAGEM_TRAJETO TRAJETO) {
		this.TRAJETO = TRAJETO;
	}

	@JsonIgnore
	public Calendar getHORARIO() {
		return this.HORARIO;
	}

	public void setHORARIO(Calendar HORARIO) {
		this.HORARIO = HORARIO;
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

}
