package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CartaoCreditoPessoa")

public class CartaoCreditoPessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false,name="BusinessEntityID")
	private int BusinessEntityID;
	
	@ManyToOne
	@MapsId("CartaoCreditoID")
	public CartaoCredito CartaoCreditoID;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="datamodificacao",nullable=false)
	private Date datamodificacao;	
}
