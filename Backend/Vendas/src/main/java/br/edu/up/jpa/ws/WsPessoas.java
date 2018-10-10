package br.edu.up.jpa.ws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.edu.up.jpa.dominio.CartaoCreditoPessoa;
import br.edu.up.jpa.dominio.Cliente;

@Component
public class WsPessoas {

	private final RestTemplate rest = new RestTemplate();
    private final String srvPessoas = "http://localhost:8080/pessoas";
	
	public CartaoCreditoPessoa buscarPessoaCartaoPorId(Long BusinessEntityID) {
		Map<String, Long> params = new HashMap<>();
		params.put("id", BusinessEntityID);
		return rest.getForObject(srvPessoas + "/{id}?projection=cartaocreditopessoa", CartaoCreditoPessoa.class, params);
	}
	
	public Cliente buscarPessoaClientePorId(Long PersonID) {
		Map<String, Long> params = new HashMap<>();
		params.put("id", PersonID);
		return rest.getForObject(srvPessoas + "/{id}?projection=cliente", Cliente.class, params);
	}
	
	
	
	
	}
