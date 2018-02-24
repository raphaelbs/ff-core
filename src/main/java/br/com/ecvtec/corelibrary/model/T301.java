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
 * Classe BANCO X CAMPO.<br>
 * Representa a tabela t301 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t301")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T301 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_301) da tabela BANCO X CAMPO (t301) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_301;

	/** Campo TIPO DO BANCO DE DADOS (c2_301_5002) da tabela BANCO X CAMPO (t301) */
	@ManyToOne
	@JoinColumn(name = "c2_301_5002", foreignKey = @ForeignKey(name = "r2_301_5002"))
	private T5002 c2_301_5002;

	/** Campo TIPO DO CAMPO (c3_301_5002) da tabela BANCO X CAMPO (t301) */
	@ManyToOne
	@JoinColumn(name = "c3_301_5002", foreignKey = @ForeignKey(name = "r3_301_5002"))
	private T5002 c3_301_5002;

	/** Campo SINTAXE (c4_301) da tabela BANCO X CAMPO (t301) */
	@Size(max = 40, message = "SINTAXE deve possuir no máximo {max} caracteres.")
	private String c4_301;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_301) da tabela BANCO X CAMPO (t301) */
	public int getC1_301(){
		return this.c1_301;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_301) da tabela BANCO X CAMPO (t301) */
	public void setC1_301(int c1_301){
		this.c1_301 = c1_301;
	}

	/** Busca valor do campo TIPO DO BANCO DE DADOS (c2_301_5002) da tabela BANCO X CAMPO (t301) */
	public T5002 getC2_301_5002(){
		return this.c2_301_5002;
	}

	/** Define valor do campo TIPO DO BANCO DE DADOS (c2_301_5002) da tabela BANCO X CAMPO (t301) */
	public void setC2_301_5002(T5002 c2_301_5002){
		this.c2_301_5002 = c2_301_5002;
	}

	/** Busca valor do campo TIPO DO CAMPO (c3_301_5002) da tabela BANCO X CAMPO (t301) */
	public T5002 getC3_301_5002(){
		return this.c3_301_5002;
	}

	/** Define valor do campo TIPO DO CAMPO (c3_301_5002) da tabela BANCO X CAMPO (t301) */
	public void setC3_301_5002(T5002 c3_301_5002){
		this.c3_301_5002 = c3_301_5002;
	}

	/** Busca valor do campo SINTAXE (c4_301) da tabela BANCO X CAMPO (t301) */
	public String getC4_301(){
		return this.c4_301;
	}

	/** Define valor do campo SINTAXE (c4_301) da tabela BANCO X CAMPO (t301) */
	public void setC4_301(String c4_301){
		this.c4_301 = c4_301;
	}

	@Override
	public String toString() {
		return "BANCO X CAMPO (t301) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_301)=" + c1_301
			+ "\n\t\tSINTAXE (c4_301)=" + c4_301
			+ "]";
	}


}
