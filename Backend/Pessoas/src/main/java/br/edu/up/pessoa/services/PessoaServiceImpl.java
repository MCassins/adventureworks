package br.edu.up.pessoa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.up.pessoa.model.Pessoa;
import br.edu.up.pessoa.repository.PessoaRepository;;

@Service("pessoaServiceImpl")
public class PessoaServiceImpl implements PessoaService {

	@Autowired private PessoaRepository pessoaRepository;
	 
	@Override
	public Iterable<Pessoa> findAll() {
		return this.pessoaRepository.findAll();
	}
	@Override
	public Pessoa save(Pessoa pessoa) {
		return this.pessoaRepository.save(pessoa);
	}
}
