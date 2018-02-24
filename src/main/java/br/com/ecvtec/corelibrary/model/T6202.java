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
 * Classe CIDADE_BAIRRO.<br>
 * Representa a tabela t6202 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6202")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6202 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_6202) da tabela CIDADE_BAIRRO (t6202) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6202;

	/** Campo CIDADE (c2_6202_6201) da tabela CIDADE_BAIRRO (t6202) */
	@ManyToOne
	@JsonBackReference("t6202C2")
	@JoinColumn(name = "c2_6202_6201", foreignKey = @ForeignKey(name = "r2_6202_6201"))
	private T6201 c2_6202_6201;

	/** Campo DESCRIÇÃO (c3_6202) da tabela CIDADE_BAIRRO (t6202) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_6202;

	/** Referencia ao campo BAIRRO (c10_6001_6202) da tabela ENDEREÇO (t6001) */
	@JsonBackReference(value = "c10_6001_6202")
	@OneToMany(mappedBy = "c10_6001_6202", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6001> t6001C10;

	/**
	 * Referencia ao campo BAIRRO (c5_6302_6202) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	@JsonBackReference(value = "c5_6302_6202")
	@OneToMany(mappedBy = "c5_6302_6202", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6302> t6302C5;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6202) da tabela
	 * CIDADE_BAIRRO (t6202)
	 */
	public int getC1_6202() {
		return this.c1_6202;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6202) da tabela
	 * CIDADE_BAIRRO (t6202)
	 */
	public void setC1_6202(int c1_6202) {
		this.c1_6202 = c1_6202;
	}

	/**
	 * Busca valor do campo CIDADE (c2_6202_6201) da tabela CIDADE_BAIRRO
	 * (t6202)
	 */
	public T6201 getC2_6202_6201() {
		return this.c2_6202_6201;
	}

	/**
	 * Define valor do campo CIDADE (c2_6202_6201) da tabela CIDADE_BAIRRO
	 * (t6202)
	 */
	public void setC2_6202_6201(T6201 c2_6202_6201) {
		this.c2_6202_6201 = c2_6202_6201;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c3_6202) da tabela CIDADE_BAIRRO (t6202)
	 */
	public String getC3_6202() {
		return this.c3_6202;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c3_6202) da tabela CIDADE_BAIRRO (t6202)
	 */
	public void setC3_6202(String c3_6202) {
		this.c3_6202 = c3_6202;
	}

	/**
	 * Busca valor do campo referencia BAIRRO (c10_6001_6202) da tabela ENDEREÇO
	 * (t6001)
	 */
	public Set<T6001> getT6001C10() {
		return this.t6001C10;
	}

	/**
	 * Define valor do campo referencia BAIRRO (c10_6001_6202) da tabela
	 * ENDEREÇO (t6001)
	 */
	public void setT6001C10(Set<T6001> t6001C10) {
		this.t6001C10 = t6001C10;
	}

	/**
	 * Busca valor do campo referencia BAIRRO (c5_6302_6202) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public Set<T6302> getT6302C5() {
		return this.t6302C5;
	}

	/**
	 * Define valor do campo referencia BAIRRO (c5_6302_6202) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public void setT6302C5(Set<T6302> t6302C5) {
		this.t6302C5 = t6302C5;
	}

	@Override
	public String toString() {
		return "CIDADE_BAIRRO (t6202) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6202)=" + c1_6202
				+ "\n\t\tDESCRIÇÃO (c3_6202)=" + c3_6202 + "]";
	}

}
