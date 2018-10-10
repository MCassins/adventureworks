package up.inventario.resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import up.inventario.dominio.ProdutoInventario;
import up.inventario.repository.ProdutoInventarioRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto-inventario")
public class ProdutoInventarioResource {

    @Autowired
    private ProdutoInventarioRepository produtos;

    @PostMapping
    public ProdutoInventario adicionar(@Valid @RequestBody ProdutoInventario produto) {
        return produtos.save(produto);
    }

    @GetMapping
    public List<ProdutoInventario> listar() {
        return (List<ProdutoInventario>) produtos.findAll();
    }

    @GetMapping("/{id}") // /produto-inventario/{$id}
    public ResponseEntity<Optional<ProdutoInventario>> buscar(@PathVariable int id) {
        Optional<ProdutoInventario> produto  = produtos.findById(id);

        if(produto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoInventario> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody ProdutoInventario produto) {

        ProdutoInventario produtoExistente = produtos.findById(id).get();

        if(produtoExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(produto, produtoExistente, "produtoID");
        produto = produtos.save(produtoExistente);

        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
        ProdutoInventario produto = produtos.findById(id).get();

        if(produto == null) {
            return ResponseEntity.notFound().build();
        }

        produtos.delete(produto);

        return ResponseEntity.noContent().build();
    }
}
