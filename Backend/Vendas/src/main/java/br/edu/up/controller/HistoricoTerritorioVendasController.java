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
@RequestMapping("/historicoterritorio")
public class HistoricoTerritorioVendasController {

	@Autowired
    private HistoricoTerritorioVendasRepository repository;

    @PostMapping
    public HistoricoTerritorioVendas adicionar(@Valid @RequestBody HistoricoTerritorioVendas historicoterritorio) {
    	return repository.save(historicoterritorio);
    }

    @GetMapping
    public List<HistoricoTerritorioVendas> listar() {
        return (List<HistoricoTerritorioVendas>) repository.findAll();
    }

    @GetMapping("/{id}") // /historicoterritorio/{$id}
    public ResponseEntity<Optional<HistoricoTerritorioVendas>> buscar(@PathVariable int id) {
        Optional<HistoricoTerritorioVendas> historicoterritorio  = repository.findById(id);

        if(historicoterritorio == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(historicoterritorio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HistoricoTerritorioVendas> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody HistoricoTerritorioVendas historicoterritorio) {

    	HistoricoTerritorioVendas historicoterritorioExistente = repository.findById(id).get();

        if(historicoterritorioExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(historicoterritorio, historicoterritorioExistente, "IDComposto");
        historicoterritorio = repository.save(historicoterritorioExistente);

        return ResponseEntity.ok(historicoterritorio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	HistoricoTerritorioVendas historicoterritorio = repository.findById(id).get();

        if(historicoterritorio == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(historicoterritorio);

        return ResponseEntity.noContent().build();
    }

}
