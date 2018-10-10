package up.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import up.inventario.dominio.Localizacao;


@RepositoryRestResource(collectionResourceRel = "localizacao", path = "localizacao", excerptProjection = Localizacao.class)
public interface LocalizacaoRepository extends CrudRepository<Localizacao, Long> {
}
