package br.edu.up.jpa.ws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.edu.up.jpa.dominio.CarrinhoCompras;

@Component
public class WsProdutos {
	
	private final RestTemplate rest = new RestTemplate();
	private final String srvProdutos = "http://localhost:8081/produtos";

	public CarrinhoCompras buscarProdutoPorId(Long ProdutoID) {
		Map<String, Long> params = new HashMap<>();
		params.put("id", ProdutoID);
		return rest.getForObject(srvProdutos + "/{id}?projection=carrinhocompras", CarrinhoCompras.class, params);
	}
}
