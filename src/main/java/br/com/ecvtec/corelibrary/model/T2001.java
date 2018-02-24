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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe INSUMO.<br>
 * Representa a tabela t2001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2001 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_2001) da tabela INSUMO (t2001) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2001;

	/** Campo NOME DO PRODUTO (c2_2001) da tabela INSUMO (t2001) */
	@Size(max = 160, message = "NOME DO PRODUTO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_2001;

	/** Campo APELIDO OU NOME GENERICO (c3_2001) da tabela INSUMO (t2001) */
	@Size(max = 40, message = "APELIDO OU NOME GENERICO deve possuir no máximo {max} caracteres.")
	private String c3_2001;

	/**
	 * Campo TIPO INSUMO (PRODUTO OU SERVIÇO) (c4_2001_5002) da tabela INSUMO
	 * (t2001)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_2001_5002", foreignKey = @ForeignKey(name = "r4_2001_5002"))
	private T5002 c4_2001_5002;

	/**
	 * Campo FORMA INSUMO (GENERICO OU INDIVIDUAL) (c5_2001_5002) da tabela
	 * INSUMO (t2001)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c5_2001_5002", foreignKey = @ForeignKey(name = "r5_2001_5002"))
	private T5002 c5_2001_5002;

	/**
	 * Campo INSUMO GENERICO DE ORIGEM (c6_2001_2001) da tabela INSUMO (t2001)
	 */
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "c6_2001_2001", foreignKey = @ForeignKey(name = "r6_2001_2001"))
	private T2001 c6_2001_2001;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2002_2001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	@JsonBackReference(value = "c2_2002_2001")
	@OneToMany(mappedBy = "c2_2002_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2002> t2002C2;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2003_2001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	@JsonBackReference(value = "c2_2003_2001")
	@OneToMany(mappedBy = "c2_2003_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2003> t2003C2;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2006_2001) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	@JsonBackReference(value = "c2_2006_2001")
	@OneToMany(mappedBy = "c2_2006_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2006> t2006C2;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2007_2001) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	@JsonBackReference(value = "c2_2007_2001")
	@OneToMany(mappedBy = "c2_2007_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2007> t2007C2;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2008_2001) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	@JsonBackReference(value = "c2_2008_2001")
	@OneToMany(mappedBy = "c2_2008_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2008> t2008C2;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2097_2001) da tabela
	 * INSUMO_COMBUSTÍVEL (t2097)
	 */
	@JsonBackReference(value = "c2_2097_2001")
	@OneToMany(mappedBy = "c2_2097_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2097> t2097C2;

	/**
	 * Referencia ao campo COMBUSTIVEL (GASOLINA, GAS, DIESEL, ALCOOL, LENHA
	 * ETC) (c3_2097_2001) da tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	@JsonBackReference(value = "c3_2097_2001")
	@OneToMany(mappedBy = "c3_2097_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2097> t2097C3;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2098_2001) da tabela
	 * INSUMO_GRUPO (t2098)
	 */
	@JsonBackReference(value = "c2_2098_2001")
	@OneToMany(mappedBy = "c2_2098_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2098> t2098C2;

	/**
	 * Referencia ao campo TABELA DE INSUMO (c2_2099_2001) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	@JsonBackReference(value = "c2_2099_2001")
	@OneToMany(mappedBy = "c2_2099_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2099> t2099C2;

	/**
	 * Referencia ao campo INSUMO (c3_3002_2001) da tabela RECEITA_ITEM (t3002)
	 */
	@JsonBackReference(value = "c3_3002_2001")
	@OneToMany(mappedBy = "c3_3002_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3002> t3002C3;

	/**
	 * Referencia ao campo IMPOSTO (c4_3003_2001) da tabela RECEITA_IMPOSTO
	 * (t3003)
	 */
	@JsonBackReference(value = "c4_3003_2001")
	@OneToMany(mappedBy = "c4_3003_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3003> t3003C4;

	/** Referencia ao campo VEICULO (c10_9501_2001) da tabela VIAGEM (t9501) */
	@JsonBackReference(value = "c10_9501_2001")
	@OneToMany(mappedBy = "c10_9501_2001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9501> t9501C10;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2001) da tabela INSUMO
	 * (t2001)
	 */
	public int getC1_2001() {
		return this.c1_2001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2001) da tabela INSUMO
	 * (t2001)
	 */
	public void setC1_2001(int c1_2001) {
		this.c1_2001 = c1_2001;
	}

	/**
	 * Busca valor do campo NOME DO PRODUTO (c2_2001) da tabela INSUMO (t2001)
	 */
	public String getC2_2001() {
		return this.c2_2001;
	}

	/**
	 * Define valor do campo NOME DO PRODUTO (c2_2001) da tabela INSUMO (t2001)
	 */
	public void setC2_2001(String c2_2001) {
		this.c2_2001 = c2_2001;
	}

	/**
	 * Busca valor do campo APELIDO OU NOME GENERICO (c3_2001) da tabela INSUMO
	 * (t2001)
	 */
	public String getC3_2001() {
		return this.c3_2001;
	}

	/**
	 * Define valor do campo APELIDO OU NOME GENERICO (c3_2001) da tabela INSUMO
	 * (t2001)
	 */
	public void setC3_2001(String c3_2001) {
		this.c3_2001 = c3_2001;
	}

	/**
	 * Busca valor do campo TIPO INSUMO (PRODUTO OU SERVIÇO) (c4_2001_5002) da
	 * tabela INSUMO (t2001)
	 */
	public T5002 getC4_2001_5002() {
		return this.c4_2001_5002;
	}

	/**
	 * Define valor do campo TIPO INSUMO (PRODUTO OU SERVIÇO) (c4_2001_5002) da
	 * tabela INSUMO (t2001)
	 */
	public void setC4_2001_5002(T5002 c4_2001_5002) {
		this.c4_2001_5002 = c4_2001_5002;
	}

	/**
	 * Busca valor do campo FORMA INSUMO (GENERICO OU INDIVIDUAL) (c5_2001_5002)
	 * da tabela INSUMO (t2001)
	 */
	public T5002 getC5_2001_5002() {
		return this.c5_2001_5002;
	}

	/**
	 * Define valor do campo FORMA INSUMO (GENERICO OU INDIVIDUAL)
	 * (c5_2001_5002) da tabela INSUMO (t2001)
	 */
	public void setC5_2001_5002(T5002 c5_2001_5002) {
		this.c5_2001_5002 = c5_2001_5002;
	}

	/**
	 * Busca valor do campo INSUMO GENERICO DE ORIGEM (c6_2001_2001) da tabela
	 * INSUMO (t2001)
	 */
	public T2001 getC6_2001_2001() {
		return this.c6_2001_2001;
	}

	/**
	 * Define valor do campo INSUMO GENERICO DE ORIGEM (c6_2001_2001) da tabela
	 * INSUMO (t2001)
	 */
	public void setC6_2001_2001(T2001 c6_2001_2001) {
		this.c6_2001_2001 = c6_2001_2001;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2002_2001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public Set<T2002> getT2002C2() {
		return this.t2002C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2002_2001) da
	 * tabela INSUMO_ENDEREÇO (t2002)
	 */
	public void setT2002C2(Set<T2002> t2002C2) {
		this.t2002C2 = t2002C2;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2003_2001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public Set<T2003> getT2003C2() {
		return this.t2003C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2003_2001) da
	 * tabela INSUMO_DOCUMENTO (t2003)
	 */
	public void setT2003C2(Set<T2003> t2003C2) {
		this.t2003C2 = t2003C2;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2006_2001) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public Set<T2006> getT2006C2() {
		return this.t2006C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2006_2001) da
	 * tabela INSUMO_DETALHE (t2006)
	 */
	public void setT2006C2(Set<T2006> t2006C2) {
		this.t2006C2 = t2006C2;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2007_2001) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public Set<T2007> getT2007C2() {
		return this.t2007C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2007_2001) da
	 * tabela INSUMO_ENTIDADE (t2007)
	 */
	public void setT2007C2(Set<T2007> t2007C2) {
		this.t2007C2 = t2007C2;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2008_2001) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public Set<T2008> getT2008C2() {
		return this.t2008C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2008_2001) da
	 * tabela INSUMO_IMAGEM (t2008)
	 */
	public void setT2008C2(Set<T2008> t2008C2) {
		this.t2008C2 = t2008C2;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2097_2001) da tabela
	 * INSUMO_COMBUSTÍVEL (t2097)
	 */
	public Set<T2097> getT2097C2() {
		return this.t2097C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2097_2001) da
	 * tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	public void setT2097C2(Set<T2097> t2097C2) {
		this.t2097C2 = t2097C2;
	}

	/**
	 * Busca valor do campo referencia COMBUSTIVEL (GASOLINA, GAS, DIESEL,
	 * ALCOOL, LENHA ETC) (c3_2097_2001) da tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	public Set<T2097> getT2097C3() {
		return this.t2097C3;
	}

	/**
	 * Define valor do campo referencia COMBUSTIVEL (GASOLINA, GAS, DIESEL,
	 * ALCOOL, LENHA ETC) (c3_2097_2001) da tabela INSUMO_COMBUSTÍVEL (t2097)
	 */
	public void setT2097C3(Set<T2097> t2097C3) {
		this.t2097C3 = t2097C3;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2098_2001) da tabela
	 * INSUMO_GRUPO (t2098)
	 */
	public Set<T2098> getT2098C2() {
		return this.t2098C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2098_2001) da
	 * tabela INSUMO_GRUPO (t2098)
	 */
	public void setT2098C2(Set<T2098> t2098C2) {
		this.t2098C2 = t2098C2;
	}

	/**
	 * Busca valor do campo referencia TABELA DE INSUMO (c2_2099_2001) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public Set<T2099> getT2099C2() {
		return this.t2099C2;
	}

	/**
	 * Define valor do campo referencia TABELA DE INSUMO (c2_2099_2001) da
	 * tabela INSUMO_VEÍCULO (t2099)
	 */
	public void setT2099C2(Set<T2099> t2099C2) {
		this.t2099C2 = t2099C2;
	}

	/**
	 * Busca valor do campo referencia INSUMO (c3_3002_2001) da tabela
	 * RECEITA_ITEM (t3002)
	 */
	public Set<T3002> getT3002C3() {
		return this.t3002C3;
	}

	/**
	 * Define valor do campo referencia INSUMO (c3_3002_2001) da tabela
	 * RECEITA_ITEM (t3002)
	 */
	public void setT3002C3(Set<T3002> t3002C3) {
		this.t3002C3 = t3002C3;
	}

	/**
	 * Busca valor do campo referencia IMPOSTO (c4_3003_2001) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public Set<T3003> getT3003C4() {
		return this.t3003C4;
	}

	/**
	 * Define valor do campo referencia IMPOSTO (c4_3003_2001) da tabela
	 * RECEITA_IMPOSTO (t3003)
	 */
	public void setT3003C4(Set<T3003> t3003C4) {
		this.t3003C4 = t3003C4;
	}

	/**
	 * Busca valor do campo referencia VEICULO (c10_9501_2001) da tabela VIAGEM
	 * (t9501)
	 */
	public Set<T9501> getT9501C10() {
		return this.t9501C10;
	}

	/**
	 * Define valor do campo referencia VEICULO (c10_9501_2001) da tabela VIAGEM
	 * (t9501)
	 */
	public void setT9501C10(Set<T9501> t9501C10) {
		this.t9501C10 = t9501C10;
	}

	@Override
	public String toString() {
		return "INSUMO (t2001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2001)=" + c1_2001
				+ "\n\t\tNOME DO PRODUTO (c2_2001)=" + c2_2001 + "\n\t\tAPELIDO OU NOME GENERICO (c3_2001)=" + c3_2001
				+ "]";
	}

}
