package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "cliente", path = "cliente", excerptProjection = Cliente.class)
public interface ClienteRepository extends  CrudRepository<Cliente , Integer> {

}
