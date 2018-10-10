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

import br.edu.up.jpa.dominio.RazaoVendas;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class RazaoVendasTest {
	 @Autowired
	 RazaoVendasRepository RazaoVendasRepository;
		@Test
		public void contextLoads() throws ParseException  {
			System.out.println("\n*************Insert Categoria*************");
			String dataString = "27/09/1993";
			DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(fmt.parse(dataString).getTime());
			RazaoVendasRepository.save(new RazaoVendas("MotivoA" , "RazaoA" , data));
			RazaoVendasRepository.save(new RazaoVendas("MotivoB" , "RazaoB", data));
			RazaoVendasRepository.save(new RazaoVendas("MotivoC" , "RazaoC" , data));
			
			
			System.out.println("\n*************FindAll Categoria*************");
				List<RazaoVendas> razaovendas = new ArrayList<RazaoVendas>();
				razaovendas = (List<RazaoVendas>) RazaoVendasRepository.findAll();
				for(RazaoVendas cc : razaovendas) {
				System.out.println(cc.getNome()+ "  "+ cc.getNome() + " " + cc.getTipoRazao() + "  "+ cc.getDatamodificacao());
				}
		}
}
