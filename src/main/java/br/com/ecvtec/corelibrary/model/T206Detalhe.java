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
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe FORM_TELA_ABA_ITEM_DETALHE.<br>
 * Representa a tabela t206 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t206")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T206Detalhe implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_206) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_206;

	/** Campo FORM (c2_206_201) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_206_201", foreignKey = @ForeignKey(name = "r2_206_201"))
	private T201Detalhe c2_206_201;

	/** Campo TELA (c3_206_202) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@ManyToOne
	@JoinColumn(name = "c3_206_202", foreignKey = @ForeignKey(name = "r3_206_202"))
	private T202Detalhe c3_206_202;

	/** Campo ABA (c4_206_203) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@ManyToOne
	@JoinColumn(name = "c4_206_203", foreignKey = @ForeignKey(name = "r4_206_203"))
	private T203Detalhe c4_206_203;

	/** Campo ITEM (c5_206_204) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@ManyToOne
	@JsonBackReference("t206C5")
	@JoinColumn(name = "c5_206_204", foreignKey = @ForeignKey(name = "r5_206_204"))
	private T204 c5_206_204;

	/** Campo TIPO DE DETALHE (c6_206_5002) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c6_206_5002", foreignKey = @ForeignKey(name = "r6_206_5002"))
	private T5002 c6_206_5002;

	/** Campo TIPO DE TIPO (c7_206_5002) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@ManyToOne
	@JoinColumn(name = "c7_206_5002", foreignKey = @ForeignKey(name = "r7_206_5002"))
	private T5002 c7_206_5002;

	/** Campo DESCRIÇÃO (c8_206) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c8_206;

	/** Campo MENSAGEM (c9_206_801) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@ManyToOne
	@JoinColumn(name = "c9_206_801", foreignKey = @ForeignKey(name = "r9_206_801"))
	private T801 c9_206_801;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_206) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public int getC1_206(){
		return this.c1_206;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_206) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC1_206(int c1_206){
		this.c1_206 = c1_206;
	}

	/** Busca valor do campo FORM (c2_206_201) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T201Detalhe getC2_206_201(){
		return this.c2_206_201;
	}

	/** Define valor do campo FORM (c2_206_201) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC2_206_201(T201Detalhe c2_206_201){
		this.c2_206_201 = c2_206_201;
	}

	/** Busca valor do campo TELA (c3_206_202) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T202Detalhe getC3_206_202(){
		return this.c3_206_202;
	}

	/** Define valor do campo TELA (c3_206_202) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC3_206_202(T202Detalhe c3_206_202){
		this.c3_206_202 = c3_206_202;
	}

	/** Busca valor do campo ABA (c4_206_203) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T203Detalhe getC4_206_203(){
		return this.c4_206_203;
	}

	/** Define valor do campo ABA (c4_206_203) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC4_206_203(T203Detalhe c4_206_203){
		this.c4_206_203 = c4_206_203;
	}

	/** Busca valor do campo ITEM (c5_206_204) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T204 getC5_206_204(){
		return this.c5_206_204;
	}

	/** Define valor do campo ITEM (c5_206_204) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC5_206_204(T204 c5_206_204){
		this.c5_206_204 = c5_206_204;
	}

	/** Busca valor do campo TIPO DE DETALHE (c6_206_5002) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T5002 getC6_206_5002(){
		return this.c6_206_5002;
	}

	/** Define valor do campo TIPO DE DETALHE (c6_206_5002) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC6_206_5002(T5002 c6_206_5002){
		this.c6_206_5002 = c6_206_5002;
	}

	/** Busca valor do campo TIPO DE TIPO (c7_206_5002) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T5002 getC7_206_5002(){
		return this.c7_206_5002;
	}

	/** Define valor do campo TIPO DE TIPO (c7_206_5002) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC7_206_5002(T5002 c7_206_5002){
		this.c7_206_5002 = c7_206_5002;
	}

	/** Busca valor do campo DESCRIÇÃO (c8_206) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public String getC8_206(){
		return this.c8_206;
	}

	/** Define valor do campo DESCRIÇÃO (c8_206) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC8_206(String c8_206){
		this.c8_206 = c8_206;
	}

	/** Busca valor do campo MENSAGEM (c9_206_801) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public T801 getC9_206_801(){
		return this.c9_206_801;
	}

	/** Define valor do campo MENSAGEM (c9_206_801) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setC9_206_801(T801 c9_206_801){
		this.c9_206_801 = c9_206_801;
	}

	@Override
	public String toString() {
		return "FORM_TELA_ABA_ITEM_DETALHE (t206) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_206)=" + c1_206
			+ "\n\t\tDESCRIÇÃO (c8_206)=" + c8_206
			+ "]";
	}


}
