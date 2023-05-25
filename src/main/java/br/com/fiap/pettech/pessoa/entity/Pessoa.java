package br.com.fiap.pettech.pessoa.entity;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {

    private Long id;

    private String nome;

    private LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa(
            Long id,
            String nome,
            LocalDate nascimento
    ) {
        this.setId(id);
        this.setNome(nome);
        this.setNascimento(nascimento);
    }

    public Long getId() {
        return id;
    }

    public Pessoa setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Pessoa setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", nascimento=").append(nascimento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(nascimento, pessoa.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nascimento);
    }
}
