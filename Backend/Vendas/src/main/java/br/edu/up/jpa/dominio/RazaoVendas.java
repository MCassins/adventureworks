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
@Table(name="RazaoVendas")

public class RazaoVendas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false,name ="RazaoVendasID")
	public int RazaoVendasID;
	
	@Column(nullable=false,name ="Nome")
	public String Nome;
	
	@Column(nullable=false,name ="TipoRazao")
	public String TipoRazao;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao; 
   
   
    
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
	result = prime * result + RazaoVendasID;
	result = prime * result + ((TipoRazao == null) ? 0 : TipoRazao.hashCode());
	result = prime * result + ((datamodificacao == null) ? 0 : datamodificacao.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	RazaoVendas other = (RazaoVendas) obj;
	if (Nome == null) {
		if (other.Nome != null)
			return false;
	} else if (!Nome.equals(other.Nome))
		return false;
	if (RazaoVendasID != other.RazaoVendasID)
		return false;
	if (TipoRazao == null) {
		if (other.TipoRazao != null)
			return false;
	} else if (!TipoRazao.equals(other.TipoRazao))
		return false;
	if (datamodificacao == null) {
		if (other.datamodificacao != null)
			return false;
	} else if (!datamodificacao.equals(other.datamodificacao))
		return false;
	return true;
}
public int getRazaoVendasID() {
	return RazaoVendasID;
}
public void setRazaoVendasID(int razaoVendasID) {
	RazaoVendasID = razaoVendasID;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getTipoRazao() {
	return TipoRazao;
}
public void setTipoRazao(String tipoRazao) {
	TipoRazao = tipoRazao;
}
public Date getDatamodificacao() {
	return datamodificacao;
}
public void setDatamodificacao(Date datamodificacao) {
	this.datamodificacao = datamodificacao;
}
public RazaoVendas(String nome, String tipoRazao, Date datamodificacao) {
	super();
	Nome = nome;
	TipoRazao = tipoRazao;
	this.datamodificacao = datamodificacao;
}
public RazaoVendas() {
	super();
}

}
