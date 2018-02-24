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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe CONTA_LANC_BANC.<br>
 * Representa a tabela t2561 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2561")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2561 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2561) da tabela CONTA_LANC_BANC (t2561)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2561;

	/** Campo CONTA (c2_2561_2501) da tabela CONTA_LANC_BANC (t2561) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2561_2501", foreignKey = @ForeignKey(name = "r2_2561_2501"))
	private T2501 c2_2561_2501;

	/** Campo SALDO_BANC (c3_2561_2560) da tabela CONTA_LANC_BANC (t2561) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_2561_2560", foreignKey = @ForeignKey(name = "r3_2561_2560"))
	private T2560 c3_2561_2560;

	/**
	 * Campo TIPO LANÇAMENTO (c4_2561_5002) da tabela CONTA_LANC_BANC (t2561)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_2561_5002", foreignKey = @ForeignKey(name = "r4_2561_5002"))
	private T5002 c4_2561_5002;

	/** Campo NÚMERO (c5_2561) da tabela CONTA_LANC_BANC (t2561) */
	@Size(max = 160, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c5_2561;

	/** Campo VALOR (c6_2561) da tabela CONTA_LANC_BANC (t2561) */
	@Digits(integer = 20, fraction = 6, message = "VALOR deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c6_2561;

	/** Campo STATUS (c7_2561_5002) da tabela CONTA_LANC_BANC (t2561) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c7_2561_5002", foreignKey = @ForeignKey(name = "r7_2561_5002"))
	private T5002 c7_2561_5002;

	/** Campo HISTÓRICO (c8_2561) da tabela CONTA_LANC_BANC (t2561) */
	@Size(max = 800, message = "HISTÓRICO deve possuir no máximo {max} caracteres.")
	private String c8_2561;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2561) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public int getC1_2561() {
		return this.c1_2561;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2561) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public void setC1_2561(int c1_2561) {
		this.c1_2561 = c1_2561;
	}

	/**
	 * Busca valor do campo CONTA (c2_2561_2501) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public T2501 getC2_2561_2501() {
		return this.c2_2561_2501;
	}

	/**
	 * Define valor do campo CONTA (c2_2561_2501) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public void setC2_2561_2501(T2501 c2_2561_2501) {
		this.c2_2561_2501 = c2_2561_2501;
	}

	/**
	 * Busca valor do campo SALDO_BANC (c3_2561_2560) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public T2560 getC3_2561_2560() {
		return this.c3_2561_2560;
	}

	/**
	 * Define valor do campo SALDO_BANC (c3_2561_2560) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public void setC3_2561_2560(T2560 c3_2561_2560) {
		this.c3_2561_2560 = c3_2561_2560;
	}

	/**
	 * Busca valor do campo TIPO LANÇAMENTO (c4_2561_5002) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public T5002 getC4_2561_5002() {
		return this.c4_2561_5002;
	}

	/**
	 * Define valor do campo TIPO LANÇAMENTO (c4_2561_5002) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public void setC4_2561_5002(T5002 c4_2561_5002) {
		this.c4_2561_5002 = c4_2561_5002;
	}

	/**
	 * Busca valor do campo NÚMERO (c5_2561) da tabela CONTA_LANC_BANC (t2561)
	 */
	public String getC5_2561() {
		return this.c5_2561;
	}

	/**
	 * Define valor do campo NÚMERO (c5_2561) da tabela CONTA_LANC_BANC (t2561)
	 */
	public void setC5_2561(String c5_2561) {
		this.c5_2561 = c5_2561;
	}

	/**
	 * Busca valor do campo VALOR (c6_2561) da tabela CONTA_LANC_BANC (t2561)
	 */
	public double getC6_2561() {
		return this.c6_2561;
	}

	/**
	 * Define valor do campo VALOR (c6_2561) da tabela CONTA_LANC_BANC (t2561)
	 */
	public void setC6_2561(double c6_2561) {
		this.c6_2561 = c6_2561;
	}

	/**
	 * Busca valor do campo STATUS (c7_2561_5002) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public T5002 getC7_2561_5002() {
		return this.c7_2561_5002;
	}

	/**
	 * Define valor do campo STATUS (c7_2561_5002) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public void setC7_2561_5002(T5002 c7_2561_5002) {
		this.c7_2561_5002 = c7_2561_5002;
	}

	/**
	 * Busca valor do campo HISTÓRICO (c8_2561) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public String getC8_2561() {
		return this.c8_2561;
	}

	/**
	 * Define valor do campo HISTÓRICO (c8_2561) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	public void setC8_2561(String c8_2561) {
		this.c8_2561 = c8_2561;
	}

	@Override
	public String toString() {
		return "CONTA_LANC_BANC (t2561) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2561)=" + c1_2561
				+ "\n\t\tNÚMERO (c5_2561)=" + c5_2561 + "\n\t\tVALOR (c6_2561)=" + c6_2561
				+ "\n\t\tHISTÓRICO (c8_2561)=" + c8_2561 + "]";
	}

}
