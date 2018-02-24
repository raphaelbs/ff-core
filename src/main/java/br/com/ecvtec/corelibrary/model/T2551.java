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
 * Classe CONTA_LANC_CONT.<br>
 * Representa a tabela t2551 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2551")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2551 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2551) da tabela CONTA_LANC_CONT (t2551)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2551;

	/** Campo CONTA (c2_2551_2501) da tabela CONTA_LANC_CONT (t2551) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2551_2501", foreignKey = @ForeignKey(name = "r2_2551_2501"))
	private T2501 c2_2551_2501;

	/** Campo SALDO_CONT (c3_2551_2550) da tabela CONTA_LANC_CONT (t2551) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_2551_2550", foreignKey = @ForeignKey(name = "r3_2551_2550"))
	private T2550 c3_2551_2550;

	/**
	 * Campo TIPO LANÇAMENTO (c4_2551_5002) da tabela CONTA_LANC_CONT (t2551)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_2551_5002", foreignKey = @ForeignKey(name = "r4_2551_5002"))
	private T5002 c4_2551_5002;

	/** Campo NÚMERO (c5_2551) da tabela CONTA_LANC_CONT (t2551) */
	@Size(max = 160, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c5_2551;

	/** Campo VALOR (c6_2551) da tabela CONTA_LANC_CONT (t2551) */
	@Digits(integer = 20, fraction = 6, message = "VALOR deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c6_2551;

	/** Campo STATUS (c7_2551_5002) da tabela CONTA_LANC_CONT (t2551) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c7_2551_5002", foreignKey = @ForeignKey(name = "r7_2551_5002"))
	private T5002 c7_2551_5002;

	/** Campo HISTÓRICO (c8_2551) da tabela CONTA_LANC_CONT (t2551) */
	@Size(max = 800, message = "HISTÓRICO deve possuir no máximo {max} caracteres.")
	private String c8_2551;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2551) da tabela
	 * CONTA_LANC_CONT (t2551)
	 */
	public int getC1_2551() {
		return this.c1_2551;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2551) da tabela
	 * CONTA_LANC_CONT (t2551)
	 */
	public void setC1_2551(int c1_2551) {
		this.c1_2551 = c1_2551;
	}

	/**
	 * Busca valor do campo CONTA (c2_2551_2501) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public T2501 getC2_2551_2501() {
		return this.c2_2551_2501;
	}

	/**
	 * Define valor do campo CONTA (c2_2551_2501) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public void setC2_2551_2501(T2501 c2_2551_2501) {
		this.c2_2551_2501 = c2_2551_2501;
	}

	/**
	 * Busca valor do campo SALDO_CONT (c3_2551_2550) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public T2550 getC3_2551_2550() {
		return this.c3_2551_2550;
	}

	/**
	 * Define valor do campo SALDO_CONT (c3_2551_2550) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public void setC3_2551_2550(T2550 c3_2551_2550) {
		this.c3_2551_2550 = c3_2551_2550;
	}

	/**
	 * Busca valor do campo TIPO LANÇAMENTO (c4_2551_5002) da tabela
	 * CONTA_LANC_CONT (t2551)
	 */
	public T5002 getC4_2551_5002() {
		return this.c4_2551_5002;
	}

	/**
	 * Define valor do campo TIPO LANÇAMENTO (c4_2551_5002) da tabela
	 * CONTA_LANC_CONT (t2551)
	 */
	public void setC4_2551_5002(T5002 c4_2551_5002) {
		this.c4_2551_5002 = c4_2551_5002;
	}

	/**
	 * Busca valor do campo NÚMERO (c5_2551) da tabela CONTA_LANC_CONT (t2551)
	 */
	public String getC5_2551() {
		return this.c5_2551;
	}

	/**
	 * Define valor do campo NÚMERO (c5_2551) da tabela CONTA_LANC_CONT (t2551)
	 */
	public void setC5_2551(String c5_2551) {
		this.c5_2551 = c5_2551;
	}

	/**
	 * Busca valor do campo VALOR (c6_2551) da tabela CONTA_LANC_CONT (t2551)
	 */
	public double getC6_2551() {
		return this.c6_2551;
	}

	/**
	 * Define valor do campo VALOR (c6_2551) da tabela CONTA_LANC_CONT (t2551)
	 */
	public void setC6_2551(double c6_2551) {
		this.c6_2551 = c6_2551;
	}

	/**
	 * Busca valor do campo STATUS (c7_2551_5002) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public T5002 getC7_2551_5002() {
		return this.c7_2551_5002;
	}

	/**
	 * Define valor do campo STATUS (c7_2551_5002) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public void setC7_2551_5002(T5002 c7_2551_5002) {
		this.c7_2551_5002 = c7_2551_5002;
	}

	/**
	 * Busca valor do campo HISTÓRICO (c8_2551) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public String getC8_2551() {
		return this.c8_2551;
	}

	/**
	 * Define valor do campo HISTÓRICO (c8_2551) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	public void setC8_2551(String c8_2551) {
		this.c8_2551 = c8_2551;
	}

	@Override
	public String toString() {
		return "CONTA_LANC_CONT (t2551) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2551)=" + c1_2551
				+ "\n\t\tNÚMERO (c5_2551)=" + c5_2551 + "\n\t\tVALOR (c6_2551)=" + c6_2551
				+ "\n\t\tHISTÓRICO (c8_2551)=" + c8_2551 + "]";
	}

}
