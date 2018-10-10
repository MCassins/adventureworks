package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "historicoterritorio", path = "historicoterritorio", excerptProjection = HistoricoTerritorioVendas.class)
public interface HistoricoTerritorioVendasRepository extends  CrudRepository<HistoricoTerritorioVendas , Integer> {

}
