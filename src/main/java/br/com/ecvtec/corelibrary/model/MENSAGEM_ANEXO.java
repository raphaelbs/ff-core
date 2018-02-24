package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name = "t6508")
public class MENSAGEM_ANEXO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6508")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "c2_6508_6501", foreignKey = @ForeignKey(name = "r2_6508_6501"))
	private MENSAGEM MENSAGEM;

	@OneToOne
	@JsonManagedReference
	@JoinColumn(name = "c3_6508_5002", foreignKey = @ForeignKey(name = "r3_6508_5002"))
	private TIPO_VALOR TIPO_ANEXO;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c4_6508_5501", foreignKey = @ForeignKey(name = "r4_6508_5501"))
	@JsonManagedReference
	private MIDIA MIDIA;

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
	public TIPO_VALOR getTIPO_ANEXO() {
		return this.TIPO_ANEXO;
	}

	public void setTIPO_ANEXO(TIPO_VALOR TIPO_ANEXO) {
		this.TIPO_ANEXO = TIPO_ANEXO;
	}

	@JsonIgnore
	public MIDIA getMIDIA() {
		return this.MIDIA;
	}

	public void setMIDIA(MIDIA MIDIA) {
		this.MIDIA = MIDIA;
	}

}
