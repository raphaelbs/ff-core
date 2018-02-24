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
 * Classe CARGA.<br>
 * Representa a tabela t9401 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9401")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9401 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo CHAVE SEQUENCIAL PRIMARIA (c1_9401) da tabela CARGA (t9401) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9401;

	/** Campo COLIGADA (c2_9401_1001) da tabela CARGA (t9401) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9401_1001", foreignKey = @ForeignKey(name = "r2_9401_1001"))
	private T1001 c2_9401_1001;

	/** Campo TIPO DOCUMENTO (c3_9401_5002) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c3_9401_5002", foreignKey = @ForeignKey(name = "r3_9401_5002"))
	private T5002 c3_9401_5002;

	/** Campo REMETENTE (c4_9401_1001) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c4_9401_1001", foreignKey = @ForeignKey(name = "r4_9401_1001"))
	private T1001 c4_9401_1001;

	/** Campo REMETENTE ENDEREÇO (c5_9401_1002) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c5_9401_1002", foreignKey = @ForeignKey(name = "r5_9401_1002"))
	private T1002 c5_9401_1002;

	/** Campo NÚMERO DOCUMENTO (c6_9401) da tabela CARGA (t9401) */
	@Size(max = 40, message = "NÚMERO DOCUMENTO deve possuir no máximo {max} caracteres.")
	private String c6_9401;

	/** Campo DATA EMISSÃO (c7_9401) da tabela CARGA (t9401) */
	private Date c7_9401;

	/** Campo DESTINATÁRIO (c8_9401_1001) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c8_9401_1001", foreignKey = @ForeignKey(name = "r8_9401_1001"))
	private T1001 c8_9401_1001;

	/** Campo DESTINATÁRIO ENDEREÇO (c9_9401_1002) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c9_9401_1002", foreignKey = @ForeignKey(name = "r9_9401_1002"))
	private T1002 c9_9401_1002;

	/** Campo STATUS (c10_9401_5002) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c10_9401_5002", foreignKey = @ForeignKey(name = "r10_9401_5002"))
	private T5002 c10_9401_5002;

	/** Campo DESCRIÇÃO (c11_9401) da tabela CARGA (t9401) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private int c11_9401;

	/** Campo PÊSO (c12_9401) da tabela CARGA (t9401) */
	@Digits(integer = 20, fraction = 6, message = "PÊSO deve possuir no máximo {integer},{fraction} digitos.")
	private double c12_9401;

	/** Campo MOEDA (c13_9401_5002) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c13_9401_5002", foreignKey = @ForeignKey(name = "r13_9401_5002"))
	private T5002 c13_9401_5002;

	/** Campo VALOR (c14_9401) da tabela CARGA (t9401) */
	@Digits(integer = 20, fraction = 6, message = "VALOR deve possuir no máximo {integer},{fraction} digitos.")
	private double c14_9401;

	/** Campo COLIGADA FILIAL (c15_9401_1002) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c15_9401_1002", foreignKey = @ForeignKey(name = "r15_9401_1002"))
	private T1002 c15_9401_1002;

	/** Campo CIDADE ORIGEM (c16_9401_6201) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c16_9401_6201", foreignKey = @ForeignKey(name = "r16_9401_6201"))
	private T6201 c16_9401_6201;

	/** Campo CIDADE DESTINO (c17_9401_6201) da tabela CARGA (t9401) */
	@ManyToOne
	@JoinColumn(name = "c17_9401_6201", foreignKey = @ForeignKey(name = "r17_9401_6201"))
	private T6201 c17_9401_6201;

	/**
	 * Referencia ao campo CARGA (c2_9406_9401) da tabela CARGA_DETALHE (t9406)
	 */
	@JsonBackReference(value = "c2_9406_9401")
	@OneToMany(mappedBy = "c2_9406_9401", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9406> t9406C2;

	/**
	 * Referencia ao campo CARGA (c3_9503_9401) da tabela VIAGEM_CARGA (t9503)
	 */
	@JsonBackReference(value = "c3_9503_9401")
	@OneToMany(mappedBy = "c3_9503_9401", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9503> t9503C3;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9401) da tabela CARGA
	 * (t9401)
	 */
	public int getC1_9401() {
		return this.c1_9401;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9401) da tabela CARGA
	 * (t9401)
	 */
	public void setC1_9401(int c1_9401) {
		this.c1_9401 = c1_9401;
	}

	/** Busca valor do campo COLIGADA (c2_9401_1001) da tabela CARGA (t9401) */
	public T1001 getC2_9401_1001() {
		return this.c2_9401_1001;
	}

	/** Define valor do campo COLIGADA (c2_9401_1001) da tabela CARGA (t9401) */
	public void setC2_9401_1001(T1001 c2_9401_1001) {
		this.c2_9401_1001 = c2_9401_1001;
	}

	/**
	 * Busca valor do campo TIPO DOCUMENTO (c3_9401_5002) da tabela CARGA
	 * (t9401)
	 */
	public T5002 getC3_9401_5002() {
		return this.c3_9401_5002;
	}

	/**
	 * Define valor do campo TIPO DOCUMENTO (c3_9401_5002) da tabela CARGA
	 * (t9401)
	 */
	public void setC3_9401_5002(T5002 c3_9401_5002) {
		this.c3_9401_5002 = c3_9401_5002;
	}

	/** Busca valor do campo REMETENTE (c4_9401_1001) da tabela CARGA (t9401) */
	public T1001 getC4_9401_1001() {
		return this.c4_9401_1001;
	}

	/**
	 * Define valor do campo REMETENTE (c4_9401_1001) da tabela CARGA (t9401)
	 */
	public void setC4_9401_1001(T1001 c4_9401_1001) {
		this.c4_9401_1001 = c4_9401_1001;
	}

	/**
	 * Busca valor do campo REMETENTE ENDEREÇO (c5_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	public T1002 getC5_9401_1002() {
		return this.c5_9401_1002;
	}

	/**
	 * Define valor do campo REMETENTE ENDEREÇO (c5_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	public void setC5_9401_1002(T1002 c5_9401_1002) {
		this.c5_9401_1002 = c5_9401_1002;
	}

	/**
	 * Busca valor do campo NÚMERO DOCUMENTO (c6_9401) da tabela CARGA (t9401)
	 */
	public String getC6_9401() {
		return this.c6_9401;
	}

	/**
	 * Define valor do campo NÚMERO DOCUMENTO (c6_9401) da tabela CARGA (t9401)
	 */
	public void setC6_9401(String c6_9401) {
		this.c6_9401 = c6_9401;
	}

	/** Busca valor do campo DATA EMISSÃO (c7_9401) da tabela CARGA (t9401) */
	public Date getC7_9401() {
		return this.c7_9401;
	}

	/** Define valor do campo DATA EMISSÃO (c7_9401) da tabela CARGA (t9401) */
	public void setC7_9401(Date c7_9401) {
		this.c7_9401 = c7_9401;
	}

	/**
	 * Busca valor do campo DESTINATÁRIO (c8_9401_1001) da tabela CARGA (t9401)
	 */
	public T1001 getC8_9401_1001() {
		return this.c8_9401_1001;
	}

	/**
	 * Define valor do campo DESTINATÁRIO (c8_9401_1001) da tabela CARGA (t9401)
	 */
	public void setC8_9401_1001(T1001 c8_9401_1001) {
		this.c8_9401_1001 = c8_9401_1001;
	}

	/**
	 * Busca valor do campo DESTINATÁRIO ENDEREÇO (c9_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	public T1002 getC9_9401_1002() {
		return this.c9_9401_1002;
	}

	/**
	 * Define valor do campo DESTINATÁRIO ENDEREÇO (c9_9401_1002) da tabela
	 * CARGA (t9401)
	 */
	public void setC9_9401_1002(T1002 c9_9401_1002) {
		this.c9_9401_1002 = c9_9401_1002;
	}

	/** Busca valor do campo STATUS (c10_9401_5002) da tabela CARGA (t9401) */
	public T5002 getC10_9401_5002() {
		return this.c10_9401_5002;
	}

	/** Define valor do campo STATUS (c10_9401_5002) da tabela CARGA (t9401) */
	public void setC10_9401_5002(T5002 c10_9401_5002) {
		this.c10_9401_5002 = c10_9401_5002;
	}

	/** Busca valor do campo DESCRIÇÃO (c11_9401) da tabela CARGA (t9401) */
	public int getC11_9401() {
		return this.c11_9401;
	}

	/** Define valor do campo DESCRIÇÃO (c11_9401) da tabela CARGA (t9401) */
	public void setC11_9401(int c11_9401) {
		this.c11_9401 = c11_9401;
	}

	/** Busca valor do campo PÊSO (c12_9401) da tabela CARGA (t9401) */
	public double getC12_9401() {
		return this.c12_9401;
	}

	/** Define valor do campo PÊSO (c12_9401) da tabela CARGA (t9401) */
	public void setC12_9401(double c12_9401) {
		this.c12_9401 = c12_9401;
	}

	/** Busca valor do campo MOEDA (c13_9401_5002) da tabela CARGA (t9401) */
	public T5002 getC13_9401_5002() {
		return this.c13_9401_5002;
	}

	/** Define valor do campo MOEDA (c13_9401_5002) da tabela CARGA (t9401) */
	public void setC13_9401_5002(T5002 c13_9401_5002) {
		this.c13_9401_5002 = c13_9401_5002;
	}

	/** Busca valor do campo VALOR (c14_9401) da tabela CARGA (t9401) */
	public double getC14_9401() {
		return this.c14_9401;
	}

	/** Define valor do campo VALOR (c14_9401) da tabela CARGA (t9401) */
	public void setC14_9401(double c14_9401) {
		this.c14_9401 = c14_9401;
	}

	/**
	 * Busca valor do campo COLIGADA FILIAL (c15_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	public T1002 getC15_9401_1002() {
		return this.c15_9401_1002;
	}

	/**
	 * Define valor do campo COLIGADA FILIAL (c15_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	public void setC15_9401_1002(T1002 c15_9401_1002) {
		this.c15_9401_1002 = c15_9401_1002;
	}

	/**
	 * Busca valor do campo CIDADE ORIGEM (c16_9401_6201) da tabela CARGA
	 * (t9401)
	 */
	public T6201 getC16_9401_6201() {
		return this.c16_9401_6201;
	}

	/**
	 * Define valor do campo CIDADE ORIGEM (c16_9401_6201) da tabela CARGA
	 * (t9401)
	 */
	public void setC16_9401_6201(T6201 c16_9401_6201) {
		this.c16_9401_6201 = c16_9401_6201;
	}

	/**
	 * Busca valor do campo CIDADE DESTINO (c17_9401_6201) da tabela CARGA
	 * (t9401)
	 */
	public T6201 getC17_9401_6201() {
		return this.c17_9401_6201;
	}

	/**
	 * Define valor do campo CIDADE DESTINO (c17_9401_6201) da tabela CARGA
	 * (t9401)
	 */
	public void setC17_9401_6201(T6201 c17_9401_6201) {
		this.c17_9401_6201 = c17_9401_6201;
	}

	/**
	 * Busca valor do campo referencia CARGA (c2_9406_9401) da tabela
	 * CARGA_DETALHE (t9406)
	 */
	public Set<T9406> getT9406C2() {
		return this.t9406C2;
	}

	/**
	 * Define valor do campo referencia CARGA (c2_9406_9401) da tabela
	 * CARGA_DETALHE (t9406)
	 */
	public void setT9406C2(Set<T9406> t9406C2) {
		this.t9406C2 = t9406C2;
	}

	/**
	 * Busca valor do campo referencia CARGA (c3_9503_9401) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public Set<T9503> getT9503C3() {
		return this.t9503C3;
	}

	/**
	 * Define valor do campo referencia CARGA (c3_9503_9401) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public void setT9503C3(Set<T9503> t9503C3) {
		this.t9503C3 = t9503C3;
	}

	@Override
	public String toString() {
		return "CARGA (t9401) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9401)=" + c1_9401
				+ "\n\t\tNÚMERO DOCUMENTO (c6_9401)=" + c6_9401 + "\n\t\tDATA EMISSÃO (c7_9401)=" + c7_9401
				+ "\n\t\tDESCRIÇÃO (c11_9401)=" + c11_9401 + "\n\t\tPÊSO (c12_9401)=" + c12_9401
				+ "\n\t\tVALOR (c14_9401)=" + c14_9401 + "]";
	}

}
