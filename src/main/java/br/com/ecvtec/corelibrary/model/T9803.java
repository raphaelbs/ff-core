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
 * Classe MENU_PERFIL.<br>
 * Representa a tabela t9803 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9803")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9803 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_9803) da tabela MENU_PERFIL (t9803) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9803;

	/** Campo MENU (c2_9803_9801) da tabela MENU_PERFIL (t9803) */

	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9803_9801", foreignKey = @ForeignKey(name = "r2_9803_9801"))
	private T9801 c2_9803_9801;

	/** Campo DESCRIÇÃO (c3_9803) da tabela MENU_PERFIL (t9803) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_9803;

	/**
	 * Referencia ao campo PERFIL (c4_1099_9803) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	@JsonBackReference(value = "c4_1099_9803")
	@OneToMany(mappedBy = "c4_1099_9803", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1099> t1099C4;

	/**
	 * Referencia ao campo PERFIL (c3_9804_9803) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	@JsonBackReference(value = "c3_9804_9803")
	@OneToMany(mappedBy = "c3_9804_9803", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9804> t9804C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_9803) da tabela
	 * MENU_PERFIL (t9803)
	 */
	public int getC1_9803() {
		return this.c1_9803;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_9803) da tabela
	 * MENU_PERFIL (t9803)
	 */
	public void setC1_9803(int c1_9803) {
		this.c1_9803 = c1_9803;
	}

	/**
	 * Busca valor do campo MENU (c2_9803_9801) da tabela MENU_PERFIL (t9803)
	 */
	/*
	 * public T9801 getC2_9803_9801(){ return this.c2_9803_9801; }
	 */

	/**
	 * Define valor do campo MENU (c2_9803_9801) da tabela MENU_PERFIL (t9803)
	 */
	/*
	 * public void setC2_9803_9801(T9801 c2_9803_9801){ this.c2_9803_9801 =
	 * c2_9803_9801; }
	 */

	/**
	 * Busca valor do campo DESCRIÇÃO (c3_9803) da tabela MENU_PERFIL (t9803)
	 */
	public String getC3_9803() {
		return this.c3_9803;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c3_9803) da tabela MENU_PERFIL (t9803)
	 */
	public void setC3_9803(String c3_9803) {
		this.c3_9803 = c3_9803;
	}

	/**
	 * Busca valor do campo referencia PERFIL (c4_1099_9803) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public Set<T1099> getT1099C4() {
		return this.t1099C4;
	}

	/**
	 * Define valor do campo referencia PERFIL (c4_1099_9803) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setT1099C4(Set<T1099> t1099C4) {
		this.t1099C4 = t1099C4;
	}

	/**
	 * Busca valor do campo referencia PERFIL (c3_9804_9803) da tabela
	 * MENU_PERFIL_ITEM (t9804)
	 */
	public Set<T9804> getT9804C3() {
		return this.t9804C3;
	}

	/**
	 * Define valor do campo referencia PERFIL (c3_9804_9803) da tabela
	 * MENU_PERFIL_ITEM (t9804)
	 */
	public void setT9804C3(Set<T9804> t9804C3) {
		this.t9804C3 = t9804C3;
	}

	@Override
	public String toString() {
		return "MENU_PERFIL (t9803) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_9803)=" + c1_9803
				+ "\n\t\tDESCRIÇÃO (c3_9803)=" + c3_9803 + "]";
	}

}
