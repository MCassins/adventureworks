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
@RequestMapping("/razaoordemvendas")
public class RazaoOrdemVendasCabecalhoController {

	@Autowired
    private RazaoOrdemVendasCabecalhoRepository repository;

    @PostMapping
    public RazaoOrdemVendasCabecalho adicionar(@Valid @RequestBody RazaoOrdemVendasCabecalho razaoordemvendas) {
        return repository.save(razaoordemvendas);
    }

    @GetMapping
    public List<RazaoOrdemVendasCabecalho> listar() {
        return (List<RazaoOrdemVendasCabecalho>) repository.findAll();
    }

    @GetMapping("/{id}") // /razaoordemvendas/{$id}
    public ResponseEntity<Optional<RazaoOrdemVendasCabecalho>> buscar(@PathVariable int id) {
        Optional<RazaoOrdemVendasCabecalho> razaoordemvendas  = repository.findById(id);

        if(razaoordemvendas == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(razaoordemvendas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RazaoOrdemVendasCabecalho> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody RazaoOrdemVendasCabecalho razaoordemvendas) {

    	RazaoOrdemVendasCabecalho razaoordemvendasExistente = repository.findById(id).get();

        if(razaoordemvendasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(razaoordemvendas, razaoordemvendasExistente, "RazaoOrdemVendasCabecalhoID");
        razaoordemvendas = repository.save(razaoordemvendasExistente);

        return ResponseEntity.ok(razaoordemvendas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	RazaoOrdemVendasCabecalho razaoordemvendas = repository.findById(id).get();

        if(razaoordemvendas == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(razaoordemvendas);

        return ResponseEntity.noContent().build();
    }

}
