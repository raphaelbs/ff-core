package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe SQL.<br>
 * Representa a tabela t701 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t701")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T701 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_701) da tabela SQL (t701) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_701;

	/** Campo DESCRIÇÃO (c2_701) da tabela SQL (t701) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_701;

	 /** Referencia ao campo SQL (c2_702_701) da tabela SQL_ITEM (t702) */
	@JsonBackReference(value = "c2_702_701")
	@OneToMany(mappedBy = "c2_702_701", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T702> t702C2;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_701) da tabela SQL (t701) */
	public int getC1_701(){
		return this.c1_701;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_701) da tabela SQL (t701) */
	public void setC1_701(int c1_701){
		this.c1_701 = c1_701;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_701) da tabela SQL (t701) */
	public String getC2_701(){
		return this.c2_701;
	}

	/** Define valor do campo DESCRIÇÃO (c2_701) da tabela SQL (t701) */
	public void setC2_701(String c2_701){
		this.c2_701 = c2_701;
	}

	/** Busca valor do campo referencia SQL (c2_702_701) da tabela SQL_ITEM (t702) */
	public Set<T702> getT702C2(){
		return this.t702C2;
	}

	/** Define valor do campo referencia SQL (c2_702_701) da tabela SQL_ITEM (t702) */
	public void setT702C2(Set<T702> t702C2){
		this.t702C2 = t702C2;
	}

	@Override
	public String toString() {
		return "SQL (t701) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_701)=" + c1_701
			+ "\n\t\tDESCRIÇÃO (c2_701)=" + c2_701
			+ "]";
	}


}
