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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe SQL_ITEM.<br>
 * Representa a tabela t702 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t702")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T702 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_702) da tabela SQL_ITEM (t702) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_702;

	/** Campo SQL (c2_702_701) da tabela SQL_ITEM (t702) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_702_701", foreignKey = @ForeignKey(name = "r2_702_701"))
	private T701 c2_702_701;

	/** Campo TIPO DO BANCO DE DADOS (c3_702_5002) da tabela SQL_ITEM (t702) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_702_5002", foreignKey = @ForeignKey(name = "r3_702_5002"))
	private T5002 c3_702_5002;

	/** Campo COMANDO SQL (c4_702_5501) da tabela SQL_ITEM (t702) */
	@Size(max = 4000, message = "COMANDO SQL deve possuir no máximo {max} caracteres.")
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_702_5501", foreignKey = @ForeignKey(name = "r4_702_5501"))
	private T5501 c4_702_5501;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_702) da tabela SQL_ITEM (t702) */
	public int getC1_702(){
		return this.c1_702;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_702) da tabela SQL_ITEM (t702) */
	public void setC1_702(int c1_702){
		this.c1_702 = c1_702;
	}

	/** Busca valor do campo SQL (c2_702_701) da tabela SQL_ITEM (t702) */
	public T701 getC2_702_701(){
		return this.c2_702_701;
	}

	/** Define valor do campo SQL (c2_702_701) da tabela SQL_ITEM (t702) */
	public void setC2_702_701(T701 c2_702_701){
		this.c2_702_701 = c2_702_701;
	}

	/** Busca valor do campo TIPO DO BANCO DE DADOS (c3_702_5002) da tabela SQL_ITEM (t702) */
	public T5002 getC3_702_5002(){
		return this.c3_702_5002;
	}

	/** Define valor do campo TIPO DO BANCO DE DADOS (c3_702_5002) da tabela SQL_ITEM (t702) */
	public void setC3_702_5002(T5002 c3_702_5002){
		this.c3_702_5002 = c3_702_5002;
	}

	/** Busca valor do campo COMANDO SQL (c4_702_5501) da tabela SQL_ITEM (t702) */
	public T5501 getC4_702_5501(){
		return this.c4_702_5501;
	}

	/** Define valor do campo COMANDO SQL (c4_702_5501) da tabela SQL_ITEM (t702) */
	public void setC4_702_5501(T5501 c4_702_5501){
		this.c4_702_5501 = c4_702_5501;
	}

	@Override
	public String toString() {
		return "SQL_ITEM (t702) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_702)=" + c1_702
			+ "]";
	}


}
