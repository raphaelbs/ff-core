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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe VIAGEM.<br>
 * Representa a tabela t9501 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9501")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9501 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo CHAVE SEQUENCIAL PRIMARIA (c1_9501) da tabela VIAGEM (t9501) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9501;

	/** Campo COLIGADA (c2_9501_1001) da tabela VIAGEM (t9501) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9501_1001", foreignKey = @ForeignKey(name = "r2_9501_1001"))
	private T1001 c2_9501_1001;

	/** Campo DESCRIÇÃO (c3_9501) da tabela VIAGEM (t9501) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_9501;

	/** Campo TIPO VIAGEM (c4_9501_5002) da tabela VIAGEM (t9501) */
	@ManyToOne
	@JoinColumn(name = "c4_9501_5002", foreignKey = @ForeignKey(name = "r4_9501_5002"))
	private T5002 c4_9501_5002;

	/** Campo STATUS (c5_9501_5002) da tabela VIAGEM (t9501) */
	@ManyToOne
	@JoinColumn(name = "c5_9501_5002", foreignKey = @ForeignKey(name = "r5_9501_5002"))
	private T5002 c5_9501_5002;

	/** Campo DATA INICIO (c6_9501) da tabela VIAGEM (t9501) */
	private Date c6_9501;

	/** Campo TIPO COORDENADA (c7_9501_5002) da tabela VIAGEM (t9501) */
	@ManyToOne
	@JoinColumn(name = "c7_9501_5002", foreignKey = @ForeignKey(name = "r7_9501_5002"))
	private T5002 c7_9501_5002;

	/** Campo COLIGADA FILIIAL (c8_9501_1002) da tabela VIAGEM (t9501) */
	@ManyToOne
	@JoinColumn(name = "c8_9501_1002", foreignKey = @ForeignKey(name = "r8_9501_1002"))
	private T1002 c8_9501_1002;

	/** Campo CONTRATADO (c9_9501_1001) da tabela VIAGEM (t9501) */
	@ManyToOne
	@JoinColumn(name = "c9_9501_1001", foreignKey = @ForeignKey(name = "r9_9501_1001"))
	private T1001 c9_9501_1001;

	/** Campo VEICULO (c10_9501_2001) da tabela VIAGEM (t9501) */
	@ManyToOne
	@JoinColumn(name = "c10_9501_2001", foreignKey = @ForeignKey(name = "r10_9501_2001"))
	private T2001 c10_9501_2001;

	/**
	 * Referencia ao campo VIAGEM (c2_9502_9501) da tabela VIAGEM_TRAJETO
	 * (t9502)
	 */
	@JsonBackReference(value = "c2_9502_9501")
	@OneToMany(mappedBy = "c2_9502_9501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9502> t9502C2;

	/**
	 * Referencia ao campo VIAGEM (c2_9503_9501) da tabela VIAGEM_CARGA (t9503)
	 */
	@JsonBackReference(value = "c2_9503_9501")
	@OneToMany(mappedBy = "c2_9503_9501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9503> t9503C2;

	/**
	 * Referencia ao campo VIAGEM (c2_9504_9501) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	@JsonBackReference(value = "c2_9504_9501")
	@OneToMany(mappedBy = "c2_9504_9501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9504> t9504C2;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9501) da tabela VIAGEM
	 * (t9501)
	 */
	public int getC1_9501() {
		return this.c1_9501;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9501) da tabela
	 * VIAGEM (t9501)
	 */
	public void setC1_9501(int c1_9501) {
		this.c1_9501 = c1_9501;
	}

	/** Busca valor do campo COLIGADA (c2_9501_1001) da tabela VIAGEM (t9501) */
	public T1001 getC2_9501_1001() {
		return this.c2_9501_1001;
	}

	/**
	 * Define valor do campo COLIGADA (c2_9501_1001) da tabela VIAGEM (t9501)
	 */
	public void setC2_9501_1001(T1001 c2_9501_1001) {
		this.c2_9501_1001 = c2_9501_1001;
	}

	/** Busca valor do campo DESCRIÇÃO (c3_9501) da tabela VIAGEM (t9501) */
	public String getC3_9501() {
		return this.c3_9501;
	}

	/** Define valor do campo DESCRIÇÃO (c3_9501) da tabela VIAGEM (t9501) */
	public void setC3_9501(String c3_9501) {
		this.c3_9501 = c3_9501;
	}

	/**
	 * Busca valor do campo TIPO VIAGEM (c4_9501_5002) da tabela VIAGEM (t9501)
	 */
	public T5002 getC4_9501_5002() {
		return this.c4_9501_5002;
	}

	/**
	 * Define valor do campo TIPO VIAGEM (c4_9501_5002) da tabela VIAGEM (t9501)
	 */
	public void setC4_9501_5002(T5002 c4_9501_5002) {
		this.c4_9501_5002 = c4_9501_5002;
	}

	/** Busca valor do campo STATUS (c5_9501_5002) da tabela VIAGEM (t9501) */
	public T5002 getC5_9501_5002() {
		return this.c5_9501_5002;
	}

	/** Define valor do campo STATUS (c5_9501_5002) da tabela VIAGEM (t9501) */
	public void setC5_9501_5002(T5002 c5_9501_5002) {
		this.c5_9501_5002 = c5_9501_5002;
	}

	/** Busca valor do campo DATA INICIO (c6_9501) da tabela VIAGEM (t9501) */
	public Date getC6_9501() {
		return this.c6_9501;
	}

	/** Define valor do campo DATA INICIO (c6_9501) da tabela VIAGEM (t9501) */
	public void setC6_9501(Date c6_9501) {
		this.c6_9501 = c6_9501;
	}

	/**
	 * Busca valor do campo TIPO COORDENADA (c7_9501_5002) da tabela VIAGEM
	 * (t9501)
	 */
	public T5002 getC7_9501_5002() {
		return this.c7_9501_5002;
	}

	/**
	 * Define valor do campo TIPO COORDENADA (c7_9501_5002) da tabela VIAGEM
	 * (t9501)
	 */
	public void setC7_9501_5002(T5002 c7_9501_5002) {
		this.c7_9501_5002 = c7_9501_5002;
	}

	/**
	 * Busca valor do campo COLIGADA FILIIAL (c8_9501_1002) da tabela VIAGEM
	 * (t9501)
	 */
	public T1002 getC8_9501_1002() {
		return this.c8_9501_1002;
	}

	/**
	 * Define valor do campo COLIGADA FILIIAL (c8_9501_1002) da tabela VIAGEM
	 * (t9501)
	 */
	public void setC8_9501_1002(T1002 c8_9501_1002) {
		this.c8_9501_1002 = c8_9501_1002;
	}

	/**
	 * Busca valor do campo CONTRATADO (c9_9501_1001) da tabela VIAGEM (t9501)
	 */
	public T1001 getC9_9501_1001() {
		return this.c9_9501_1001;
	}

	/**
	 * Define valor do campo CONTRATADO (c9_9501_1001) da tabela VIAGEM (t9501)
	 */
	public void setC9_9501_1001(T1001 c9_9501_1001) {
		this.c9_9501_1001 = c9_9501_1001;
	}

	/** Busca valor do campo VEICULO (c10_9501_2001) da tabela VIAGEM (t9501) */
	public T2001 getC10_9501_2001() {
		return this.c10_9501_2001;
	}

	/**
	 * Define valor do campo VEICULO (c10_9501_2001) da tabela VIAGEM (t9501)
	 */
	public void setC10_9501_2001(T2001 c10_9501_2001) {
		this.c10_9501_2001 = c10_9501_2001;
	}

	/**
	 * Busca valor do campo referencia VIAGEM (c2_9502_9501) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public Set<T9502> getT9502C2() {
		return this.t9502C2;
	}

	/**
	 * Define valor do campo referencia VIAGEM (c2_9502_9501) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public void setT9502C2(Set<T9502> t9502C2) {
		this.t9502C2 = t9502C2;
	}

	/**
	 * Busca valor do campo referencia VIAGEM (c2_9503_9501) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public Set<T9503> getT9503C2() {
		return this.t9503C2;
	}

	/**
	 * Define valor do campo referencia VIAGEM (c2_9503_9501) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public void setT9503C2(Set<T9503> t9503C2) {
		this.t9503C2 = t9503C2;
	}

	/**
	 * Busca valor do campo referencia VIAGEM (c2_9504_9501) da tabela
	 * VIAGEM_COORDENADA (t9504)
	 */
	public Set<T9504> getT9504C2() {
		return this.t9504C2;
	}

	/**
	 * Define valor do campo referencia VIAGEM (c2_9504_9501) da tabela
	 * VIAGEM_COORDENADA (t9504)
	 */
	public void setT9504C2(Set<T9504> t9504C2) {
		this.t9504C2 = t9504C2;
	}

	@Override
	public String toString() {
		return "VIAGEM (t9501) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9501)=" + c1_9501
				+ "\n\t\tDESCRIÇÃO (c3_9501)=" + c3_9501 + "\n\t\tDATA INICIO (c6_9501)=" + c6_9501 + "]";
	}

}
