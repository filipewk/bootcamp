package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.pessoa.GrupoPessoa;
import br.com.bootcamp.exer3.pessoa.Pessoa;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Filipe", "3123123123", "filipewk@gmail.com",
                LocalDate.of(1990, 10, 2));
        Pessoa pessoa2 = new Pessoa("Jose", "32323232", "xd@gmail.com",
                LocalDate.of(2000, 1, 3));
        Pessoa pessoa3 = new Pessoa("Maria", "312367823", "testewk@gmail.com",
                LocalDate.of(1985, 10, 2));
        Pessoa pessoa4 = new Pessoa("Carlos", "32322", "dasdas@gmail.com",
                LocalDate.of(2003, 1, 3));

        GrupoPessoa grupo = new GrupoPessoa();

        grupo.addGrupo(pessoa);
        grupo.addGrupo(pessoa2);
        grupo.addGrupo(pessoa3);
        grupo.addGrupo(pessoa4);

        System.out.println("");

        for (int i = 0; i < grupo.getListaPessoa().size(); i++) {
            System.out.println("pessoaAtual i: " + i + " " + grupo.getListaPessoa().get(i).getNome());
        }

        System.out.println("");

        grupo.getPessoaIdades();
    }

}
