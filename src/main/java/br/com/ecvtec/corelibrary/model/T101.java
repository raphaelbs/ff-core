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
 * Classe TABELA.<br>
 * Representa a tabela t101 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t101")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T101 implements Serializable {

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

	 /** Referencia ao campo TABELA (c2_102_101) da tabela TABELA_CAMPO (t102) */
	@JsonBackReference(value = "c2_102_101")
	@OneToMany(mappedBy = "c2_102_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T102> t102C2;

	 /** Referencia ao campo TABELA (c2_103_101) da tabela TABELA_REFERÊNCIA (t103) */
	@JsonBackReference(value = "c2_103_101")
	@OneToMany(mappedBy = "c2_103_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T103> t103C2;

	 /** Referencia ao campo TABELA (c2_104_101) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@JsonBackReference(value = "c2_104_101")
	@OneToMany(mappedBy = "c2_104_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T104> t104C2;

	 /** Referencia ao campo TABELA (c2_105_101) da tabela TABELA_ÍNDICE (t105) */
	@JsonBackReference(value = "c2_105_101")
	@OneToMany(mappedBy = "c2_105_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T105> t105C2;

	 /** Referencia ao campo TABELA (c2_106_101) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@JsonBackReference(value = "c2_106_101")
	@OneToMany(mappedBy = "c2_106_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T106> t106C2;

	 /** Referencia ao campo TABELA (c6_203_101) da tabela FORM_TELA_ABA (t203) */
	@JsonBackReference(value = "c6_203_101")
	@OneToMany(mappedBy = "c6_203_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T203Detalhe> t203C6;

	 /** Referencia ao campo TABELA (c3_9901_101) da tabela LOG (t9901) */
	@JsonBackReference(value = "c3_9901_101")
	@OneToMany(mappedBy = "c3_9901_101", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T9901> t9901C3;

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

	/** Busca valor do campo referencia TABELA (c2_102_101) da tabela TABELA_CAMPO (t102) */
	public Set<T102> getT102C2(){
		return this.t102C2;
	}

	/** Define valor do campo referencia TABELA (c2_102_101) da tabela TABELA_CAMPO (t102) */
	public void setT102C2(Set<T102> t102C2){
		this.t102C2 = t102C2;
	}

	/** Busca valor do campo referencia TABELA (c2_103_101) da tabela TABELA_REFERÊNCIA (t103) */
	public Set<T103> getT103C2(){
		return this.t103C2;
	}

	/** Define valor do campo referencia TABELA (c2_103_101) da tabela TABELA_REFERÊNCIA (t103) */
	public void setT103C2(Set<T103> t103C2){
		this.t103C2 = t103C2;
	}

	/** Busca valor do campo referencia TABELA (c2_104_101) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public Set<T104> getT104C2(){
		return this.t104C2;
	}

	/** Define valor do campo referencia TABELA (c2_104_101) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setT104C2(Set<T104> t104C2){
		this.t104C2 = t104C2;
	}

	/** Busca valor do campo referencia TABELA (c2_105_101) da tabela TABELA_ÍNDICE (t105) */
	public Set<T105> getT105C2(){
		return this.t105C2;
	}

	/** Define valor do campo referencia TABELA (c2_105_101) da tabela TABELA_ÍNDICE (t105) */
	public void setT105C2(Set<T105> t105C2){
		this.t105C2 = t105C2;
	}

	/** Busca valor do campo referencia TABELA (c2_106_101) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public Set<T106> getT106C2(){
		return this.t106C2;
	}

	/** Define valor do campo referencia TABELA (c2_106_101) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setT106C2(Set<T106> t106C2){
		this.t106C2 = t106C2;
	}

	/** Busca valor do campo referencia TABELA (c6_203_101) da tabela FORM_TELA_ABA (t203) */
	public Set<T203Detalhe> getT203C6(){
		return this.t203C6;
	}

	/** Define valor do campo referencia TABELA (c6_203_101) da tabela FORM_TELA_ABA (t203) */
	public void setT203C6(Set<T203Detalhe> t203C6){
		this.t203C6 = t203C6;
	}

	/** Busca valor do campo referencia TABELA (c3_9901_101) da tabela LOG (t9901) */
	public Set<T9901> getT9901C3(){
		return this.t9901C3;
	}

	/** Define valor do campo referencia TABELA (c3_9901_101) da tabela LOG (t9901) */
	public void setT9901C3(Set<T9901> t9901C3){
		this.t9901C3 = t9901C3;
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
