package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.List;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.ecvtec.corelibrary.jackson.SerializadorT9802;

/**
 * Classe MENU_ITEM.<br>
 * Representa a tabela t9802 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t9802")
@JsonSerialize(using=SerializadorT9802.class)
public class T9802 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_9802) da tabela MENU_ITEM (t9802) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9802;

	/** Campo MENU (c2_9802_9801) da tabela MENU_ITEM (t9802) */
	@NotNull
	@ManyToOne
	@JsonBackReference("c2_9802_9801")
	@JoinColumn(name = "c2_9802_9801", foreignKey = @ForeignKey(name = "r2_9802_9801"))
	private T9801 c2_9802_9801;

	/** Campo DESCRIÇÃO (c3_9802) da tabela MENU_ITEM (t9802) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_9802;

	/** Campo TIPO (c4_9802_5002) da tabela MENU_ITEM (t9802) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_9802_5002", foreignKey = @ForeignKey(name = "r4_9802_5002"))
	private T5002 c4_9802_5002;

	/** Campo MENU SUPERIOR (c5_9802_9802) da tabela MENU_ITEM (t9802) */
	@ManyToOne
	@JsonBackReference("t9802C5")
	@JoinColumn(name = "c5_9802_9802", foreignKey = @ForeignKey(name = "r5_9802_9802"))
	private T9802 c5_9802_9802;

	/** Campo FORM (c6_9802) da tabela MENU_ITEM (t9802) */
	@Size(max = 160, message = "FORM deve possuir no máximo {max} caracteres.")
	private String c6_9802;

	/** Campo ORDERNAÇÃO (c7_9802) da tabela MENU_ITEM (t9802) */
	@NotNull
	private int c7_9802;

	/** Campo LABEL (c8_9802_801) da tabela MENU_ITEM (t9802) */
	@ManyToOne
	@JoinColumn(name = "c8_9802_801", foreignKey = @ForeignKey(name = "r8_9802_801"))
	private T801 c8_9802_801;

	/** Referencia ao campo c5_9802_9802 (c4_9804_9804) da tabela MENU_PERFIL_ITEM (t9804) */
	@JsonManagedReference("t9802C5")
	@OneToMany(mappedBy = "c5_9802_9802", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<T9802> t9802C5;
	
	/** Referencia ao campo ITEM_MENU (c4_9804_9802) da tabela MENU_PERFIL_ITEM (t9804) */
	@JsonBackReference(value = "c4_9804_9802")
	@OneToMany(mappedBy = "c4_9804_9802", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9804> t9804C4;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_9802) da tabela MENU_ITEM (t9802) */
	public int getC1_9802(){
		return this.c1_9802;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_9802) da tabela MENU_ITEM (t9802) */
	public void setC1_9802(int c1_9802){
		this.c1_9802 = c1_9802;
	}

	/** Busca valor do campo MENU (c2_9802_9801) da tabela MENU_ITEM (t9802) */
	public T9801 getC2_9802_9801(){
		return this.c2_9802_9801;
	}

	/** Define valor do campo MENU (c2_9802_9801) da tabela MENU_ITEM (t9802) */
	public void setC2_9802_9801(T9801 c2_9802_9801){
		this.c2_9802_9801 = c2_9802_9801;
	}

	/** Busca valor do campo DESCRIÇÃO (c3_9802) da tabela MENU_ITEM (t9802) */
	public String getC3_9802(){
		return this.c3_9802;
	}

	/** Define valor do campo DESCRIÇÃO (c3_9802) da tabela MENU_ITEM (t9802) */
	public void setC3_9802(String c3_9802){
		this.c3_9802 = c3_9802;
	}

	/** Busca valor do campo TIPO (c4_9802_5002) da tabela MENU_ITEM (t9802) */
	public T5002 getC4_9802_5002(){
		return this.c4_9802_5002;
	}

	/** Define valor do campo TIPO (c4_9802_5002) da tabela MENU_ITEM (t9802) */
	public void setC4_9802_5002(T5002 c4_9802_5002){
		this.c4_9802_5002 = c4_9802_5002;
	}

	/** Busca valor do campo MENU SUPERIOR (c5_9802_9802) da tabela MENU_ITEM (t9802) */
	public T9802 getC5_9802_9802(){
		return this.c5_9802_9802;
	}

	/** Define valor do campo MENU SUPERIOR (c5_9802_9802) da tabela MENU_ITEM (t9802) */
	public void setC5_9802_9802(T9802 c5_9802_9802){
		this.c5_9802_9802 = c5_9802_9802;
	}

	/** Busca valor do campo FORM (c6_9802) da tabela MENU_ITEM (t9802) */
	public String getC6_9802(){
		return this.c6_9802;
	}

	/** Define valor do campo FORM (c6_9802) da tabela MENU_ITEM (t9802) */
	public void setC6_9802(String c6_9802){
		this.c6_9802 = c6_9802;
	}

	/** Busca valor do campo ORDERNAÇÃO (c7_9802) da tabela MENU_ITEM (t9802) */
	public int getC7_9802(){
		return this.c7_9802;
	}

	/** Define valor do campo ORDERNAÇÃO (c7_9802) da tabela MENU_ITEM (t9802) */
	public void setC7_9802(int c7_9802){
		this.c7_9802 = c7_9802;
	}

	/** Busca valor do campo LABEL (c8_9802_801) da tabela MENU_ITEM (t9802) */
	public T801 getC8_9802_801(){
		return this.c8_9802_801;
	}

	/** Define valor do campo LABEL (c8_9802_801) da tabela MENU_ITEM (t9802) */
	public void setC8_9802_801(T801 c8_9802_801){
		this.c8_9802_801 = c8_9802_801;
	}

	/** Busca valor do campo referencia ITEM_MENU (c4_9804_9802) da tabela MENU_PERFIL_ITEM (t9804) */
	public Set<T9804> getT9804C4(){
		return this.t9804C4;
	}

	/** Define valor do campo referencia ITEM_MENU (c4_9804_9802) da tabela MENU_PERFIL_ITEM (t9804) */
	public void setT9804C4(Set<T9804> t9804C4){
		this.t9804C4 = t9804C4;
	}

	public List<T9802> getT9802C5() {
		return t9802C5;
	}

	public void setT9802C5(List<T9802> t9802c5) {
		t9802C5 = t9802c5;
	}

	@Override
	public String toString() {
		return "MENU_ITEM (t9802) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_9802)=" + c1_9802
			+ "\n\t\tDESCRIÇÃO (c3_9802)=" + c3_9802
			+ "\n\t\tFORM (c6_9802)=" + c6_9802
			+ "\n\t\tORDERNAÇÃO (c7_9802)=" + c7_9802
			+ "]";
	}


}
