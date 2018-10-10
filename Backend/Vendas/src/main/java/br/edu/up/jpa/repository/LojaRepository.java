package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.Loja;

@RepositoryRestResource(collectionResourceRel = "loja", path = "loja", excerptProjection = Loja.class)
public interface LojaRepository extends  CrudRepository<Loja , Integer> {

}
