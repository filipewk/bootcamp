package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.pessoa.GrupoPessoa;
import br.com.bootcamp.exer3.pessoa.Pessoa;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1990, 10, 2);
        Pessoa pessoa = new Pessoa("Filipe", "3123123123", "filipewk@gmail.com", dataNascimento);
        GrupoPessoa grupo = new GrupoPessoa();

        LocalDate aniversario = dataNascimento.plusYears(18);
        System.out.println(aniversario);
        grupo.addGrupo(pessoa);
    }

}
