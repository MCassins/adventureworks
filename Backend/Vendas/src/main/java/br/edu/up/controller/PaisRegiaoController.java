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
@RequestMapping("/paisregiao")
public class PaisRegiaoController {

	@Autowired
    private PaisRegiaoRepository repository;

    @PostMapping
    public PaisRegiao adicionar(@Valid @RequestBody PaisRegiao paisregiao) {
        return repository.save(paisregiao);
    }

    @GetMapping
    public List<PaisRegiao> listar() {
        return (List<PaisRegiao>) repository.findAll();
    }

    @GetMapping("/{id}") // /paisregiao/{$id}
    public ResponseEntity<Optional<PaisRegiao>> buscar(@PathVariable int id) {
        Optional<PaisRegiao> paisregiao  = repository.findById(id);

        if(paisregiao == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(paisregiao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaisRegiao> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody PaisRegiao paisregiao) {

    	PaisRegiao paisregiaoExistente = repository.findById(id).get();

        if(paisregiaoExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(paisregiao, paisregiaoExistente, "PaisRegiaoID");
        paisregiao = repository.save(paisregiaoExistente);

        return ResponseEntity.ok(paisregiao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	PaisRegiao paisregiao = repository.findById(id).get();

        if(paisregiao == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(paisregiao);

        return ResponseEntity.noContent().build();
    }

}
