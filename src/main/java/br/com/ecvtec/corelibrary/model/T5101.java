package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe PARÂMETRO.<br>
 * Representa a tabela t5101 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t5101")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T5101 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_5101) da tabela PARÂMETRO (t5101) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_5101;

	/** Campo DESCRIÇÃO (c2_5101) da tabela PARÂMETRO (t5101) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_5101;

	/** Campo VALOR (c3_5101) da tabela PARÂMETRO (t5101) */
	@Size(max = 40, message = "VALOR deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c3_5101;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_5101) da tabela PARÂMETRO
	 * (t5101)
	 */
	public int getC1_5101() {
		return this.c1_5101;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_5101) da tabela PARÂMETRO
	 * (t5101)
	 */
	public void setC1_5101(int c1_5101) {
		this.c1_5101 = c1_5101;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_5101) da tabela PARÂMETRO (t5101) */
	public String getC2_5101() {
		return this.c2_5101;
	}

	/** Define valor do campo DESCRIÇÃO (c2_5101) da tabela PARÂMETRO (t5101) */
	public void setC2_5101(String c2_5101) {
		this.c2_5101 = c2_5101;
	}

	/** Busca valor do campo VALOR (c3_5101) da tabela PARÂMETRO (t5101) */
	public String getC3_5101() {
		return this.c3_5101;
	}

	/** Define valor do campo VALOR (c3_5101) da tabela PARÂMETRO (t5101) */
	public void setC3_5101(String c3_5101) {
		this.c3_5101 = c3_5101;
	}

	@Override
	public String toString() {
		return "PARÂMETRO (t5101) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_5101)=" + c1_5101 + "\n\t\tDESCRIÇÃO (c2_5101)="
				+ c2_5101 + "\n\t\tVALOR (c3_5101)=" + c3_5101 + "]";
	}

}
