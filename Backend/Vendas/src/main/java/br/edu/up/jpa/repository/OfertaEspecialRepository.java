package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "ofertaespecial", path = "ofertaespecial", excerptProjection = OfertaEspecial.class)
public interface OfertaEspecialRepository extends  CrudRepository<OfertaEspecial , Integer> {

}
