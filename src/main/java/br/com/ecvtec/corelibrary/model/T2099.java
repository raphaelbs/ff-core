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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe INSUMO_VEÍCULO.<br>
 * Representa a tabela t2099 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2099")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2099 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2099) da tabela INSUMO_VEÍCULO (t2099)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2099;

	/**
	 * Campo TABELA DE INSUMO (c2_2099_2001) da tabela INSUMO_VEÍCULO (t2099)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2099_2001", foreignKey = @ForeignKey(name = "r2_2099_2001"))
	private T2001 c2_2099_2001;

	/**
	 * Campo INDICA SE O VEICULO É DO TIPO CAVALO MECANICO, CARRETA, TRUCK,
	 * MOTOS E ETC (c3_2099_5002) da tabela INSUMO_VEÍCULO (t2099)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_2099_5002", foreignKey = @ForeignKey(name = "r3_2099_5002"))
	private T5002 c3_2099_5002;

	/**
	 * Campo CIDADE DE EMPLACAMENTO DO VEICULO (c4_2099_6201) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_2099_6201", foreignKey = @ForeignKey(name = "r4_2099_6201"))
	private T6201 c4_2099_6201;

	/**
	 * Campo TIPO DA CARROCERIA (c5_2099_5002) da tabela INSUMO_VEÍCULO (t2099)
	 */
	@ManyToOne
	@JoinColumn(name = "c5_2099_5002", foreignKey = @ForeignKey(name = "r5_2099_5002"))
	private T5002 c5_2099_5002;

	/**
	 * Campo INDICA O PESO DO VEICULO (TARA) (c6_2099) da tabela INSUMO_VEÍCULO
	 * (t2099)
	 */
	@Digits(integer = 20, fraction = 6, message = "INDICA O PESO DO VEICULO (TARA) deve possuir no máximo {integer},{fraction} digitos.")
	private double c6_2099;

	/**
	 * Campo CAPACIDADE DE PESO QUE O VEICULO CONSEGUE TRANSPORTAR (c7_2099) da
	 * tabela INSUMO_VEÍCULO (t2099)
	 */
	@Digits(integer = 20, fraction = 6, message = "CAPACIDADE DE PESO QUE O VEICULO CONSEGUE TRANSPORTAR deve possuir no máximo {integer},{fraction} digitos.")
	private double c7_2099;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2099) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public int getC1_2099() {
		return this.c1_2099;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2099) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public void setC1_2099(int c1_2099) {
		this.c1_2099 = c1_2099;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2099_2001) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public T2001 getC2_2099_2001() {
		return this.c2_2099_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2099_2001) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public void setC2_2099_2001(T2001 c2_2099_2001) {
		this.c2_2099_2001 = c2_2099_2001;
	}

	/**
	 * Busca valor do campo INDICA SE O VEICULO É DO TIPO CAVALO MECANICO,
	 * CARRETA, TRUCK, MOTOS E ETC (c3_2099_5002) da tabela INSUMO_VEÍCULO
	 * (t2099)
	 */
	public T5002 getC3_2099_5002() {
		return this.c3_2099_5002;
	}

	/**
	 * Define valor do campo INDICA SE O VEICULO É DO TIPO CAVALO MECANICO,
	 * CARRETA, TRUCK, MOTOS E ETC (c3_2099_5002) da tabela INSUMO_VEÍCULO
	 * (t2099)
	 */
	public void setC3_2099_5002(T5002 c3_2099_5002) {
		this.c3_2099_5002 = c3_2099_5002;
	}

	/**
	 * Busca valor do campo CIDADE DE EMPLACAMENTO DO VEICULO (c4_2099_6201) da
	 * tabela INSUMO_VEÍCULO (t2099)
	 */
	public T6201 getC4_2099_6201() {
		return this.c4_2099_6201;
	}

	/**
	 * Define valor do campo CIDADE DE EMPLACAMENTO DO VEICULO (c4_2099_6201) da
	 * tabela INSUMO_VEÍCULO (t2099)
	 */
	public void setC4_2099_6201(T6201 c4_2099_6201) {
		this.c4_2099_6201 = c4_2099_6201;
	}

	/**
	 * Busca valor do campo TIPO DA CARROCERIA (c5_2099_5002) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public T5002 getC5_2099_5002() {
		return this.c5_2099_5002;
	}

	/**
	 * Define valor do campo TIPO DA CARROCERIA (c5_2099_5002) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public void setC5_2099_5002(T5002 c5_2099_5002) {
		this.c5_2099_5002 = c5_2099_5002;
	}

	/**
	 * Busca valor do campo INDICA O PESO DO VEICULO (TARA) (c6_2099) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public double getC6_2099() {
		return this.c6_2099;
	}

	/**
	 * Define valor do campo INDICA O PESO DO VEICULO (TARA) (c6_2099) da tabela
	 * INSUMO_VEÍCULO (t2099)
	 */
	public void setC6_2099(double c6_2099) {
		this.c6_2099 = c6_2099;
	}

	/**
	 * Busca valor do campo CAPACIDADE DE PESO QUE O VEICULO CONSEGUE
	 * TRANSPORTAR (c7_2099) da tabela INSUMO_VEÍCULO (t2099)
	 */
	public double getC7_2099() {
		return this.c7_2099;
	}

	/**
	 * Define valor do campo CAPACIDADE DE PESO QUE O VEICULO CONSEGUE
	 * TRANSPORTAR (c7_2099) da tabela INSUMO_VEÍCULO (t2099)
	 */
	public void setC7_2099(double c7_2099) {
		this.c7_2099 = c7_2099;
	}

	@Override
	public String toString() {
		return "INSUMO_VEÍCULO (t2099) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2099)=" + c1_2099
				+ "\n\t\tINDICA O PESO DO VEICULO (TARA) (c6_2099)=" + c6_2099
				+ "\n\t\tCAPACIDADE DE PESO QUE O VEICULO CONSEGUE TRANSPORTAR (c7_2099)=" + c7_2099 + "]";
	}

}
