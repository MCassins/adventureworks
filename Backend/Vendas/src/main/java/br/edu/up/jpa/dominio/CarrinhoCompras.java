package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="CarrinhoCompras")

public class CarrinhoCompras {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false , name ="ItemCarrinhoCompraID")
	public int ItemCarrinhoCompraID;
	
	@Column(nullable=false,name ="CarrinhoCompraID")
	public String CarrinhoCompraID;
	
	@Column(nullable=false,name ="Quantidade")
	public int Quantidade;
	
	@Column(nullable=false,name ="ProdutoID")
	public int ProdutoID;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name ="DataCriacao")
	public Date DataCriacao;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
    
    // G E S

	public int getItemCarrinhoCompraID() {
		return ItemCarrinhoCompraID;
	}

	public void setItemCarrinhoCompraID(int itemCarrinhoCompraID) {
		ItemCarrinhoCompraID = itemCarrinhoCompraID;
	}

	public String getCarrinhoCompraID() {
		return CarrinhoCompraID;
	}

	public void setCarrinhoCompraID(String carrinhoCompraID) {
		CarrinhoCompraID = carrinhoCompraID;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public int getProdutoID() {
		return ProdutoID;
	}

	public void setProdutoID(int produtoID) {
		ProdutoID = produtoID;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	//CONSTRUTOR 
	
	public CarrinhoCompras(String carrinhoCompraID, int quantidade, int produtoID,
			Date dataCriacao, Date datamodificacao) {
		super();
		
		CarrinhoCompraID = carrinhoCompraID;
		Quantidade = quantidade;
		ProdutoID = produtoID;
		DataCriacao = dataCriacao;
		this.datamodificacao = datamodificacao;
	}

	public CarrinhoCompras() {
		super();
	}	
    
    
   
    
    
}
