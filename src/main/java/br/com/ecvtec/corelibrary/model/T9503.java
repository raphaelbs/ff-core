package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe VIAGEM_CARGA.<br>
 * Representa a tabela t9503 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9503")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9503 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_9503) da tabela VIAGEM_CARGA (t9503)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9503;

	/** Campo VIAGEM (c2_9503_9501) da tabela VIAGEM_CARGA (t9503) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9503_9501", foreignKey = @ForeignKey(name = "r2_9503_9501"))
	private T9501 c2_9503_9501;

	/** Campo CARGA (c3_9503_9401) da tabela VIAGEM_CARGA (t9503) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_9503_9401", foreignKey = @ForeignKey(name = "r3_9503_9401"))
	private T9401 c3_9503_9401;

	/** Campo TRAJETO (c4_9503_9502) da tabela VIAGEM_CARGA (t9503) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_9503_9502", foreignKey = @ForeignKey(name = "r4_9503_9502"))
	private T9502 c4_9503_9502;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9503) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public int getC1_9503() {
		return this.c1_9503;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9503) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public void setC1_9503(int c1_9503) {
		this.c1_9503 = c1_9503;
	}

	/**
	 * Busca valor do campo VIAGEM (c2_9503_9501) da tabela VIAGEM_CARGA (t9503)
	 */
	public T9501 getC2_9503_9501() {
		return this.c2_9503_9501;
	}

	/**
	 * Define valor do campo VIAGEM (c2_9503_9501) da tabela VIAGEM_CARGA
	 * (t9503)
	 */
	public void setC2_9503_9501(T9501 c2_9503_9501) {
		this.c2_9503_9501 = c2_9503_9501;
	}

	/**
	 * Busca valor do campo CARGA (c3_9503_9401) da tabela VIAGEM_CARGA (t9503)
	 */
	public T9401 getC3_9503_9401() {
		return this.c3_9503_9401;
	}

	/**
	 * Define valor do campo CARGA (c3_9503_9401) da tabela VIAGEM_CARGA (t9503)
	 */
	public void setC3_9503_9401(T9401 c3_9503_9401) {
		this.c3_9503_9401 = c3_9503_9401;
	}

	/**
	 * Busca valor do campo TRAJETO (c4_9503_9502) da tabela VIAGEM_CARGA
	 * (t9503)
	 */
	public T9502 getC4_9503_9502() {
		return this.c4_9503_9502;
	}

	/**
	 * Define valor do campo TRAJETO (c4_9503_9502) da tabela VIAGEM_CARGA
	 * (t9503)
	 */
	public void setC4_9503_9502(T9502 c4_9503_9502) {
		this.c4_9503_9502 = c4_9503_9502;
	}

	@Override
	public String toString() {
		return "VIAGEM_CARGA (t9503) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9503)=" + c1_9503 + "]";
	}

}
