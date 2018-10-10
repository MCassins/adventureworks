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
@RequestMapping("/moeda")
public class MoedaController {

	@Autowired
    private MoedaRepository repository;

    @PostMapping
    public Moeda adicionar(@Valid @RequestBody Moeda moeda) {
        return repository.save(moeda);
    }

    @GetMapping
    public List<Moeda> listar() {
        return (List<Moeda>) repository.findAll();
    }

    @GetMapping("/{id}") // /moeda/{$id}
    public ResponseEntity<Optional<Moeda>> buscar(@PathVariable int id) {
        Optional<Moeda> moeda  = repository.findById(id);

        if(moeda == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(moeda);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Moeda> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody Moeda moeda) {

    	Moeda moedaExistente = repository.findById(id).get();

        if(moedaExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(moeda, moedaExistente, "MoedaID");
        moeda = repository.save(moedaExistente);

        return ResponseEntity.ok(moeda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	Moeda moeda = repository.findById(id).get();

        if(moeda == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(moeda);

        return ResponseEntity.noContent().build();
    }


}
