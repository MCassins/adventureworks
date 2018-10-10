package up.inventario.dominio;

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
@Table(name="localizacao")
public class Localizacao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long LocalizacaoID;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "taxadecusto", nullable = true)
	private double taxadecusto;
	
	@Column(name = "disponibilidade", nullable = true)
	private int disponibilidade;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datamodificacao", nullable = true)
	private Date datamodificacao;

	public long getLocalizacaoID() {
		return LocalizacaoID;
	}

	public void setLocalizacaoID(int localizacaoID) {
		LocalizacaoID = localizacaoID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTaxadecusto() {
		return taxadecusto;
	}

	public void setTaxadecusto(double taxadecusto) {
		this.taxadecusto = taxadecusto;
	}

	public int getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}


	public void setLocalizacaoID(Long id) {
	}
}
