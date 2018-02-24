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
 * Classe ENTIDADE_AGENDA.<br>
 * Representa a tabela t1005 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1005")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1005 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1005) da tabela ENTIDADE_AGENDA (t1005)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1005;

	/** Campo TABELA (c2_1005_1001) da tabela ENTIDADE_AGENDA (t1005) */
	@ManyToOne
	@JoinColumn(name = "c2_1005_1001", foreignKey = @ForeignKey(name = "r2_1005_1001"))
	@JsonBackReference("c2_1005_1001")
	private T1001 c2_1005_1001;

	/** Campo PRAÇA (c3_1005_1002) da tabela ENTIDADE_AGENDA (t1005) */
	@ManyToOne
	@JoinColumn(name = "c3_1005_1002", foreignKey = @ForeignKey(name = "r3_1005_1002"))
	@JsonBackReference("t1005C3")
	private T1002 c3_1005_1002;

	/** Campo TIPO DE AGENDA (c4_1005_5002) da tabela ENTIDADE_AGENDA (t1005) */
	@ManyToOne
	@JoinColumn(name = "c4_1005_5002", foreignKey = @ForeignKey(name = "r4_1005_5002"))
	private T5002 c4_1005_5002;

	/** Campo NÚMERO OU CONTA (c5_1005) da tabela ENTIDADE_AGENDA (t1005) */
	@Size(max = 80, message = "NÚMERO OU CONTA deve possuir no máximo {max} caracteres.")
	private String c5_1005;

	/** Campo OPERADORA (c6_1005_1001) da tabela ENTIDADE_AGENDA (t1005) */
	@ManyToOne
	@JoinColumn(name = "c6_1005_1001", foreignKey = @ForeignKey(name = "r6_1005_1001"))
	private T1001 c6_1005_1001;

	/** Campo CONTATO (c7_1005_1004) da tabela ENTIDADE_AGENDA (t1005) */
	@ManyToOne
	@JoinColumn(name = "c7_1005_1004", foreignKey = @ForeignKey(name = "r7_1005_1004"))
	private T1004 c7_1005_1004;

	/**
	 * Referencia ao campo REMETENTE_AGENDA (c4_6501_1005) da tabela MENSAGEM
	 * (t6501)
	 */
	@JsonBackReference(value = "c4_6501_1005")
	@OneToMany(mappedBy = "c4_6501_1005", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6501> t6501C4;

	/**
	 * Referencia ao campo DESTINATARIO_AGENDA (c3_6502_1005) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	@JsonBackReference(value = "c3_6502_1005")
	@OneToMany(mappedBy = "c3_6502_1005", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6502> t6502C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1005) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public int getC1_1005() {
		return this.c1_1005;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1005) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public void setC1_1005(int c1_1005) {
		this.c1_1005 = c1_1005;
	}

	/**
	 * Busca valor do campo TABELA (c2_1005_1001) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public T1001 getC2_1005_1001() {
		return this.c2_1005_1001;
	}

	/**
	 * Define valor do campo TABELA (c2_1005_1001) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public void setC2_1005_1001(T1001 c2_1005_1001) {
		this.c2_1005_1001 = c2_1005_1001;
	}

	/**
	 * Busca valor do campo PRAÇA (c3_1005_1002) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public T1002 getC3_1005_1002() {
		return this.c3_1005_1002;
	}

	/**
	 * Define valor do campo PRAÇA (c3_1005_1002) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public void setC3_1005_1002(T1002 c3_1005_1002) {
		this.c3_1005_1002 = c3_1005_1002;
	}

	/**
	 * Busca valor do campo TIPO DE AGENDA (c4_1005_5002) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public T5002 getC4_1005_5002() {
		return this.c4_1005_5002;
	}

	/**
	 * Define valor do campo TIPO DE AGENDA (c4_1005_5002) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public void setC4_1005_5002(T5002 c4_1005_5002) {
		this.c4_1005_5002 = c4_1005_5002;
	}

	/**
	 * Busca valor do campo NÚMERO OU CONTA (c5_1005) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public String getC5_1005() {
		return this.c5_1005;
	}

	/**
	 * Define valor do campo NÚMERO OU CONTA (c5_1005) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public void setC5_1005(String c5_1005) {
		this.c5_1005 = c5_1005;
	}

	/**
	 * Busca valor do campo OPERADORA (c6_1005_1001) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public T1001 getC6_1005_1001() {
		return this.c6_1005_1001;
	}

	/**
	 * Define valor do campo OPERADORA (c6_1005_1001) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public void setC6_1005_1001(T1001 c6_1005_1001) {
		this.c6_1005_1001 = c6_1005_1001;
	}

	/**
	 * Busca valor do campo CONTATO (c7_1005_1004) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public T1004 getC7_1005_1004() {
		return this.c7_1005_1004;
	}

	/**
	 * Define valor do campo CONTATO (c7_1005_1004) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	public void setC7_1005_1004(T1004 c7_1005_1004) {
		this.c7_1005_1004 = c7_1005_1004;
	}

	/**
	 * Busca valor do campo referencia REMETENTE_AGENDA (c4_6501_1005) da tabela
	 * MENSAGEM (t6501)
	 */
	public Set<T6501> getT6501C4() {
		return this.t6501C4;
	}

	/**
	 * Define valor do campo referencia REMETENTE_AGENDA (c4_6501_1005) da
	 * tabela MENSAGEM (t6501)
	 */
	public void setT6501C4(Set<T6501> t6501C4) {
		this.t6501C4 = t6501C4;
	}

	/**
	 * Busca valor do campo referencia DESTINATARIO_AGENDA (c3_6502_1005) da
	 * tabela MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public Set<T6502> getT6502C3() {
		return this.t6502C3;
	}

	/**
	 * Define valor do campo referencia DESTINATARIO_AGENDA (c3_6502_1005) da
	 * tabela MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public void setT6502C3(Set<T6502> t6502C3) {
		this.t6502C3 = t6502C3;
	}

	@Override
	public String toString() {
		return "ENTIDADE_AGENDA (t1005) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1005)=" + c1_1005
				+ "\n\t\tNÚMERO OU CONTA (c5_1005)=" + c5_1005 + "]";
	}

}
