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
@RequestMapping("/cartaocreditopessoa")
public class CartaoCreditoPessoaController {

	@Autowired
    private CartaoCreditoPessoaRepository repository;

    @PostMapping
    public CartaoCreditoPessoa adicionar(@Valid @RequestBody CartaoCreditoPessoa cartaocreditopessoa) {
        return repository.save(cartaocreditopessoa);
    }

    @GetMapping
    public List<CartaoCreditoPessoa> listar() {
        return (List<CartaoCreditoPessoa>) repository.findAll();
    }

    @GetMapping("/{id}") // /cartaocreditopessoa/{$id}
    public ResponseEntity<Optional<CartaoCreditoPessoa>> buscar(@PathVariable int id) {
        Optional<CartaoCreditoPessoa> cartaocreditopessoa  = repository.findById(id);

        if(cartaocreditopessoa == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(cartaocreditopessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartaoCreditoPessoa> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody CartaoCreditoPessoa cartaocreditopessoa) {

    	CartaoCreditoPessoa cartaocreditopessoaExistente = repository.findById(id).get();

        if(cartaocreditopessoaExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(cartaocreditopessoa, cartaocreditopessoaExistente, "BusinessEntityID");
        cartaocreditopessoa = repository.save(cartaocreditopessoaExistente);

        return ResponseEntity.ok(cartaocreditopessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	CartaoCreditoPessoa cartaocreditopessoa = repository.findById(id).get();

        if(cartaocreditopessoa == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(cartaocreditopessoa);

        return ResponseEntity.noContent().build();
    }


}
