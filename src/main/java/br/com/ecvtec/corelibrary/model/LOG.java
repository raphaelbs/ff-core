package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "t9901")
public class LOG implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9901")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@Column(name = "c2_9901_5002")
	@NotNull(message = "TIPO não pode ser nulo.")
	private Integer TIPO;

	@Column(name = "c3_9901_101")
	private Integer TABELA;

	@Column(name = "c4_9901")
	private Integer TABELA_PK;

	@Column(name = "c5_9901_1001")
	private Integer USUARIO;

	@Column(name = "c6_9901")
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar HORA_INICIO;

	@Column(name = "c7_9901")
	@Size(max = 80, message = "MAQUINA deve possuir no máximo {max} caracteres.")
	private String MAQUINA;

	@Column(name = "c8_9901")
	@NotNull(message = "MAQUINA_IP não pode ser nulo.")
	@Size(max = 80, message = "MAQUINA_IP deve possuir no máximo {max} caracteres.")
	private String MAQUINA_IP;

	@Column(name = "c9_9901")
	@Size(max = 80, message = "FORM deve possuir no máximo {max} caracteres.")
	private String FORM;

	@Column(name = "c10_9901")
	@Size(max = 160, message = "COMENTARIO deve possuir no máximo {max} caracteres.")
	private String COMENTARIO;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public Integer getTIPO() {
		return this.TIPO;
	}

	public void setTIPO(Integer TIPO) {
		this.TIPO = TIPO;
	}

	@JsonIgnore
	public Integer getTABELA() {
		return this.TABELA;
	}

	public void setTABELA(Integer TABELA) {
		this.TABELA = TABELA;
	}

	@JsonIgnore
	public Integer getTABELA_PK() {
		return this.TABELA_PK;
	}

	public void setTABELA_PK(Integer TABELA_PK) {
		this.TABELA_PK = TABELA_PK;
	}

	@JsonIgnore
	public Integer getUSUARIO() {
		return this.USUARIO;
	}

	public void setUSUARIO(Integer USUARIO) {
		this.USUARIO = USUARIO;
	}

	@JsonIgnore
	public Calendar getHORA_INICIO() {
		return this.HORA_INICIO;
	}

	public void setHORA_INICIO(Calendar HORA_INICIO) {
		this.HORA_INICIO = HORA_INICIO;
	}

	@JsonIgnore
	public String getMAQUINA() {
		return this.MAQUINA;
	}

	public void setMAQUINA(String MAQUINA) {
		this.MAQUINA = MAQUINA;
	}

	@JsonIgnore
	public String getMAQUINA_IP() {
		return this.MAQUINA_IP;
	}

	public void setMAQUINA_IP(String MAQUINA_IP) {
		this.MAQUINA_IP = MAQUINA_IP;
	}

	@JsonIgnore
	public String getFORM() {
		return this.FORM;
	}

	public void setFORM(String FORM) {
		this.FORM = FORM;
	}

	@JsonIgnore
	public String getCOMENTARIO() {
		return this.COMENTARIO;
	}

	public void setCOMENTARIO(String COMENTARIO) {
		this.COMENTARIO = COMENTARIO;
	}

}
