package br.com.bootcamp.exer1;

import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.pessoa.Pessoa;
import br.com.bootcamp.exer1.telefone.Telefone;
import br.com.bootcamp.exer1.telefone.TipoTelefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // DADOS PESSOAIS.
        pessoa.setNome("Filipe");
        pessoa.setSobrenome("Oliveira");
        LocalDate dataNascimento = LocalDate.of(1990, 7, 1);
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setCpf("12312312");
        pessoa.setEmail("filipe@gmail.com");

        // LISTA ENDERECO.
        List<Endereco> enderecoList = new ArrayList<>();
        Endereco endereco = new Endereco("R. tupi", 123, "Centro");
        enderecoList.add(endereco);
        pessoa.setEnderecoList(enderecoList);

        // TELEFONE
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(TipoTelefone.CELULAR);
        telefone.setDdd(45);
        telefone.setNumero(87312312);

        pessoa.setTelefoneList(new ArrayList<>());
        pessoa.getTelefoneList().add(telefone);

        System.out.println(pessoa.toString());

    }
}
