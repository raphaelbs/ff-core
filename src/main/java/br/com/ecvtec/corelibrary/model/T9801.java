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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Classe MENU.<br>
 * Representa a tabela t9801 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t9801")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9801 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_9801) da tabela MENU (t9801) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9801;

	/** Campo DESCRIÇÃO (c2_9801) da tabela MENU (t9801) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_9801;

	 /** Referencia ao campo MENU (c2_9802_9801) da tabela MENU_ITEM (t9802) */
	@JsonManagedReference(value = "c2_9802_9801")
	@OneToMany(mappedBy = "c2_9802_9801", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T9802> t9802C2;

	 /** Referencia ao campo MENU (c2_9803_9801) da tabela MENU_PERFIL (t9803) */
	@JsonBackReference(value = "c2_9803_9801")
	@OneToMany(mappedBy = "c2_9803_9801", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T9803> t9803C2;

	 /** Referencia ao campo MENU (c2_9804_9801) da tabela MENU_PERFIL_ITEM (t9804) */
	@JsonBackReference(value = "c2_9804_9801")
	@OneToMany(mappedBy = "c2_9804_9801", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T9804> t9804C2;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_9801) da tabela MENU (t9801) */
	public int getC1_9801(){
		return this.c1_9801;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_9801) da tabela MENU (t9801) */
	public void setC1_9801(int c1_9801){
		this.c1_9801 = c1_9801;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_9801) da tabela MENU (t9801) */
	public String getC2_9801(){
		return this.c2_9801;
	}

	/** Define valor do campo DESCRIÇÃO (c2_9801) da tabela MENU (t9801) */
	public void setC2_9801(String c2_9801){
		this.c2_9801 = c2_9801;
	}

	/** Busca valor do campo referencia MENU (c2_9802_9801) da tabela MENU_ITEM (t9802) */
	public Set<T9802> getT9802C2(){
		return this.t9802C2;
	}

	/** Define valor do campo referencia MENU (c2_9802_9801) da tabela MENU_ITEM (t9802) */
	public void setT9802C2(Set<T9802> t9802C2){
		this.t9802C2 = t9802C2;
	}

	/** Busca valor do campo referencia MENU (c2_9803_9801) da tabela MENU_PERFIL (t9803) */
	public Set<T9803> getT9803C2(){
		return this.t9803C2;
	}

	/** Define valor do campo referencia MENU (c2_9803_9801) da tabela MENU_PERFIL (t9803) */
	public void setT9803C2(Set<T9803> t9803C2){
		this.t9803C2 = t9803C2;
	}

	/** Busca valor do campo referencia MENU (c2_9804_9801) da tabela MENU_PERFIL_ITEM (t9804) */
	public Set<T9804> getT9804C2(){
		return this.t9804C2;
	}

	/** Define valor do campo referencia MENU (c2_9804_9801) da tabela MENU_PERFIL_ITEM (t9804) */
	public void setT9804C2(Set<T9804> t9804C2){
		this.t9804C2 = t9804C2;
	}

	@Override
	public String toString() {
		return "MENU (t9801) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_9801)=" + c1_9801
			+ "\n\t\tDESCRIÇÃO (c2_9801)=" + c2_9801
			+ "]";
	}


}
