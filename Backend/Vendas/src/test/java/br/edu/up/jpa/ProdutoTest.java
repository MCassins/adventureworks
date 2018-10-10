package br.edu.up.jpa;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.Produto;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class ProdutoTest {
	 @Autowired
	 ProdutoRepository ProdutoRepository;
		@Test
		public void contextLoads() throws ParseException  {
			System.out.println("\n*************Insert Categoria*************");
			String dataString = "27/09/1993";
			DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(fmt.parse(dataString).getTime());
			ProdutoRepository.save(new Produto("Geladeira", "AAA123" , data));
			ProdutoRepository.save(new Produto("Fogao", "BBB123" , data));
			ProdutoRepository.save(new Produto("Bicicleta", "CCC123" , data ));
			
			
			System.out.println("\n*************FindAll Categoria*************");
				List<Produto> produto = new ArrayList<Produto>();
				produto = (List<Produto>) ProdutoRepository.findAll();
				for(Produto cc : produto) {
				System.out.println(cc.getNomeProduto()+ "  "+ cc.getProdutoNumero() + "  "+ cc.getDatamodificacao());
				}
		}
}
