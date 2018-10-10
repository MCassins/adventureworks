package up.inventario.resource;

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

import up.inventario.dominio.Localizacao;
import up.inventario.repository.LocalizacaoRepository;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoResource {

    @Autowired
    private LocalizacaoRepository localizacoes;

    @PostMapping
    public Localizacao adicionar(@Valid @RequestBody Localizacao localizacao) {
        return localizacoes.save(localizacao);
    }

    @GetMapping
    public List<Localizacao> listar(){
        return (List<Localizacao>) localizacoes.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Localizacao>> buscar(@PathVariable Long id){
        Optional<Localizacao> loc = localizacoes.findById(id);

        if(loc == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(loc);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Localizacao> atualizar(@PathVariable Long id,
                                                 @Valid @RequestBody Localizacao localizacao){
        Optional<Localizacao> loc = localizacoes.findById(id);

        if(loc == null) {
            return ResponseEntity.notFound().build();
        }

        localizacao.setLocalizacaoID(id);

        return ResponseEntity.ok(localizacoes.save(localizacao));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){

        Optional<Localizacao> loc = localizacoes.findById(id);

        if(loc == null) {
            return ResponseEntity.notFound().build();
        }

        localizacoes.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}

