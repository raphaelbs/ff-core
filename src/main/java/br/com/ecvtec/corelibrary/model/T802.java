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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe TERMO_ÍTEM.<br>
 * Representa a tabela t802 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t802")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T802 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_802) da tabela TERMO_ÍTEM (t802) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_802;

	/** Campo TERMO (c2_802_801) da tabela TERMO_ÍTEM (t802) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_802_801", foreignKey = @ForeignKey(name = "r2_802_801"))
	private T801 c2_802_801;

	/** Campo IDIOMA (c3_802_5002) da tabela TERMO_ÍTEM (t802) */
	@ManyToOne
	@JoinColumn(name = "c3_802_5002", foreignKey = @ForeignKey(name = "r3_802_5002"))
	private T5002 c3_802_5002;

	/** Campo DESCRIÇÃO (c4_802) da tabela TERMO_ÍTEM (t802) */
	@Size(max = 400, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c4_802;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_802) da tabela TERMO_ÍTEM (t802) */
	public int getC1_802(){
		return this.c1_802;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_802) da tabela TERMO_ÍTEM (t802) */
	public void setC1_802(int c1_802){
		this.c1_802 = c1_802;
	}

	/** Busca valor do campo TERMO (c2_802_801) da tabela TERMO_ÍTEM (t802) */
	public T801 getC2_802_801(){
		return this.c2_802_801;
	}

	/** Define valor do campo TERMO (c2_802_801) da tabela TERMO_ÍTEM (t802) */
	public void setC2_802_801(T801 c2_802_801){
		this.c2_802_801 = c2_802_801;
	}

	/** Busca valor do campo IDIOMA (c3_802_5002) da tabela TERMO_ÍTEM (t802) */
	public T5002 getC3_802_5002(){
		return this.c3_802_5002;
	}

	/** Define valor do campo IDIOMA (c3_802_5002) da tabela TERMO_ÍTEM (t802) */
	public void setC3_802_5002(T5002 c3_802_5002){
		this.c3_802_5002 = c3_802_5002;
	}

	/** Busca valor do campo DESCRIÇÃO (c4_802) da tabela TERMO_ÍTEM (t802) */
	public String getC4_802(){
		return this.c4_802;
	}

	/** Define valor do campo DESCRIÇÃO (c4_802) da tabela TERMO_ÍTEM (t802) */
	public void setC4_802(String c4_802){
		this.c4_802 = c4_802;
	}

	@Override
	public String toString() {
		return "TERMO_ÍTEM (t802) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_802)=" + c1_802
			+ "\n\t\tDESCRIÇÃO (c4_802)=" + c4_802
			+ "]";
	}


}
