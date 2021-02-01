package br.com.bootcamp.exer3.pessoa;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, String cpf, String email, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
