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
 * Classe TABELA_REFERÊNCIA_ITEM.<br>
 * Representa a tabela t104 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t104")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T104 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_104) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_104;

	/** Campo TABELA (c2_104_101) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_104_101", foreignKey = @ForeignKey(name = "r2_104_101"))
	private T101 c2_104_101;

	/** Campo REFERÊNCIA (c3_104_103) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@ManyToOne
	@JoinColumn(name = "c3_104_103", foreignKey = @ForeignKey(name = "r3_104_103"))
	private T103 c3_104_103;

	/** Campo CAMPO (c4_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@ManyToOne
	@JoinColumn(name = "c4_104_102", foreignKey = @ForeignKey(name = "r4_104_102"))
	private T102 c4_104_102;

	/** Campo ID TABELA ESTRANGEIRA (c5_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@ManyToOne
	@JoinColumn(name = "c5_104_102", foreignKey = @ForeignKey(name = "r5_104_102"))
	private T102 c5_104_102;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_104) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public int getC1_104(){
		return this.c1_104;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_104) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setC1_104(int c1_104){
		this.c1_104 = c1_104;
	}

	/** Busca valor do campo TABELA (c2_104_101) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public T101 getC2_104_101(){
		return this.c2_104_101;
	}

	/** Define valor do campo TABELA (c2_104_101) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setC2_104_101(T101 c2_104_101){
		this.c2_104_101 = c2_104_101;
	}

	/** Busca valor do campo REFERÊNCIA (c3_104_103) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public T103 getC3_104_103(){
		return this.c3_104_103;
	}

	/** Define valor do campo REFERÊNCIA (c3_104_103) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setC3_104_103(T103 c3_104_103){
		this.c3_104_103 = c3_104_103;
	}

	/** Busca valor do campo CAMPO (c4_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public T102 getC4_104_102(){
		return this.c4_104_102;
	}

	/** Define valor do campo CAMPO (c4_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setC4_104_102(T102 c4_104_102){
		this.c4_104_102 = c4_104_102;
	}

	/** Busca valor do campo ID TABELA ESTRANGEIRA (c5_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public T102 getC5_104_102(){
		return this.c5_104_102;
	}

	/** Define valor do campo ID TABELA ESTRANGEIRA (c5_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setC5_104_102(T102 c5_104_102){
		this.c5_104_102 = c5_104_102;
	}

	@Override
	public String toString() {
		return "TABELA_REFERÊNCIA_ITEM (t104) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_104)=" + c1_104
			+ "]";
	}


}
