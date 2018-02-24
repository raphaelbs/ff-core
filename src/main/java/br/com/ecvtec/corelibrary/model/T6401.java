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
 * Classe DEPARTAMENTO.<br>
 * Representa a tabela t6401 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6401")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6401 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_6401) da tabela DEPARTAMENTO (t6401) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6401;

	/** Campo DESCRIÇÃO (c2_6401) da tabela DEPARTAMENTO (t6401) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_6401;

	/** Campo SETOR (c3_6401_5002) da tabela DEPARTAMENTO (t6401) */
	@ManyToOne
	@JoinColumn(name = "c3_6401_5002", foreignKey = @ForeignKey(name = "r3_6401_5002"))
	private T5002 c3_6401_5002;

	/**
	 * Referencia ao campo DEPARTAMENTO (c14_7001_6401) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	@JsonBackReference(value = "c14_7001_6401")
	@OneToMany(mappedBy = "c14_7001_6401", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T7001> t7001C14;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6401) da tabela
	 * DEPARTAMENTO (t6401)
	 */
	public int getC1_6401() {
		return this.c1_6401;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6401) da tabela
	 * DEPARTAMENTO (t6401)
	 */
	public void setC1_6401(int c1_6401) {
		this.c1_6401 = c1_6401;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c2_6401) da tabela DEPARTAMENTO (t6401)
	 */
	public String getC2_6401() {
		return this.c2_6401;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c2_6401) da tabela DEPARTAMENTO (t6401)
	 */
	public void setC2_6401(String c2_6401) {
		this.c2_6401 = c2_6401;
	}

	/**
	 * Busca valor do campo SETOR (c3_6401_5002) da tabela DEPARTAMENTO (t6401)
	 */
	public T5002 getC3_6401_5002() {
		return this.c3_6401_5002;
	}

	/**
	 * Define valor do campo SETOR (c3_6401_5002) da tabela DEPARTAMENTO (t6401)
	 */
	public void setC3_6401_5002(T5002 c3_6401_5002) {
		this.c3_6401_5002 = c3_6401_5002;
	}

	/**
	 * Busca valor do campo referencia DEPARTAMENTO (c14_7001_6401) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public Set<T7001> getT7001C14() {
		return this.t7001C14;
	}

	/**
	 * Define valor do campo referencia DEPARTAMENTO (c14_7001_6401) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setT7001C14(Set<T7001> t7001C14) {
		this.t7001C14 = t7001C14;
	}

	@Override
	public String toString() {
		return "DEPARTAMENTO (t6401) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6401)=" + c1_6401
				+ "\n\t\tDESCRIÇÃO (c2_6401)=" + c2_6401 + "]";
	}

}
