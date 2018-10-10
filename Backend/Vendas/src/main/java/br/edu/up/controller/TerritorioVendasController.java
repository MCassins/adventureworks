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
@RequestMapping("/territoriovendas")
public class TerritorioVendasController {

	@Autowired
    private TerritorioVendasRepository repository;

    @PostMapping
    public TerritorioVendas adicionar(@Valid @RequestBody TerritorioVendas territoriovendas) {
        return repository.save(territoriovendas);
    }

    @GetMapping
    public List<TerritorioVendas> listar() {
        return (List<TerritorioVendas>) repository.findAll();
    }

    @GetMapping("/{id}") // /territoriovendas/{$id}
    public ResponseEntity<Optional<TerritorioVendas>> buscar(@PathVariable int id) {
        Optional<TerritorioVendas> territoriovendas  = repository.findById(id);

        if(territoriovendas == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(territoriovendas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TerritorioVendas> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody TerritorioVendas territoriovendas) {

    	TerritorioVendas territoriovendasExistente = repository.findById(id).get();

        if(territoriovendasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(territoriovendas, territoriovendasExistente, "TerritorioID");
        territoriovendas = repository.save(territoriovendasExistente);

        return ResponseEntity.ok(territoriovendas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	TerritorioVendas territoriovendas = repository.findById(id).get();

        if(territoriovendas == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(territoriovendas);

        return ResponseEntity.noContent().build();
    }


}
