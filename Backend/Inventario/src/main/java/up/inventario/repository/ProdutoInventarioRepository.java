package up.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import up.inventario.dominio.ProdutoInventario;

@RepositoryRestResource(collectionResourceRel = "inventario", path = "inventario", excerptProjection = ProdutoInventario.class)
public interface ProdutoInventarioRepository extends CrudRepository<ProdutoInventario, Integer> {

}


