package br.edu.up.jpa.dominio;

import java.math.BigDecimal;
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
@Table(name="TerritorioVendas")

public class TerritorioVendas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false ,name ="TipoRazao")
	public int TerritorioID;
	
	@Column(nullable=false ,name ="Nome")
	public String Nome;
	
	@Column(nullable=false ,name ="RegiaoPaisCodigo")
	public String RegiaoPaisCodigo;
	
	@Column(nullable=false ,name ="Grupo")
	public String Grupo;
	
	@Column(precision=19, scale=4,nullable=false ,name ="VendasAnoCorrente")
	public BigDecimal VendasAnoCorrente;
	
	@Column(precision=19, scale=4,nullable=false ,name ="VendasUltimoAno")
	public BigDecimal VendasUltimoAno;
	
	@Column(precision=19, scale=4,nullable=false ,name ="CustoAnoCorrente")
	public BigDecimal CustoAnoCorrente;
	
	@Column(precision=19, scale=4,nullable=false ,name ="CustoUltimoAno")
	public BigDecimal CustoUltimoAno;
	
	@Column(nullable = false, length=64 ,name ="Rowguide")
	private String RowGuide;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
	
	
	//G e S

	public int getTerritorioID() {
		return TerritorioID;
	}

	public void setTerritorioID(int territorioID) {
		TerritorioID = territorioID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getRegiaoPaisCodigo() {
		return RegiaoPaisCodigo;
	}

	public void setRegiaoPaisCodigo(String regiaoPaisCodigo) {
		RegiaoPaisCodigo = regiaoPaisCodigo;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public BigDecimal getVendasAnoCorrente() {
		return VendasAnoCorrente;
	}

	public void setVendasAnoCorrente(BigDecimal vendasAnoCorrente) {
		VendasAnoCorrente = vendasAnoCorrente;
	}

	public BigDecimal getVendasUltimoAno() {
		return VendasUltimoAno;
	}

	public void setVendasUltimoAno(BigDecimal vendasUltimoAno) {
		VendasUltimoAno = vendasUltimoAno;
	}

	public BigDecimal getCustoAnoCorrente() {
		return CustoAnoCorrente;
	}

	public void setCustoAnoCorrente(BigDecimal custoAnoCorrente) {
		CustoAnoCorrente = custoAnoCorrente;
	}

	public BigDecimal getCustoUltimoAno() {
		return CustoUltimoAno;
	}

	public void setCustoUltimoAno(BigDecimal custoUltimoAno) {
		CustoUltimoAno = custoUltimoAno;
	}

	public String getRowGuide() {
		return RowGuide;
	}

	public void setRowGuide(String rowGuide) {
		RowGuide = rowGuide;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}
	
	//CONSTRUTOR

	public TerritorioVendas(int territorioID, String nome, String regiaoPaisCodigo, String grupo,
			BigDecimal vendasAnoCorrente, BigDecimal vendasUltimoAno, BigDecimal custoAnoCorrente,
			BigDecimal custoUltimoAno, String rowGuide, Date datamodificacao) {
		super();
		TerritorioID = territorioID;
		Nome = nome;
		RegiaoPaisCodigo = regiaoPaisCodigo;
		Grupo = grupo;
		VendasAnoCorrente = vendasAnoCorrente;
		VendasUltimoAno = vendasUltimoAno;
		CustoAnoCorrente = custoAnoCorrente;
		CustoUltimoAno = custoUltimoAno;
		RowGuide = rowGuide;
		this.datamodificacao = datamodificacao;
	}

	public TerritorioVendas() {
		super();
	}
	
	
	
	
	
}