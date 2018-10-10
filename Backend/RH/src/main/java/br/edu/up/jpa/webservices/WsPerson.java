/*package br.edu.up.jpa.webservices;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;
import br.edu.up.jpa.dominio.Person;

public class WsPerson {
	private final RestTemplate rest = new RestTemplate();
    private final String srvPessoas = "http://localhost:8080/pessoas";
	
	public Person buscarClientePorId(Long idCliente) {
		Map<String, Long> params = new HashMap<>();
		Long idPessoa = null;
		params.put("id", idPessoa);
		return rest.getForObject(srvPessoas + "/{id}?projection=pessoa", Person.class, params);
	}
	
	public Person buscarClientePorNome(String nome) {
		Map<String, String> params = new HashMap<>();
		params.put("nome", nome);
		return rest.getForObject(srvPessoas + "/search/findByNome?nome={nome}&projection=pessoa", Person.class, params);
	}
}*/
