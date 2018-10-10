package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "cartaocreditopessoa", path = "cartaocreditopessoa", excerptProjection = CartaoCreditoPessoa.class)
public interface CartaoCreditoPessoaRepository extends  CrudRepository<CartaoCreditoPessoa , Integer>{

}
