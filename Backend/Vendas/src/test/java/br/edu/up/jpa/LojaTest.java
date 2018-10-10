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

import br.edu.up.jpa.dominio.Loja;
import br.edu.up.jpa.repository.LojaRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class LojaTest {
	
	@Autowired
	LojaRepository LojaRepository;
	
	@Test
	public void contextLoads() throws ParseException {

		System.out.println("\n*************Insert Categoria*************");
		String dataString = "27/09/1993";
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date(fmt.parse(dataString).getTime());
		LojaRepository.save(new Loja("Ricardo", 2, "fbyvbehwevb", "jbvwvhwebV", data));
		LojaRepository.save(new Loja("Bruno", 2, "xd", "xd", data));
		LojaRepository.save(new Loja("Dinossauro", 2, "haha", "haha", data));
		
		
		System.out.println("\n*************FindAll Categoria*************");
			List<Loja> loja = new ArrayList<Loja>();
			loja = (List<Loja>) LojaRepository.findAll();
			for(Loja cc : loja) {
			System.out.println(cc.getNome()+ "  "+ cc.getRowguild() + "  "+ cc.getDatamodificacao());
			}

	}
}
