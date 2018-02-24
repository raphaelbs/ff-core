package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t9502")
public class VIAGEM_TRAJETO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9502")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@OneToOne
	@JoinColumn(name = "c2_9502_9501", foreignKey = @ForeignKey(name = "r2_9502_9501"))
	@JsonManagedReference
	private VIAGEM VIAGEM;

	@ManyToOne
	@JoinColumn(name = "c3_9502_6201", foreignKey = @ForeignKey(name = "r3_9502_6201"))
	@JsonManagedReference
	private CIDADE CIDADE_ORIGEM;

	@ManyToOne
	@JoinColumn(name = "c4_9502_6201", foreignKey = @ForeignKey(name = "r4_9502_6201"))
	@JsonManagedReference
	private CIDADE CIDADE_DESTINO;

	@Column(name = "c5_9502")
	private Integer ORDENACAO;

	@OneToMany(mappedBy = "TRAJETO")
	@JsonBackReference
	private Set<VIAGEM_CARGA> TRAJETO_VIAGEM_CARGAs;

	@OneToMany(mappedBy = "TRAJETO")
	@JsonBackReference
	private Set<VIAGEM_COORDENADA> TRAJETO_VIAGEM_COORDENADAs;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public VIAGEM getVIAGEM() {
		return this.VIAGEM;
	}

	public void setVIAGEM(VIAGEM VIAGEM) {
		this.VIAGEM = VIAGEM;
	}

	@JsonIgnore
	public CIDADE getCIDADE_ORIGEM() {
		return this.CIDADE_ORIGEM;
	}

	public void setCIDADE_ORIGEM(CIDADE CIDADE_ORIGEM) {
		this.CIDADE_ORIGEM = CIDADE_ORIGEM;
	}

	@JsonIgnore
	public CIDADE getCIDADE_DESTINO() {
		return this.CIDADE_DESTINO;
	}

	public void setCIDADE_DESTINO(CIDADE CIDADE_DESTINO) {
		this.CIDADE_DESTINO = CIDADE_DESTINO;
	}

	@JsonIgnore
	public Integer getORDENACAO() {
		return this.ORDENACAO;
	}

	public void setORDENACAO(Integer ORDENACAO) {
		this.ORDENACAO = ORDENACAO;
	}

	@JsonIgnore
	public Set<VIAGEM_CARGA> getTRAJETO_VIAGEM_CARGAs() {
		return this.TRAJETO_VIAGEM_CARGAs;
	}

	public void setTRAJETO_VIAGEM_CARGAs(Set<VIAGEM_CARGA> TRAJETO_VIAGEM_CARGAs) {
		this.TRAJETO_VIAGEM_CARGAs = TRAJETO_VIAGEM_CARGAs;
	}

	@JsonIgnore
	public Set<VIAGEM_COORDENADA> getTRAJETO_VIAGEM_COORDENADAs() {
		return this.TRAJETO_VIAGEM_COORDENADAs;
	}

	public void setTRAJETO_VIAGEM_COORDENADAs(Set<VIAGEM_COORDENADA> TRAJETO_VIAGEM_COORDENADAs) {
		this.TRAJETO_VIAGEM_COORDENADAs = TRAJETO_VIAGEM_COORDENADAs;
	}
}
