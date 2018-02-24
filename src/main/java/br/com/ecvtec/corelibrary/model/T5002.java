package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe TIPO_VALOR.<br>
 * Representa a tabela t5002 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t5002")	
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T5002 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_5002) da tabela TIPO_VALOR (t5002) */
	@Id
	@NotNull
	private int c1_5002;

	/** Campo TIPO DE TIPO (c2_5002_5001) da tabela TIPO_VALOR (t5002) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_5002_5001", foreignKey = @ForeignKey(name = "r2_5002_5001"))
	@JsonBackReference("c2_5002_5001")
	private T5001 c2_5002_5001;

	/** Campo CHAVE DO TIPO (c3_5002) da tabela TIPO_VALOR (t5002) */
	@NotNull
	private int c3_5002;

	/** Campo DESCRIÇÃO (c4_5002) da tabela TIPO_VALOR (t5002) */
	@Size(max = 400, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c4_5002;

	/** Campo TIPO (c5_5002_5002) da tabela TIPO_VALOR (t5002) */
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "c5_5002_5002", foreignKey = @ForeignKey(name = "r5_5002_5002"))
	private T5002 c5_5002_5002;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_5002) da tabela TIPO_VALOR
	 * (t5002)
	 */
	public int getC1_5002() {
		return this.c1_5002;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_5002) da tabela
	 * TIPO_VALOR (t5002)
	 */
	public void setC1_5002(int c1_5002) {
		this.c1_5002 = c1_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c2_5002_5001) da tabela TIPO_VALOR
	 * (t5002)
	 */
	public T5001 getC2_5002_5001() {
		return this.c2_5002_5001;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c2_5002_5001) da tabela TIPO_VALOR
	 * (t5002)
	 */
	public void setC2_5002_5001(T5001 c2_5002_5001) {
		this.c2_5002_5001 = c2_5002_5001;
	}

	/**
	 * Busca valor do campo CHAVE DO TIPO (c3_5002) da tabela TIPO_VALOR (t5002)
	 */
	public int getC3_5002() {
		return this.c3_5002;
	}

	/**
	 * Define valor do campo CHAVE DO TIPO (c3_5002) da tabela TIPO_VALOR
	 * (t5002)
	 */
	public void setC3_5002(int c3_5002) {
		this.c3_5002 = c3_5002;
	}

	/** Busca valor do campo DESCRIÇÃO (c4_5002) da tabela TIPO_VALOR (t5002) */
	public String getC4_5002() {
		return this.c4_5002;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c4_5002) da tabela TIPO_VALOR (t5002)
	 */
	public void setC4_5002(String c4_5002) {
		this.c4_5002 = c4_5002;
	}

	/** Busca valor do campo TIPO (c5_5002_5002) da tabela TIPO_VALOR (t5002) */
	public T5002 getC5_5002_5002() {
		return this.c5_5002_5002;
	}

	/**
	 * Define valor do campo TIPO (c5_5002_5002) da tabela TIPO_VALOR (t5002)
	 */
	public void setC5_5002_5002(T5002 c5_5002_5002) {
		this.c5_5002_5002 = c5_5002_5002;
	}

	@Override
	public String toString() {
		return "TIPO_VALOR (t5002) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_5002)=" + c1_5002
				+ "\n\t\tCHAVE DO TIPO (c3_5002)=" + c3_5002 + "\n\t\tDESCRIÇÃO (c4_5002)=" + c4_5002 + "]";
	}

}
