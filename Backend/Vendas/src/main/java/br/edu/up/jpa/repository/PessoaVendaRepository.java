package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.PessoaVenda;

@RepositoryRestResource(collectionResourceRel = "pessoavenda", path = "pessoavenda", excerptProjection = PessoaVenda.class)
public interface PessoaVendaRepository extends  CrudRepository<PessoaVenda , Integer>{

}
