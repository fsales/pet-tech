package br.com.fiap.pettech.dominio.pessoa.controller;

import br.com.fiap.pettech.dominio.pessoa.entity.PessoaFisica;
import br.com.fiap.pettech.dominio.pessoa.repository.PessoaFisicaCollectionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/pf")
public class PessoaFisicaController {

    public PessoaFisicaCollectionRepository repository;

    public PessoaFisicaController(PessoaFisicaCollectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public ResponseEntity<Collection<PessoaFisica>> findAll(){
        var pessoas = repository.findAll();

        return ResponseEntity.ok(pessoas);
    }
}
