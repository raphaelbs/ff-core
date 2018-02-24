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
 * Classe VIA.<br>
 * Representa a tabela t6301 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6301")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6301 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_6301) da tabela VIA (t6301) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6301;

	/** Campo DESCRIÇÃO (c2_6301) da tabela VIA (t6301) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_6301;

	/** Campo TIPO DO LOGRADOURO (c3_6301_5002) da tabela VIA (t6301) */
	@ManyToOne
	@JoinColumn(name = "c3_6301_5002", foreignKey = @ForeignKey(name = "r3_6301_5002"))
	private T5002 c3_6301_5002;

	/** Referencia ao campo VIA (c3_6001_6301) da tabela ENDEREÇO (t6001) */
	@JsonBackReference(value = "c3_6001_6301")
	@OneToMany(mappedBy = "c3_6001_6301", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6001> t6001C3;

	/**
	 * Referencia ao campo VIA (c2_6302_6301) da tabela VIA_QUARTEIRÃO (t6302)
	 */
	@JsonBackReference(value = "c2_6302_6301")
	@OneToMany(mappedBy = "c2_6302_6301", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6302> t6302C2;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6301) da tabela VIA
	 * (t6301)
	 */
	public int getC1_6301() {
		return this.c1_6301;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6301) da tabela VIA
	 * (t6301)
	 */
	public void setC1_6301(int c1_6301) {
		this.c1_6301 = c1_6301;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_6301) da tabela VIA (t6301) */
	public String getC2_6301() {
		return this.c2_6301;
	}

	/** Define valor do campo DESCRIÇÃO (c2_6301) da tabela VIA (t6301) */
	public void setC2_6301(String c2_6301) {
		this.c2_6301 = c2_6301;
	}

	/**
	 * Busca valor do campo TIPO DO LOGRADOURO (c3_6301_5002) da tabela VIA
	 * (t6301)
	 */
	public T5002 getC3_6301_5002() {
		return this.c3_6301_5002;
	}

	/**
	 * Define valor do campo TIPO DO LOGRADOURO (c3_6301_5002) da tabela VIA
	 * (t6301)
	 */
	public void setC3_6301_5002(T5002 c3_6301_5002) {
		this.c3_6301_5002 = c3_6301_5002;
	}

	/**
	 * Busca valor do campo referencia VIA (c3_6001_6301) da tabela ENDEREÇO
	 * (t6001)
	 */
	public Set<T6001> getT6001C3() {
		return this.t6001C3;
	}

	/**
	 * Define valor do campo referencia VIA (c3_6001_6301) da tabela ENDEREÇO
	 * (t6001)
	 */
	public void setT6001C3(Set<T6001> t6001C3) {
		this.t6001C3 = t6001C3;
	}

	/**
	 * Busca valor do campo referencia VIA (c2_6302_6301) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public Set<T6302> getT6302C2() {
		return this.t6302C2;
	}

	/**
	 * Define valor do campo referencia VIA (c2_6302_6301) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public void setT6302C2(Set<T6302> t6302C2) {
		this.t6302C2 = t6302C2;
	}

	@Override
	public String toString() {
		return "VIA (t6301) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6301)=" + c1_6301 + "\n\t\tDESCRIÇÃO (c2_6301)="
				+ c2_6301 + "]";
	}

}
