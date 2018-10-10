package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="OfertaEspecialProduto")
public class OfertaEspecialProduto {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int OfertaEspecialProdutoID;
	
	@Column(nullable=false,name ="ProdutoID")
	public int ProdutoID;
	
	@ManyToOne
	@JoinColumn(name="OfertaEspecialID")
	public OfertaEspecial OfertaEspecialID;
	
    @Column(nullable=false,name ="Rowguild")
    public String rowguild;
     
    @Temporal(TemporalType.TIMESTAMP)
 	@Column(name ="Datamodificacao",nullable=false)
 	private Date datamodificacao;
    
    
    //G e S

	public int getOfertaEspecialProdutoID() {
		return OfertaEspecialProdutoID;
	}

	public void setOfertaEspecialProdutoID(int ofertaEspecialProdutoID) {
		OfertaEspecialProdutoID = ofertaEspecialProdutoID;
	}

	public int getProdutoID() {
		return ProdutoID;
	}

	public void setProdutoID(int produtoID) {
		ProdutoID = produtoID;
	}

	public OfertaEspecial getOfertaEspecialID() {
		return OfertaEspecialID;
	}

	public void setOfertaEspecialID(OfertaEspecial ofertaEspecialID) {
		OfertaEspecialID = ofertaEspecialID;
	}

	public String getRowguild() {
		return rowguild;
	}

	public void setRowguild(String rowguild) {
		this.rowguild = rowguild;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}
	
	//CONSTRUTOR

	public OfertaEspecialProduto(int ofertaEspecialProdutoID, int produtoID, OfertaEspecial ofertaEspecialID,
			String rowguild, Date datamodificacao) {
		super();
		OfertaEspecialProdutoID = ofertaEspecialProdutoID;
		ProdutoID = produtoID;
		OfertaEspecialID = ofertaEspecialID;
		this.rowguild = rowguild;
		this.datamodificacao = datamodificacao;
	}

	public OfertaEspecialProduto() {
		super();
	}
	
	
    
    

}
