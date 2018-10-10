package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "cabecalhoordemvendas", path = "cabecalhoordemvendas", excerptProjection = CabecalhoOrdemVendas.class)
public interface CabecalhoOrdemVendasRepository extends  CrudRepository<CabecalhoOrdemVendas , Integer>{

	
}
