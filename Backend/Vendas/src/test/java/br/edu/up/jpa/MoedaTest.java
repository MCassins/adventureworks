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

import br.edu.up.jpa.dominio.Moeda;
import br.edu.up.jpa.repository.MoedaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class MoedaTest {
	 @Autowired
	 MoedaRepository MoedaRepository;
		@Test
		public void contextLoads() throws ParseException  {
			
			System.out.println("\n*************Insert Categoria*************");
			String dataString = "27/09/1993";
			DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(fmt.parse(dataString).getTime());
			MoedaRepository.save(new Moeda("EU","EURO" , data));
			MoedaRepository.save(new Moeda("NA", "DOLAR" , data));
			MoedaRepository.save(new Moeda("BR", "REAL" , data));
			
			
			System.out.println("\n*************FindAll Categoria*************");
				List<Moeda> moeda = new ArrayList<Moeda>();
				moeda = (List<Moeda>) MoedaRepository.findAll();
				for(Moeda cc : moeda) {
				System.out.println(cc.getMoedaID()+ "  "+ cc.getNomeMoeda() + "  "+ cc.getDataHoraModificacao());
				}

		}
}
