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
import br.edu.up.jpa.repository.CabecalhoOrdemVendasRepository;


@RestController
@RequestMapping("/cabecalhoordemvendas")
public class CabecalhoOrdemVendasController {

	@Autowired
    private CabecalhoOrdemVendasRepository repository;

    @PostMapping
    public CabecalhoOrdemVendas adicionar(@Valid @RequestBody CabecalhoOrdemVendas cabecalhoordemvendas) {
        return repository.save(cabecalhoordemvendas);
    }

    @GetMapping
    public List<CabecalhoOrdemVendas> listar() {
        return (List<CabecalhoOrdemVendas>) repository.findAll();
    }

    @GetMapping("/{id}") // /cabecalhoordemvendas/{$id}
    public ResponseEntity<Optional<CabecalhoOrdemVendas>> buscar(@PathVariable int id) {
        Optional<CabecalhoOrdemVendas> cabecalhoordemvendas  = repository.findById(id);

        if(cabecalhoordemvendas == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(cabecalhoordemvendas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CabecalhoOrdemVendas> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody CabecalhoOrdemVendas cabecalhoordemvendas) {

    	CabecalhoOrdemVendas cabecalhoordemvendasExistente = repository.findById(id).get();

        if(cabecalhoordemvendasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(cabecalhoordemvendas, cabecalhoordemvendasExistente, "CabecalhoOrdemVendasID");
        cabecalhoordemvendas = repository.save(cabecalhoordemvendasExistente);

        return ResponseEntity.ok(cabecalhoordemvendas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	CabecalhoOrdemVendas cabecalhoordemvendas = repository.findById(id).get();

        if(cabecalhoordemvendas == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(cabecalhoordemvendas);

        return ResponseEntity.noContent().build();
    }

}
