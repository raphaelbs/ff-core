package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.sql.Date;
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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe CONTA_SALDO_BANC.<br>
 * Representa a tabela t2560 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2560")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2560 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2560) da tabela CONTA_SALDO_BANC (t2560)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2560;

	/** Campo CONTA (c2_2560_2501) da tabela CONTA_SALDO_BANC (t2560) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2560_2501", foreignKey = @ForeignKey(name = "r2_2560_2501"))
	private T2501 c2_2560_2501;

	/** Campo DATA (c3_2560) da tabela CONTA_SALDO_BANC (t2560) */
	@NotNull
	private Date c3_2560;

	/** Campo SALDO ANTERIOR (c4_2560) da tabela CONTA_SALDO_BANC (t2560) */
	@Digits(integer = 20, fraction = 6, message = "SALDO ANTERIOR deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c4_2560;

	/** Campo TOTAL DE ENTRADAS (c5_2560) da tabela CONTA_SALDO_BANC (t2560) */
	@Digits(integer = 20, fraction = 6, message = "TOTAL DE ENTRADAS deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c5_2560;

	/** Campo TOTAL DE SAÍDAS (c6_2560) da tabela CONTA_SALDO_BANC (t2560) */
	@Digits(integer = 20, fraction = 6, message = "TOTAL DE SAÍDAS deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c6_2560;

	/** Campo SALDO ATUAL (c7_2560) da tabela CONTA_SALDO_BANC (t2560) */
	@Digits(integer = 20, fraction = 6, message = "SALDO ATUAL deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c7_2560;

	/**
	 * Referencia ao campo SALDO_BANC (c3_2561_2560) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	@JsonBackReference(value = "c3_2561_2560")
	@OneToMany(mappedBy = "c3_2561_2560", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2561> t2561C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2560) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public int getC1_2560() {
		return this.c1_2560;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2560) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public void setC1_2560(int c1_2560) {
		this.c1_2560 = c1_2560;
	}

	/**
	 * Busca valor do campo CONTA (c2_2560_2501) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public T2501 getC2_2560_2501() {
		return this.c2_2560_2501;
	}

	/**
	 * Define valor do campo CONTA (c2_2560_2501) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public void setC2_2560_2501(T2501 c2_2560_2501) {
		this.c2_2560_2501 = c2_2560_2501;
	}

	/**
	 * Busca valor do campo DATA (c3_2560) da tabela CONTA_SALDO_BANC (t2560)
	 */
	public Date getC3_2560() {
		return this.c3_2560;
	}

	/**
	 * Define valor do campo DATA (c3_2560) da tabela CONTA_SALDO_BANC (t2560)
	 */
	public void setC3_2560(Date c3_2560) {
		this.c3_2560 = c3_2560;
	}

	/**
	 * Busca valor do campo SALDO ANTERIOR (c4_2560) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public double getC4_2560() {
		return this.c4_2560;
	}

	/**
	 * Define valor do campo SALDO ANTERIOR (c4_2560) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public void setC4_2560(double c4_2560) {
		this.c4_2560 = c4_2560;
	}

	/**
	 * Busca valor do campo TOTAL DE ENTRADAS (c5_2560) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public double getC5_2560() {
		return this.c5_2560;
	}

	/**
	 * Define valor do campo TOTAL DE ENTRADAS (c5_2560) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public void setC5_2560(double c5_2560) {
		this.c5_2560 = c5_2560;
	}

	/**
	 * Busca valor do campo TOTAL DE SAÍDAS (c6_2560) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public double getC6_2560() {
		return this.c6_2560;
	}

	/**
	 * Define valor do campo TOTAL DE SAÍDAS (c6_2560) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public void setC6_2560(double c6_2560) {
		this.c6_2560 = c6_2560;
	}

	/**
	 * Busca valor do campo SALDO ATUAL (c7_2560) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public double getC7_2560() {
		return this.c7_2560;
	}

	/**
	 * Define valor do campo SALDO ATUAL (c7_2560) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	public void setC7_2560(double c7_2560) {
		this.c7_2560 = c7_2560;
	}

	/**
	 * Busca valor do campo referencia SALDO_BANC (c3_2561_2560) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public Set<T2561> getT2561C3() {
		return this.t2561C3;
	}

	/**
	 * Define valor do campo referencia SALDO_BANC (c3_2561_2560) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public void setT2561C3(Set<T2561> t2561C3) {
		this.t2561C3 = t2561C3;
	}

	@Override
	public String toString() {
		return "CONTA_SALDO_BANC (t2560) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2560)=" + c1_2560
				+ "\n\t\tDATA (c3_2560)=" + c3_2560 + "\n\t\tSALDO ANTERIOR (c4_2560)=" + c4_2560
				+ "\n\t\tTOTAL DE ENTRADAS (c5_2560)=" + c5_2560 + "\n\t\tTOTAL DE SAÍDAS (c6_2560)=" + c6_2560
				+ "\n\t\tSALDO ATUAL (c7_2560)=" + c7_2560 + "]";
	}

}
