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
import br.edu.up.jpa.dominio.PaisRegiao;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class PaisRegiaoTest {
	 @Autowired
	 PaisRegiaoRepository PaisRegiaoRepository;
		@Test
		public void contextLoads() throws ParseException  {
			System.out.println("\n*************Insert Categoria*************");
			String dataString = "27/09/1993";
			DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(fmt.parse(dataString).getTime());
			Moeda moeda = new Moeda();
			moeda.setMoedaID("1");
			moeda.setNomeMoeda("AAA111");
			moeda.setDataHoraModificacao(data);
			PaisRegiaoRepository.save(new PaisRegiao(moeda , "111AAA" , data));
			PaisRegiaoRepository.save(new PaisRegiao(moeda , "111bbb" , data));
			PaisRegiaoRepository.save(new PaisRegiao(moeda , "111bbb" , data));

			
			
			
			System.out.println("\n*************FindAll Categoria*************");
				List<PaisRegiao> PaisRegiao = new ArrayList<PaisRegiao>();
				PaisRegiao = (List<PaisRegiao>) PaisRegiaoRepository.findAll();
				for(PaisRegiao cc : PaisRegiao) {
				System.out.println(cc.getMoedaID() + "  "+ cc.getCodigoMoeda() + "  "+ cc.getDatamodificacao());
				}
		}
}
