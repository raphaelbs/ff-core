package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe ESTOQUE.<br>
 * Representa a tabela t8001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t8001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T8001 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_8001) da tabela ESTOQUE (t8001) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_8001;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_8001) da tabela ESTOQUE
	 * (t8001)
	 */
	public int getC1_8001() {
		return this.c1_8001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_8001) da tabela ESTOQUE
	 * (t8001)
	 */
	public void setC1_8001(int c1_8001) {
		this.c1_8001 = c1_8001;
	}

	@Override
	public String toString() {
		return "ESTOQUE (t8001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_8001)=" + c1_8001 + "]";
	}

}
