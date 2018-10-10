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
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;

	@PostMapping
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
		return repository.save(cliente);
	}

	@GetMapping
	public List<Cliente> listar() {
		return (List<Cliente>) repository.findAll();
	}

	@GetMapping("/{id}") // /cliente/{$id}
	public ResponseEntity<Optional<Cliente>> buscar(@PathVariable int id) {
		Optional<Cliente> cliente  = repository.findById(id);

		if(cliente == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(cliente);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable int id,
			@Valid @RequestBody Cliente cliente) {

		Cliente clienteExistente = repository.findById(id).get();

		if(clienteExistente == null) {
			return ResponseEntity.notFound().build();
		}

		BeanUtils.copyProperties(cliente, clienteExistente, "IDComposto");
		cliente = repository.save(clienteExistente);

		return ResponseEntity.ok(cliente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable int id) {
		Cliente cliente = repository.findById(id).get();

		if(cliente == null) {
			return ResponseEntity.notFound().build();
		}

		repository.delete(cliente);

		return ResponseEntity.noContent().build();
	}

}
