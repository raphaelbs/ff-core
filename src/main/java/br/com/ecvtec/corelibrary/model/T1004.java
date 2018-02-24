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
 * Classe ENTIDADE_CONTATO.<br>
 * Representa a tabela t1004 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1004")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1004 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1004) da tabela ENTIDADE_CONTATO (t1004)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1004;

	/** Campo TABELA (c2_1004_1001) da tabela ENTIDADE_CONTATO (t1004) */
	@ManyToOne
	@JoinColumn(name = "c2_1004_1001", foreignKey = @ForeignKey(name = "r2_1004_1001"))
	@JsonBackReference("t1004C2")
	private T1001 c2_1004_1001;

	/** Campo PRAÇA (c3_1004_1002) da tabela ENTIDADE_CONTATO (t1004) */
	@ManyToOne
	@JoinColumn(name = "c3_1004_1002", foreignKey = @ForeignKey(name = "r3_1004_1002"))
	@JsonBackReference("t1004C3")
	private T1002 c3_1004_1002;

	/**
	 * Campo TIPO DE CONTATO (c4_1004_5002) da tabela ENTIDADE_CONTATO (t1004)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_1004_5002", foreignKey = @ForeignKey(name = "r4_1004_5002"))
	private T5002 c4_1004_5002;

	/** Campo NOME DO CONTATO (c5_1004) da tabela ENTIDADE_CONTATO (t1004) */
	@Size(max = 80, message = "NOME DO CONTATO deve possuir no máximo {max} caracteres.")
	private String c5_1004;

	/**
	 * Campo TIPO DE TRATAMENTO (c6_1004_5002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	@ManyToOne
	@JoinColumn(name = "c6_1004_5002", foreignKey = @ForeignKey(name = "r6_1004_5002"))
	private T5002 c6_1004_5002;

	/**
	 * Campo DATA DE ANIVERSÁRIO OU DATA DE NASCIMENTO (c7_1004) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	private Date c7_1004;

	/** Campo SEXO (c8_1004_5002) da tabela ENTIDADE_CONTATO (t1004) */
	@ManyToOne
	@JoinColumn(name = "c8_1004_5002", foreignKey = @ForeignKey(name = "r8_1004_5002"))
	private T5002 c8_1004_5002;

	/** Campo ESTADO CIVIL (c9_1004_5002) da tabela ENTIDADE_CONTATO (t1004) */
	@ManyToOne
	@JoinColumn(name = "c9_1004_5002", foreignKey = @ForeignKey(name = "r9_1004_5002"))
	private T5002 c9_1004_5002;

	/** Campo RELIGIÃO (c10_1004_5002) da tabela ENTIDADE_CONTATO (t1004) */
	@ManyToOne
	@JoinColumn(name = "c10_1004_5002", foreignKey = @ForeignKey(name = "r10_1004_5002"))
	private T5002 c10_1004_5002;

	/** Campo NATURAL DE (c11_1004_6201) da tabela ENTIDADE_CONTATO (t1004) */
	@ManyToOne
	@JoinColumn(name = "c11_1004_6201", foreignKey = @ForeignKey(name = "r11_1004_6201"))
	private T6201 c11_1004_6201;

	/**
	 * Referencia ao campo CONTATO (c7_1005_1004) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	@JsonBackReference(value = "c7_1005_1004")
	@OneToMany(mappedBy = "c7_1005_1004", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1005> t1005C7;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1004) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public int getC1_1004() {
		return this.c1_1004;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1004) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setC1_1004(int c1_1004) {
		this.c1_1004 = c1_1004;
	}

	/**
	 * Busca valor do campo TABELA (c2_1004_1001) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public T1001 getC2_1004_1001() {
		return this.c2_1004_1001;
	}

	/**
	 * Define valor do campo TABELA (c2_1004_1001) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public void setC2_1004_1001(T1001 c2_1004_1001) {
		this.c2_1004_1001 = c2_1004_1001;
	}

	/**
	 * Busca valor do campo PRAÇA (c3_1004_1002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public T1002 getC3_1004_1002() {
		return this.c3_1004_1002;
	}

	/**
	 * Define valor do campo PRAÇA (c3_1004_1002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public void setC3_1004_1002(T1002 c3_1004_1002) {
		this.c3_1004_1002 = c3_1004_1002;
	}

	/**
	 * Busca valor do campo TIPO DE CONTATO (c4_1004_5002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public T5002 getC4_1004_5002() {
		return this.c4_1004_5002;
	}

	/**
	 * Define valor do campo TIPO DE CONTATO (c4_1004_5002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setC4_1004_5002(T5002 c4_1004_5002) {
		this.c4_1004_5002 = c4_1004_5002;
	}

	/**
	 * Busca valor do campo NOME DO CONTATO (c5_1004) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public String getC5_1004() {
		return this.c5_1004;
	}

	/**
	 * Define valor do campo NOME DO CONTATO (c5_1004) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setC5_1004(String c5_1004) {
		this.c5_1004 = c5_1004;
	}

	/**
	 * Busca valor do campo TIPO DE TRATAMENTO (c6_1004_5002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public T5002 getC6_1004_5002() {
		return this.c6_1004_5002;
	}

	/**
	 * Define valor do campo TIPO DE TRATAMENTO (c6_1004_5002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setC6_1004_5002(T5002 c6_1004_5002) {
		this.c6_1004_5002 = c6_1004_5002;
	}

	/**
	 * Busca valor do campo DATA DE ANIVERSÁRIO OU DATA DE NASCIMENTO (c7_1004)
	 * da tabela ENTIDADE_CONTATO (t1004)
	 */
	public Date getC7_1004() {
		return this.c7_1004;
	}

	/**
	 * Define valor do campo DATA DE ANIVERSÁRIO OU DATA DE NASCIMENTO (c7_1004)
	 * da tabela ENTIDADE_CONTATO (t1004)
	 */
	public void setC7_1004(Date c7_1004) {
		this.c7_1004 = c7_1004;
	}

	/**
	 * Busca valor do campo SEXO (c8_1004_5002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public T5002 getC8_1004_5002() {
		return this.c8_1004_5002;
	}

	/**
	 * Define valor do campo SEXO (c8_1004_5002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public void setC8_1004_5002(T5002 c8_1004_5002) {
		this.c8_1004_5002 = c8_1004_5002;
	}

	/**
	 * Busca valor do campo ESTADO CIVIL (c9_1004_5002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public T5002 getC9_1004_5002() {
		return this.c9_1004_5002;
	}

	/**
	 * Define valor do campo ESTADO CIVIL (c9_1004_5002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setC9_1004_5002(T5002 c9_1004_5002) {
		this.c9_1004_5002 = c9_1004_5002;
	}

	/**
	 * Busca valor do campo RELIGIÃO (c10_1004_5002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public T5002 getC10_1004_5002() {
		return this.c10_1004_5002;
	}

	/**
	 * Define valor do campo RELIGIÃO (c10_1004_5002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	public void setC10_1004_5002(T5002 c10_1004_5002) {
		this.c10_1004_5002 = c10_1004_5002;
	}

	/**
	 * Busca valor do campo NATURAL DE (c11_1004_6201) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public T6201 getC11_1004_6201() {
		return this.c11_1004_6201;
	}

	/**
	 * Define valor do campo NATURAL DE (c11_1004_6201) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setC11_1004_6201(T6201 c11_1004_6201) {
		this.c11_1004_6201 = c11_1004_6201;
	}

	/**
	 * Busca valor do campo referencia CONTATO (c7_1005_1004) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public Set<T1005> getT1005C7() {
		return this.t1005C7;
	}

	/**
	 * Define valor do campo referencia CONTATO (c7_1005_1004) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public void setT1005C7(Set<T1005> t1005C7) {
		this.t1005C7 = t1005C7;
	}

	@Override
	public String toString() {
		return "ENTIDADE_CONTATO (t1004) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1004)=" + c1_1004
				+ "\n\t\tNOME DO CONTATO (c5_1004)=" + c5_1004
				+ "\n\t\tDATA DE ANIVERSÁRIO OU DATA DE NASCIMENTO (c7_1004)=" + c7_1004 + "]";
	}

}
