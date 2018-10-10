package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "ofertaespecialproduto", path = "ofertaespecialproduto", excerptProjection = OfertaEspecialProduto.class)
public interface OfertaEspecialProdutoRepository extends  CrudRepository<OfertaEspecialProduto , Integer> {

}
