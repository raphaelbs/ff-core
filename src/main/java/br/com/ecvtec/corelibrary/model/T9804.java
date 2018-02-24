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
 * Classe MENU_PERFIL_ITEM.<br>
 * Representa a tabela t9804 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9804")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9804 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_9804) da tabela MENU_PERFIL_ITEM (t9804)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9804;

	/** Campo MENU (c2_9804_9801) da tabela MENU_PERFIL_ITEM (t9804) */

	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9804_9801", foreignKey = @ForeignKey(name = "r2_9804_9801"))
	private T9801 c2_9804_9801;

	/** Campo PERFIL (c3_9804_9803) da tabela MENU_PERFIL_ITEM (t9804) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_9804_9803", foreignKey = @ForeignKey(name = "r3_9804_9803"))
	private T9803 c3_9804_9803;

	/** Campo ITEM_MENU (c4_9804_9802) da tabela MENU_PERFIL_ITEM (t9804) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_9804_9802", foreignKey = @ForeignKey(name = "r4_9804_9802"))
	private T9802 c4_9804_9802;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_9804) da tabela
	 * MENU_PERFIL_ITEM (t9804)
	 */
	public int getC1_9804() {
		return this.c1_9804;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_9804) da tabela
	 * MENU_PERFIL_ITEM (t9804)
	 */
	public void setC1_9804(int c1_9804) {
		this.c1_9804 = c1_9804;
	}

	/**
	 * Busca valor do campo MENU (c2_9804_9801) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	/*
	 * public T9801 getC2_9804_9801(){ return this.c2_9804_9801; }
	 */

	/**
	 * Define valor do campo MENU (c2_9804_9801) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	/*
	 * public void setC2_9804_9801(T9801 c2_9804_9801){ this.c2_9804_9801 =
	 * c2_9804_9801; }
	 */

	/**
	 * Busca valor do campo PERFIL (c3_9804_9803) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	public T9803 getC3_9804_9803() {
		return this.c3_9804_9803;
	}

	/**
	 * Define valor do campo PERFIL (c3_9804_9803) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	public void setC3_9804_9803(T9803 c3_9804_9803) {
		this.c3_9804_9803 = c3_9804_9803;
	}

	/**
	 * Busca valor do campo ITEM_MENU (c4_9804_9802) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	/*
	 * public T9802 getC4_9804_9802(){ return this.c4_9804_9802; }
	 */

	/**
	 * Define valor do campo ITEM_MENU (c4_9804_9802) da tabela MENU_PERFIL_ITEM
	 * (t9804)
	 */
	/*
	 * public void setC4_9804_9802(T9802 c4_9804_9802){ this.c4_9804_9802 =
	 * c4_9804_9802; }
	 */

	@Override
	public String toString() {
		return "MENU_PERFIL_ITEM (t9804) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_9804)=" + c1_9804 + "]";
	}

}
