package br.com.bootcamp.exer3.pessoa;

import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.telefone.Telefone;
import br.com.bootcamp.exer1.telefone.TipoTelefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GrupoPessoa {

    private Pessoa pessoa;

    public List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    private List<Pessoa> listaPessoa = new ArrayList<>();


    public boolean ehMaiorDe18Anos(LocalDate dataNascimento) {
        LocalDate aniversario = dataNascimento.plusYears(18);
        return !LocalDate.now().isEqual(aniversario) || !LocalDate.now().isBefore(aniversario);

    }

    public void addGrupo(Pessoa p) {
        if (this.ehMaiorDe18Anos(p.getDataDeNascimento())) {
            listaPessoa.add(p);
            System.out.println(listaPessoa.toString());
        } else {
            System.out.println("Não é maior de idade");
        }
    }

    @Override
    public String toString() {
        return "GrupoPessoa{" +
                "pessoa=" + pessoa +
                ", listaPessoa=" + listaPessoa +
                '}';
    }
}
