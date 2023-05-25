package br.com.fiap.pettech.dominio.pessoa.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa {

    String cnpj;

    private Collection<Pessoa> socios =  new Vector<>();

    public PessoaJuridica() {
    }

    public PessoaJuridica(
            Long id,
            String nome,
            LocalDate nascimento,
            String cnpj,
            Collection<Pessoa> socios) {
        super(id, nome, nascimento);
        this.cnpj = cnpj;
        this.socios = socios;
    }

    public PessoaJuridica addSocio(Pessoa socio) {
        //TODO não pode ser a mesma pessoa
        this.socios.add(socio);
        return this;
    }

    public PessoaJuridica removeSocio(Pessoa socio) {
        this.socios.remove(socio);
        return this;
    }

    public Collection<Pessoa> getSocios() {
        return Collections.unmodifiableCollection(socios);
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaJuridica{");
        sb.append("cnpj='").append(cnpj).append('\'');
        sb.append(", socios=").append(socios);
        sb.append('}')
                .append(super.toString());
        return sb.toString();
    }
}
