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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe RECEITA.<br>
 * Representa a tabela t3001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t3001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T3001 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_3001) da tabela RECEITA (t3001) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_3001;

	/** Campo COLIGADA (c2_3001_1001) da tabela RECEITA (t3001) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_3001_1001", foreignKey = @ForeignKey(name = "r2_3001_1001"))
	private T1001 c2_3001_1001;

	/** Campo COLIGADA FILIAL (c3_3001_1002) da tabela RECEITA (t3001) */
	@ManyToOne
	@JoinColumn(name = "c3_3001_1002", foreignKey = @ForeignKey(name = "r3_3001_1002"))
	private T1002 c3_3001_1002;

	/** Campo TIPO DE DOCUENTO (c4_3001_5002) da tabela RECEITA (t3001) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_3001_5002", foreignKey = @ForeignKey(name = "r4_3001_5002"))
	private T5002 c4_3001_5002;

	/** Campo NÚMERO (c5_3001) da tabela RECEITA (t3001) */
	@Size(max = 160, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c5_3001;

	/** Campo SÉRIE (c6_3001) da tabela RECEITA (t3001) */
	@Size(max = 160, message = "SÉRIE deve possuir no máximo {max} caracteres.")
	private String c6_3001;

	/** Campo DATA EMISSÃO (c7_3001) da tabela RECEITA (t3001) */
	private Date c7_3001;

	/** Campo CLIENTE (c8_3001_1001) da tabela RECEITA (t3001) */
	@ManyToOne
	@JoinColumn(name = "c8_3001_1001", foreignKey = @ForeignKey(name = "r8_3001_1001"))
	private T1001 c8_3001_1001;

	/** Campo CLIENTE PRAÇA (c9_3001_1002) da tabela RECEITA (t3001) */
	@ManyToOne
	@JoinColumn(name = "c9_3001_1002", foreignKey = @ForeignKey(name = "r9_3001_1002"))
	private T1002 c9_3001_1002;

	/** Campo MOEDA (c10_3001_5002) da tabela RECEITA (t3001) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c10_3001_5002", foreignKey = @ForeignKey(name = "r10_3001_5002"))
	private T5002 c10_3001_5002;

	/** Campo VALOR TOTAL (c11_3001) da tabela RECEITA (t3001) */
	@Digits(integer = 20, fraction = 6, message = "VALOR TOTAL deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c11_3001;

	/** Campo VALOR IMPOSTOS (c12_3001) da tabela RECEITA (t3001) */
	@Digits(integer = 20, fraction = 6, message = "VALOR IMPOSTOS deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c12_3001;

	/** Campo VALOR ADICIONAL (c13_3001) da tabela RECEITA (t3001) */
	@Digits(integer = 20, fraction = 6, message = "VALOR ADICIONAL deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c13_3001;

	/** Campo VALOR IMPOSTO (c14_3001) da tabela RECEITA (t3001) */
	@Digits(integer = 20, fraction = 6, message = "VALOR IMPOSTO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c14_3001;

	/** Campo VALOR LÍQUIDO (c15_3001) da tabela RECEITA (t3001) */
	@Digits(integer = 20, fraction = 6, message = "VALOR LÍQUIDO deve possuir no máximo {integer},{fraction} digitos.")
	@NotNull
	private double c15_3001;

	/** Campo STATUS (c16_3001_5002) da tabela RECEITA (t3001) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c16_3001_5002", foreignKey = @ForeignKey(name = "r16_3001_5002"))
	private T5002 c16_3001_5002;

	/** Campo DESCRIÇÃO (c17_3001) da tabela RECEITA (t3001) */
	@Size(max = 400, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c17_3001;

	/**
	 * Referencia ao campo RECEITA (c2_3002_3001) da tabela RECEITA_ITEM (t3002)
	 */
	@JsonBackReference(value = "c2_3002_3001")
	@OneToMany(mappedBy = "c2_3002_3001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3002> t3002C2;

	/**
	 * Referencia ao campo RECEITA (c2_3003_3001) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	@JsonBackReference(value = "c2_3003_3001")
	@OneToMany(mappedBy = "c2_3003_3001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3003> t3003C2;

	/**
	 * Referencia ao campo RECEITA (c2_3010_3001) da tabela RECEITA_DUPLICATA
	 * (t3010)
	 */
	@JsonBackReference(value = "c2_3010_3001")
	@OneToMany(mappedBy = "c2_3010_3001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3010> t3010C2;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_3001) da tabela RECEITA
	 * (t3001)
	 */
	public int getC1_3001() {
		return this.c1_3001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_3001) da tabela RECEITA
	 * (t3001)
	 */
	public void setC1_3001(int c1_3001) {
		this.c1_3001 = c1_3001;
	}

	/**
	 * Busca valor do campo COLIGADA (c2_3001_1001) da tabela RECEITA (t3001)
	 */
	public T1001 getC2_3001_1001() {
		return this.c2_3001_1001;
	}

	/**
	 * Define valor do campo COLIGADA (c2_3001_1001) da tabela RECEITA (t3001)
	 */
	public void setC2_3001_1001(T1001 c2_3001_1001) {
		this.c2_3001_1001 = c2_3001_1001;
	}

	/**
	 * Busca valor do campo COLIGADA FILIAL (c3_3001_1002) da tabela RECEITA
	 * (t3001)
	 */
	public T1002 getC3_3001_1002() {
		return this.c3_3001_1002;
	}

	/**
	 * Define valor do campo COLIGADA FILIAL (c3_3001_1002) da tabela RECEITA
	 * (t3001)
	 */
	public void setC3_3001_1002(T1002 c3_3001_1002) {
		this.c3_3001_1002 = c3_3001_1002;
	}

	/**
	 * Busca valor do campo TIPO DE DOCUENTO (c4_3001_5002) da tabela RECEITA
	 * (t3001)
	 */
	public T5002 getC4_3001_5002() {
		return this.c4_3001_5002;
	}

	/**
	 * Define valor do campo TIPO DE DOCUENTO (c4_3001_5002) da tabela RECEITA
	 * (t3001)
	 */
	public void setC4_3001_5002(T5002 c4_3001_5002) {
		this.c4_3001_5002 = c4_3001_5002;
	}

	/** Busca valor do campo NÚMERO (c5_3001) da tabela RECEITA (t3001) */
	public String getC5_3001() {
		return this.c5_3001;
	}

	/** Define valor do campo NÚMERO (c5_3001) da tabela RECEITA (t3001) */
	public void setC5_3001(String c5_3001) {
		this.c5_3001 = c5_3001;
	}

	/** Busca valor do campo SÉRIE (c6_3001) da tabela RECEITA (t3001) */
	public String getC6_3001() {
		return this.c6_3001;
	}

	/** Define valor do campo SÉRIE (c6_3001) da tabela RECEITA (t3001) */
	public void setC6_3001(String c6_3001) {
		this.c6_3001 = c6_3001;
	}

	/** Busca valor do campo DATA EMISSÃO (c7_3001) da tabela RECEITA (t3001) */
	public Date getC7_3001() {
		return this.c7_3001;
	}

	/**
	 * Define valor do campo DATA EMISSÃO (c7_3001) da tabela RECEITA (t3001)
	 */
	public void setC7_3001(Date c7_3001) {
		this.c7_3001 = c7_3001;
	}

	/** Busca valor do campo CLIENTE (c8_3001_1001) da tabela RECEITA (t3001) */
	public T1001 getC8_3001_1001() {
		return this.c8_3001_1001;
	}

	/**
	 * Define valor do campo CLIENTE (c8_3001_1001) da tabela RECEITA (t3001)
	 */
	public void setC8_3001_1001(T1001 c8_3001_1001) {
		this.c8_3001_1001 = c8_3001_1001;
	}

	/**
	 * Busca valor do campo CLIENTE PRAÇA (c9_3001_1002) da tabela RECEITA
	 * (t3001)
	 */
	public T1002 getC9_3001_1002() {
		return this.c9_3001_1002;
	}

	/**
	 * Define valor do campo CLIENTE PRAÇA (c9_3001_1002) da tabela RECEITA
	 * (t3001)
	 */
	public void setC9_3001_1002(T1002 c9_3001_1002) {
		this.c9_3001_1002 = c9_3001_1002;
	}

	/** Busca valor do campo MOEDA (c10_3001_5002) da tabela RECEITA (t3001) */
	public T5002 getC10_3001_5002() {
		return this.c10_3001_5002;
	}

	/** Define valor do campo MOEDA (c10_3001_5002) da tabela RECEITA (t3001) */
	public void setC10_3001_5002(T5002 c10_3001_5002) {
		this.c10_3001_5002 = c10_3001_5002;
	}

	/** Busca valor do campo VALOR TOTAL (c11_3001) da tabela RECEITA (t3001) */
	public double getC11_3001() {
		return this.c11_3001;
	}

	/**
	 * Define valor do campo VALOR TOTAL (c11_3001) da tabela RECEITA (t3001)
	 */
	public void setC11_3001(double c11_3001) {
		this.c11_3001 = c11_3001;
	}

	/**
	 * Busca valor do campo VALOR IMPOSTOS (c12_3001) da tabela RECEITA (t3001)
	 */
	public double getC12_3001() {
		return this.c12_3001;
	}

	/**
	 * Define valor do campo VALOR IMPOSTOS (c12_3001) da tabela RECEITA (t3001)
	 */
	public void setC12_3001(double c12_3001) {
		this.c12_3001 = c12_3001;
	}

	/**
	 * Busca valor do campo VALOR ADICIONAL (c13_3001) da tabela RECEITA (t3001)
	 */
	public double getC13_3001() {
		return this.c13_3001;
	}

	/**
	 * Define valor do campo VALOR ADICIONAL (c13_3001) da tabela RECEITA
	 * (t3001)
	 */
	public void setC13_3001(double c13_3001) {
		this.c13_3001 = c13_3001;
	}

	/**
	 * Busca valor do campo VALOR IMPOSTO (c14_3001) da tabela RECEITA (t3001)
	 */
	public double getC14_3001() {
		return this.c14_3001;
	}

	/**
	 * Define valor do campo VALOR IMPOSTO (c14_3001) da tabela RECEITA (t3001)
	 */
	public void setC14_3001(double c14_3001) {
		this.c14_3001 = c14_3001;
	}

	/**
	 * Busca valor do campo VALOR LÍQUIDO (c15_3001) da tabela RECEITA (t3001)
	 */
	public double getC15_3001() {
		return this.c15_3001;
	}

	/**
	 * Define valor do campo VALOR LÍQUIDO (c15_3001) da tabela RECEITA (t3001)
	 */
	public void setC15_3001(double c15_3001) {
		this.c15_3001 = c15_3001;
	}

	/** Busca valor do campo STATUS (c16_3001_5002) da tabela RECEITA (t3001) */
	public T5002 getC16_3001_5002() {
		return this.c16_3001_5002;
	}

	/**
	 * Define valor do campo STATUS (c16_3001_5002) da tabela RECEITA (t3001)
	 */
	public void setC16_3001_5002(T5002 c16_3001_5002) {
		this.c16_3001_5002 = c16_3001_5002;
	}

	/** Busca valor do campo DESCRIÇÃO (c17_3001) da tabela RECEITA (t3001) */
	public String getC17_3001() {
		return this.c17_3001;
	}

	/** Define valor do campo DESCRIÇÃO (c17_3001) da tabela RECEITA (t3001) */
	public void setC17_3001(String c17_3001) {
		this.c17_3001 = c17_3001;
	}

	/**
	 * Busca valor do campo referencia RECEITA (c2_3002_3001) da tabela
	 * RECEITA_ITEM (t3002)
	 */
	public Set<T3002> getT3002C2() {
		return this.t3002C2;
	}

	/**
	 * Define valor do campo referencia RECEITA (c2_3002_3001) da tabela
	 * RECEITA_ITEM (t3002)
	 */
	public void setT3002C2(Set<T3002> t3002C2) {
		this.t3002C2 = t3002C2;
	}

	/**
	 * Busca valor do campo referencia RECEITA (c2_3003_3001) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public Set<T3003> getT3003C2() {
		return this.t3003C2;
	}

	/**
	 * Define valor do campo referencia RECEITA (c2_3003_3001) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public void setT3003C2(Set<T3003> t3003C2) {
		this.t3003C2 = t3003C2;
	}

	/**
	 * Busca valor do campo referencia RECEITA (c2_3010_3001) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public Set<T3010> getT3010C2() {
		return this.t3010C2;
	}

	/**
	 * Define valor do campo referencia RECEITA (c2_3010_3001) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	public void setT3010C2(Set<T3010> t3010C2) {
		this.t3010C2 = t3010C2;
	}

	@Override
	public String toString() {
		return "RECEITA (t3001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_3001)=" + c1_3001 + "\n\t\tNÚMERO (c5_3001)="
				+ c5_3001 + "\n\t\tSÉRIE (c6_3001)=" + c6_3001 + "\n\t\tDATA EMISSÃO (c7_3001)=" + c7_3001
				+ "\n\t\tVALOR TOTAL (c11_3001)=" + c11_3001 + "\n\t\tVALOR IMPOSTOS (c12_3001)=" + c12_3001
				+ "\n\t\tVALOR ADICIONAL (c13_3001)=" + c13_3001 + "\n\t\tVALOR IMPOSTO (c14_3001)=" + c14_3001
				+ "\n\t\tVALOR LÍQUIDO (c15_3001)=" + c15_3001 + "\n\t\tDESCRIÇÃO (c17_3001)=" + c17_3001 + "]";
	}

}
