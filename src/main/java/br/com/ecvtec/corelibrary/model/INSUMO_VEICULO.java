package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t2099")
public class INSUMO_VEICULO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2099")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2099_2001", foreignKey = @ForeignKey(name = "r2_2099_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@OneToOne
	@JoinColumn(name = "c3_2099_5002", foreignKey = @ForeignKey(name = "r3_2099_5002"))
	@JsonManagedReference
	private TIPO_VALOR INDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC;

	@ManyToOne
	@JoinColumn(name = "c4_2099_6201", foreignKey = @ForeignKey(name = "r4_2099_6201"))
	@JsonManagedReference
	private CIDADE CIDADE_DE_EMPLACAMENTO_DO_VEICULO;

	@OneToOne
	@JoinColumn(name = "c5_2099_5002", foreignKey = @ForeignKey(name = "r5_2099_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DA_CARROCERIA;

	@Column(name = "c6_2099")
	@Size(max = 20, message = "INDICA_O_PESO_DO_VEICULO_TARA_ deve possuir no maximo {max} caracteres.")
	private BigDecimal INDICA_O_PESO_DO_VEICULO_TARA_;

	@Column(name = "c7_2099")
	@Size(max = 20, message = "CAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR deve possuir no maximo {max} caracteres.")
	private BigDecimal CAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public INSUMO getTABELA_DE_INSUMO() {
		return this.TABELA_DE_INSUMO;
	}

	public void setTABELA_DE_INSUMO(INSUMO TABELA_DE_INSUMO) {
		this.TABELA_DE_INSUMO = TABELA_DE_INSUMO;
	}

	@JsonIgnore
	public TIPO_VALOR getINDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC() {
		return this.INDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC;
	}

	public void setINDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC(
			TIPO_VALOR INDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC) {
		this.INDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC = INDICA_SE_O_VEICULO_E_DO_TIPO_CAVALO_MECANICO_CARRETA_TRUCK_MOTOS_E_ETC;
	}

	@JsonIgnore
	public CIDADE getCIDADE_DE_EMPLACAMENTO_DO_VEICULO() {
		return this.CIDADE_DE_EMPLACAMENTO_DO_VEICULO;
	}

	public void setCIDADE_DE_EMPLACAMENTO_DO_VEICULO(CIDADE CIDADE_DE_EMPLACAMENTO_DO_VEICULO) {
		this.CIDADE_DE_EMPLACAMENTO_DO_VEICULO = CIDADE_DE_EMPLACAMENTO_DO_VEICULO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DA_CARROCERIA() {
		return this.TIPO_DA_CARROCERIA;
	}

	public void setTIPO_DA_CARROCERIA(TIPO_VALOR TIPO_DA_CARROCERIA) {
		this.TIPO_DA_CARROCERIA = TIPO_DA_CARROCERIA;
	}

	@JsonIgnore
	public BigDecimal getINDICA_O_PESO_DO_VEICULO_TARA_() {
		return this.INDICA_O_PESO_DO_VEICULO_TARA_;
	}

	public void setINDICA_O_PESO_DO_VEICULO_TARA_(BigDecimal INDICA_O_PESO_DO_VEICULO_TARA_) {
		this.INDICA_O_PESO_DO_VEICULO_TARA_ = INDICA_O_PESO_DO_VEICULO_TARA_;
	}

	@JsonIgnore
	public BigDecimal getCAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR() {
		return this.CAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR;
	}

	public void setCAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR(
			BigDecimal CAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR) {
		this.CAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR = CAPACIDADE_DE_PESO_QUE_O_VEICULO_CONSEGUE_TRANSPORTAR;
	}

}
