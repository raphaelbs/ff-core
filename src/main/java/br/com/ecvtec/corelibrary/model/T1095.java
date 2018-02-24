package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe ENTIDADE_CIDADE.<br>
 * Representa a tabela t1095 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1095")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1095 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_1095) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1095;

	/** Campo ENTIDADE (c2_1095_1001) da tabela ENTIDADE_CIDADE (t1095) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_1095_1001", foreignKey = @ForeignKey(name = "r2_1095_1001"))
	private T1001 c2_1095_1001;

	/** Campo CIDADE (c3_1095_6201) da tabela ENTIDADE_CIDADE (t1095) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_1095_6201", foreignKey = @ForeignKey(name = "r3_1095_6201"))
	private T6201 c3_1095_6201;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_1095) da tabela
	 * ENTIDADE_CIDADE (t1095)
	 */
	public int getC1_1095() {
		return this.c1_1095;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_1095) da tabela
	 * ENTIDADE_CIDADE (t1095)
	 */
	public void setC1_1095(int c1_1095) {
		this.c1_1095 = c1_1095;
	}

	/**
	 * Busca valor do campo ENTIDADE (c2_1095_1001) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	public T1001 getC2_1095_1001() {
		return this.c2_1095_1001;
	}

	/**
	 * Define valor do campo ENTIDADE (c2_1095_1001) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	public void setC2_1095_1001(T1001 c2_1095_1001) {
		this.c2_1095_1001 = c2_1095_1001;
	}

	/**
	 * Busca valor do campo CIDADE (c3_1095_6201) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	public T6201 getC3_1095_6201() {
		return this.c3_1095_6201;
	}

	/**
	 * Define valor do campo CIDADE (c3_1095_6201) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	public void setC3_1095_6201(T6201 c3_1095_6201) {
		this.c3_1095_6201 = c3_1095_6201;
	}

	@Override
	public String toString() {
		return "ENTIDADE_CIDADE (t1095) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_1095)=" + c1_1095 + "]";
	}

}
