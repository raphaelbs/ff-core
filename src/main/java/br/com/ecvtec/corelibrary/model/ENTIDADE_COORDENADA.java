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

@Entity
@Table(name = "t1099")
public class ENTIDADE_COORDENADA implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1099")

	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@ManyToOne
	@JoinColumn(name = "c2_1099", foreignKey = @ForeignKey(name = "r2_1099"))

	private ENTIDADE ENTIDADE;

	@OneToOne
	@JoinColumn(name = "c3_1099", foreignKey = @ForeignKey(name = "r3_1099"))

	private TIPO_VALOR STATUS;

	@Column(name = "c4_1099")

	@NotNull
	private Calendar HORARIO;

	@OneToOne
	@JoinColumn(name = "c5_1099", foreignKey = @ForeignKey(name = "r5_1099"))

	private TIPO_VALOR TIPO_COORDENADA;

	@Column(name = "c6_1099")

	@Size(max = 40, message = "LATITUDE deve possuir no máximo {max} caracteres.")
	private String LATITUDE;

	@Column(name = "c7_1099")

	@Size(max = 40, message = "LONGITUDE deve possuir no máximo {max} caracteres.")
	private String LONGITUDE;

	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public ENTIDADE getENTIDADE() {
		return this.ENTIDADE;
	}

	public void setENTIDADE(ENTIDADE ENTIDADE) {
		this.ENTIDADE = ENTIDADE;
	}

	public TIPO_VALOR getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(TIPO_VALOR STATUS) {
		this.STATUS = STATUS;
	}

	public Calendar getHORARIO() {
		return this.HORARIO;
	}

	public void setHORARIO(Calendar HORARIO) {
		this.HORARIO = HORARIO;
	}

	public TIPO_VALOR getTIPO_COORDENADA() {
		return this.TIPO_COORDENADA;
	}

	public void setTIPO_COORDENADA(TIPO_VALOR TIPO_COORDENADA) {
		this.TIPO_COORDENADA = TIPO_COORDENADA;
	}

	public String getLATITUDE() {
		return this.LATITUDE;
	}

	public void setLATITUDE(String LATITUDE) {
		this.LATITUDE = LATITUDE;
	}

	public String getLONGITUDE() {
		return this.LONGITUDE;
	}

	public void setLONGITUDE(String LONGITUDE) {
		this.LONGITUDE = LONGITUDE;
	}

}
