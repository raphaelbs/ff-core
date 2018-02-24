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

/**
 * Classe TABELA_ÍNDICE_ITEM.<br>
 * Representa a tabela t106 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t106")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T106 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_106) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_106;

	/** Campo TABELA (c2_106_101) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_106_101", foreignKey = @ForeignKey(name = "r2_106_101"))
	private T101 c2_106_101;

	/** Campo ÍNDICE (c3_106_105) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@ManyToOne
	@JoinColumn(name = "c3_106_105", foreignKey = @ForeignKey(name = "r3_106_105"))
	private T105 c3_106_105;

	/** Campo CAMPO (c4_106_102) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@ManyToOne
	@JoinColumn(name = "c4_106_102", foreignKey = @ForeignKey(name = "r4_106_102"))
	private T102 c4_106_102;

	/** Campo ORDEM (c5_106) da tabela TABELA_ÍNDICE_ITEM (t106) */
	private int c5_106;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_106) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public int getC1_106(){
		return this.c1_106;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_106) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setC1_106(int c1_106){
		this.c1_106 = c1_106;
	}

	/** Busca valor do campo TABELA (c2_106_101) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public T101 getC2_106_101(){
		return this.c2_106_101;
	}

	/** Define valor do campo TABELA (c2_106_101) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setC2_106_101(T101 c2_106_101){
		this.c2_106_101 = c2_106_101;
	}

	/** Busca valor do campo ÍNDICE (c3_106_105) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public T105 getC3_106_105(){
		return this.c3_106_105;
	}

	/** Define valor do campo ÍNDICE (c3_106_105) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setC3_106_105(T105 c3_106_105){
		this.c3_106_105 = c3_106_105;
	}

	/** Busca valor do campo CAMPO (c4_106_102) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public T102 getC4_106_102(){
		return this.c4_106_102;
	}

	/** Define valor do campo CAMPO (c4_106_102) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setC4_106_102(T102 c4_106_102){
		this.c4_106_102 = c4_106_102;
	}

	/** Busca valor do campo ORDEM (c5_106) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public int getC5_106(){
		return this.c5_106;
	}

	/** Define valor do campo ORDEM (c5_106) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setC5_106(int c5_106){
		this.c5_106 = c5_106;
	}

	@Override
	public String toString() {
		return "TABELA_ÍNDICE_ITEM (t106) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_106)=" + c1_106
			+ "\n\t\tORDEM (c5_106)=" + c5_106
			+ "]";
	}


}
