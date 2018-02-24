package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe RECEITA_ITEM.<br>
 * Representa a tabela t3002 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t3002")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T3002 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_3002) da tabela RECEITA_ITEM (t3002) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_3002;

	/** Campo RECEITA (c2_3002_3001) da tabela RECEITA_ITEM (t3002) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_3002_3001", foreignKey = @ForeignKey(name = "r2_3002_3001"))
	private T3001 c2_3002_3001;

	/** Campo INSUMO (c3_3002_2001) da tabela RECEITA_ITEM (t3002) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_3002_2001", foreignKey = @ForeignKey(name = "r3_3002_2001"))
	private T2001 c3_3002_2001;

	/** Campo VALOR UNITÁRIO (c4_3002) da tabela RECEITA_ITEM (t3002) */
	@Digits(integer = 20, fraction = 6, message = "VALOR UNITÁRIO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c4_3002;

	/** Campo QUANTIDADE (c5_3002) da tabela RECEITA_ITEM (t3002) */
	@Digits(integer = 20, fraction = 6, message = "QUANTIDADE deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c5_3002;

	/** Campo VALOR TOTAL (c6_3002) da tabela RECEITA_ITEM (t3002) */
	@Digits(integer = 20, fraction = 6, message = "VALOR TOTAL deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c6_3002;

	/** Campo DESCRIÇÃO (c7_3002) da tabela RECEITA_ITEM (t3002) */
	@Size(max = 400, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c7_3002;

	/**
	 * Referencia ao campo RECEITA ITEM (c3_3003_3002) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	@JsonBackReference(value = "c3_3003_3002")
	@OneToMany(mappedBy = "c3_3003_3002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3003> t3003C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_3002) da tabela
	 * RECEITA_ITEM (t3002)
	 */
	public int getC1_3002() {
		return this.c1_3002;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_3002) da tabela
	 * RECEITA_ITEM (t3002)
	 */
	public void setC1_3002(int c1_3002) {
		this.c1_3002 = c1_3002;
	}

	/**
	 * Busca valor do campo RECEITA (c2_3002_3001) da tabela RECEITA_ITEM
	 * (t3002)
	 */
	public T3001 getC2_3002_3001() {
		return this.c2_3002_3001;
	}

	/**
	 * Define valor do campo RECEITA (c2_3002_3001) da tabela RECEITA_ITEM
	 * (t3002)
	 */
	public void setC2_3002_3001(T3001 c2_3002_3001) {
		this.c2_3002_3001 = c2_3002_3001;
	}

	/**
	 * Busca valor do campo INSUMO (c3_3002_2001) da tabela RECEITA_ITEM (t3002)
	 */
	public T2001 getC3_3002_2001() {
		return this.c3_3002_2001;
	}

	/**
	 * Define valor do campo INSUMO (c3_3002_2001) da tabela RECEITA_ITEM
	 * (t3002)
	 */
	public void setC3_3002_2001(T2001 c3_3002_2001) {
		this.c3_3002_2001 = c3_3002_2001;
	}

	/**
	 * Busca valor do campo VALOR UNITÁRIO (c4_3002) da tabela RECEITA_ITEM
	 * (t3002)
	 */
	public double getC4_3002() {
		return this.c4_3002;
	}

	/**
	 * Define valor do campo VALOR UNITÁRIO (c4_3002) da tabela RECEITA_ITEM
	 * (t3002)
	 */
	public void setC4_3002(double c4_3002) {
		this.c4_3002 = c4_3002;
	}

	/**
	 * Busca valor do campo QUANTIDADE (c5_3002) da tabela RECEITA_ITEM (t3002)
	 */
	public double getC5_3002() {
		return this.c5_3002;
	}

	/**
	 * Define valor do campo QUANTIDADE (c5_3002) da tabela RECEITA_ITEM (t3002)
	 */
	public void setC5_3002(double c5_3002) {
		this.c5_3002 = c5_3002;
	}

	/**
	 * Busca valor do campo VALOR TOTAL (c6_3002) da tabela RECEITA_ITEM (t3002)
	 */
	public double getC6_3002() {
		return this.c6_3002;
	}

	/**
	 * Define valor do campo VALOR TOTAL (c6_3002) da tabela RECEITA_ITEM
	 * (t3002)
	 */
	public void setC6_3002(double c6_3002) {
		this.c6_3002 = c6_3002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c7_3002) da tabela RECEITA_ITEM (t3002)
	 */
	public String getC7_3002() {
		return this.c7_3002;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c7_3002) da tabela RECEITA_ITEM (t3002)
	 */
	public void setC7_3002(String c7_3002) {
		this.c7_3002 = c7_3002;
	}

	/**
	 * Busca valor do campo referencia RECEITA ITEM (c3_3003_3002) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public Set<T3003> getT3003C3() {
		return this.t3003C3;
	}

	/**
	 * Define valor do campo referencia RECEITA ITEM (c3_3003_3002) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public void setT3003C3(Set<T3003> t3003C3) {
		this.t3003C3 = t3003C3;
	}

	@Override
	public String toString() {
		return "RECEITA_ITEM (t3002) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_3002)=" + c1_3002
				+ "\n\t\tVALOR UNITÁRIO (c4_3002)=" + c4_3002 + "\n\t\tQUANTIDADE (c5_3002)=" + c5_3002
				+ "\n\t\tVALOR TOTAL (c6_3002)=" + c6_3002 + "\n\t\tDESCRIÇÃO (c7_3002)=" + c7_3002 + "]";
	}

}
