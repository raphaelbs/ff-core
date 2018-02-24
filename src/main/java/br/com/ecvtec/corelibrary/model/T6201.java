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
 * Classe CIDADE.<br>
 * Representa a tabela t6201 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6201")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6201 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_6201) da tabela CIDADE (t6201) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6201;

	/** Campo DESCRIÇÃO (c2_6201) da tabela CIDADE (t6201) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_6201;

	/** Campo PAÍS (c3_6201_6101) da tabela CIDADE (t6201) */
	@ManyToOne
	@JoinColumn(name = "c3_6201_6101", foreignKey = @ForeignKey(name = "r3_6201_6101"))
	private T6101 c3_6201_6101;

	/** Campo UF (c4_6201_6102) da tabela CIDADE (t6201) */
	@ManyToOne
	@JoinColumn(name = "c4_6201_6102", foreignKey = @ForeignKey(name = "r4_6201_6102"))
	private T6102 c4_6201_6102;

	/**
	 * Referencia ao campo NATURAL DE (c11_1004_6201) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	@JsonBackReference(value = "c11_1004_6201")
	@OneToMany(mappedBy = "c11_1004_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1004> t1004C11;

	/**
	 * Referencia ao campo CIDADE (c3_1095_6201) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	@JsonBackReference(value = "c3_1095_6201")
	@OneToMany(mappedBy = "c3_1095_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1095> t1095C3;

	/**
	 * Referencia ao campo CIDADE DE EMPLACAMENTO DO VEICULO (c4_2099_6201) da
	 * tabela INSUMO_VEÍCULO (t2099)
	 */
	@JsonBackReference(value = "c4_2099_6201")
	@OneToMany(mappedBy = "c4_2099_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2099> t2099C4;

	/** Referencia ao campo CIDADE (c12_6001_6201) da tabela ENDEREÇO (t6001) */
	@JsonBackReference(value = "c12_6001_6201")
	@OneToMany(mappedBy = "c12_6001_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6001> t6001C12;

	/**
	 * Referencia ao campo CIDADE (c2_6202_6201) da tabela CIDADE_BAIRRO (t6202)
	 */
	@JsonManagedReference("t6202C2")
	@OneToMany(mappedBy = "c2_6202_6201", cascade = CascadeType.ALL, 
		fetch = FetchType.EAGER, orphanRemoval=true)
	private Set<T6202> t6202C2;

	/**
	 * Referencia ao campo CIDADE (c2_6206_6201) da tabela CIDADE_DETALHE
	 * (t6206)
	 */
	@JsonManagedReference("t6206C2")
	@OneToMany(mappedBy = "c2_6206_6201", cascade = CascadeType.ALL, 
		fetch = FetchType.EAGER, orphanRemoval=true)
	private Set<T6206> t6206C2;

	/**
	 * Referencia ao campo CIDADE (c4_6302_6201) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	@JsonBackReference(value = "c4_6302_6201")
	@OneToMany(mappedBy = "c4_6302_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6302> t6302C4;

	/**
	 * Referencia ao campo CIDADE ORIGEM (c16_9401_6201) da tabela CARGA (t9401)
	 */
	@JsonBackReference(value = "c16_9401_6201")
	@OneToMany(mappedBy = "c16_9401_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C16;

	/**
	 * Referencia ao campo CIDADE DESTINO (c17_9401_6201) da tabela CARGA
	 * (t9401)
	 */
	@JsonBackReference(value = "c17_9401_6201")
	@OneToMany(mappedBy = "c17_9401_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C17;

	/**
	 * Referencia ao campo CIDADE ORIGEM (c3_9502_6201) da tabela VIAGEM_TRAJETO
	 * (t9502)
	 */
	@JsonBackReference(value = "c3_9502_6201")
	@OneToMany(mappedBy = "c3_9502_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9502> t9502C3;

	/**
	 * Referencia ao campo CIDADE DESTINO (c4_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	@JsonBackReference(value = "c4_9502_6201")
	@OneToMany(mappedBy = "c4_9502_6201", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9502> t9502C4;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6201) da tabela CIDADE
	 * (t6201)
	 */
	public int getC1_6201() {
		return this.c1_6201;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6201) da tabela CIDADE
	 * (t6201)
	 */
	public void setC1_6201(int c1_6201) {
		this.c1_6201 = c1_6201;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_6201) da tabela CIDADE (t6201) */
	public String getC2_6201() {
		return this.c2_6201;
	}

	/** Define valor do campo DESCRIÇÃO (c2_6201) da tabela CIDADE (t6201) */
	public void setC2_6201(String c2_6201) {
		this.c2_6201 = c2_6201;
	}

	/** Busca valor do campo PAÍS (c3_6201_6101) da tabela CIDADE (t6201) */
	public T6101 getC3_6201_6101() {
		return this.c3_6201_6101;
	}

	/** Define valor do campo PAÍS (c3_6201_6101) da tabela CIDADE (t6201) */
	public void setC3_6201_6101(T6101 c3_6201_6101) {
		this.c3_6201_6101 = c3_6201_6101;
	}

	/** Busca valor do campo UF (c4_6201_6102) da tabela CIDADE (t6201) */
	public T6102 getC4_6201_6102() {
		return this.c4_6201_6102;
	}

	/** Define valor do campo UF (c4_6201_6102) da tabela CIDADE (t6201) */
	public void setC4_6201_6102(T6102 c4_6201_6102) {
		this.c4_6201_6102 = c4_6201_6102;
	}

	/**
	 * Busca valor do campo referencia NATURAL DE (c11_1004_6201) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public Set<T1004> getT1004C11() {
		return this.t1004C11;
	}

	/**
	 * Define valor do campo referencia NATURAL DE (c11_1004_6201) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setT1004C11(Set<T1004> t1004C11) {
		this.t1004C11 = t1004C11;
	}

	/**
	 * Busca valor do campo referencia CIDADE (c3_1095_6201) da tabela
	 * ENTIDADE_CIDADE (t1095)
	 */
	public Set<T1095> getT1095C3() {
		return this.t1095C3;
	}

	/**
	 * Define valor do campo referencia CIDADE (c3_1095_6201) da tabela
	 * ENTIDADE_CIDADE (t1095)
	 */
	public void setT1095C3(Set<T1095> t1095C3) {
		this.t1095C3 = t1095C3;
	}

	/**
	 * Busca valor do campo referencia CIDADE DE EMPLACAMENTO DO VEICULO
	 * (c4_2099_6201) da tabela INSUMO_VEÍCULO (t2099)
	 */
	public Set<T2099> getT2099C4() {
		return this.t2099C4;
	}

	/**
	 * Define valor do campo referencia CIDADE DE EMPLACAMENTO DO VEICULO
	 * (c4_2099_6201) da tabela INSUMO_VEÍCULO (t2099)
	 */
	public void setT2099C4(Set<T2099> t2099C4) {
		this.t2099C4 = t2099C4;
	}

	/**
	 * Busca valor do campo referencia CIDADE (c12_6001_6201) da tabela ENDEREÇO
	 * (t6001)
	 */
	public Set<T6001> getT6001C12() {
		return this.t6001C12;
	}

	/**
	 * Define valor do campo referencia CIDADE (c12_6001_6201) da tabela
	 * ENDEREÇO (t6001)
	 */
	public void setT6001C12(Set<T6001> t6001C12) {
		this.t6001C12 = t6001C12;
	}

	/**
	 * Busca valor do campo referencia CIDADE (c2_6202_6201) da tabela
	 * CIDADE_BAIRRO (t6202)
	 */
	public Set<T6202> getT6202C2() {
		return this.t6202C2;
	}

	/**
	 * Define valor do campo referencia CIDADE (c2_6202_6201) da tabela
	 * CIDADE_BAIRRO (t6202)
	 */
	public void setT6202C2(Set<T6202> t6202C2) {
		this.t6202C2 = t6202C2;
	}

	/**
	 * Busca valor do campo referencia CIDADE (c2_6206_6201) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public Set<T6206> getT6206C2() {
		return this.t6206C2;
	}

	/**
	 * Define valor do campo referencia CIDADE (c2_6206_6201) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public void setT6206C2(Set<T6206> t6206C2) {
		this.t6206C2 = t6206C2;
	}

	/**
	 * Busca valor do campo referencia CIDADE (c4_6302_6201) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public Set<T6302> getT6302C4() {
		return this.t6302C4;
	}

	/**
	 * Define valor do campo referencia CIDADE (c4_6302_6201) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public void setT6302C4(Set<T6302> t6302C4) {
		this.t6302C4 = t6302C4;
	}

	/**
	 * Busca valor do campo referencia CIDADE ORIGEM (c16_9401_6201) da tabela
	 * CARGA (t9401)
	 */
	public Set<T9401> getT9401C16() {
		return this.t9401C16;
	}

	/**
	 * Define valor do campo referencia CIDADE ORIGEM (c16_9401_6201) da tabela
	 * CARGA (t9401)
	 */
	public void setT9401C16(Set<T9401> t9401C16) {
		this.t9401C16 = t9401C16;
	}

	/**
	 * Busca valor do campo referencia CIDADE DESTINO (c17_9401_6201) da tabela
	 * CARGA (t9401)
	 */
	public Set<T9401> getT9401C17() {
		return this.t9401C17;
	}

	/**
	 * Define valor do campo referencia CIDADE DESTINO (c17_9401_6201) da tabela
	 * CARGA (t9401)
	 */
	public void setT9401C17(Set<T9401> t9401C17) {
		this.t9401C17 = t9401C17;
	}

	/**
	 * Busca valor do campo referencia CIDADE ORIGEM (c3_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public Set<T9502> getT9502C3() {
		return this.t9502C3;
	}

	/**
	 * Define valor do campo referencia CIDADE ORIGEM (c3_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public void setT9502C3(Set<T9502> t9502C3) {
		this.t9502C3 = t9502C3;
	}

	/**
	 * Busca valor do campo referencia CIDADE DESTINO (c4_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public Set<T9502> getT9502C4() {
		return this.t9502C4;
	}

	/**
	 * Define valor do campo referencia CIDADE DESTINO (c4_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public void setT9502C4(Set<T9502> t9502C4) {
		this.t9502C4 = t9502C4;
	}

	@Override
	public String toString() {
		return "CIDADE (t6201) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6201)=" + c1_6201 + "\n\t\tDESCRIÇÃO (c2_6201)="
				+ c2_6201 + "]";
	}

}
