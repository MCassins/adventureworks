package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.Produto;



@RepositoryRestResource(collectionResourceRel = "produto", path = "produto", excerptProjection = Produto.class)
public interface ProdutoRepository extends  CrudRepository<Produto , Integer>{

}
