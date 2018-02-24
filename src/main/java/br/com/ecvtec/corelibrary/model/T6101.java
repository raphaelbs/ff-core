package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * Classe PAÍS.<br>
 * Representa a tabela t6101 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6101")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6101 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_6101) da tabela PAÍS (t6101) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6101;

	/** Campo DESCRIÇÃO (c2_6101) da tabela PAÍS (t6101) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_6101;

	/** Campo SIGLA (c3_6101) da tabela PAÍS (t6101) */
	@Size(max = 40, message = "SIGLA deve possuir no máximo {max} caracteres.")
	private String c3_6101;

	/** Campo CÓDIGO DDI (c4_6101) da tabela PAÍS (t6101) */
	@Size(max = 40, message = "CÓDIGO DDI deve possuir no máximo {max} caracteres.")
	private String c4_6101;

	/**
	 * Referencia ao campo PAÍS (c2_6102_6101) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	@JsonBackReference(value = "c2_6102_6101")
	@OneToMany(mappedBy = "c2_6102_6101", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6102> t6102C2;

	/** Referencia ao campo PAÍS (c3_6201_6101) da tabela CIDADE (t6201) */
	@JsonBackReference(value = "c3_6201_6101")
	@OneToMany(mappedBy = "c3_6201_6101", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6201> t6201C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6101) da tabela PAÍS
	 * (t6101)
	 */
	public int getC1_6101() {
		return this.c1_6101;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6101) da tabela PAÍS
	 * (t6101)
	 */
	public void setC1_6101(int c1_6101) {
		this.c1_6101 = c1_6101;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_6101) da tabela PAÍS (t6101) */
	public String getC2_6101() {
		return this.c2_6101;
	}

	/** Define valor do campo DESCRIÇÃO (c2_6101) da tabela PAÍS (t6101) */
	public void setC2_6101(String c2_6101) {
		this.c2_6101 = c2_6101;
	}

	/** Busca valor do campo SIGLA (c3_6101) da tabela PAÍS (t6101) */
	public String getC3_6101() {
		return this.c3_6101;
	}

	/** Define valor do campo SIGLA (c3_6101) da tabela PAÍS (t6101) */
	public void setC3_6101(String c3_6101) {
		this.c3_6101 = c3_6101;
	}

	/** Busca valor do campo CÓDIGO DDI (c4_6101) da tabela PAÍS (t6101) */
	public String getC4_6101() {
		return this.c4_6101;
	}

	/** Define valor do campo CÓDIGO DDI (c4_6101) da tabela PAÍS (t6101) */
	public void setC4_6101(String c4_6101) {
		this.c4_6101 = c4_6101;
	}

	/**
	 * Busca valor do campo referencia PAÍS (c2_6102_6101) da tabela UNIDADE DA
	 * FEDERAÇÃO (t6102)
	 */
	public Set<T6102> getT6102C2() {
		return this.t6102C2;
	}

	/**
	 * Define valor do campo referencia PAÍS (c2_6102_6101) da tabela UNIDADE DA
	 * FEDERAÇÃO (t6102)
	 */
	public void setT6102C2(Set<T6102> t6102C2) {
		this.t6102C2 = t6102C2;
	}

	/**
	 * Busca valor do campo referencia PAÍS (c3_6201_6101) da tabela CIDADE
	 * (t6201)
	 */
	public Set<T6201> getT6201C3() {
		return this.t6201C3;
	}

	/**
	 * Define valor do campo referencia PAÍS (c3_6201_6101) da tabela CIDADE
	 * (t6201)
	 */
	public void setT6201C3(Set<T6201> t6201C3) {
		this.t6201C3 = t6201C3;
	}

	@Override
	public String toString() {
		return "PAÍS (t6101) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6101)=" + c1_6101 + "\n\t\tDESCRIÇÃO (c2_6101)="
				+ c2_6101 + "\n\t\tSIGLA (c3_6101)=" + c3_6101 + "\n\t\tCÓDIGO DDI (c4_6101)=" + c4_6101 + "]";
	}

}
