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

/**
 * Classe TABELA_ÍNDICE.<br>
 * Representa a tabela t105 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t105")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T105 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_105) da tabela TABELA_ÍNDICE (t105) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_105;

	/** Campo TABELA (c2_105_101) da tabela TABELA_ÍNDICE (t105) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_105_101", foreignKey = @ForeignKey(name = "r2_105_101"))
	private T101 c2_105_101;

	/** Campo DESCRIÇÃO (c3_105) da tabela TABELA_ÍNDICE (t105) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_105;

	/** Campo TIPO DO ÍNDICE (c4_105_5002) da tabela TABELA_ÍNDICE (t105) */
	@ManyToOne
	@JoinColumn(name = "c4_105_5002", foreignKey = @ForeignKey(name = "r4_105_5002"))
	private T5002 c4_105_5002;

	/** Campo NOME FÍSICO (c5_105) da tabela TABELA_ÍNDICE (t105) */
	@Size(max = 40, message = "NOME FÍSICO deve possuir no máximo {max} caracteres.")
	private String c5_105;

	 /** Referencia ao campo ÍNDICE (c3_106_105) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@JsonBackReference(value = "c3_106_105")
	@OneToMany(mappedBy = "c3_106_105", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T106> t106C3;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_105) da tabela TABELA_ÍNDICE (t105) */
	public int getC1_105(){
		return this.c1_105;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_105) da tabela TABELA_ÍNDICE (t105) */
	public void setC1_105(int c1_105){
		this.c1_105 = c1_105;
	}

	/** Busca valor do campo TABELA (c2_105_101) da tabela TABELA_ÍNDICE (t105) */
	public T101 getC2_105_101(){
		return this.c2_105_101;
	}

	/** Define valor do campo TABELA (c2_105_101) da tabela TABELA_ÍNDICE (t105) */
	public void setC2_105_101(T101 c2_105_101){
		this.c2_105_101 = c2_105_101;
	}

	/** Busca valor do campo DESCRIÇÃO (c3_105) da tabela TABELA_ÍNDICE (t105) */
	public String getC3_105(){
		return this.c3_105;
	}

	/** Define valor do campo DESCRIÇÃO (c3_105) da tabela TABELA_ÍNDICE (t105) */
	public void setC3_105(String c3_105){
		this.c3_105 = c3_105;
	}

	/** Busca valor do campo TIPO DO ÍNDICE (c4_105_5002) da tabela TABELA_ÍNDICE (t105) */
	public T5002 getC4_105_5002(){
		return this.c4_105_5002;
	}

	/** Define valor do campo TIPO DO ÍNDICE (c4_105_5002) da tabela TABELA_ÍNDICE (t105) */
	public void setC4_105_5002(T5002 c4_105_5002){
		this.c4_105_5002 = c4_105_5002;
	}

	/** Busca valor do campo NOME FÍSICO (c5_105) da tabela TABELA_ÍNDICE (t105) */
	public String getC5_105(){
		return this.c5_105;
	}

	/** Define valor do campo NOME FÍSICO (c5_105) da tabela TABELA_ÍNDICE (t105) */
	public void setC5_105(String c5_105){
		this.c5_105 = c5_105;
	}

	/** Busca valor do campo referencia ÍNDICE (c3_106_105) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public Set<T106> getT106C3(){
		return this.t106C3;
	}

	/** Define valor do campo referencia ÍNDICE (c3_106_105) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setT106C3(Set<T106> t106C3){
		this.t106C3 = t106C3;
	}

	@Override
	public String toString() {
		return "TABELA_ÍNDICE (t105) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_105)=" + c1_105
			+ "\n\t\tDESCRIÇÃO (c3_105)=" + c3_105
			+ "\n\t\tNOME FÍSICO (c5_105)=" + c5_105
			+ "]";
	}


}
