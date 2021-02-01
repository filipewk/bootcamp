package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.pessoa.GrupoPessoa;
import br.com.bootcamp.exer3.pessoa.Pessoa;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1990, 10, 2);
        LocalDate dataNascimento2 = LocalDate.of(1991, 1, 3);
        Pessoa pessoa = new Pessoa("Filipe", "3123123123", "filipewk@gmail.com", dataNascimento);
        Pessoa pessoa2 = new Pessoa("Jose", "32323232", "xd@gmail.com", dataNascimento2);
        GrupoPessoa grupo = new GrupoPessoa();

        grupo.addGrupo(pessoa);
        grupo.addGrupo(pessoa2);

        System.out.println("");
        for (int i = 0; i < grupo.getListaPessoa().size(); i++) {
            System.out.println("pessoaAtual: " + grupo.getListaPessoa().get(i));
        }
    }

}
