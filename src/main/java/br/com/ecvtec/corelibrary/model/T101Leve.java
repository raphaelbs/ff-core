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
 * Classe TABELA.<br>
 * Representa a tabela t101 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t101")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T101Leve implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_101) da tabela TABELA (t101) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_101;

	/** Campo DESCRIÇÃO (c2_101) da tabela TABELA (t101) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_101;

	/** Campo NOME FÍSICO (c3_101) da tabela TABELA (t101) */
	@Size(max = 40, message = "NOME FÍSICO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c3_101;

	/** Campo PROJETO (c4_101_5002) da tabela TABELA (t101) */
	@ManyToOne
	@JoinColumn(name = "c4_101_5002", foreignKey = @ForeignKey(name = "r4_101_5002"))
	private T5002 c4_101_5002;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_101) da tabela TABELA (t101) */
	public int getC1_101(){
		return this.c1_101;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_101) da tabela TABELA (t101) */
	public void setC1_101(int c1_101){
		this.c1_101 = c1_101;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_101) da tabela TABELA (t101) */
	public String getC2_101(){
		return this.c2_101;
	}

	/** Define valor do campo DESCRIÇÃO (c2_101) da tabela TABELA (t101) */
	public void setC2_101(String c2_101){
		this.c2_101 = c2_101;
	}

	/** Busca valor do campo NOME FÍSICO (c3_101) da tabela TABELA (t101) */
	public String getC3_101(){
		return this.c3_101;
	}

	/** Define valor do campo NOME FÍSICO (c3_101) da tabela TABELA (t101) */
	public void setC3_101(String c3_101){
		this.c3_101 = c3_101;
	}

	/** Busca valor do campo PROJETO (c4_101_5002) da tabela TABELA (t101) */
	public T5002 getC4_101_5002(){
		return this.c4_101_5002;
	}

	/** Define valor do campo PROJETO (c4_101_5002) da tabela TABELA (t101) */
	public void setC4_101_5002(T5002 c4_101_5002){
		this.c4_101_5002 = c4_101_5002;
	}

	@Override
	public String toString() {
		return "TABELA (t101) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_101)=" + c1_101
			+ "\n\t\tDESCRIÇÃO (c2_101)=" + c2_101
			+ "\n\t\tNOME FÍSICO (c3_101)=" + c3_101
			+ "]";
	}


}
