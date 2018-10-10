package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Moeda")
public class Moeda {


	@Id
	@Column(columnDefinition="char(3)",name ="MoedaID")
	public String MoedaID;

	@Column(nullable=false,name ="NomeMoeda")
	public String NomeMoeda;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name ="DataHoraModificacao")
	public Date DataHoraModificacao;

	//G e S 
	
	public String getMoedaID() {
		return MoedaID;
	}

	public void setMoedaID(String moedaID) {
		MoedaID = moedaID;
	}

	public String getNomeMoeda() {
		return NomeMoeda;
	}

	public void setNomeMoeda(String nomeMoeda) {
		NomeMoeda = nomeMoeda;
	}

	public Date getDataHoraModificacao() {
		return DataHoraModificacao;
	}

	public void setDataHoraModificacao(Date dataHoraModificacao) {
		DataHoraModificacao = dataHoraModificacao;
	}

	//CONSTRUTOR
	
	public Moeda(String moedaID, String nomeMoeda, Date dataHoraModificacao) {
		super();
		MoedaID = moedaID;
		NomeMoeda = nomeMoeda;
		DataHoraModificacao = dataHoraModificacao;
	}

	public Moeda() {
		super();
	}
	
	
	
	
	
	

}
