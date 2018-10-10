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
@RequestMapping("/loja")
public class LojaController {

	@Autowired
    private LojaRepository repository;

    @PostMapping
    public Loja adicionar(@Valid @RequestBody Loja loja) {
        return repository.save(loja);
    }

    @GetMapping
    public List<Loja> listar() {
        return (List<Loja>) repository.findAll();
    }

    @GetMapping("/{id}") // /loja/{$id}
    public ResponseEntity<Optional<Loja>> buscar(@PathVariable int id) {
        Optional<Loja> loja  = repository.findById(id);

        if(loja == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(loja);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Loja> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody Loja loja) {

    	Loja lojaExistente = repository.findById(id).get();

        if(lojaExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(loja, lojaExistente, "LojaID");
        loja = repository.save(lojaExistente);

        return ResponseEntity.ok(loja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	Loja loja = repository.findById(id).get();

        if(loja == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(loja);

        return ResponseEntity.noContent().build();
    }

}
