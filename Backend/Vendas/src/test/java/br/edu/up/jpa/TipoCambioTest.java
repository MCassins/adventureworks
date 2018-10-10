package br.edu.up.jpa;
import java.math.BigDecimal;
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

import br.edu.up.jpa.dominio.TipoCambio;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class TipoCambioTest {
	 @Autowired
	 TipoCambioRepository TipoCambioRepository;
		@Test
		public void contextLoads() throws ParseException  {
			
			System.out.println("\n*************Insert Categoria*************");
			String dataString = "27/09/1993";
			DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(fmt.parse(dataString).getTime());
			BigDecimal big1 = new BigDecimal("0.1");
            BigDecimal big2 = new BigDecimal("0.2");
			TipoCambioRepository.save(new TipoCambio(data , "RUSSIA" , "BRASIL" , big1  , big2 , data));
			TipoCambioRepository.save(new TipoCambio(data , "EUA", "COREIA DO NORTE" , big1, big2 , data));
			TipoCambioRepository.save(new TipoCambio(data , "CHINA", "COREIA DO SUL" , big1, big2 , data));
			
			
			System.out.println("\n*************FindAll Categoria*************");
				List<TipoCambio> tipocambio = new ArrayList<TipoCambio>();
				tipocambio = (List<TipoCambio>) TipoCambioRepository.findAll();
				for(TipoCambio cc : tipocambio) {
				System.out.println(cc.DataTaxaCambio + "  "+ cc.LocalCambioCodigo + "  "+ cc.DestinoCambioCodigo + "  " + cc.TaxaFimDoDia + "  " + cc.TaxaFimDoDia + "  " + cc.getDatamodificacao());
				}
		}
}
