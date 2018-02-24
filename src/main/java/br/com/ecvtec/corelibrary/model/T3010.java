package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.sql.Date;

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
 * Classe RECEITA_DUPLICATA.<br>
 * Representa a tabela t3010 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t3010")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T3010 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_3010) da tabela RECEITA_DUPLICATA (t3010)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_3010;

	/** Campo RECEITA (c2_3010_3001) da tabela RECEITA_DUPLICATA (t3010) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_3010_3001", foreignKey = @ForeignKey(name = "r2_3010_3001"))
	private T3001 c2_3010_3001;

	/** Campo DATA VENCIMENTO (c3_3010) da tabela RECEITA_DUPLICATA (t3010) */
	@NotNull
	private Date c3_3010;

	/** Campo NÚMERO (c4_3010) da tabela RECEITA_DUPLICATA (t3010) */
	@Size(max = 80, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c4_3010;

	/** Campo MOEDA (c5_3010_5002) da tabela RECEITA_DUPLICATA (t3010) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c5_3010_5002", foreignKey = @ForeignKey(name = "r5_3010_5002"))
	private T5002 c5_3010_5002;

	/** Campo VALOR TOTAL (c6_3010) da tabela RECEITA_DUPLICATA (t3010) */
	@Digits(integer = 20, fraction = 6, message = "VALOR TOTAL deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c6_3010;

	/** Campo VALOR ACRÉSCIMO (c7_3010) da tabela RECEITA_DUPLICATA (t3010) */
	@Digits(integer = 20, fraction = 6, message = "VALOR ACRÉSCIMO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c7_3010;

	/** Campo VALOR DESCONTO (c8_3010) da tabela RECEITA_DUPLICATA (t3010) */
	@Digits(integer = 20, fraction = 6, message = "VALOR DESCONTO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c8_3010;

	/** Campo VALOR LÍQUIDO (c9_3010) da tabela RECEITA_DUPLICATA (t3010) */
	@Digits(integer = 20, fraction = 6, message = "VALOR LÍQUIDO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c9_3010;

	/** Campo DATA RECEBIMENTO (c10_3010) da tabela RECEITA_DUPLICATA (t3010) */
	private Date c10_3010;

	/** Campo DATA CRÉDITO (c11_3010) da tabela RECEITA_DUPLICATA (t3010) */
	private Date c11_3010;

	/** Campo STATUS (c12_3010_5002) da tabela RECEITA_DUPLICATA (t3010) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c12_3010_5002", foreignKey = @ForeignKey(name = "r12_3010_5002"))
	private T5002 c12_3010_5002;

	/**
	 * Campo LOCAL DE COBRANÇA (c13_3010_2501) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c13_3010_2501", foreignKey = @ForeignKey(name = "r13_3010_2501"))
	private T2501 c13_3010_2501;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public int getC1_3010() {
		return this.c1_3010;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setC1_3010(int c1_3010) {
		this.c1_3010 = c1_3010;
	}

	/**
	 * Busca valor do campo RECEITA (c2_3010_3001) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public T3001 getC2_3010_3001() {
		return this.c2_3010_3001;
	}

	/**
	 * Define valor do campo RECEITA (c2_3010_3001) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC2_3010_3001(T3001 c2_3010_3001) {
		this.c2_3010_3001 = c2_3010_3001;
	}

	/**
	 * Busca valor do campo DATA VENCIMENTO (c3_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public Date getC3_3010() {
		return this.c3_3010;
	}

	/**
	 * Define valor do campo DATA VENCIMENTO (c3_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setC3_3010(Date c3_3010) {
		this.c3_3010 = c3_3010;
	}

	/**
	 * Busca valor do campo NÚMERO (c4_3010) da tabela RECEITA_DUPLICATA (t3010)
	 */
	public String getC4_3010() {
		return this.c4_3010;
	}

	/**
	 * Define valor do campo NÚMERO (c4_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC4_3010(String c4_3010) {
		this.c4_3010 = c4_3010;
	}

	/**
	 * Busca valor do campo MOEDA (c5_3010_5002) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public T5002 getC5_3010_5002() {
		return this.c5_3010_5002;
	}

	/**
	 * Define valor do campo MOEDA (c5_3010_5002) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC5_3010_5002(T5002 c5_3010_5002) {
		this.c5_3010_5002 = c5_3010_5002;
	}

	/**
	 * Busca valor do campo VALOR TOTAL (c6_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public double getC6_3010() {
		return this.c6_3010;
	}

	/**
	 * Define valor do campo VALOR TOTAL (c6_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC6_3010(double c6_3010) {
		this.c6_3010 = c6_3010;
	}

	/**
	 * Busca valor do campo VALOR ACRÉSCIMO (c7_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public double getC7_3010() {
		return this.c7_3010;
	}

	/**
	 * Define valor do campo VALOR ACRÉSCIMO (c7_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setC7_3010(double c7_3010) {
		this.c7_3010 = c7_3010;
	}

	/**
	 * Busca valor do campo VALOR DESCONTO (c8_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public double getC8_3010() {
		return this.c8_3010;
	}

	/**
	 * Define valor do campo VALOR DESCONTO (c8_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setC8_3010(double c8_3010) {
		this.c8_3010 = c8_3010;
	}

	/**
	 * Busca valor do campo VALOR LÍQUIDO (c9_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public double getC9_3010() {
		return this.c9_3010;
	}

	/**
	 * Define valor do campo VALOR LÍQUIDO (c9_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC9_3010(double c9_3010) {
		this.c9_3010 = c9_3010;
	}

	/**
	 * Busca valor do campo DATA RECEBIMENTO (c10_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public Date getC10_3010() {
		return this.c10_3010;
	}

	/**
	 * Define valor do campo DATA RECEBIMENTO (c10_3010) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setC10_3010(Date c10_3010) {
		this.c10_3010 = c10_3010;
	}

	/**
	 * Busca valor do campo DATA CRÉDITO (c11_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public Date getC11_3010() {
		return this.c11_3010;
	}

	/**
	 * Define valor do campo DATA CRÉDITO (c11_3010) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC11_3010(Date c11_3010) {
		this.c11_3010 = c11_3010;
	}

	/**
	 * Busca valor do campo STATUS (c12_3010_5002) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public T5002 getC12_3010_5002() {
		return this.c12_3010_5002;
	}

	/**
	 * Define valor do campo STATUS (c12_3010_5002) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	public void setC12_3010_5002(T5002 c12_3010_5002) {
		this.c12_3010_5002 = c12_3010_5002;
	}

	/**
	 * Busca valor do campo LOCAL DE COBRANÇA (c13_3010_2501) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public T2501 getC13_3010_2501() {
		return this.c13_3010_2501;
	}

	/**
	 * Define valor do campo LOCAL DE COBRANÇA (c13_3010_2501) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setC13_3010_2501(T2501 c13_3010_2501) {
		this.c13_3010_2501 = c13_3010_2501;
	}

	@Override
	public String toString() {
		return "RECEITA_DUPLICATA (t3010) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_3010)=" + c1_3010
				+ "\n\t\tDATA VENCIMENTO (c3_3010)=" + c3_3010 + "\n\t\tNÚMERO (c4_3010)=" + c4_3010
				+ "\n\t\tVALOR TOTAL (c6_3010)=" + c6_3010 + "\n\t\tVALOR ACRÉSCIMO (c7_3010)=" + c7_3010
				+ "\n\t\tVALOR DESCONTO (c8_3010)=" + c8_3010 + "\n\t\tVALOR LÍQUIDO (c9_3010)=" + c9_3010
				+ "\n\t\tDATA RECEBIMENTO (c10_3010)=" + c10_3010 + "\n\t\tDATA CRÉDITO (c11_3010)=" + c11_3010 + "]";
	}

}
