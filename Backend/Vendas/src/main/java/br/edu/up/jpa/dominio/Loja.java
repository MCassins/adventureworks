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
@Table(name="Loja")
public class Loja {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false,name ="LojaID")
	public int LojaID;
	
	@Column(nullable=false,name ="Nome") 
	public String Nome;
	
	@Column(nullable=true,name ="VendedorID")
    public int VendedorID;
    
	//XML
	@Column(name="Demografia",columnDefinition = "TEXT",nullable=true)
	private String Demografia;
	
    @Column(nullable=false, length=64,name ="Rowguild")
    public String rowguild;
     
    @Temporal(TemporalType.TIMESTAMP)
 	@Column(name ="Datamodificacao",nullable=false)
 	private Date datamodificacao;
    
    
    //G e S
    
	

	public Loja() {
		super();
	}

	public int getLojaID() {
		return LojaID;
	}

	public void setLojaID(int lojaID) {
		LojaID = lojaID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getVendedorID() {
		return VendedorID;
	}

	public void setVendedorID(int vendedorID) {
		VendedorID = vendedorID;
	}

	public String getDemografia() {
		return Demografia;
	}

	public void setDemografia(String demografia) {
		Demografia = demografia;
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

	public Loja(String nome, int vendedorID, String demografia, String rowguild, Date datamodificacao) {
		super();
		Nome = nome;
		VendedorID = vendedorID;
		Demografia = demografia;
		this.rowguild = rowguild;
		this.datamodificacao = datamodificacao;
	}

	//CONSTRUTOR
	
	

	
	
	
	
	
	
    
    
}