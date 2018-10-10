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

import br.edu.up.jpa.dominio.CarrinhoCompras;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class CarrinhoComprasTest {
    @Autowired
    CarrinhoComprasRepository CarrinhoComprasRepository;
	@Test
	public void contextLoads() throws ParseException  {
		System.out.println("\n*************Insert Categoria*************");
		String dataString = "27/09/1993";
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date(fmt.parse(dataString).getTime());
		CarrinhoComprasRepository.save(new CarrinhoCompras("AAA111", 999, 1 , data , data));
		CarrinhoComprasRepository.save(new CarrinhoCompras("BBB111", 666, 2 , data , data));
		CarrinhoComprasRepository.save(new CarrinhoCompras("CCC111", 333, 3 , data , data));
		
		
		System.out.println("\n*************FindAll Categoria*************");
			List<CarrinhoCompras> carrinhocompras = new ArrayList<CarrinhoCompras>();
			carrinhocompras = (List<CarrinhoCompras>) CarrinhoComprasRepository.findAll();
			for(CarrinhoCompras cc : carrinhocompras) {
			System.out.println(cc.CarrinhoCompraID +  "  "+ cc.Quantidade + "  "+ cc.ProdutoID + "  " + cc.DataCriacao + " " + cc.getDatamodificacao());
			}

	}
}
