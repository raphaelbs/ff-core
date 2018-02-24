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
import javax.validation.constraints.Size;

@Entity(name = "t9406")
public class CARGA_DETALHE implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9406")

	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@OneToOne
	@JoinColumn(name = "c2_9406_9401", foreignKey = @ForeignKey(name = "r2_9406_9401"))

	private CARGA CARGA;

	@OneToOne
	@JoinColumn(name = "c3_9406_5002", foreignKey = @ForeignKey(name = "r3_9406_5002"))

	private TIPO_VALOR TIPO_DETALHE;

	@OneToOne
	@JoinColumn(name = "c4_9406_5002", foreignKey = @ForeignKey(name = "r4_9406_5002"))

	private TIPO_VALOR TIPO_DE_TIPO;

	@Column(name = "c5_9406")

	@Size(max = 160, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO;

	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public CARGA getCARGA() {
		return this.CARGA;
	}

	public void setCARGA(CARGA CARGA) {
		this.CARGA = CARGA;
	}

	public TIPO_VALOR getTIPO_DETALHE() {
		return this.TIPO_DETALHE;
	}

	public void setTIPO_DETALHE(TIPO_VALOR TIPO_DETALHE) {
		this.TIPO_DETALHE = TIPO_DETALHE;
	}

	public TIPO_VALOR getTIPO_DE_TIPO() {
		return this.TIPO_DE_TIPO;
	}

	public void setTIPO_DE_TIPO(TIPO_VALOR TIPO_DE_TIPO) {
		this.TIPO_DE_TIPO = TIPO_DE_TIPO;
	}

	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

}
