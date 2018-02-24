package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "t9902")
public class LOG_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9902")

	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@Column(name = "c2_9902_9901")

	@NotNull
	private Integer LOG;

	@Column(name = "c3_9902_5501")

	@NotNull
	private Integer DADO;

	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public Integer getLOG() {
		return this.LOG;
	}

	public void setLOG(Integer LOG) {
		this.LOG = LOG;
	}

	public Integer getDADO() {
		return this.DADO;
	}

	public void setDADO(Integer DADO) {
		this.DADO = DADO;
	}

}
