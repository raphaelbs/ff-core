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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe CONTA.<br>
 * Representa a tabela t2501 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2501")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2501 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_2501) da tabela CONTA (t2501) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2501;

	/** Campo DESCRIÇÃO (c2_2501) da tabela CONTA (t2501) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_2501;

	/** Campo INSTITUIÇÃO FINANCEIRA (c3_2501_1001) da tabela CONTA (t2501) */
	@ManyToOne
	@JoinColumn(name = "c3_2501_1001", foreignKey = @ForeignKey(name = "r3_2501_1001"))
	private T1001 c3_2501_1001;

	/** Campo AGÊNCIA (c4_2501_1002) da tabela CONTA (t2501) */
	@ManyToOne
	@JoinColumn(name = "c4_2501_1002", foreignKey = @ForeignKey(name = "r4_2501_1002"))
	private T1002 c4_2501_1002;

	/** Campo NÚMERO (c5_2501) da tabela CONTA (t2501) */
	@Size(max = 40, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c5_2501;

	/** Campo DÍGITO (c6_2501) da tabela CONTA (t2501) */
	@Size(max = 40, message = "DÍGITO deve possuir no máximo {max} caracteres.")
	private String c6_2501;

	/** Campo TIPO (c7_2501_5002) da tabela CONTA (t2501) */
	@ManyToOne
	@JoinColumn(name = "c7_2501_5002", foreignKey = @ForeignKey(name = "r7_2501_5002"))
	private T5002 c7_2501_5002;

	/** Campo MOEDA (c8_2501_5002) da tabela CONTA (t2501) */
	@ManyToOne
	@JoinColumn(name = "c8_2501_5002", foreignKey = @ForeignKey(name = "r8_2501_5002"))
	private T5002 c8_2501_5002;

	/** Campo STATUS (c9_2501_5002) da tabela CONTA (t2501) */
	@ManyToOne
	@JoinColumn(name = "c9_2501_5002", foreignKey = @ForeignKey(name = "r9_2501_5002"))
	private T5002 c9_2501_5002;

	/**
	 * Referencia ao campo CONTA (c2_2506_2501) da tabela CONTA_DETALHE (t2506)
	 */
	@JsonBackReference(value = "c2_2506_2501")
	@OneToMany(mappedBy = "c2_2506_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2506> t2506C2;

	/**
	 * Referencia ao campo CONTA (c2_2507_2501) da tabela CONTA_CORRENTISTA
	 * (t2507)
	 */
	@JsonBackReference(value = "c2_2507_2501")
	@OneToMany(mappedBy = "c2_2507_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2507> t2507C2;

	/**
	 * Referencia ao campo CONTA (c2_2550_2501) da tabela CONTA_SALDO_CONT
	 * (t2550)
	 */
	@JsonBackReference(value = "c2_2550_2501")
	@OneToMany(mappedBy = "c2_2550_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2550> t2550C2;

	/**
	 * Referencia ao campo CONTA (c2_2551_2501) da tabela CONTA_LANC_CONT
	 * (t2551)
	 */
	@JsonBackReference(value = "c2_2551_2501")
	@OneToMany(mappedBy = "c2_2551_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2551> t2551C2;

	/**
	 * Referencia ao campo CONTA (c2_2560_2501) da tabela CONTA_SALDO_BANC
	 * (t2560)
	 */
	@JsonBackReference(value = "c2_2560_2501")
	@OneToMany(mappedBy = "c2_2560_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2560> t2560C2;

	/**
	 * Referencia ao campo CONTA (c2_2561_2501) da tabela CONTA_LANC_BANC
	 * (t2561)
	 */
	@JsonBackReference(value = "c2_2561_2501")
	@OneToMany(mappedBy = "c2_2561_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2561> t2561C2;

	/**
	 * Referencia ao campo LOCAL DE COBRANÇA (c13_3010_2501) da tabela
	 * RECEITA_DUPLICATA (t3010)
	 */
	@JsonBackReference(value = "c13_3010_2501")
	@OneToMany(mappedBy = "c13_3010_2501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3010> t3010C13;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2501) da tabela CONTA
	 * (t2501)
	 */
	public int getC1_2501() {
		return this.c1_2501;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2501) da tabela CONTA
	 * (t2501)
	 */
	public void setC1_2501(int c1_2501) {
		this.c1_2501 = c1_2501;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_2501) da tabela CONTA (t2501) */
	public String getC2_2501() {
		return this.c2_2501;
	}

	/** Define valor do campo DESCRIÇÃO (c2_2501) da tabela CONTA (t2501) */
	public void setC2_2501(String c2_2501) {
		this.c2_2501 = c2_2501;
	}

	/**
	 * Busca valor do campo INSTITUIÇÃO FINANCEIRA (c3_2501_1001) da tabela
	 * CONTA (t2501)
	 */
	public T1001 getC3_2501_1001() {
		return this.c3_2501_1001;
	}

	/**
	 * Define valor do campo INSTITUIÇÃO FINANCEIRA (c3_2501_1001) da tabela
	 * CONTA (t2501)
	 */
	public void setC3_2501_1001(T1001 c3_2501_1001) {
		this.c3_2501_1001 = c3_2501_1001;
	}

	/** Busca valor do campo AGÊNCIA (c4_2501_1002) da tabela CONTA (t2501) */
	public T1002 getC4_2501_1002() {
		return this.c4_2501_1002;
	}

	/** Define valor do campo AGÊNCIA (c4_2501_1002) da tabela CONTA (t2501) */
	public void setC4_2501_1002(T1002 c4_2501_1002) {
		this.c4_2501_1002 = c4_2501_1002;
	}

	/** Busca valor do campo NÚMERO (c5_2501) da tabela CONTA (t2501) */
	public String getC5_2501() {
		return this.c5_2501;
	}

	/** Define valor do campo NÚMERO (c5_2501) da tabela CONTA (t2501) */
	public void setC5_2501(String c5_2501) {
		this.c5_2501 = c5_2501;
	}

	/** Busca valor do campo DÍGITO (c6_2501) da tabela CONTA (t2501) */
	public String getC6_2501() {
		return this.c6_2501;
	}

	/** Define valor do campo DÍGITO (c6_2501) da tabela CONTA (t2501) */
	public void setC6_2501(String c6_2501) {
		this.c6_2501 = c6_2501;
	}

	/** Busca valor do campo TIPO (c7_2501_5002) da tabela CONTA (t2501) */
	public T5002 getC7_2501_5002() {
		return this.c7_2501_5002;
	}

	/** Define valor do campo TIPO (c7_2501_5002) da tabela CONTA (t2501) */
	public void setC7_2501_5002(T5002 c7_2501_5002) {
		this.c7_2501_5002 = c7_2501_5002;
	}

	/** Busca valor do campo MOEDA (c8_2501_5002) da tabela CONTA (t2501) */
	public T5002 getC8_2501_5002() {
		return this.c8_2501_5002;
	}

	/** Define valor do campo MOEDA (c8_2501_5002) da tabela CONTA (t2501) */
	public void setC8_2501_5002(T5002 c8_2501_5002) {
		this.c8_2501_5002 = c8_2501_5002;
	}

	/** Busca valor do campo STATUS (c9_2501_5002) da tabela CONTA (t2501) */
	public T5002 getC9_2501_5002() {
		return this.c9_2501_5002;
	}

	/** Define valor do campo STATUS (c9_2501_5002) da tabela CONTA (t2501) */
	public void setC9_2501_5002(T5002 c9_2501_5002) {
		this.c9_2501_5002 = c9_2501_5002;
	}

	/**
	 * Busca valor do campo referencia CONTA (c2_2506_2501) da tabela
	 * CONTA_DETALHE (t2506)
	 */
	public Set<T2506> getT2506C2() {
		return this.t2506C2;
	}

	/**
	 * Define valor do campo referencia CONTA (c2_2506_2501) da tabela
	 * CONTA_DETALHE (t2506)
	 */
	public void setT2506C2(Set<T2506> t2506C2) {
		this.t2506C2 = t2506C2;
	}

	/**
	 * Busca valor do campo referencia CONTA (c2_2507_2501) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public Set<T2507> getT2507C2() {
		return this.t2507C2;
	}

	/**
	 * Define valor do campo referencia CONTA (c2_2507_2501) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public void setT2507C2(Set<T2507> t2507C2) {
		this.t2507C2 = t2507C2;
	}

	/**
	 * Busca valor do campo referencia CONTA (c2_2550_2501) da tabela
	 * CONTA_SALDO_CONT (t2550)
	 */
	public Set<T2550> getT2550C2() {
		return this.t2550C2;
	}

	/**
	 * Define valor do campo referencia CONTA (c2_2550_2501) da tabela
	 * CONTA_SALDO_CONT (t2550)
	 */
	public void setT2550C2(Set<T2550> t2550C2) {
		this.t2550C2 = t2550C2;
	}

	/**
	 * Busca valor do campo referencia CONTA (c2_2551_2501) da tabela
	 * CONTA_LANC_CONT (t2551)
	 */
	public Set<T2551> getT2551C2() {
		return this.t2551C2;
	}

	/**
	 * Define valor do campo referencia CONTA (c2_2551_2501) da tabela
	 * CONTA_LANC_CONT (t2551)
	 */
	public void setT2551C2(Set<T2551> t2551C2) {
		this.t2551C2 = t2551C2;
	}

	/**
	 * Busca valor do campo referencia CONTA (c2_2560_2501) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public Set<T2560> getT2560C2() {
		return this.t2560C2;
	}

	/**
	 * Define valor do campo referencia CONTA (c2_2560_2501) da tabela
	 * CONTA_SALDO_BANC (t2560)
	 */
	public void setT2560C2(Set<T2560> t2560C2) {
		this.t2560C2 = t2560C2;
	}

	/**
	 * Busca valor do campo referencia CONTA (c2_2561_2501) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public Set<T2561> getT2561C2() {
		return this.t2561C2;
	}

	/**
	 * Define valor do campo referencia CONTA (c2_2561_2501) da tabela
	 * CONTA_LANC_BANC (t2561)
	 */
	public void setT2561C2(Set<T2561> t2561C2) {
		this.t2561C2 = t2561C2;
	}

	/**
	 * Busca valor do campo referencia LOCAL DE COBRANÇA (c13_3010_2501) da
	 * tabela RECEITA_DUPLICATA (t3010)
	 */
	public Set<T3010> getT3010C13() {
		return this.t3010C13;
	}

	/**
	 * Define valor do campo referencia LOCAL DE COBRANÇA (c13_3010_2501) da
	 * tabela RECEITA_DUPLICATA (t3010)
	 */
	public void setT3010C13(Set<T3010> t3010C13) {
		this.t3010C13 = t3010C13;
	}

	@Override
	public String toString() {
		return "CONTA (t2501) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2501)=" + c1_2501 + "\n\t\tDESCRIÇÃO (c2_2501)="
				+ c2_2501 + "\n\t\tNÚMERO (c5_2501)=" + c5_2501 + "\n\t\tDÍGITO (c6_2501)=" + c6_2501 + "]";
	}

}
