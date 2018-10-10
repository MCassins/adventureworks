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
@RequestMapping("/razaovendas")
public class RazaoVendasController {

	@Autowired
    private RazaoVendasRepository repository;

    @PostMapping
    public RazaoVendas adicionar(@Valid @RequestBody RazaoVendas razaovendas) {
        return repository.save(razaovendas);
    }

    @GetMapping
    public List<RazaoVendas> listar() {
        return (List<RazaoVendas>) repository.findAll();
    }

    @GetMapping("/{id}") // /razaovendas/{$id}
    public ResponseEntity<Optional<RazaoVendas>> buscar(@PathVariable int id) {
        Optional<RazaoVendas> razaovendas  = repository.findById(id);

        if(razaovendas == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(razaovendas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RazaoVendas> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody RazaoVendas razaovendas) {

    	RazaoVendas razaovendasExistente = repository.findById(id).get();

        if(razaovendasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(razaovendas, razaovendasExistente, "RazaoVendasID");
        razaovendas = repository.save(razaovendasExistente);

        return ResponseEntity.ok(razaovendas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	RazaoVendas razaovendas = repository.findById(id).get();

        if(razaovendas == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(razaovendas);

        return ResponseEntity.noContent().build();
    }


}
