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
@Table(name="TipoCambio")
public class TipoCambio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false , name ="TaxaCambioID")
	public int TaxaCambioID;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false , name ="DataTaxaCambio")
	public Date DataTaxaCambio;
	
	@Column(nullable=false , name ="LocalCambioCodigo")
	public String LocalCambioCodigo;
	
	@Column(nullable=false , name ="DestinoCambioCodigo")
	public String DestinoCambioCodigo;
	
	@Column(precision=19, scale=4,nullable=false , name ="TaxaMedia")
	public BigDecimal TaxaMedia;
	
	@Column(precision=19, scale=4,nullable=false , name ="TaxaFimDoDia")
	public BigDecimal TaxaFimDoDia;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="Datamodificacao",nullable=false)
	private Date datamodificacao;

	public TipoCambio() {
		super();
	}

	public TipoCambio( Date dataTaxaCambio, String localCambioCodigo, String destinoCambioCodigo,
			BigDecimal taxaMedia, BigDecimal taxaFimDoDia, Date datamodificacao) {
		super();
		DataTaxaCambio = dataTaxaCambio;
		LocalCambioCodigo = localCambioCodigo;
		DestinoCambioCodigo = destinoCambioCodigo;
		TaxaMedia = taxaMedia;
		TaxaFimDoDia = taxaFimDoDia;
		this.datamodificacao = datamodificacao;
	}

	public int getTaxaCambioID() {
		return TaxaCambioID;
	}

	public void setTaxaCambioID(int taxaCambioID) {
		TaxaCambioID = taxaCambioID;
	}

	public Date getDataTaxaCambio() {
		return DataTaxaCambio;
	}

	public void setDataTaxaCambio(Date dataTaxaCambio) {
		DataTaxaCambio = dataTaxaCambio;
	}

	public String getLocalCambioCodigo() {
		return LocalCambioCodigo;
	}

	public void setLocalCambioCodigo(String localCambioCodigo) {
		LocalCambioCodigo = localCambioCodigo;
	}

	public String getDestinoCambioCodigo() {
		return DestinoCambioCodigo;
	}

	public void setDestinoCambioCodigo(String destinoCambioCodigo) {
		DestinoCambioCodigo = destinoCambioCodigo;
	}

	public BigDecimal getTaxaMedia() {
		return TaxaMedia;
	}

	public void setTaxaMedia(BigDecimal taxaMedia) {
		TaxaMedia = taxaMedia;
	}

	public BigDecimal getTaxaFimDoDia() {
		return TaxaFimDoDia;
	}

	public void setTaxaFimDoDia(BigDecimal taxaFimDoDia) {
		TaxaFimDoDia = taxaFimDoDia;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataTaxaCambio == null) ? 0 : DataTaxaCambio.hashCode());
		result = prime * result + ((DestinoCambioCodigo == null) ? 0 : DestinoCambioCodigo.hashCode());
		result = prime * result + ((LocalCambioCodigo == null) ? 0 : LocalCambioCodigo.hashCode());
		result = prime * result + TaxaCambioID;
		result = prime * result + ((TaxaFimDoDia == null) ? 0 : TaxaFimDoDia.hashCode());
		result = prime * result + ((TaxaMedia == null) ? 0 : TaxaMedia.hashCode());
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
		TipoCambio other = (TipoCambio) obj;
		if (DataTaxaCambio == null) {
			if (other.DataTaxaCambio != null)
				return false;
		} else if (!DataTaxaCambio.equals(other.DataTaxaCambio))
			return false;
		if (DestinoCambioCodigo == null) {
			if (other.DestinoCambioCodigo != null)
				return false;
		} else if (!DestinoCambioCodigo.equals(other.DestinoCambioCodigo))
			return false;
		if (LocalCambioCodigo == null) {
			if (other.LocalCambioCodigo != null)
				return false;
		} else if (!LocalCambioCodigo.equals(other.LocalCambioCodigo))
			return false;
		if (TaxaCambioID != other.TaxaCambioID)
			return false;
		if (TaxaFimDoDia == null) {
			if (other.TaxaFimDoDia != null)
				return false;
		} else if (!TaxaFimDoDia.equals(other.TaxaFimDoDia))
			return false;
		if (TaxaMedia == null) {
			if (other.TaxaMedia != null)
				return false;
		} else if (!TaxaMedia.equals(other.TaxaMedia))
			return false;
		if (datamodificacao == null) {
			if (other.datamodificacao != null)
				return false;
		} else if (!datamodificacao.equals(other.datamodificacao))
			return false;
		return true;
	}
	
	
	
}
