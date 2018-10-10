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
@RequestMapping("/pessoavenda")
public class PessoaVendaController {
	
	@Autowired
    private PessoaVendaRepository repository;

    @PostMapping
    public PessoaVenda adicionar(@Valid @RequestBody PessoaVenda pessoavenda) {
        return repository.save(pessoavenda);
    }

    @GetMapping
    public List<PessoaVenda> listar() {
        return (List<PessoaVenda>) repository.findAll();
    }

    @GetMapping("/{id}") // /pessoavenda/{$id}
    public ResponseEntity<Optional<PessoaVenda>> buscar(@PathVariable int id) {
        Optional<PessoaVenda> pessoavenda  = repository.findById(id);

        if(pessoavenda == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pessoavenda);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaVenda> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody PessoaVenda pessoavenda) {

    	PessoaVenda pessoavendaExistente = repository.findById(id).get();

        if(pessoavendaExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(pessoavenda, pessoavendaExistente, "PessoaVendaID");
        pessoavenda = repository.save(pessoavendaExistente);

        return ResponseEntity.ok(pessoavenda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	PessoaVenda pessoavenda = repository.findById(id).get();

        if(pessoavenda == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(pessoavenda);

        return ResponseEntity.noContent().build();
    }



}
