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
@RequestMapping("/carrinhocompras")
public class CarrinhoComprasController {

	@Autowired
    private CarrinhoComprasRepository repository;

    @PostMapping
    public CarrinhoCompras adicionar(@Valid @RequestBody CarrinhoCompras carrinhocompras) {
        return repository.save(carrinhocompras);
    }

    @GetMapping
    public List<CarrinhoCompras> listar() {
        return (List<CarrinhoCompras>) repository.findAll();
    }

    @GetMapping("/{id}") // /carrinhocompras/{$id}
    public ResponseEntity<Optional<CarrinhoCompras>> buscar(@PathVariable int id) {
        Optional<CarrinhoCompras> carrinhocompras  = repository.findById(id);

        if(carrinhocompras == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(carrinhocompras);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarrinhoCompras> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody CarrinhoCompras carrinhocompras) {

    	CarrinhoCompras carrinhocomprasExistente = repository.findById(id).get();

        if(carrinhocomprasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(carrinhocompras, carrinhocomprasExistente, "CarrinhoCompraID");
        carrinhocompras = repository.save(carrinhocomprasExistente);

        return ResponseEntity.ok(carrinhocompras);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	CarrinhoCompras carrinhocompras = repository.findById(id).get();

        if(carrinhocompras == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(carrinhocompras);

        return ResponseEntity.noContent().build();
    }

}
