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
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Classe ENTIDADE_ENDEREÇO.<br>
 * Representa a tabela t1002 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1002")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1002 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1002) da tabela ENTIDADE_ENDEREÇO (t1002)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1002;

	/** Campo PESSOA (c2_1002_1001) da tabela ENTIDADE_ENDEREÇO (t1002) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_1002_1001", foreignKey = @ForeignKey(name = "r2_1002_1001"))
	@JsonBackReference("c2_1002_1001")
	private T1001 c2_1002_1001;

	/**
	 * Campo DESCRIÇÃO (NOME DA FILIAL OU AGÊNCIA) (c3_1002) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	@Size(max = 40, message = "DESCRIÇÃO (NOME DA FILIAL OU AGÊNCIA) deve possuir no máximo {max} caracteres.")
	private String c3_1002;

	/**
	 * Campo TIPO DO ENDEREÇO (COMERCIAL, RESIDENCIAL E ETC) (c4_1002_5002) da
	 * tabela ENTIDADE_ENDEREÇO (t1002)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_1002_5002", foreignKey = @ForeignKey(name = "r4_1002_5002"))
	private T5002 c4_1002_5002;

	/** Campo ENDEREÇO (c5_1002_6001) da tabela ENTIDADE_ENDEREÇO (t1002) */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c5_1002_6001", foreignKey = @ForeignKey(name = "r5_1002_6001"))
	private T6001 c5_1002_6001;

	/**
	 * Referencia ao campo PRAÇA (c3_1003_1002) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	@JsonManagedReference("t1003C3")
	@OneToMany(mappedBy = "c3_1003_1002", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T1003> t1003C3;

	/**
	 * Referencia ao campo PRAÇA (c3_1004_1002) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	@JsonManagedReference("t1004C3")
	@OneToMany(mappedBy = "c3_1004_1002", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T1004> t1004C3;

	/**
	 * Referencia ao campo PRAÇA (c3_1005_1002) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	@JsonManagedReference("t1005C3")
	@OneToMany(mappedBy = "c3_1005_1002", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T1005> t1005C3;

	/**
	 * Referencia ao campo TABELA DE PESSOA (PRACA) (c4_2007_1002) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	@JsonBackReference("c4_2007_1002")
	@OneToMany(mappedBy = "c4_2007_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2007> t2007C4;

	/** Referencia ao campo AGÊNCIA (c4_2501_1002) da tabela CONTA (t2501) */
	@JsonBackReference("c4_2501_1002")
	@OneToMany(mappedBy = "c4_2501_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2501> t2501C4;

	/**	
	 * Referencia ao campo CORRENTISTA PRAÇA (c5_2507_1002) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	@JsonBackReference("c5_2507_1002")
	@OneToMany(mappedBy = "c5_2507_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2507> t2507C5;

	/**
	 * Referencia ao campo COLIGADA FILIAL (c3_3001_1002) da tabela RECEITA
	 * (t3001)
	 */
	@JsonBackReference("c3_3001_1002")
	@OneToMany(mappedBy = "c3_3001_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3001> t3001C3;

	/**
	 * Referencia ao campo CLIENTE PRAÇA (c9_3001_1002) da tabela RECEITA
	 * (t3001)
	 */
	@JsonBackReference("c9_3001_1002")
	@OneToMany(mappedBy = "c9_3001_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3001> t3001C9;

	/**
	 * Referencia ao campo FILIAL (c13_7001_1002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	@JsonBackReference("c13_7001_1002")
	@OneToMany(mappedBy = "c13_7001_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T7001> t7001C13;

	/**
	 * Referencia ao campo REMETENTE ENDEREÇO (c5_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	@JsonBackReference("c5_9401_1002")
	@OneToMany(mappedBy = "c5_9401_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C5;

	/**
	 * Referencia ao campo DESTINATÁRIO ENDEREÇO (c9_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	@JsonBackReference("c9_9401_1002")
	@OneToMany(mappedBy = "c9_9401_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C9;

	/**
	 * Referencia ao campo COLIGADA FILIAL (c15_9401_1002) da tabela CARGA
	 * (t9401)
	 */
	@JsonBackReference("c15_9401_1002")
	@OneToMany(mappedBy = "c15_9401_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C15;

	/**
	 * Referencia ao campo COLIGADA FILIIAL (c8_9501_1002) da tabela VIAGEM
	 * (t9501)
	 */
	@JsonBackReference("c8_9501_1002")
	@OneToMany(mappedBy = "c8_9501_1002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9501> t9501C8;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1002) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	public int getC1_1002() {
		return this.c1_1002;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1002) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	public void setC1_1002(int c1_1002) {
		this.c1_1002 = c1_1002;
	}

	/**
	 * Busca valor do campo PESSOA (c2_1002_1001) da tabela ENTIDADE_ENDEREÇO
	 * (t1002)
	 */
	public T1001 getC2_1002_1001() {
		return this.c2_1002_1001;
	}

	/**
	 * Define valor do campo PESSOA (c2_1002_1001) da tabela ENTIDADE_ENDEREÇO
	 * (t1002)
	 */
	public void setC2_1002_1001(T1001 c2_1002_1001) {
		this.c2_1002_1001 = c2_1002_1001;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (NOME DA FILIAL OU AGÊNCIA) (c3_1002) da
	 * tabela ENTIDADE_ENDEREÇO (t1002)
	 */
	public String getC3_1002() {
		return this.c3_1002;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (NOME DA FILIAL OU AGÊNCIA) (c3_1002) da
	 * tabela ENTIDADE_ENDEREÇO (t1002)
	 */
	public void setC3_1002(String c3_1002) {
		this.c3_1002 = c3_1002;
	}

	/**
	 * Busca valor do campo TIPO DO ENDEREÇO (COMERCIAL, RESIDENCIAL E ETC)
	 * (c4_1002_5002) da tabela ENTIDADE_ENDEREÇO (t1002)
	 */
	public T5002 getC4_1002_5002() {
		return this.c4_1002_5002;
	}

	/**
	 * Define valor do campo TIPO DO ENDEREÇO (COMERCIAL, RESIDENCIAL E ETC)
	 * (c4_1002_5002) da tabela ENTIDADE_ENDEREÇO (t1002)
	 */
	public void setC4_1002_5002(T5002 c4_1002_5002) {
		this.c4_1002_5002 = c4_1002_5002;
	}

	/**
	 * Busca valor do campo ENDEREÇO (c5_1002_6001) da tabela ENTIDADE_ENDEREÇO
	 * (t1002)
	 */
	public T6001 getC5_1002_6001() {
		return this.c5_1002_6001;
	}

	/**
	 * Define valor do campo ENDEREÇO (c5_1002_6001) da tabela ENTIDADE_ENDEREÇO
	 * (t1002)
	 */
	public void setC5_1002_6001(T6001 c5_1002_6001) {
		this.c5_1002_6001 = c5_1002_6001;
	}

	/**
	 * Busca valor do campo referencia PRAÇA (c3_1003_1002) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public Set<T1003> getT1003C3() {
		return this.t1003C3;
	}

	/**
	 * Define valor do campo referencia PRAÇA (c3_1003_1002) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setT1003C3(Set<T1003> t1003C3) {
		this.t1003C3 = t1003C3;
	}

	/**
	 * Busca valor do campo referencia PRAÇA (c3_1004_1002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public Set<T1004> getT1004C3() {
		return this.t1004C3;
	}

	/**
	 * Define valor do campo referencia PRAÇA (c3_1004_1002) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setT1004C3(Set<T1004> t1004C3) {
		this.t1004C3 = t1004C3;
	}

	/**
	 * Busca valor do campo referencia PRAÇA (c3_1005_1002) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public Set<T1005> getT1005C3() {
		return this.t1005C3;
	}

	/**
	 * Define valor do campo referencia PRAÇA (c3_1005_1002) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public void setT1005C3(Set<T1005> t1005C3) {
		this.t1005C3 = t1005C3;
	}

	/**
	 * Busca valor do campo referencia TABELA DE PESSOA (PRACA) (c4_2007_1002)
	 * da tabela INSUMO_ENTIDADE (t2007)
	 */
	public Set<T2007> getT2007C4() {
		return this.t2007C4;
	}

	/**
	 * Define valor do campo referencia TABELA DE PESSOA (PRACA) (c4_2007_1002)
	 * da tabela INSUMO_ENTIDADE (t2007)
	 */
	public void setT2007C4(Set<T2007> t2007C4) {
		this.t2007C4 = t2007C4;
	}

	/**
	 * Busca valor do campo referencia AGÊNCIA (c4_2501_1002) da tabela CONTA
	 * (t2501)
	 */
	public Set<T2501> getT2501C4() {
		return this.t2501C4;
	}

	/**
	 * Define valor do campo referencia AGÊNCIA (c4_2501_1002) da tabela CONTA
	 * (t2501)
	 */
	public void setT2501C4(Set<T2501> t2501C4) {
		this.t2501C4 = t2501C4;
	}

	/**
	 * Busca valor do campo referencia CORRENTISTA PRAÇA (c5_2507_1002) da
	 * tabela CONTA_CORRENTISTA (t2507)
	 */
	public Set<T2507> getT2507C5() {
		return this.t2507C5;
	}

	/**
	 * Define valor do campo referencia CORRENTISTA PRAÇA (c5_2507_1002) da
	 * tabela CONTA_CORRENTISTA (t2507)
	 */
	public void setT2507C5(Set<T2507> t2507C5) {
		this.t2507C5 = t2507C5;
	}

	/**
	 * Busca valor do campo referencia COLIGADA FILIAL (c3_3001_1002) da tabela
	 * RECEITA (t3001)
	 */
	public Set<T3001> getT3001C3() {
		return this.t3001C3;
	}

	/**
	 * Define valor do campo referencia COLIGADA FILIAL (c3_3001_1002) da tabela
	 * RECEITA (t3001)
	 */
	public void setT3001C3(Set<T3001> t3001C3) {
		this.t3001C3 = t3001C3;
	}

	/**
	 * Busca valor do campo referencia CLIENTE PRAÇA (c9_3001_1002) da tabela
	 * RECEITA (t3001)
	 */
	public Set<T3001> getT3001C9() {
		return this.t3001C9;
	}

	/**
	 * Define valor do campo referencia CLIENTE PRAÇA (c9_3001_1002) da tabela
	 * RECEITA (t3001)
	 */
	public void setT3001C9(Set<T3001> t3001C9) {
		this.t3001C9 = t3001C9;
	}

	/**
	 * Busca valor do campo referencia FILIAL (c13_7001_1002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public Set<T7001> getT7001C13() {
		return this.t7001C13;
	}

	/**
	 * Define valor do campo referencia FILIAL (c13_7001_1002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setT7001C13(Set<T7001> t7001C13) {
		this.t7001C13 = t7001C13;
	}

	/**
	 * Busca valor do campo referencia REMETENTE ENDEREÇO (c5_9401_1002) da
	 * tabela CARGA (t9401)
	 */
	public Set<T9401> getT9401C5() {
		return this.t9401C5;
	}

	/**
	 * Define valor do campo referencia REMETENTE ENDEREÇO (c5_9401_1002) da
	 * tabela CARGA (t9401)
	 */
	public void setT9401C5(Set<T9401> t9401C5) {
		this.t9401C5 = t9401C5;
	}

	/**
	 * Busca valor do campo referencia DESTINATÁRIO ENDEREÇO (c9_9401_1002) da
	 * tabela CARGA (t9401)
	 */
	public Set<T9401> getT9401C9() {
		return this.t9401C9;
	}

	/**
	 * Define valor do campo referencia DESTINATÁRIO ENDEREÇO (c9_9401_1002) da
	 * tabela CARGA (t9401)
	 */
	public void setT9401C9(Set<T9401> t9401C9) {
		this.t9401C9 = t9401C9;
	}

	/**
	 * Busca valor do campo referencia COLIGADA FILIAL (c15_9401_1002) da tabela
	 * CARGA (t9401)
	 */
	public Set<T9401> getT9401C15() {
		return this.t9401C15;
	}

	/**
	 * Define valor do campo referencia COLIGADA FILIAL (c15_9401_1002) da
	 * tabela CARGA (t9401)
	 */
	public void setT9401C15(Set<T9401> t9401C15) {
		this.t9401C15 = t9401C15;
	}

	/**
	 * Busca valor do campo referencia COLIGADA FILIIAL (c8_9501_1002) da tabela
	 * VIAGEM (t9501)
	 */
	public Set<T9501> getT9501C8() {
		return this.t9501C8;
	}

	/**
	 * Define valor do campo referencia COLIGADA FILIIAL (c8_9501_1002) da
	 * tabela VIAGEM (t9501)
	 */
	public void setT9501C8(Set<T9501> t9501C8) {
		this.t9501C8 = t9501C8;
	}

	@Override
	public String toString() {
		return "ENTIDADE_ENDEREÇO (t1002) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1002)=" + c1_1002
				+ "\n\t\tDESCRIÇÃO (NOME DA FILIAL OU AGÊNCIA) (c3_1002)=" + c3_1002 + "]";
	}

}
