package br.edu.up.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.jpa.dominio.*;
import br.edu.up.jpa.repository.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
    private ProdutoRepository repository;

    @PostMapping
    public Produto adicionar(@Valid @RequestBody Produto produto) {
        return repository.save(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return (List<Produto>) repository.findAll();
    }

    @GetMapping("/{id}") // /produto/{$id}
    public ResponseEntity<Optional<Produto>> buscar(@PathVariable int id) {
        Optional<Produto> produto  = repository.findById(id);

        if(produto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody Produto produto) {

    	Produto produtoExistente = repository.findById(id).get();

        if(produtoExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(produto, produtoExistente, "ProdutoID");
        produto = repository.save(produtoExistente);

        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	Produto produto = repository.findById(id).get();

        if(produto == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(produto);

        return ResponseEntity.noContent().build();
    }



}
