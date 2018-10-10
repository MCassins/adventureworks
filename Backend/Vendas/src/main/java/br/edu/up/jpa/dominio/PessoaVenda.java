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
@Table(name="PessoaVenda")
public class PessoaVenda {
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false,name ="PessoaVendaID")
	public int PessoaVendaID;
	
	@ManyToOne
	@JoinColumn(name="TerritorioVendasID")
	public TerritorioVendas TerritorioVendasID;
	
	@Column(nullable=false,name ="CotaVendas")
	public double CotaVendas;
	
	@Column(nullable=false,name ="Bonus")
	public double Bonus;
	
	@Column(nullable=false,name ="ComissaoPCT")
	public double ComissaoPCT;
	
	@Column(nullable=false,name ="VendasYTD")
	public double VendasYTD;
	
	@Column(nullable=false,name ="VendasUltimoAno")
	public double VendasUltimoAno;
	
	@Column(nullable=false,name ="Rowguild")
	public String rowguild;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
	
	//G e S

	public int getPessoaVendaID() {
		return PessoaVendaID;
	}

	public void setPessoaVendaID(int pessoaVendaID) {
		PessoaVendaID = pessoaVendaID;
	}

	public TerritorioVendas getTerritorioVendasID() {
		return TerritorioVendasID;
	}

	public void setTerritorioVendasID(TerritorioVendas territorioVendasID) {
		TerritorioVendasID = territorioVendasID;
	}

	public double getCotaVendas() {
		return CotaVendas;
	}

	public void setCotaVendas(double cotaVendas) {
		CotaVendas = cotaVendas;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public double getComissaoPCT() {
		return ComissaoPCT;
	}

	public void setComissaoPCT(double comissaoPCT) {
		ComissaoPCT = comissaoPCT;
	}

	public double getVendasYTD() {
		return VendasYTD;
	}

	public void setVendasYTD(double vendasYTD) {
		VendasYTD = vendasYTD;
	}

	public double getVendasUltimoAno() {
		return VendasUltimoAno;
	}

	public void setVendasUltimoAno(double vendasUltimoAno) {
		VendasUltimoAno = vendasUltimoAno;
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
	
	public PessoaVenda(int pessoaVendaID, TerritorioVendas territorioVendasID, double cotaVendas, double bonus,
			double comissaoPCT, double vendasYTD, double vendasUltimoAno, String rowguild, Date datamodificacao) {
		super();
		PessoaVendaID = pessoaVendaID;
		TerritorioVendasID = territorioVendasID;
		CotaVendas = cotaVendas;
		Bonus = bonus;
		ComissaoPCT = comissaoPCT;
		VendasYTD = vendasYTD;
		VendasUltimoAno = vendasUltimoAno;
		this.rowguild = rowguild;
		this.datamodificacao = datamodificacao;
	}

	public PessoaVenda() {
		super();
	}
	
	
	
	
}