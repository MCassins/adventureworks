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
@RequestMapping("/tipocambio")
public class TipoCambioController {

	@Autowired
    private TipoCambioRepository repository;

    @PostMapping
    public TipoCambio adicionar(@Valid @RequestBody TipoCambio tipocambio) {
        return repository.save(tipocambio);
    }

    @GetMapping
    public List<TipoCambio> listar() {
        return (List<TipoCambio>) repository.findAll();
    }

    @GetMapping("/{id}") // /tipocambio/{$id}
    public ResponseEntity<Optional<TipoCambio>> buscar(@PathVariable int id) {
        Optional<TipoCambio> tipocambio  = repository.findById(id);

        if(tipocambio == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(tipocambio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoCambio> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody TipoCambio tipocambio) {

    	TipoCambio tipocambioExistente = repository.findById(id).get();

        if(tipocambioExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(tipocambio, tipocambioExistente, "TaxaCambioID");
        tipocambio = repository.save(tipocambioExistente);

        return ResponseEntity.ok(tipocambio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	TipoCambio tipocambio = repository.findById(id).get();

        if(tipocambio == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(tipocambio);

        return ResponseEntity.noContent().build();
    }


}
