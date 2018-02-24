package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t6502")
public class MENSAGEM_DESTINATARIO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6502")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@OneToOne
	@JoinColumn(name = "c2_6502_6501", foreignKey = @ForeignKey(name = "r2_6502_6501"))
	@JsonManagedReference
	private MENSAGEM MENSAGEM;

	@OneToOne
	@JoinColumn(name = "c3_6502_1005", foreignKey = @ForeignKey(name = "r3_6502_1005"))
	@NotNull
	@JsonManagedReference
	private ENTIDADE_AGENDA DESTINATARIO_AGENDA;

	@Column(name = "c4_6502")
	@Size(max = 1600, message = "TEXTO deve possuir no maximo {max} caracteres.")
	private String TEXTO;

	@OneToOne
	@NotNull
	@JoinColumn(name = "c5_6502_5002", foreignKey = @ForeignKey(name = "r5_6502_5002"))
	private TIPO_VALOR STATUS;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public MENSAGEM getMENSAGEM() {
		return this.MENSAGEM;
	}

	public void setMENSAGEM(MENSAGEM MENSAGEM) {
		this.MENSAGEM = MENSAGEM;
	}

	@JsonIgnore
	public ENTIDADE_AGENDA getDESTINATARIO_AGENDA() {
		return this.DESTINATARIO_AGENDA;
	}

	public void setDESTINATARIO_AGENDA(ENTIDADE_AGENDA DESTINATARIO_AGENDA) {
		this.DESTINATARIO_AGENDA = DESTINATARIO_AGENDA;
	}

	@JsonIgnore
	public String getTEXTO() {
		return this.TEXTO;
	}

	public void setTEXTO(String TEXTO) {
		this.TEXTO = TEXTO;
	}

	@JsonIgnore
	public TIPO_VALOR getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(TIPO_VALOR STATUS) {
		this.STATUS = STATUS;
	}

}
