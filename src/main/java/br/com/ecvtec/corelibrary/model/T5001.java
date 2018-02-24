package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

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
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Classe TIPO.<br>
 * Representa a tabela t5001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t5001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T5001 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_5001) da tabela TIPO (t5001) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_5001;

	/** Campo DESCRIÇÃO (c2_5001) da tabela TIPO (t5001) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_5001;

	/** Campo TIPO (c3_5001_5002) da tabela TIPO (t5001) */
	@NotNull
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "c3_5001_5002", foreignKey = @ForeignKey(name = "r3_5001_5002"))
	private T5002 c3_5001_5002;

	/**
	 * Referencia ao campo TIPO DE TIPO (c2_5002_5001) da tabela TIPO_VALOR
	 * (t5002)
	 */
	@JsonManagedReference("c2_5002_5001")
	@OneToMany(mappedBy = "c2_5002_5001", fetch = FetchType.LAZY)
	private Set<T5002> t5002C2;

	/**
	 * Referencia ao campo TIPO (c2_5006_5001) da tabela TIPO_DETALHE (t5006)
	 */
	@JsonBackReference("c2_5006_5001")
	@OneToMany(mappedBy = "c2_5006_5001", fetch = FetchType.LAZY)
	private Set<T5006> t5006C2;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_5001) da tabela TIPO
	 * (t5001)
	 */
	public int getC1_5001() {
		return this.c1_5001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_5001) da tabela TIPO
	 * (t5001)
	 */
	public void setC1_5001(int c1_5001) {
		this.c1_5001 = c1_5001;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_5001) da tabela TIPO (t5001) */
	public String getC2_5001() {
		return this.c2_5001;
	}

	/** Define valor do campo DESCRIÇÃO (c2_5001) da tabela TIPO (t5001) */
	public void setC2_5001(String c2_5001) {
		this.c2_5001 = c2_5001;
	}

	/** Busca valor do campo TIPO (c3_5001_5002) da tabela TIPO (t5001) */
	public T5002 getC3_5001_5002() {
		return this.c3_5001_5002;
	}

	/** Define valor do campo TIPO (c3_5001_5002) da tabela TIPO (t5001) */
	public void setC3_5001_5002(T5002 c3_5001_5002) {
		this.c3_5001_5002 = c3_5001_5002;
	}

	/**
	 * Busca valor do campo referencia TIPO DE TIPO (c2_5002_5001) da tabela
	 * TIPO_VALOR (t5002)
	 */
	public Set<T5002> getT5002C2() {
		return this.t5002C2;
	}

	/**
	 * Define valor do campo referencia TIPO DE TIPO (c2_5002_5001) da tabela
	 * TIPO_VALOR (t5002)
	 */
	public void setT5002C2(Set<T5002> t5002C2) {
		this.t5002C2 = t5002C2;
	}

	/**
	 * Busca valor do campo referencia TIPO (c2_5006_5001) da tabela
	 * TIPO_DETALHE (t5006)
	 */
	public Set<T5006> getT5006C2() {
		return this.t5006C2;
	}

	/**
	 * Define valor do campo referencia TIPO (c2_5006_5001) da tabela
	 * TIPO_DETALHE (t5006)
	 */
	public void setT5006C2(Set<T5006> t5006C2) {
		this.t5006C2 = t5006C2;
	}

	@Override
	public String toString() {
		return "TIPO (t5001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_5001)=" + c1_5001 + "\n\t\tDESCRIÇÃO (c2_5001)="
				+ c2_5001 + "]";
	}

}
