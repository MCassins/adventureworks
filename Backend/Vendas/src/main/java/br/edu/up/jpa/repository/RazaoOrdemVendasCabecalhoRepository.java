package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "razaoordemvendas", path = "razaoordemvendas", excerptProjection = RazaoOrdemVendasCabecalho.class)
public interface RazaoOrdemVendasCabecalhoRepository extends  CrudRepository<RazaoOrdemVendasCabecalho , Integer> {

}
