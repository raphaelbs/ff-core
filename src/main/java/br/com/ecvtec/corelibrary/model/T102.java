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
 * Classe TABELA_CAMPO.<br>
 * Representa a tabela t102 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t102")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T102 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_102) da tabela TABELA_CAMPO (t102) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_102;

	/** Campo TABELA (c2_102_101) da tabela TABELA_CAMPO (t102) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_102_101", foreignKey = @ForeignKey(name = "r2_102_101"))
	private T101 c2_102_101;

	/** Campo DESCRIÇÃO (c3_102) da tabela TABELA_CAMPO (t102) */
	@Size(max = 80, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c3_102;

	/** Campo TIPO DO CAMPO (c4_102_5002) da tabela TABELA_CAMPO (t102) */
	@ManyToOne
	@JoinColumn(name = "c4_102_5002", foreignKey = @ForeignKey(name = "r4_102_5002"))
	private T5002 c4_102_5002;

	/** Campo TAMANHO (c5_102) da tabela TABELA_CAMPO (t102) */
	@Size(max = 40, message = "TAMANHO deve possuir no máximo {max} caracteres.")
	private String c5_102;

	/** Campo OBRIGATÓRIO (c6_102_5002) da tabela TABELA_CAMPO (t102) */
	@ManyToOne
	@JoinColumn(name = "c6_102_5002", foreignKey = @ForeignKey(name = "r6_102_5002"))
	private T5002 c6_102_5002;

	/** Campo ORDEM (c7_102) da tabela TABELA_CAMPO (t102) */
	private int c7_102;

	/** Campo NOME FÍSICO (c8_102) da tabela TABELA_CAMPO (t102) */
	@Size(max = 40, message = "NOME FÍSICO deve possuir no máximo {max} caracteres.")
	private String c8_102;

	 /** Referencia ao campo CAMPO (c4_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@JsonBackReference(value = "c4_104_102")
	@OneToMany(mappedBy = "c4_104_102", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T104> t104C4;

	 /** Referencia ao campo ID TABELA ESTRANGEIRA (c5_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	@JsonBackReference(value = "c5_104_102")
	@OneToMany(mappedBy = "c5_104_102", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T104> t104C5;

	 /** Referencia ao campo CAMPO (c4_106_102) da tabela TABELA_ÍNDICE_ITEM (t106) */
	@JsonBackReference(value = "c4_106_102")
	@OneToMany(mappedBy = "c4_106_102", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T106> t106C4;

	 /** Referencia ao campo COLUNA TABELA (c8_204_102) da tabela FORM_TELA_ABA_ITEM (t204) */
	@JsonBackReference(value = "c8_204_102")
	@OneToMany(mappedBy = "c8_204_102", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<T204> t204C8;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_102) da tabela TABELA_CAMPO (t102) */
	public int getC1_102(){
		return this.c1_102;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_102) da tabela TABELA_CAMPO (t102) */
	public void setC1_102(int c1_102){
		this.c1_102 = c1_102;
	}

	/** Busca valor do campo TABELA (c2_102_101) da tabela TABELA_CAMPO (t102) */
	public T101 getC2_102_101(){
		return this.c2_102_101;
	}

	/** Define valor do campo TABELA (c2_102_101) da tabela TABELA_CAMPO (t102) */
	public void setC2_102_101(T101 c2_102_101){
		this.c2_102_101 = c2_102_101;
	}

	/** Busca valor do campo DESCRIÇÃO (c3_102) da tabela TABELA_CAMPO (t102) */
	public String getC3_102(){
		return this.c3_102;
	}

	/** Define valor do campo DESCRIÇÃO (c3_102) da tabela TABELA_CAMPO (t102) */
	public void setC3_102(String c3_102){
		this.c3_102 = c3_102;
	}

	/** Busca valor do campo TIPO DO CAMPO (c4_102_5002) da tabela TABELA_CAMPO (t102) */
	public T5002 getC4_102_5002(){
		return this.c4_102_5002;
	}

	/** Define valor do campo TIPO DO CAMPO (c4_102_5002) da tabela TABELA_CAMPO (t102) */
	public void setC4_102_5002(T5002 c4_102_5002){
		this.c4_102_5002 = c4_102_5002;
	}

	/** Busca valor do campo TAMANHO (c5_102) da tabela TABELA_CAMPO (t102) */
	public String getC5_102(){
		return this.c5_102;
	}

	/** Define valor do campo TAMANHO (c5_102) da tabela TABELA_CAMPO (t102) */
	public void setC5_102(String c5_102){
		this.c5_102 = c5_102;
	}

	/** Busca valor do campo OBRIGATÓRIO (c6_102_5002) da tabela TABELA_CAMPO (t102) */
	public T5002 getC6_102_5002(){
		return this.c6_102_5002;
	}

	/** Define valor do campo OBRIGATÓRIO (c6_102_5002) da tabela TABELA_CAMPO (t102) */
	public void setC6_102_5002(T5002 c6_102_5002){
		this.c6_102_5002 = c6_102_5002;
	}

	/** Busca valor do campo ORDEM (c7_102) da tabela TABELA_CAMPO (t102) */
	public int getC7_102(){
		return this.c7_102;
	}

	/** Define valor do campo ORDEM (c7_102) da tabela TABELA_CAMPO (t102) */
	public void setC7_102(int c7_102){
		this.c7_102 = c7_102;
	}

	/** Busca valor do campo NOME FÍSICO (c8_102) da tabela TABELA_CAMPO (t102) */
	public String getC8_102(){
		return this.c8_102;
	}

	/** Define valor do campo NOME FÍSICO (c8_102) da tabela TABELA_CAMPO (t102) */
	public void setC8_102(String c8_102){
		this.c8_102 = c8_102;
	}

	/** Busca valor do campo referencia CAMPO (c4_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public Set<T104> getT104C4(){
		return this.t104C4;
	}

	/** Define valor do campo referencia CAMPO (c4_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setT104C4(Set<T104> t104C4){
		this.t104C4 = t104C4;
	}

	/** Busca valor do campo referencia ID TABELA ESTRANGEIRA (c5_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public Set<T104> getT104C5(){
		return this.t104C5;
	}

	/** Define valor do campo referencia ID TABELA ESTRANGEIRA (c5_104_102) da tabela TABELA_REFERÊNCIA_ITEM (t104) */
	public void setT104C5(Set<T104> t104C5){
		this.t104C5 = t104C5;
	}

	/** Busca valor do campo referencia CAMPO (c4_106_102) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public Set<T106> getT106C4(){
		return this.t106C4;
	}

	/** Define valor do campo referencia CAMPO (c4_106_102) da tabela TABELA_ÍNDICE_ITEM (t106) */
	public void setT106C4(Set<T106> t106C4){
		this.t106C4 = t106C4;
	}

	/** Busca valor do campo referencia COLUNA TABELA (c8_204_102) da tabela FORM_TELA_ABA_ITEM (t204) */
	public Set<T204> getT204C8(){
		return this.t204C8;
	}

	/** Define valor do campo referencia COLUNA TABELA (c8_204_102) da tabela FORM_TELA_ABA_ITEM (t204) */
	public void setT204C8(Set<T204> t204C8){
		this.t204C8 = t204C8;
	}

	@Override
	public String toString() {
		return "TABELA_CAMPO (t102) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_102)=" + c1_102
			+ "\n\t\tDESCRIÇÃO (c3_102)=" + c3_102
			+ "\n\t\tTAMANHO (c5_102)=" + c5_102
			+ "\n\t\tORDEM (c7_102)=" + c7_102
			+ "\n\t\tNOME FÍSICO (c8_102)=" + c8_102
			+ "]";
	}


}
