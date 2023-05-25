package br.com.fiap.pettech.dominio.pessoa.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {

    private String cpf;

    private Collection<PessoaFisica> dependentes = new Vector<>(); // nao posso dar as coleções para modificar

    public PessoaFisica() {
    }

    public PessoaFisica(
            Long id,
            String nome,
            LocalDate nascimento,
            String cpf,
            Collection<PessoaFisica> dependentes
    ) {
        super(id, nome, nascimento);
        this.cpf = cpf;
        this.dependentes = dependentes;
    }

    public PessoaFisica addDependente(PessoaFisica dependente) {
        //TODO não pode ser a mesma pessoa
        this.dependentes.add(dependente);
        return this;
    }

    public PessoaFisica removeDependente(PessoaFisica dependente) {
        this.dependentes.remove(dependente);
        return this;
    }

    public Collection<PessoaFisica> getDependentes() {
        return Collections.unmodifiableCollection(dependentes);
    }

    public String getCpf() {
        return cpf;
    }

    public PessoaFisica setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append(", dependentes=").append(dependentes);
        sb.append('}')
                .append(super.toString());
        return sb.toString();
    }
}
