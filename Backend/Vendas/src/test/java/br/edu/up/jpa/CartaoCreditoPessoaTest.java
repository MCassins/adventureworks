package br.edu.up.jpa;
import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.edu.up.jpa.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Vendasv3.class)
public class CartaoCreditoPessoaTest {
	 @Autowired
	 CartaoCreditoPessoaRepository CartaoCreditoPessoaRepository;
		@Test
		public void contextLoads() throws ParseException  {
		}
}
