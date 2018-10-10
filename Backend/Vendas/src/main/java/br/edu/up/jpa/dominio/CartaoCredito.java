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
@Table(name="CartaoCredito ")

public class CartaoCredito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false,name="CartaoCreditoID")
	public int CartaoCreditoID;

	@Column(nullable=false,name="TipoCartao")
	public String TipoCartao;

	@Column(nullable=false,name="NumeroCartao")
	public String NumeroCartao;

	@Column(nullable=false,name="VencimentoMes")
	public int VencimentoMes;

	@Column(nullable=false,name="VencimentoAno")
	public int VencimentoAno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
	
	//G E S

	public int getCartaoCreditoID() {
		return CartaoCreditoID;
	}

	public void setCartaoCreditoID(int cartaoCreditoID) {
		CartaoCreditoID = cartaoCreditoID;
	}

	public String getTipoCartao() {
		return TipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		TipoCartao = tipoCartao;
	}

	public String getNumeroCartao() {
		return NumeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		NumeroCartao = numeroCartao;
	}

	public int getVencimentoMes() {
		return VencimentoMes;
	}

	public void setVencimentoMes(int vencimentoMes) {
		VencimentoMes = vencimentoMes;
	}

	public int getVencimentoAno() {
		return VencimentoAno;
	}

	public void setVencimentoAno(int vencimentoAno) {
		VencimentoAno = vencimentoAno;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	//CONSTRUTOR
	
	public CartaoCredito(String tipoCartao, String numeroCartao, int vencimentoMes,
			int vencimentoAno, Date datamodificacao) {
		super();
		TipoCartao = tipoCartao;
		NumeroCartao = numeroCartao;
		VencimentoMes = vencimentoMes;
		VencimentoAno = vencimentoAno;
		this.datamodificacao = datamodificacao;
	}

	public CartaoCredito() {
		super();
	}
	
	
	
}
