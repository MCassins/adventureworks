package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "razaovendas", path = "razaovendas", excerptProjection = RazaoVendas.class)
public interface RazaoVendasRepository extends  CrudRepository<RazaoVendas , Integer> {

}
