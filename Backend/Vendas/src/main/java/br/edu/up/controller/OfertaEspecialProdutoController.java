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
@RequestMapping("/ofertaespecialproduto")
public class OfertaEspecialProdutoController {

	@Autowired
    private OfertaEspecialProdutoRepository repository;

    @PostMapping
    public OfertaEspecialProduto adicionar(@Valid @RequestBody OfertaEspecialProduto ofertaespecialproduto) {
        return repository.save(ofertaespecialproduto);
    }

    @GetMapping
    public List<OfertaEspecialProduto> listar() {
        return (List<OfertaEspecialProduto>) repository.findAll();
    }

    @GetMapping("/{id}") // /ofertaespecialproduto/{$id}
    public ResponseEntity<Optional<OfertaEspecialProduto>> buscar(@PathVariable int id) {
        Optional<OfertaEspecialProduto> ofertaespecialproduto  = repository.findById(id);

        if(ofertaespecialproduto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(ofertaespecialproduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OfertaEspecialProduto> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody OfertaEspecialProduto ofertaespecialproduto) {

    	OfertaEspecialProduto ofertaespecialprodutoExistente = repository.findById(id).get();

        if(ofertaespecialprodutoExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(ofertaespecialproduto, ofertaespecialprodutoExistente, "OfertaEspecialProdutoID");
        ofertaespecialproduto = repository.save(ofertaespecialprodutoExistente);

        return ResponseEntity.ok(ofertaespecialproduto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	OfertaEspecialProduto ofertaespecialproduto = repository.findById(id).get();

        if(ofertaespecialproduto == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(ofertaespecialproduto);

        return ResponseEntity.noContent().build();
    }
}
