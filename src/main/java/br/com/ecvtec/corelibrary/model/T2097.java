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
 * Classe INSUMO_COMBUSTÍVEL.<br>
 * Representa a tabela t2097 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2097")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2097 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2097) da tabela INSUMO_COMBUSTÍVEL
	 * (t2097)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2097;

	/**
	 * Campo TABELA DE INSUMO (c2_2097_2001) da tabela INSUMO_COMBUSTÍVEL
	 * (t2097)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2097_2001", foreignKey = @ForeignKey(name = "r2_2097_2001"))
	private T2001 c2_2097_2001;

	/**
	 * Campo COMBUSTIVEL (GASOLINA, GAS, DIESEL, ALCOOL, LENHA ETC)
	 * (c3_2097_2001) da tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	@ManyToOne
	@JoinColumn(name = "c3_2097_2001", foreignKey = @ForeignKey(name = "r3_2097_2001"))
	private T2001 c3_2097_2001;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2097) da tabela
	 * INSUMO_COMBUSTÍVEL (t2097)
	 */
	public int getC1_2097() {
		return this.c1_2097;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2097) da tabela
	 * INSUMO_COMBUSTÍVEL (t2097)
	 */
	public void setC1_2097(int c1_2097) {
		this.c1_2097 = c1_2097;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2097_2001) da tabela
	 * INSUMO_COMBUSTÍVEL (t2097)
	 */
	public T2001 getC2_2097_2001() {
		return this.c2_2097_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2097_2001) da tabela
	 * INSUMO_COMBUSTÍVEL (t2097)
	 */
	public void setC2_2097_2001(T2001 c2_2097_2001) {
		this.c2_2097_2001 = c2_2097_2001;
	}

	/**
	 * Busca valor do campo COMBUSTIVEL (GASOLINA, GAS, DIESEL, ALCOOL, LENHA
	 * ETC) (c3_2097_2001) da tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	public T2001 getC3_2097_2001() {
		return this.c3_2097_2001;
	}

	/**
	 * Define valor do campo COMBUSTIVEL (GASOLINA, GAS, DIESEL, ALCOOL, LENHA
	 * ETC) (c3_2097_2001) da tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	public void setC3_2097_2001(T2001 c3_2097_2001) {
		this.c3_2097_2001 = c3_2097_2001;
	}

	@Override
	public String toString() {
		return "INSUMO_COMBUSTÍVEL (t2097) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2097)=" + c1_2097 + "]";
	}

}
