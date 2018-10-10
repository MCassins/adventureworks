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

import br.edu.up.jpa.dominio.CartaoCredito;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class CartaoCreditoTest {
	 @Autowired
	 CartaoCreditoRepository CartaoCreditoRepository;
		@Test
		public void contextLoads() throws ParseException  {
			System.out.println("\n*************Insert Categoria*************");
			String dataString = "27/09/1993";
			DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date(fmt.parse(dataString).getTime());
			CartaoCreditoRepository.save(new CartaoCredito("VISA", "aaaa", 12 , 2017 , data));
			CartaoCreditoRepository.save(new CartaoCredito("MASTERCARD", "bbbb", 9 , 2015 , data));
			CartaoCreditoRepository.save(new CartaoCredito("HIPERCARD", "cccc", 10 , 2014 , data));
			CartaoCreditoRepository.save(new CartaoCredito("NUBANk", "cccc", 10 , 2020 , data));
			
			System.out.println("\n*************FindAll Categoria*************");
				List<CartaoCredito> CartaoCredito = new ArrayList<CartaoCredito>();
				CartaoCredito = (List<CartaoCredito>) CartaoCreditoRepository.findAll();
				for(CartaoCredito cc : CartaoCredito) {
				System.out.println(cc.getNumeroCartao()+ "  "+ cc.getTipoCartao() + "  " + cc.getVencimentoMes() + " " + cc.getVencimentoAno() + "  " + cc.getDatamodificacao());
				}
		}
}
