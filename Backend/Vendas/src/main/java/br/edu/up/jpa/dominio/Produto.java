package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Produto")

public class Produto {
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false ,name ="ProdutoID")
	public int ProdutoID;
	
	@Column(nullable=false ,name ="NomeProduto")
	public String NomeProduto;
	
	@Column(nullable=false ,name ="ProdutoNumero")
	public String ProdutoNumero;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;

    
    //G e S
    
	public int getProdutoID() {
		return ProdutoID;
	}

	public void setProdutoID(int produtoID) {
		ProdutoID = produtoID;
	}

	public String getNomeProduto() {
		return NomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}

	public String getProdutoNumero() {
		return ProdutoNumero;
	}

	public void setProdutoNumero(String produtoNumero) {
		ProdutoNumero = produtoNumero;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	//CONSTRUTOR
	
	public Produto( String nomeProduto, String produtoNumero, Date datamodificacao) {
		super();
		NomeProduto = nomeProduto;
		ProdutoNumero = produtoNumero;
		this.datamodificacao = datamodificacao;
	}

	public Produto() {
		super();
	}
	
	
    
	
    
	
}
