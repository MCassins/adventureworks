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


import br.edu.up.jpa.dominio.CartaoCredito;
import br.edu.up.jpa.repository.CartaoCreditoRepository;


@RestController
@RequestMapping("/cartaocredito")
public class CartaoCreditoController {

		@Autowired
	    private CartaoCreditoRepository repository;

	    @PostMapping
	    public CartaoCredito adicionar(@Valid @RequestBody CartaoCredito cartaocredito) {
	        return repository.save(cartaocredito);
	    }

	    @GetMapping
	    public List<CartaoCredito> listar() {
	        return (List<CartaoCredito>) repository.findAll();
	    }

	    @GetMapping("/{id}") // /cartaocredito/{$id}
	    public ResponseEntity<Optional<CartaoCredito>> buscar(@PathVariable int id) {
	        Optional<CartaoCredito> cartaocredito  = repository.findById(id);

	        if(cartaocredito == null) {
	            return ResponseEntity.notFound().build();
	        }

	        return ResponseEntity.ok(cartaocredito);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<CartaoCredito> atualizar(@PathVariable int id,
	                                                       @Valid @RequestBody CartaoCredito cartaocredito) {

	    	CartaoCredito cartaoExistente = repository.findById(id).get();

	        if(cartaoExistente == null) {
	            return ResponseEntity.notFound().build();
	        }

	        BeanUtils.copyProperties(cartaocredito, cartaoExistente, "CartaoCreditoID");
	        cartaocredito = repository.save(cartaoExistente);

	        return ResponseEntity.ok(cartaocredito);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> remover(@PathVariable int id) {
	    	CartaoCredito cartaocredito = repository.findById(id).get();

	        if(cartaocredito == null) {
	            return ResponseEntity.notFound().build();
	        }

	        repository.delete(cartaocredito);

	        return ResponseEntity.noContent().build();
	    }

	
}
