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
 * Classe UNIDADE DA FEDERAÇÃO.<br>
 * Representa a tabela t6102 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6102")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6102 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_6102) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6102;

	/** Campo PAÍS (c2_6102_6101) da tabela UNIDADE DA FEDERAÇÃO (t6102) */
	@ManyToOne
	@JoinColumn(name = "c2_6102_6101", foreignKey = @ForeignKey(name = "r2_6102_6101"))
	private T6101 c2_6102_6101;

	/** Campo DESCRIÇÃO (c3_6102) da tabela UNIDADE DA FEDERAÇÃO (t6102) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_6102;

	/** Campo SIGLA (c4_6102) da tabela UNIDADE DA FEDERAÇÃO (t6102) */
	@Size(max = 40, message = "SIGLA deve possuir no máximo {max} caracteres.")
	private String c4_6102;

	/** Campo REGIÃO (c5_6102_5002) da tabela UNIDADE DA FEDERAÇÃO (t6102) */
	@ManyToOne
	@JoinColumn(name = "c5_6102_5002", foreignKey = @ForeignKey(name = "r5_6102_5002"))
	private T5002 c5_6102_5002;

	/** Referencia ao campo UF (c4_6201_6102) da tabela CIDADE (t6201) */
	@JsonBackReference(value = "c4_6201_6102")
	@OneToMany(mappedBy = "c4_6201_6102", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6201> t6201C4;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6102) da tabela UNIDADE DA
	 * FEDERAÇÃO (t6102)
	 */
	public int getC1_6102() {
		return this.c1_6102;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6102) da tabela UNIDADE
	 * DA FEDERAÇÃO (t6102)
	 */
	public void setC1_6102(int c1_6102) {
		this.c1_6102 = c1_6102;
	}

	/**
	 * Busca valor do campo PAÍS (c2_6102_6101) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public T6101 getC2_6102_6101() {
		return this.c2_6102_6101;
	}

	/**
	 * Define valor do campo PAÍS (c2_6102_6101) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public void setC2_6102_6101(T6101 c2_6102_6101) {
		this.c2_6102_6101 = c2_6102_6101;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c3_6102) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public String getC3_6102() {
		return this.c3_6102;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c3_6102) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public void setC3_6102(String c3_6102) {
		this.c3_6102 = c3_6102;
	}

	/**
	 * Busca valor do campo SIGLA (c4_6102) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public String getC4_6102() {
		return this.c4_6102;
	}

	/**
	 * Define valor do campo SIGLA (c4_6102) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public void setC4_6102(String c4_6102) {
		this.c4_6102 = c4_6102;
	}

	/**
	 * Busca valor do campo REGIÃO (c5_6102_5002) da tabela UNIDADE DA FEDERAÇÃO
	 * (t6102)
	 */
	public T5002 getC5_6102_5002() {
		return this.c5_6102_5002;
	}

	/**
	 * Define valor do campo REGIÃO (c5_6102_5002) da tabela UNIDADE DA
	 * FEDERAÇÃO (t6102)
	 */
	public void setC5_6102_5002(T5002 c5_6102_5002) {
		this.c5_6102_5002 = c5_6102_5002;
	}

	/**
	 * Busca valor do campo referencia UF (c4_6201_6102) da tabela CIDADE
	 * (t6201)
	 */
	public Set<T6201> getT6201C4() {
		return this.t6201C4;
	}

	/**
	 * Define valor do campo referencia UF (c4_6201_6102) da tabela CIDADE
	 * (t6201)
	 */
	public void setT6201C4(Set<T6201> t6201C4) {
		this.t6201C4 = t6201C4;
	}

	@Override
	public String toString() {
		return "UNIDADE DA FEDERAÇÃO (t6102) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6102)=" + c1_6102
				+ "\n\t\tDESCRIÇÃO (c3_6102)=" + c3_6102 + "\n\t\tSIGLA (c4_6102)=" + c4_6102 + "]";
	}

}
