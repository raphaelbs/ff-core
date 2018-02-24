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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe RECEITA_IMPOSTO.<br>
 * Representa a tabela t3003 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t3003")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T3003 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_3003) da tabela RECEITA_IMPOSTO (t3003)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_3003;

	/** Campo RECEITA (c2_3003_3001) da tabela RECEITA_IMPOSTO (t3003) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_3003_3001", foreignKey = @ForeignKey(name = "r2_3003_3001"))
	private T3001 c2_3003_3001;

	/** Campo RECEITA ITEM (c3_3003_3002) da tabela RECEITA_IMPOSTO (t3003) */
	@ManyToOne
	@JoinColumn(name = "c3_3003_3002", foreignKey = @ForeignKey(name = "r3_3003_3002"))
	private T3002 c3_3003_3002;

	/** Campo IMPOSTO (c4_3003_2001) da tabela RECEITA_IMPOSTO (t3003) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_3003_2001", foreignKey = @ForeignKey(name = "r4_3003_2001"))
	private T2001 c4_3003_2001;

	/** Campo BASE DE CÁCULO (c5_3003) da tabela RECEITA_IMPOSTO (t3003) */
	@Digits(integer = 20, fraction = 6, message = "BASE DE CÁCULO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c5_3003;

	/** Campo PERCENTUAL (c6_3003) da tabela RECEITA_IMPOSTO (t3003) */
	@Digits(integer = 20, fraction = 6, message = "PERCENTUAL deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c6_3003;

	/** Campo VALOR IMPOSTO (c7_3003) da tabela RECEITA_IMPOSTO (t3003) */
	@Digits(integer = 20, fraction = 6, message = "VALOR IMPOSTO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c7_3003;

	/** Campo DEDUZIR (c8_3003_5002) da tabela RECEITA_IMPOSTO (t3003) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c8_3003_5002", foreignKey = @ForeignKey(name = "r8_3003_5002"))
	private T5002 c8_3003_5002;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_3003) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public int getC1_3003() {
		return this.c1_3003;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_3003) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public void setC1_3003(int c1_3003) {
		this.c1_3003 = c1_3003;
	}

	/**
	 * Busca valor do campo RECEITA (c2_3003_3001) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public T3001 getC2_3003_3001() {
		return this.c2_3003_3001;
	}

	/**
	 * Define valor do campo RECEITA (c2_3003_3001) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public void setC2_3003_3001(T3001 c2_3003_3001) {
		this.c2_3003_3001 = c2_3003_3001;
	}

	/**
	 * Busca valor do campo RECEITA ITEM (c3_3003_3002) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public T3002 getC3_3003_3002() {
		return this.c3_3003_3002;
	}

	/**
	 * Define valor do campo RECEITA ITEM (c3_3003_3002) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public void setC3_3003_3002(T3002 c3_3003_3002) {
		this.c3_3003_3002 = c3_3003_3002;
	}

	/**
	 * Busca valor do campo IMPOSTO (c4_3003_2001) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public T2001 getC4_3003_2001() {
		return this.c4_3003_2001;
	}

	/**
	 * Define valor do campo IMPOSTO (c4_3003_2001) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public void setC4_3003_2001(T2001 c4_3003_2001) {
		this.c4_3003_2001 = c4_3003_2001;
	}

	/**
	 * Busca valor do campo BASE DE CÁCULO (c5_3003) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public double getC5_3003() {
		return this.c5_3003;
	}

	/**
	 * Define valor do campo BASE DE CÁCULO (c5_3003) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public void setC5_3003(double c5_3003) {
		this.c5_3003 = c5_3003;
	}

	/**
	 * Busca valor do campo PERCENTUAL (c6_3003) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public double getC6_3003() {
		return this.c6_3003;
	}

	/**
	 * Define valor do campo PERCENTUAL (c6_3003) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public void setC6_3003(double c6_3003) {
		this.c6_3003 = c6_3003;
	}

	/**
	 * Busca valor do campo VALOR IMPOSTO (c7_3003) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public double getC7_3003() {
		return this.c7_3003;
	}

	/**
	 * Define valor do campo VALOR IMPOSTO (c7_3003) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public void setC7_3003(double c7_3003) {
		this.c7_3003 = c7_3003;
	}

	/**
	 * Busca valor do campo DEDUZIR (c8_3003_5002) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public T5002 getC8_3003_5002() {
		return this.c8_3003_5002;
	}

	/**
	 * Define valor do campo DEDUZIR (c8_3003_5002) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	public void setC8_3003_5002(T5002 c8_3003_5002) {
		this.c8_3003_5002 = c8_3003_5002;
	}

	@Override
	public String toString() {
		return "RECEITA_IMPOSTO (t3003) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_3003)=" + c1_3003
				+ "\n\t\tBASE DE CÁCULO (c5_3003)=" + c5_3003 + "\n\t\tPERCENTUAL (c6_3003)=" + c6_3003
				+ "\n\t\tVALOR IMPOSTO (c7_3003)=" + c7_3003 + "]";
	}

}
