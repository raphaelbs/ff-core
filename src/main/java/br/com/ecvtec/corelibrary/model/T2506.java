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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe CONTA_DETALHE.<br>
 * Representa a tabela t2506 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2506")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2506 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_2506) da tabela CONTA_DETALHE (t2506) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2506;

	/** Campo CONTA (c2_2506_2501) da tabela CONTA_DETALHE (t2506) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2506_2501", foreignKey = @ForeignKey(name = "r2_2506_2501"))
	private T2501 c2_2506_2501;

	/** Campo VALOR (c3_2506_5002) da tabela CONTA_DETALHE (t2506) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_2506_5002", foreignKey = @ForeignKey(name = "r3_2506_5002"))
	private T5002 c3_2506_5002;

	/** Campo TIPO DETALHE (c4_2506_5002) da tabela CONTA_DETALHE (t2506) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_2506_5002", foreignKey = @ForeignKey(name = "r4_2506_5002"))
	private T5002 c4_2506_5002;

	/** Campo TIPO DE TIPO (c5_2506_5002) da tabela CONTA_DETALHE (t2506) */
	@ManyToOne
	@JoinColumn(name = "c5_2506_5002", foreignKey = @ForeignKey(name = "r5_2506_5002"))
	private T5002 c5_2506_5002;

	/** Campo DESCRIÇÃO (c6_2506) da tabela CONTA_DETALHE (t2506) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c6_2506;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2506) da tabela
	 * CONTA_DETALHE (t2506)
	 */
	public int getC1_2506() {
		return this.c1_2506;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2506) da tabela
	 * CONTA_DETALHE (t2506)
	 */
	public void setC1_2506(int c1_2506) {
		this.c1_2506 = c1_2506;
	}

	/**
	 * Busca valor do campo CONTA (c2_2506_2501) da tabela CONTA_DETALHE (t2506)
	 */
	public T2501 getC2_2506_2501() {
		return this.c2_2506_2501;
	}

	/**
	 * Define valor do campo CONTA (c2_2506_2501) da tabela CONTA_DETALHE
	 * (t2506)
	 */
	public void setC2_2506_2501(T2501 c2_2506_2501) {
		this.c2_2506_2501 = c2_2506_2501;
	}

	/**
	 * Busca valor do campo VALOR (c3_2506_5002) da tabela CONTA_DETALHE (t2506)
	 */
	public T5002 getC3_2506_5002() {
		return this.c3_2506_5002;
	}

	/**
	 * Define valor do campo VALOR (c3_2506_5002) da tabela CONTA_DETALHE
	 * (t2506)
	 */
	public void setC3_2506_5002(T5002 c3_2506_5002) {
		this.c3_2506_5002 = c3_2506_5002;
	}

	/**
	 * Busca valor do campo TIPO DETALHE (c4_2506_5002) da tabela CONTA_DETALHE
	 * (t2506)
	 */
	public T5002 getC4_2506_5002() {
		return this.c4_2506_5002;
	}

	/**
	 * Define valor do campo TIPO DETALHE (c4_2506_5002) da tabela CONTA_DETALHE
	 * (t2506)
	 */
	public void setC4_2506_5002(T5002 c4_2506_5002) {
		this.c4_2506_5002 = c4_2506_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c5_2506_5002) da tabela CONTA_DETALHE
	 * (t2506)
	 */
	public T5002 getC5_2506_5002() {
		return this.c5_2506_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c5_2506_5002) da tabela CONTA_DETALHE
	 * (t2506)
	 */
	public void setC5_2506_5002(T5002 c5_2506_5002) {
		this.c5_2506_5002 = c5_2506_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c6_2506) da tabela CONTA_DETALHE (t2506)
	 */
	public String getC6_2506() {
		return this.c6_2506;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c6_2506) da tabela CONTA_DETALHE (t2506)
	 */
	public void setC6_2506(String c6_2506) {
		this.c6_2506 = c6_2506;
	}

	@Override
	public String toString() {
		return "CONTA_DETALHE (t2506) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2506)=" + c1_2506
				+ "\n\t\tDESCRIÇÃO (c6_2506)=" + c6_2506 + "]";
	}

}
