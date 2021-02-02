package br.com.bootcamp.exer3.pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class GrupoPessoa {

    private final List<Pessoa> listaPessoa = new ArrayList<>();

    public List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public boolean ehMaiorDe18Anos(LocalDate dataNascimento) {
        LocalDate aniversario = dataNascimento.plusYears(18);
        return LocalDate.now().isEqual(aniversario) || !LocalDate.now().isBefore(aniversario);
    }

    public void addGrupo(Pessoa p) {
        if (this.ehMaiorDe18Anos(p.getDataDeNascimento())) {
            listaPessoa.add(p);
            System.out.println("Pessoa adicionada com sucesso.");
        } else {
            System.out.println("Não é maior de idade");
        }
    }

    public Integer getMaiorIdade() {
        if (!listaPessoa.isEmpty()) {
            int maiorIdade = getIdade(listaPessoa.get(0).getDataDeNascimento());
            for (int i = 1; i < listaPessoa.size(); i++) {
                int idadeAtual = getIdade(listaPessoa.get(i).getDataDeNascimento());
                if (idadeAtual > maiorIdade) {
                    maiorIdade = idadeAtual;
                }
            }
            return maiorIdade;
        }
        return null;
    }

    public Integer getMenorIdade() {
        if (!listaPessoa.isEmpty()) {
            int menorIdade = getIdade(listaPessoa.get(0).getDataDeNascimento());
            for (int i = 1; i < listaPessoa.size(); i++) {
                int idadeAtual = getIdade(listaPessoa.get(i).getDataDeNascimento());
                if (idadeAtual < menorIdade) {
                    menorIdade = idadeAtual;
                }
            }
            return menorIdade;
        }
        return null;
    }

    public int getIdade(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public void getPessoaIdades() {
        for (int i = 0; i < listaPessoa.size(); i++) {
            if (getIdade(listaPessoa.get(i).getDataDeNascimento()) == getMaiorIdade()) {
                System.out.println("Maior idade: " + listaPessoa.get(i).getNome() + " Data: "
                        + listaPessoa.get(i).getDataDeNascimento() + " Idade: " + getMaiorIdade());
            }

            if (getIdade(listaPessoa.get(i).getDataDeNascimento()) == getMenorIdade()) {
                System.out.println("Menor idade: " + listaPessoa.get(i).getNome() + " Data: "
                        + listaPessoa.get(i).getDataDeNascimento() + " Idade: " + getMenorIdade());
            }
        }
    }

}
