package br.edu.up.jpa.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Cliente")

public class Cliente {
	
	@Embeddable
	public static class IDComposto implements Serializable {

		private static final long serialVersionUID = 1L;

		/*@Column(name="ClienteID;")
		private int ClienteID;
		
		@Column(name="PersonID")
		private int PersonID;*/
		
		@Column(name="LojaID")
		private int LojaID;
	}
	@EmbeddedId
	private IDComposto id;
	
	@Column(name="ClienteID")
	public int ClienteID; 

	@Column(name="PersonID")
	public int PersonID;

	//@ManyToOne
	@ManyToOne
	@MapsId("LojaID")
	@JoinColumn(name="LojaID")
	public Loja LojaID;

	//@ManyToOne
	@ManyToOne
	@JoinColumn(name="TerritorioVendasID")
	public TerritorioVendas TerritorioVendasID;

	@Column(nullable=false,name="NumeroConta")
	public String NumeroConta;

	@Column(nullable=false, length=64,name="Rowguild")
	public String Rowguild;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;

	public IDComposto getId() {
		return id;
	}

	public void setId(IDComposto id) {
		this.id = id;
	}

	public int getClienteID() {
		return ClienteID;
	}

	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}

	public int getPersonID() {
		return PersonID;
	}

	public void setPersonID(int personID) {
		PersonID = personID;
	}

	public Loja getLojaID() {
		return LojaID;
	}

	public void setLojaID(Loja lojaID) {
		LojaID = lojaID;
	}

	public TerritorioVendas getTerritorioVendasID() {
		return TerritorioVendasID;
	}

	public void setTerritorioVendasID(TerritorioVendas territorioVendasID) {
		TerritorioVendasID = territorioVendasID;
	}

	public String getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		NumeroConta = numeroConta;
	}

	public String getRowguild() {
		return Rowguild;
	}

	public void setRowguild(String rowguild) {
		Rowguild = rowguild;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	
}