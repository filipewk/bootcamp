package br.com.bootcamp.exer9;

public class Morador {

    private String nome;

    public Morador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Morador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
