package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "paisregiao", path = "paisregiao", excerptProjection = PaisRegiao.class)
public interface PaisRegiaoRepository extends  CrudRepository<PaisRegiao , Integer> {

}
