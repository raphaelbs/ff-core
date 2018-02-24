package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe FORM_TELA_ABA_ITEM.<br>
 * Representa a tabela t204 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t204")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T204Detalhe implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_204;

	/** Campo FORM (c2_204_201) da tabela FORM_TELA_ABA_ITEM (t204) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_204_201", foreignKey = @ForeignKey(name = "r2_204_201"))
	private T201Detalhe c2_204_201;

	/** Campo TELA (c3_204_202) da tabela FORM_TELA_ABA_ITEM (t204) */
	@ManyToOne
	@JoinColumn(name = "c3_204_202", foreignKey = @ForeignKey(name = "r3_204_202"))
	private T202Detalhe c3_204_202;

	/** Campo ABA (c4_204_203) da tabela FORM_TELA_ABA_ITEM (t204) */
	@ManyToOne
	@JsonBackReference("t204C4")
	@JoinColumn(name = "c4_204_203", foreignKey = @ForeignKey(name = "r4_204_203"))
	private T203 c4_204_203;

	/** Campo DESCRIÇÃO (c5_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c5_204;

	/** Campo TIPO DO ITEM (c6_204_5002) da tabela FORM_TELA_ABA_ITEM (t204) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c6_204_5002", foreignKey = @ForeignKey(name = "r6_204_5002"))
	private T5002 c6_204_5002;

	/** Campo LABEL (c7_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	@ManyToOne
	@JoinColumn(name = "c7_204_801", foreignKey = @ForeignKey(name = "r7_204_801"))
	private T801 c7_204_801;

	/** Campo COLUNA TABELA (c8_204_102) da tabela FORM_TELA_ABA_ITEM (t204) */
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "c8_204_102", foreignKey = @ForeignKey(name = "r8_204_102"))
	private T102 c8_204_102;

	/** Campo TABELA REFERENCIADA (c9_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	private String c9_204;

	/** Campo GRUPAMENTO (c10_204_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	@ManyToOne
	@JoinColumn(name = "c10_204_204", foreignKey = @ForeignKey(name = "r10_204_204"))
	private T204Detalhe c10_204_204;

	/** Campo SQL - PARÂMETROS (c11_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	@Size(max = 400, message = "SQL - PARÂMETROS deve possuir no máximo {max} caracteres.")
	private String c11_204;

	/** Campo HINT (c12_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	@ManyToOne
	@JoinColumn(name = "c12_204_801", foreignKey = @ForeignKey(name = "r12_204_801"))
	private T801 c12_204_801;

	/** Campo VALOR DEFAULT (c13_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	@Size(max = 400, message = "VALOR DEFAULT deve possuir no máximo {max} caracteres.")
	private String c13_204;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public int getC1_204(){
		return this.c1_204;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC1_204(int c1_204){
		this.c1_204 = c1_204;
	}

	/** Busca valor do campo FORM (c2_204_201) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T201Detalhe getC2_204_201(){
		return this.c2_204_201;
	}

	/** Define valor do campo FORM (c2_204_201) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC2_204_201(T201Detalhe c2_204_201){
		this.c2_204_201 = c2_204_201;
	}

	/** Busca valor do campo TELA (c3_204_202) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T202Detalhe getC3_204_202(){
		return this.c3_204_202;
	}

	/** Define valor do campo TELA (c3_204_202) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC3_204_202(T202Detalhe c3_204_202){
		this.c3_204_202 = c3_204_202;
	}

	/** Busca valor do campo ABA (c4_204_203) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T203 getC4_204_203(){
		return this.c4_204_203;
	}

	/** Define valor do campo ABA (c4_204_203) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC4_204_203(T203 c4_204_203){
		this.c4_204_203 = c4_204_203;
	}

	/** Busca valor do campo DESCRIÇÃO (c5_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public String getC5_204(){
		return this.c5_204;
	}

	/** Define valor do campo DESCRIÇÃO (c5_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC5_204(String c5_204){
		this.c5_204 = c5_204;
	}

	/** Busca valor do campo TIPO DO ITEM (c6_204_5002) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T5002 getC6_204_5002(){
		return this.c6_204_5002;
	}

	/** Define valor do campo TIPO DO ITEM (c6_204_5002) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC6_204_5002(T5002 c6_204_5002){
		this.c6_204_5002 = c6_204_5002;
	}

	/** Busca valor do campo LABEL (c7_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T801 getC7_204_801(){
		return this.c7_204_801;
	}

	/** Define valor do campo LABEL (c7_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC7_204_801(T801 c7_204_801){
		this.c7_204_801 = c7_204_801;
	}

	/** Busca valor do campo COLUNA TABELA (c8_204_102) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T102 getC8_204_102(){
		return this.c8_204_102;
	}

	/** Define valor do campo COLUNA TABELA (c8_204_102) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC8_204_102(T102 c8_204_102){
		this.c8_204_102 = c8_204_102;
	}

	/** Busca valor do campo TABELA REFERENCIADA (c9_204_101) da tabela FORM_TELA_ABA_ITEM (t204) */
	public String getC9_204(){
		return this.c9_204;
	}

	/** Define valor do campo TABELA REFERENCIADA (c9_204_101) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC9_204(String c9_204){
		this.c9_204 = c9_204;
	}

	/** Busca valor do campo GRUPAMENTO (c10_204_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T204Detalhe getC10_204_204(){
		return this.c10_204_204;
	}

	/** Define valor do campo GRUPAMENTO (c10_204_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC10_204_204(T204Detalhe c10_204_204){
		this.c10_204_204 = c10_204_204;
	}

	/** Busca valor do campo SQL - PARÂMETROS (c11_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public String getC11_204(){
		return this.c11_204;
	}

	/** Define valor do campo SQL - PARÂMETROS (c11_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC11_204(String c11_204){
		this.c11_204 = c11_204;
	}

	/** Busca valor do campo HINT (c12_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public T801 getC12_204_801(){
		return this.c12_204_801;
	}

	/** Define valor do campo HINT (c12_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC12_204_801(T801 c12_204_801){
		this.c12_204_801 = c12_204_801;
	}

	/** Busca valor do campo VALOR DEFAULT (c13_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public String getC13_204(){
		return this.c13_204;
	}

	/** Define valor do campo VALOR DEFAULT (c13_204) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setC13_204(String c13_204){
		this.c13_204 = c13_204;
	}

	@Override
	public String toString() {
		return "FORM_TELA_ABA_ITEM (t204) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_204)=" + c1_204
			+ "\n\t\tDESCRIÇÃO (c5_204)=" + c5_204
			+ "\n\t\tSQL - PARÂMETROS (c11_204)=" + c11_204
			+ "\n\t\tVALOR DEFAULT (c13_204)=" + c13_204
			+ "]";
	}


}
