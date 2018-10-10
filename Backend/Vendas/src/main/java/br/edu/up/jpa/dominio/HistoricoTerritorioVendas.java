package br.edu.up.jpa.dominio;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HistoricoTerritorioVendas")

public class HistoricoTerritorioVendas {
	
	private static final long serialVersionUID = 1L;

	@Embeddable
	public static class IDComposto implements Serializable {

		private static final long serialVersionUID = 1L;

		@Column(name="PessoaVendaID")
		private int PessoaVendaID;
		
		@Column(name="TerritorioID")
		private int TerritorioID;
	}
	@EmbeddedId
	private IDComposto id;
	
	@ManyToOne
	@MapsId("PessoaVendaID")
	@JoinColumn(name="PessoaVendaID")
	public PessoaVenda PessoaVenda;
	
	@ManyToOne
	@MapsId("TerritorioID")
	@JoinColumn(name="TerritorioID")
	public TerritorioVendas Territorio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name="DataInicio")
	public Date DataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name="DataFim")
	public Date DataFim;
	
	@Column(nullable=false,name="Rowguild")
    public String rowguild;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;
	
}
