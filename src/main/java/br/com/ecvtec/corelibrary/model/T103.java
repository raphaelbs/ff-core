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
 * Classe TABELA_REFERÊNCIA.<br>
 * Representa a tabela t103 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t103")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T103 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_103) da tabela TABELA_REFERÊNCIA (t103) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_103;

	/** Campo TABELA (c2_103_101) da tabela TABELA_REFERÊNCIA (t103) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_103_101", foreignKey = @ForeignKey(name = "r2_103_101"))
	private T101 c2_103_101;

	/** Campo DESCRIÇÃO (c3_103) da tabela TABELA_REFERÊNCIA (t103) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_103;

	/** Campo TIPO REFERENCIA (c4_103_5002) da tabela TABELA_REFERÊNCIA (t103) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_103_5002", foreignKey = @ForeignKey(name = "r4_103_5002"))
	private T5002 c4_103_5002;

	/** Campo NOME FÍSICO (c5_103) da tabela TABELA_REFERÊNCIA (t103) */
	@Size(max = 40, message = "NOME FÍSICO deve possuir no máximo {max} caracteres.")
	private String c5_103;

	/** Campo TIPO CARDINALIDADE (c6_103_5002) da tabela TABELA_REFERÊNCIA (t103) */
	@ManyToOne
	@JoinColumn(name = "c6_103_5002", foreignKey = @ForeignKey(name = "r6_103_5002"))
	private T5002 c6_103_5002;

	 /** Referencia ao campo REFERÊNCIA (c3_104_103) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@JsonBackReference(value = "c3_104_103")
	@OneToMany(mappedBy = "c3_104_103", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T104> t104C3;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_103) da tabela TABELA_REFERÊNCIA (t103) */
	public int getC1_103(){
		return this.c1_103;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_103) da tabela TABELA_REFERÊNCIA (t103) */
	public void setC1_103(int c1_103){
		this.c1_103 = c1_103;
	}

	/** Busca valor do campo TABELA (c2_103_101) da tabela TABELA_REFERÊNCIA (t103) */
	public T101 getC2_103_101(){
		return this.c2_103_101;
	}

	/** Define valor do campo TABELA (c2_103_101) da tabela TABELA_REFERÊNCIA (t103) */
	public void setC2_103_101(T101 c2_103_101){
		this.c2_103_101 = c2_103_101;
	}

	/** Busca valor do campo DESCRIÇÃO (c3_103) da tabela TABELA_REFERÊNCIA (t103) */
	public String getC3_103(){
		return this.c3_103;
	}

	/** Define valor do campo DESCRIÇÃO (c3_103) da tabela TABELA_REFERÊNCIA (t103) */
	public void setC3_103(String c3_103){
		this.c3_103 = c3_103;
	}

	/** Busca valor do campo TIPO REFERENCIA (c4_103_5002) da tabela TABELA_REFERÊNCIA (t103) */
	public T5002 getC4_103_5002(){
		return this.c4_103_5002;
	}

	/** Define valor do campo TIPO REFERENCIA (c4_103_5002) da tabela TABELA_REFERÊNCIA (t103) */
	public void setC4_103_5002(T5002 c4_103_5002){
		this.c4_103_5002 = c4_103_5002;
	}

	/** Busca valor do campo NOME FÍSICO (c5_103) da tabela TABELA_REFERÊNCIA (t103) */
	public String getC5_103(){
		return this.c5_103;
	}

	/** Define valor do campo NOME FÍSICO (c5_103) da tabela TABELA_REFERÊNCIA (t103) */
	public void setC5_103(String c5_103){
		this.c5_103 = c5_103;
	}

	/** Busca valor do campo TIPO CARDINALIDADE (c6_103_5002) da tabela TABELA_REFERÊNCIA (t103) */
	public T5002 getC6_103_5002(){
		return this.c6_103_5002;
	}

	/** Define valor do campo TIPO CARDINALIDADE (c6_103_5002) da tabela TABELA_REFERÊNCIA (t103) */
	public void setC6_103_5002(T5002 c6_103_5002){
		this.c6_103_5002 = c6_103_5002;
	}

	/** Busca valor do campo referencia REFERÊNCIA (c3_104_103) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public Set<T104> getT104C3(){
		return this.t104C3;
	}

	/** Define valor do campo referencia REFERÊNCIA (c3_104_103) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setT104C3(Set<T104> t104C3){
		this.t104C3 = t104C3;
	}

	@Override
	public String toString() {
		return "TABELA_REFERÊNCIA (t103) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_103)=" + c1_103
			+ "\n\t\tDESCRIÇÃO (c3_103)=" + c3_103
			+ "\n\t\tNOME FÍSICO (c5_103)=" + c5_103
			+ "]";
	}


}
