package br.edu.up.jpa.ws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.edu.up.jpa.dominio.PessoaVenda;

@Component
public class WsVendedor {

	private final RestTemplate rest = new RestTemplate();
	private final String srvEmpregado = "http://localhost:8081/empregados";

	public PessoaVenda buscarProdutoPorId(Long PessoaVendaID) {
		Map<String, Long> params = new HashMap<>();
		params.put("id", PessoaVendaID);
		return rest.getForObject(srvEmpregado + "/{id}?projection=pessoavenda", PessoaVenda.class, params);
	}
}
