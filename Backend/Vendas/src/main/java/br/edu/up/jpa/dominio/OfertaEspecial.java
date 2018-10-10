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
@Table(name="OfertaEspecial")
public class OfertaEspecial {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false ,name ="OfertaEspecialID")
	public int OfertaEspecialID;
	
	@Column(nullable=false,name ="Descricao")
	public String Descricao;
	
	@Column(precision=19, scale=4,nullable=false,name ="DescontoPCT")
	public BigDecimal DescontoPCT;
	
	@Column(nullable=false,name ="Tipo")
	public String Tipo;
	
	@Column(nullable=false,name ="Categoria")
	public String Categoria;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="DataInicio",nullable=false)
	public Date DataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="DataFinal",nullable=false)
	public Date DataFinal;
	
	@Column(nullable=false,name ="MinQtd")
	public int MinQtd;
	
	@Column(nullable=false,name ="MaxQtd")
	public int MaxQtd;
	

    @Column(nullable=false,name ="Rowguild")
     public String rowguild;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;

    
    // G e S 
    
	public int getOfertaEspecialID() {
		return OfertaEspecialID;
	}

	public void setOfertaEspecialID(int ofertaEspecialID) {
		OfertaEspecialID = ofertaEspecialID;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public BigDecimal getDescontoPCT() {
		return DescontoPCT;
	}

	public void setDescontoPCT(BigDecimal descontoPCT) {
		DescontoPCT = descontoPCT;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public Date getDataInicio() {
		return DataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		DataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return DataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		DataFinal = dataFinal;
	}

	public int getMinQtd() {
		return MinQtd;
	}

	public void setMinQtd(int minQtd) {
		MinQtd = minQtd;
	}

	public int getMaxQtd() {
		return MaxQtd;
	}

	public void setMaxQtd(int maxQtd) {
		MaxQtd = maxQtd;
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
	
	public OfertaEspecial( String descricao, BigDecimal descontoPCT, String tipo, String categoria,
			Date dataInicio, Date dataFinal, int minQtd, int maxQtd, String rowguild, Date datamodificacao) {
		super();
	
		Descricao = descricao;
		DescontoPCT = descontoPCT;
		Tipo = tipo;
		Categoria = categoria;
		DataInicio = dataInicio;
		DataFinal = dataFinal;
		MinQtd = minQtd;
		MaxQtd = maxQtd;
		this.rowguild = rowguild;
		this.datamodificacao = datamodificacao;
	}

	public OfertaEspecial() {
		super();
	}
	
	
    
    
	
}
