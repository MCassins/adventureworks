package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="CabecalhoOrdemVendas ")

public class CabecalhoOrdemVendas {
	
	
    @Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
    public int CabecalhoOrdemVendasID; 
    
    @ManyToOne
	@MapsId("TerritorioVendasID")
	public TerritorioVendas TerritorioVendasID;
    
	@ManyToOne
	@MapsId("TipoCambioID")
	public TipoCambio TipoCambioID;
	
	@ManyToOne
	@MapsId("PessoaVendaID")
	public PessoaVenda PessoaVendaID;
	
	@ManyToOne
	@MapsId("CartaoCreditoID")
	public CartaoCredito CartaoCreditoID;
	
	@ManyToOne
	@MapsId("ClienteID")
	public Cliente ClienteID;
	
	@Column(nullable=false,name="OrdemData")
    @Temporal(TemporalType.TIMESTAMP)
     public Date OrdemData;
	
	@Column(nullable=false,name="VencimentoData")
     @Temporal(TemporalType.TIMESTAMP)
	public Date VencimentoData;
	
	@Column(nullable=false,name="DataEnvio")
    @Temporal(TemporalType.TIMESTAMP)
	public Date DataEnvio;
	
	@Column(nullable=false,name="Status2")
	public int Status_2;
  
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="DataModificacao",nullable=false)
	private Date datamodificacao;

    
 
    
    //G E S
	public int getCabecalhoOrdemVendasID() {
		return CabecalhoOrdemVendasID;
	}

	public void setCabecalhoOrdemVendasID(int cabecalhoOrdemVendasID) {
		CabecalhoOrdemVendasID = cabecalhoOrdemVendasID;
	}

	public TerritorioVendas getTerritorioVendasID() {
		return TerritorioVendasID;
	}

	public void setTerritorioVendasID(TerritorioVendas territorioVendasID) {
		TerritorioVendasID = territorioVendasID;
	}

	public TipoCambio getTipoCambioID() {
		return TipoCambioID;
	}

	public void setTipoCambioID(TipoCambio tipoCambioID) {
		TipoCambioID = tipoCambioID;
	}

	public PessoaVenda getPessoaVendaID() {
		return PessoaVendaID;
	}

	public void setPessoaVendaID(PessoaVenda pessoaVendaID) {
		PessoaVendaID = pessoaVendaID;
	}

	public CartaoCredito getCartaoCreditoID() {
		return CartaoCreditoID;
	}

	public void setCartaoCreditoID(CartaoCredito cartaoCreditoID) {
		CartaoCreditoID = cartaoCreditoID;
	}

	public Cliente getClienteID() {
		return ClienteID;
	}

	public void setClienteID(Cliente clienteID) {
		ClienteID = clienteID;
	}

	public Date getOrdemData() {
		return OrdemData;
	}

	public void setOrdemData(Date ordemData) {
		OrdemData = ordemData;
	}

	public Date getVencimentoData() {
		return VencimentoData;
	}

	public void setVencimentoData(Date vencimentoData) {
		VencimentoData = vencimentoData;
	}

	public Date getDataEnvio() {
		return DataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		DataEnvio = dataEnvio;
	}

	public int getStatus_2() {
		return Status_2;
	}

	public void setStatus_2(int status_2) {
		Status_2 = status_2;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	//CONSTRUTOR 
	public CabecalhoOrdemVendas() {
		super();
	}

	public CabecalhoOrdemVendas(TerritorioVendas territorioVendasID,
			TipoCambio tipoCambioID, PessoaVenda pessoaVendaID, CartaoCredito cartaoCreditoID, Cliente clienteID,
			Date ordemData, Date vencimentoData, Date dataEnvio, int status_2, Date datamodificacao) {
		super();
		TerritorioVendasID = territorioVendasID;
		TipoCambioID = tipoCambioID;
		PessoaVendaID = pessoaVendaID;
		CartaoCreditoID = cartaoCreditoID;
		ClienteID = clienteID;
		OrdemData = ordemData;
		VencimentoData = vencimentoData;
		DataEnvio = dataEnvio;
		Status_2 = status_2;
		this.datamodificacao = datamodificacao;
	}	
	
	//HASHCODE
	
	
	
	
    
    
    
}
