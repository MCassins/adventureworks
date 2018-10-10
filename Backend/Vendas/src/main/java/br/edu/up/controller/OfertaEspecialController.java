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
@RequestMapping("/ofertaespecial")
public class OfertaEspecialController {

	@Autowired
    private OfertaEspecialRepository repository;

    @PostMapping
    public OfertaEspecial adicionar(@Valid @RequestBody OfertaEspecial ofertaespecial) {
        return repository.save(ofertaespecial);
    }

    @GetMapping
    public List<OfertaEspecial> listar() {
        return (List<OfertaEspecial>) repository.findAll();
    }

    @GetMapping("/{id}") // /ofertaespecial/{$id}
    public ResponseEntity<Optional<OfertaEspecial>> buscar(@PathVariable int id) {
        Optional<OfertaEspecial> ofertaespecial  = repository.findById(id);

        if(ofertaespecial == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(ofertaespecial);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OfertaEspecial> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody OfertaEspecial ofertaespecial) {

    	OfertaEspecial ofertaespecialExistente = repository.findById(id).get();

        if(ofertaespecialExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(ofertaespecial, ofertaespecialExistente, "OfertaEspecialID");
        ofertaespecial = repository.save(ofertaespecialExistente);

        return ResponseEntity.ok(ofertaespecial);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	OfertaEspecial ofertaespecial = repository.findById(id).get();

        if(ofertaespecial == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(ofertaespecial);

        return ResponseEntity.noContent().build();
    }
}
