package br.edu.up.pessoa.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.pessoa.model.Pessoa;
import br.edu.up.pessoa.services.PessoaService;

@RestController
@RequestMapping(value="/api/pessoas")
public class PessoaApiRestController {
	
	@Autowired @Qualifier("pessoaServiceImpl")
	private PessoaService pessoaService;

	@GetMapping
	public Iterable<Pessoa> findAll() {
		return this.pessoaService.findAll();
	}

	@PostMapping
	public Pessoa save(@RequestBody Pessoa pessoa) {
		return this.pessoaService.save(pessoa);
	}
}
