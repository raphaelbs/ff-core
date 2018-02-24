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
 * Classe TERMO.<br>
 * Representa a tabela t801 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t801")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T801 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_801) da tabela TERMO (t801) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_801;

	/** Campo DESCRIÇÃO (c2_801) da tabela TERMO (t801) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_801;

	 /** Referencia ao campo TÍTULO DO FORM (c4_201_801) da tabela FORM (t201) */
	@JsonBackReference(value = "c4_201_801")
	@OneToMany(mappedBy = "c4_201_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T201> t201C4;

	 /** Referencia ao campo TÍTULO DA TELA (c5_202_801) da tabela FORM_TELA (t202) */
	@JsonBackReference(value = "c5_202_801")
	@OneToMany(mappedBy = "c5_202_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T202Detalhe> t202C5;

	 /** Referencia ao campo TÍTULO DA ABA (c8_203_801) da tabela FORM_TELA_ABA (t203) */
	@JsonBackReference(value = "c8_203_801")
	@OneToMany(mappedBy = "c8_203_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T203Detalhe> t203C8;

	 /** Referencia ao campo LABEL (c7_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	@JsonBackReference(value = "c7_204_801")
	@OneToMany(mappedBy = "c7_204_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T204> t204C7;

	 /** Referencia ao campo HINT (c12_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	@JsonBackReference(value = "c12_204_801")
	@OneToMany(mappedBy = "c12_204_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T204> t204C12;

	 /** Referencia ao campo MENSAGEM (c9_206_801) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	@JsonBackReference(value = "c9_206_801")
	@OneToMany(mappedBy = "c9_206_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T206> t206C9;

	 /** Referencia ao campo TERMO (c2_802_801) da tabela TERMO_ÍTEM (t802) */
	@JsonBackReference(value = "c2_802_801")
	@OneToMany(mappedBy = "c2_802_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T802> t802C2;

	 /** Referencia ao campo LABEL (c8_9802_801) da tabela MENU_ITEM (t9802) */
	@JsonBackReference(value = "c8_9802_801")
	@OneToMany(mappedBy = "c8_9802_801", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9802> t9802C8;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_801) da tabela TERMO (t801) */
	public int getC1_801(){
		return this.c1_801;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_801) da tabela TERMO (t801) */
	public void setC1_801(int c1_801){
		this.c1_801 = c1_801;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_801) da tabela TERMO (t801) */
	public String getC2_801(){
		return this.c2_801;
	}

	/** Define valor do campo DESCRIÇÃO (c2_801) da tabela TERMO (t801) */
	public void setC2_801(String c2_801){
		this.c2_801 = c2_801;
	}

	/** Busca valor do campo referencia TÍTULO DO FORM (c4_201_801) da tabela FORM (t201) */
	public Set<T201> getT201C4(){
		return this.t201C4;
	}

	/** Define valor do campo referencia TÍTULO DO FORM (c4_201_801) da tabela FORM (t201) */
	public void setT201C4(Set<T201> t201C4){
		this.t201C4 = t201C4;
	}

	/** Busca valor do campo referencia TÍTULO DA TELA (c5_202_801) da tabela FORM_TELA (t202) */
	public Set<T202Detalhe> getT202C5(){
		return this.t202C5;
	}

	/** Define valor do campo referencia TÍTULO DA TELA (c5_202_801) da tabela FORM_TELA (t202) */
	public void setT202C5(Set<T202Detalhe> t202C5){
		this.t202C5 = t202C5;
	}

	/** Busca valor do campo referencia TÍTULO DA ABA (c8_203_801) da tabela FORM_TELA_ABA (t203) */
	public Set<T203Detalhe> getT203C8(){
		return this.t203C8;
	}

	/** Define valor do campo referencia TÍTULO DA ABA (c8_203_801) da tabela FORM_TELA_ABA (t203) */
	public void setT203C8(Set<T203Detalhe> t203C8){
		this.t203C8 = t203C8;
	}

	/** Busca valor do campo referencia LABEL (c7_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public Set<T204> getT204C7(){
		return this.t204C7;
	}

	/** Define valor do campo referencia LABEL (c7_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setT204C7(Set<T204> t204C7){
		this.t204C7 = t204C7;
	}

	/** Busca valor do campo referencia HINT (c12_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public Set<T204> getT204C12(){
		return this.t204C12;
	}

	/** Define valor do campo referencia HINT (c12_204_801) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setT204C12(Set<T204> t204C12){
		this.t204C12 = t204C12;
	}

	/** Busca valor do campo referencia MENSAGEM (c9_206_801) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public Set<T206> getT206C9(){
		return this.t206C9;
	}

	/** Define valor do campo referencia MENSAGEM (c9_206_801) da tabela FORM_TELA_ABA_ITEM_DETALHE (t206) */
	public void setT206C9(Set<T206> t206C9){
		this.t206C9 = t206C9;
	}

	/** Busca valor do campo referencia TERMO (c2_802_801) da tabela TERMO_ÍTEM (t802) */
	public Set<T802> getT802C2(){
		return this.t802C2;
	}

	/** Define valor do campo referencia TERMO (c2_802_801) da tabela TERMO_ÍTEM (t802) */
	public void setT802C2(Set<T802> t802C2){
		this.t802C2 = t802C2;
	}

	/** Busca valor do campo referencia LABEL (c8_9802_801) da tabela MENU_ITEM (t9802) */
	public Set<T9802> getT9802C8(){
		return this.t9802C8;
	}

	/** Define valor do campo referencia LABEL (c8_9802_801) da tabela MENU_ITEM (t9802) */
	public void setT9802C8(Set<T9802> t9802C8){
		this.t9802C8 = t9802C8;
	}

	@Override
	public String toString() {
		return "TERMO (t801) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_801)=" + c1_801
			+ "\n\t\tDESCRIÇÃO (c2_801)=" + c2_801
			+ "]";
	}


}
