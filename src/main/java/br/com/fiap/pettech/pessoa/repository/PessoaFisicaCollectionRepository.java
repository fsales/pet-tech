package br.com.fiap.pettech.pessoa.repository;

import br.com.fiap.pettech.pessoa.entity.PessoaFisica;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class PessoaFisicaCollectionRepository {

   private static Set<PessoaFisica> pessoas;

    static {
        pessoas = new LinkedHashSet<>();
    }

    public Collection<PessoaFisica> findAll(){
        return pessoas;
    }

    public Optional<PessoaFisica> findById(Long id){
        return pessoas.stream().filter(p-> p.getId().equals(id)).findFirst();
    }

    public PessoaFisica save(PessoaFisica pessoaFisica){
        pessoaFisica.setId(pessoas.size() +1L);
        pessoaFisica.addDependente(pessoaFisica);

        return pessoaFisica;
    }
}
