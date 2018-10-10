package br.edu.up.jpa.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="RazaoOrdemVendasCabecalho")


public class RazaoOrdemVendasCabecalho {
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false ,name ="RazaoOrdemVendasCabecalhoID")
	public int RazaoOrdemVendasCabecalhoID;
	
	@Column(nullable=false ,name ="NumeroRevisao")
    public int NumeroRevisao;
	
	 @Column(nullable=false ,name ="DataPedidoVenda")
     @Temporal(TemporalType.TIMESTAMP)
     public Date DataPedidoVenda;
	  
	 @Column(nullable=false ,name ="DataPedidoCliente")
     @Temporal(TemporalType.TIMESTAMP)
     public Date DataPedidoCliente;
	
	  
    @Column(nullable=true,name ="DataEnvio")
    @Temporal(TemporalType.TIMESTAMP)
	public Date DataEnvio;
	
 	@Column(nullable=false,name ="Status")
    public int Status;
 	

	@Column(name="OrdemOnline",columnDefinition="tinyint(1)", nullable = false)
	private byte OrdemOnline;
 	
	@Column(nullable=false,name="NumeroPedidoVenda")
    public String NumeroPedidoVenda;
	
	@Column(nullable=true,name="NumeroPedidoCompra")
    public String NumeroPedidoCompra;
	
	@Column(nullable=true,name="ClienteID")
    public int ClienteID;
	
  	@Column(nullable=true,name="RazaoVendasID")
	public int RazaoVendasID;
  	
  	@Column(nullable=true,name="TerritorioID")
	public int TerritorioID;
  	
  	@Column(nullable=false,name="EnderecoCobrancaID")
	public int EnderecoCobrancaID;
  	
  	@Column(nullable=false,name="EnderecoEnvioID")
	public int EnderecoEnvioID;
  	
  	@Column(nullable=false,name="MetodoEnvioClienteID")
	public int 	MetodoEnvioClienteID;
  	
	@Column(nullable=false,name="MetodoEnvioID")
	public int 	MetodoEnvioID;
	
	@Column(nullable=true,name="CartaoCreditoID")
	public int 	CartaoCreditoID;
	
	@Column(nullable=true,name="CodigoAprovacaoID")
	public String 	CodigoAprovacaoID;
	
	@Column(nullable=true,name="TaxaCambioID")
	public int 	TaxaCambioID;
	
	@Column(name="SubTotal", precision=19, scale=4, nullable = false)
	private BigDecimal SubTotal;
	
	@Column(name="Imposto", precision=19, scale=4, nullable = false)
	private BigDecimal Imposto;
	
	@Column(name="Frete", precision=19, scale=4, nullable = false)
	private BigDecimal Frete;
	
	@Column(name="Total", precision=19, scale=4, nullable = false)
	private BigDecimal Total;
	
	@Column(nullable=true,name="Comentario")
	public String Comentario;
	

	@Column(nullable = false, length=64 ,name="Rowguide")
	private String RowGuide;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false,name="Datamodificacao")
	private Date DataModificacao;
	
	
	
	
}
