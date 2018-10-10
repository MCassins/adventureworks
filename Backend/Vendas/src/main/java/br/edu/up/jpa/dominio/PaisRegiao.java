package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PaisRegiao")


public class PaisRegiao {
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false,name ="PaisRegiaoID")
	public int PaisRegiaoID;
	
	@ManyToOne
	@JoinColumn(name="MoedaID")
	public Moeda MoedaID;
	
	@Column(nullable=false,name ="CodigoMoeda")
	public String CodigoMoeda;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
    
    //G e S

	public int getPaisRegiaoID() {
		return PaisRegiaoID;
	}

	public void setPaisRegiaoID(int paisRegiaoID) {
		PaisRegiaoID = paisRegiaoID;
	}

	public Moeda getMoedaID() {
		return MoedaID;
	}

	public void setMoedaID(Moeda moedaID) {
		MoedaID = moedaID;
	}

	public String getCodigoMoeda() {
		return CodigoMoeda;
	}

	public void setCodigoMoeda(String codigoMoeda) {
		CodigoMoeda = codigoMoeda;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	//CONSTRUTOR
	
	public PaisRegiao( Moeda moedaID, String codigoMoeda, Date datamodificacao) {
		super();
		MoedaID = moedaID;
		CodigoMoeda = codigoMoeda;
		this.datamodificacao = datamodificacao;
	}

	public PaisRegiao() {
		super();
	}
	
	
    
	
    
    
}
