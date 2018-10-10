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
@Table(name="HistoricoCotasVendasPessoas")

public class HistoricoCotasVendasPessoas {
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false,name="HistorioCotasVendasPessoasId")
	public int HistorioCotasVendasPessoasId;
	
	@Column(nullable=false,name="CotaData")
	public Date CotaData;
	
     @Column(nullable=false,name="VendasCota")
	public String VendasCota;
     
     @Column(nullable=false,name="Rowguild")
     public String rowguild;
     
     @Temporal(TemporalType.TIMESTAMP)
     @Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
     
    // G e S

	public int getHistorioCotasVendasPessoasId() {
		return HistorioCotasVendasPessoasId;
	}

	public void setHistorioCotasVendasPessoasId(int historioCotasVendasPessoasId) {
		HistorioCotasVendasPessoasId = historioCotasVendasPessoasId;
	}

	public Date getCotaData() {
		return CotaData;
	}

	public void setCotaData(Date cotaData) {
		CotaData = cotaData;
	}

	public String getVendasCota() {
		return VendasCota;
	}

	public void setVendasCota(String vendasCota) {
		VendasCota = vendasCota;
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
	
	public HistoricoCotasVendasPessoas(int historioCotasVendasPessoasId, Date cotaData, String vendasCota,
			String rowguild, Date datamodificacao) {
		super();
		HistorioCotasVendasPessoasId = historioCotasVendasPessoasId;
		CotaData = cotaData;
		VendasCota = vendasCota;
		this.rowguild = rowguild;
		this.datamodificacao = datamodificacao;
	}

	public HistoricoCotasVendasPessoas() {
		super();
	}
	
	
	
	
     
     
}