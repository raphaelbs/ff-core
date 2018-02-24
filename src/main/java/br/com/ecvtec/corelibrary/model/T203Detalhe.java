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
 * Classe FORM_TELA_ABA.<br>
 * Representa a tabela t203 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t203")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T203Detalhe implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_203) da tabela FORM_TELA_ABA (t203) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_203;

	/** Campo FORM (c2_203_201) da tabela FORM_TELA_ABA (t203) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_203_201", foreignKey = @ForeignKey(name = "r2_203_201"))
	private T201Detalhe c2_203_201;

	/** Campo TELA (c3_203_202) da tabela FORM_TELA_ABA (t203) */
	@NotNull
	@ManyToOne
	@JsonBackReference("t203C3")
	@JoinColumn(name = "c3_203_202", foreignKey = @ForeignKey(name = "r3_203_202"))
	private T202 c3_203_202;

	/** Campo DESCRIÇÃO (c4_203) da tabela FORM_TELA_ABA (t203) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c4_203;

	/** Campo TIPO DE ABA (c5_203_5002) da tabela FORM_TELA_ABA (t203) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c5_203_5002", foreignKey = @ForeignKey(name = "r5_203_5002"))
	private T5002 c5_203_5002;

	/** Campo TABELA (c6_203_101) da tabela FORM_TELA_ABA (t203) */
	@ManyToOne
	@JoinColumn(name = "c6_203_101", foreignKey = @ForeignKey(name = "r6_203_101"))
	private T101Leve c6_203_101;

	/** Campo ORDENAÇÃO (c7_203) da tabela FORM_TELA_ABA (t203) */
	private int c7_203;

	/** Campo TÍTULO DA ABA (c8_203_801) da tabela FORM_TELA_ABA (t203) */
	@ManyToOne
	@JoinColumn(name = "c8_203_801", foreignKey = @ForeignKey(name = "r8_203_801"))
	private T801 c8_203_801;

	/** Campo CONTAINER (c9_203) da tabela FORM_TELA_ABA (t203) */
	@NotNull
	private int c9_203;
	
	/** Campo MAPEAMENTO (c10_203) da tabela FORM_TELA_ABA (t203) */
	private String c10_203;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_203) da tabela FORM_TELA_ABA (t203) */
	public int getC1_203(){
		return this.c1_203;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_203) da tabela FORM_TELA_ABA (t203) */
	public void setC1_203(int c1_203){
		this.c1_203 = c1_203;
	}

	/** Busca valor do campo FORM (c2_203_201) da tabela FORM_TELA_ABA (t203) */
	public T201Detalhe getC2_203_201(){
		return this.c2_203_201;
	}

	/** Define valor do campo FORM (c2_203_201) da tabela FORM_TELA_ABA (t203) */
	public void setC2_203_201(T201Detalhe c2_203_201){
		this.c2_203_201 = c2_203_201;
	}

	/** Busca valor do campo TELA (c3_203_202) da tabela FORM_TELA_ABA (t203) */
	public T202 getC3_203_202(){
		return this.c3_203_202;
	}

	/** Define valor do campo TELA (c3_203_202) da tabela FORM_TELA_ABA (t203) */
	public void setC3_203_202(T202 c3_203_202){
		this.c3_203_202 = c3_203_202;
	}

	/** Busca valor do campo DESCRIÇÃO (c4_203) da tabela FORM_TELA_ABA (t203) */
	public String getC4_203(){
		return this.c4_203;
	}

	/** Define valor do campo DESCRIÇÃO (c4_203) da tabela FORM_TELA_ABA (t203) */
	public void setC4_203(String c4_203){
		this.c4_203 = c4_203;
	}

	/** Busca valor do campo TIPO DE ABA (c5_203_5002) da tabela FORM_TELA_ABA (t203) */
	public T5002 getC5_203_5002(){
		return this.c5_203_5002;
	}

	/** Define valor do campo TIPO DE ABA (c5_203_5002) da tabela FORM_TELA_ABA (t203) */
	public void setC5_203_5002(T5002 c5_203_5002){
		this.c5_203_5002 = c5_203_5002;
	}

	/** Busca valor do campo TABELA (c6_203_101) da tabela FORM_TELA_ABA (t203) */
	public T101Leve getC6_203_101(){
		return this.c6_203_101;
	}

	/** Define valor do campo TABELA (c6_203_101) da tabela FORM_TELA_ABA (t203) */
	public void setC6_203_101(T101Leve c6_203_101){
		this.c6_203_101 = c6_203_101;
	}

	/** Busca valor do campo ORDENAÇÃO (c7_203) da tabela FORM_TELA_ABA (t203) */
	public int getC7_203(){
		return this.c7_203;
	}

	/** Define valor do campo ORDENAÇÃO (c7_203) da tabela FORM_TELA_ABA (t203) */
	public void setC7_203(int c7_203){
		this.c7_203 = c7_203;
	}

	/** Busca valor do campo TÍTULO DA ABA (c8_203_801) da tabela FORM_TELA_ABA (t203) */
	public T801 getC8_203_801(){
		return this.c8_203_801;
	}

	/** Define valor do campo TÍTULO DA ABA (c8_203_801) da tabela FORM_TELA_ABA (t203) */
	public void setC8_203_801(T801 c8_203_801){
		this.c8_203_801 = c8_203_801;
	}

	/** Busca valor do campo CONTAINER (c9_203) da tabela FORM_TELA_ABA (t203) */
	public int getC9_203(){
		return this.c9_203;
	}

	/** Define valor do campo CONTAINER (c9_203) da tabela FORM_TELA_ABA (t203) */
	public void setC9_203(int c9_203){
		this.c9_203 = c9_203;
	}
	
	/** Busca valor do campo MAPEAMENTO (c10_203) da tabela FORM_TELA_ABA (t203) */
	public String getC10_203() {
		return c10_203;
	}

	/** Define valor do campo MAPEAMENTO (c10_203) da tabela FORM_TELA_ABA (t203) */
	public void setC10_203(String c10_203) {
		this.c10_203 = c10_203;
	}
	
	@Override
	public String toString() {
		return "FORM_TELA_ABA (t203) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_203)=" + c1_203
			+ "\n\t\tDESCRIÇÃO (c4_203)=" + c4_203
			+ "\n\t\tORDENAÇÃO (c7_203)=" + c7_203
			+ "\n\t\tCONTAINER (c9_203)=" + c9_203
			+ "]";
	}


}
