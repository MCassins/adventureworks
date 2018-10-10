package br.edu.up.jpa.ws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.edu.up.jpa.dominio.RazaoOrdemVendasCabecalho;

@Component
public class WsCompras {

	private final RestTemplate rest = new RestTemplate();
	private final String srvCompras = "http://localhost:8081/compras";

	public RazaoOrdemVendasCabecalho buscarProdutoPorId(Long MetodoEnvioID) {
		Map<String, Long> params = new HashMap<>();
		params.put("id", MetodoEnvioID);
		return rest.getForObject(srvCompras + "/{id}?projection=razaoordemvendas", RazaoOrdemVendasCabecalho.class, params);
	}
}
