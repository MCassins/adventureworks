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
@RequestMapping("/historicovendaspessoas")
public class HistoricoCotasVendasPessoasController {
	
	@Autowired
    private HistoricoCotasVendasPessoasRepository repository;

    @PostMapping
    public HistoricoCotasVendasPessoas adicionar(@Valid @RequestBody HistoricoCotasVendasPessoas historicovendaspessoas) {
        return repository.save(historicovendaspessoas);
    }

    @GetMapping
    public List<HistoricoCotasVendasPessoas> listar() {
        return (List<HistoricoCotasVendasPessoas>) repository.findAll();
    }

    @GetMapping("/{id}") // /historicovendaspessoas/{$id}
    public ResponseEntity<Optional<HistoricoCotasVendasPessoas>> buscar(@PathVariable int id) {
        Optional<HistoricoCotasVendasPessoas> historicovendaspessoas  = repository.findById(id);

        if(historicovendaspessoas == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(historicovendaspessoas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HistoricoCotasVendasPessoas> atualizar(@PathVariable int id,
                                                       @Valid @RequestBody HistoricoCotasVendasPessoas historicovendaspessoas) {

    	HistoricoCotasVendasPessoas historicovendaspessoasExistente = repository.findById(id).get();

        if(historicovendaspessoasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(historicovendaspessoas, historicovendaspessoasExistente, "HistorioCotasVendasPessoasId");
        historicovendaspessoas = repository.save(historicovendaspessoasExistente);

        return ResponseEntity.ok(historicovendaspessoas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
    	HistoricoCotasVendasPessoas historicovendaspessoasExistente = repository.findById(id).get();

        if(historicovendaspessoasExistente == null) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(historicovendaspessoasExistente);

        return ResponseEntity.noContent().build();
    }

}
