package br.edu.up.pessoa.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.pessoa.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
	

}
