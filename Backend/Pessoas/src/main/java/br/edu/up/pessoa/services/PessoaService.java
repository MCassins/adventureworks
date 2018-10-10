package br.edu.up.pessoa.services;

import br.edu.up.pessoa.model.Pessoa;

public interface PessoaService {

	Iterable<Pessoa> findAll();

	Pessoa save(Pessoa pessoa);

}
