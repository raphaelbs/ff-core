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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Classe FORM_TELA.<br>
 * Representa a tabela t202 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t202")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T202 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_202) da tabela FORM_TELA (t202) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_202;

	/** Campo FORM (c2_202_201) da tabela FORM_TELA (t202) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_202_201", foreignKey = @ForeignKey(name = "r2_202_201"))
	private T201Detalhe c2_202_201;

	/** Campo DESCRIÇÃO (c3_202) da tabela FORM_TELA (t202) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_202;

	/** Campo TIPO DA TELA (c4_202_5002) da tabela FORM_TELA (t202) */
	@ManyToOne
	@JoinColumn(name = "c4_202_5002", foreignKey = @ForeignKey(name = "r4_202_5002"))
	private T5002 c4_202_5002;

	/** Campo TÍTULO DA TELA (c5_202_801) da tabela FORM_TELA (t202) */
	@ManyToOne
	@JoinColumn(name = "c5_202_801", foreignKey = @ForeignKey(name = "r5_202_801"))
	private T801 c5_202_801;

	 /** Referencia ao campo TELA (c3_203_202) da tabela FORM_TELA_ABA (t203) */
	@JsonManagedReference("t203C3")
	@OneToMany(mappedBy = "c3_203_202", cascade=CascadeType.ALL, 
		fetch = FetchType.EAGER, orphanRemoval=true)
	private Set<T203Detalhe> t203C3;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_202) da tabela FORM_TELA (t202) */
	public int getC1_202(){
		return this.c1_202;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_202) da tabela FORM_TELA (t202) */
	public void setC1_202(int c1_202){
		this.c1_202 = c1_202;
	}

	/** Busca valor do campo FORM (c2_202_201) da tabela FORM_TELA (t202) */
	public T201Detalhe getC2_202_201(){
		return this.c2_202_201;
	}

	/** Define valor do campo FORM (c2_202_201) da tabela FORM_TELA (t202) */
	public void setC2_202_201(T201Detalhe c2_202_201){
		this.c2_202_201 = c2_202_201;
	}

	/** Busca valor do campo DESCRIÇÃO (c3_202) da tabela FORM_TELA (t202) */
	public String getC3_202(){
		return this.c3_202;
	}

	/** Define valor do campo DESCRIÇÃO (c3_202) da tabela FORM_TELA (t202) */
	public void setC3_202(String c3_202){
		this.c3_202 = c3_202;
	}

	/** Busca valor do campo TIPO DA TELA (c4_202_5002) da tabela FORM_TELA (t202) */
	public T5002 getC4_202_5002(){
		return this.c4_202_5002;
	}

	/** Define valor do campo TIPO DA TELA (c4_202_5002) da tabela FORM_TELA (t202) */
	public void setC4_202_5002(T5002 c4_202_5002){
		this.c4_202_5002 = c4_202_5002;
	}

	/** Busca valor do campo TÍTULO DA TELA (c5_202_801) da tabela FORM_TELA (t202) */
	public T801 getC5_202_801(){
		return this.c5_202_801;
	}

	/** Define valor do campo TÍTULO DA TELA (c5_202_801) da tabela FORM_TELA (t202) */
	public void setC5_202_801(T801 c5_202_801){
		this.c5_202_801 = c5_202_801;
	}

	/** Busca valor do campo referencia TELA (c3_203_202) da tabela FORM_TELA_ABA (t203) */
	public Set<T203Detalhe> getT203C3(){
		return this.t203C3;
	}

	/** Define valor do campo referencia TELA (c3_203_202) da tabela FORM_TELA_ABA (t203) */
	public void setT203C3(Set<T203Detalhe> t203C3){
		this.t203C3 = t203C3;
	}
	
	public void setFilhos(){
		if(this.t203C3 == null) return;
		for(T203Detalhe t203 : this.t203C3){
			t203.setC2_203_201(c2_202_201);	
			t203.setC3_203_202(this);
		}
	}

	@Override
	public String toString() {
		return "FORM_TELA (t202) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_202)=" + c1_202
			+ "\n\t\tDESCRIÇÃO (c3_202)=" + c3_202
			+ "]";
	}


}
