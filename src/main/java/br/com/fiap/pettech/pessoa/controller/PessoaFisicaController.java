package br.com.fiap.pettech.pessoa.controller;

import br.com.fiap.pettech.pessoa.entity.PessoaFisica;
import br.com.fiap.pettech.pessoa.repository.PessoaFisicaCollectionRepository;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<Collection<PessoaFisica>> findall(){
        var pessoas = repository.findAll();

        return ResponseEntity.ok(pessoas);
    }
}
