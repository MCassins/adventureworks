package br.edu.up.jpa;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.CabecalhoOrdemVendas;
import br.edu.up.jpa.dominio.CartaoCredito;
import br.edu.up.jpa.dominio.Cliente;
import br.edu.up.jpa.dominio.PessoaVenda;
import br.edu.up.jpa.dominio.TerritorioVendas;
import br.edu.up.jpa.dominio.TipoCambio;
import br.edu.up.jpa.repository.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class CabecalhoOrdemVendasTest {
 
	
	@Autowired
	CabecalhoOrdemVendasRepository CabecalhoOrdemVendasRepository;
	
	@Test
	public void contextLoads() throws ParseException  {
          //ERRO
		System.out.println("\n*************Insert Categoria*************");
		String dataString = "27/09/1993";
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date(fmt.parse(dataString).getTime());
		TerritorioVendas t =  new TerritorioVendas();
		TipoCambio tcambio = new TipoCambio();
		PessoaVenda p = new PessoaVenda();
		CartaoCredito ca = new CartaoCredito();
		Cliente cli = new Cliente();
		t.setTerritorioID(1);
		tcambio.setTaxaCambioID(2);
		p.setPessoaVendaID(1);
		ca.setCartaoCreditoID(1);
	    cli.setClienteID(1);
		
		
		CabecalhoOrdemVendasRepository.save(new CabecalhoOrdemVendas(t , tcambio , p , ca, cli , data , data , data , 1 , data));
		CabecalhoOrdemVendasRepository.save(new CabecalhoOrdemVendas(t , tcambio , p , ca, cli , data , data , data , 3 , data));
		CabecalhoOrdemVendasRepository.save(new CabecalhoOrdemVendas(t , tcambio , p , ca, cli , data , data , data , 4 , data));
		
		
	}
}
