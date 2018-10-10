package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "historicovendaspessoas", path = "historicovendaspessoas", excerptProjection = HistoricoCotasVendasPessoas.class)
public interface HistoricoCotasVendasPessoasRepository extends  CrudRepository<HistoricoCotasVendasPessoas , Integer> {

}
