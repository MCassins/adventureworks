package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "territoriovendas", path = "territoriovendas", excerptProjection = TerritorioVendas.class)
public interface TerritorioVendasRepository extends  CrudRepository<TerritorioVendas , Integer> {

}
