package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t9804")
public class MENU_PERFIL_ITEM implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9804")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_9804_9801", foreignKey = @ForeignKey(name = "r2_9804_9801"))
	@JsonManagedReference
	private MENU MENU;

	@ManyToOne
	@JoinColumn(name = "c3_9804_9803", foreignKey = @ForeignKey(name = "r3_9804_9803"))
	@JsonManagedReference
	private MENU_PERFIL MENU_PERFIL;

	@ManyToOne
	@JoinColumn(name = "c4_9804_9802", foreignKey = @ForeignKey(name = "r4_9804_9802"))
	@JsonManagedReference
	private MENU_ITEM MENU_ITEM;

	public Integer getID__CHAVE_SEQUENCIAL() {
		return ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer iD__CHAVE_SEQUENCIAL) {
		ID__CHAVE_SEQUENCIAL = iD__CHAVE_SEQUENCIAL;
	}

	public MENU getMENU() {
		return MENU;
	}

	public void setMENU(MENU mENU) {
		MENU = mENU;
	}

	public MENU_PERFIL getMENU_PERFIL() {
		return MENU_PERFIL;
	}

	public void setMENU_PERFIL(MENU_PERFIL mENU_PERFIL) {
		MENU_PERFIL = mENU_PERFIL;
	}

	public MENU_ITEM getMENU_ITEM() {
		return MENU_ITEM;
	}

	public void setMENU_ITEM(MENU_ITEM mENU_ITEM) {
		MENU_ITEM = mENU_ITEM;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
