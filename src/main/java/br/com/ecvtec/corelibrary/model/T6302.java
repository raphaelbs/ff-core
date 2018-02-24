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
 * Classe VIA_QUARTEIRÃO.<br>
 * Representa a tabela t6302 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6302")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6302 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_6302) da tabela VIA_QUARTEIRÃO (t6302)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6302;

	/** Campo VIA (c2_6302_6301) da tabela VIA_QUARTEIRÃO (t6302) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_6302_6301", foreignKey = @ForeignKey(name = "r2_6302_6301"))
	private T6301 c2_6302_6301;

	/** Campo DESCRIÇÃO (c3_6302) da tabela VIA_QUARTEIRÃO (t6302) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_6302;

	/** Campo CIDADE (c4_6302_6201) da tabela VIA_QUARTEIRÃO (t6302) */
	@ManyToOne
	@JoinColumn(name = "c4_6302_6201", foreignKey = @ForeignKey(name = "r4_6302_6201"))
	private T6201 c4_6302_6201;

	/** Campo BAIRRO (c5_6302_6202) da tabela VIA_QUARTEIRÃO (t6302) */
	@ManyToOne
	@JoinColumn(name = "c5_6302_6202", foreignKey = @ForeignKey(name = "r5_6302_6202"))
	private T6202 c5_6302_6202;

	/** Campo ORDEM DO QUARTEIRÃO (c6_6302) da tabela VIA_QUARTEIRÃO (t6302) */
	private int c6_6302;

	/**
	 * Referencia ao campo QUARTEIRÃO (c4_6001_6302) da tabela ENDEREÇO (t6001)
	 */
	@JsonBackReference(value = "c4_6001_6302")
	@OneToMany(mappedBy = "c4_6001_6302", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6001> t6001C4;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6302) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public int getC1_6302() {
		return this.c1_6302;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6302) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public void setC1_6302(int c1_6302) {
		this.c1_6302 = c1_6302;
	}

	/**
	 * Busca valor do campo VIA (c2_6302_6301) da tabela VIA_QUARTEIRÃO (t6302)
	 */
	public T6301 getC2_6302_6301() {
		return this.c2_6302_6301;
	}

	/**
	 * Define valor do campo VIA (c2_6302_6301) da tabela VIA_QUARTEIRÃO (t6302)
	 */
	public void setC2_6302_6301(T6301 c2_6302_6301) {
		this.c2_6302_6301 = c2_6302_6301;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c3_6302) da tabela VIA_QUARTEIRÃO (t6302)
	 */
	public String getC3_6302() {
		return this.c3_6302;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c3_6302) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	public void setC3_6302(String c3_6302) {
		this.c3_6302 = c3_6302;
	}

	/**
	 * Busca valor do campo CIDADE (c4_6302_6201) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	public T6201 getC4_6302_6201() {
		return this.c4_6302_6201;
	}

	/**
	 * Define valor do campo CIDADE (c4_6302_6201) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	public void setC4_6302_6201(T6201 c4_6302_6201) {
		this.c4_6302_6201 = c4_6302_6201;
	}

	/**
	 * Busca valor do campo BAIRRO (c5_6302_6202) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	public T6202 getC5_6302_6202() {
		return this.c5_6302_6202;
	}

	/**
	 * Define valor do campo BAIRRO (c5_6302_6202) da tabela VIA_QUARTEIRÃO
	 * (t6302)
	 */
	public void setC5_6302_6202(T6202 c5_6302_6202) {
		this.c5_6302_6202 = c5_6302_6202;
	}

	/**
	 * Busca valor do campo ORDEM DO QUARTEIRÃO (c6_6302) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public int getC6_6302() {
		return this.c6_6302;
	}

	/**
	 * Define valor do campo ORDEM DO QUARTEIRÃO (c6_6302) da tabela
	 * VIA_QUARTEIRÃO (t6302)
	 */
	public void setC6_6302(int c6_6302) {
		this.c6_6302 = c6_6302;
	}

	/**
	 * Busca valor do campo referencia QUARTEIRÃO (c4_6001_6302) da tabela
	 * ENDEREÇO (t6001)
	 */
	public Set<T6001> getT6001C4() {
		return this.t6001C4;
	}

	/**
	 * Define valor do campo referencia QUARTEIRÃO (c4_6001_6302) da tabela
	 * ENDEREÇO (t6001)
	 */
	public void setT6001C4(Set<T6001> t6001C4) {
		this.t6001C4 = t6001C4;
	}

	@Override
	public String toString() {
		return "VIA_QUARTEIRÃO (t6302) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6302)=" + c1_6302
				+ "\n\t\tDESCRIÇÃO (c3_6302)=" + c3_6302 + "\n\t\tORDEM DO QUARTEIRÃO (c6_6302)=" + c6_6302 + "]";
	}

}
