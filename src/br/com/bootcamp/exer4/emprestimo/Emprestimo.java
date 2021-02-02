package br.com.bootcamp.exer4.emprestimo;

import br.com.bootcamp.exer4.aluno.Aluno;
import br.com.bootcamp.exer4.livro.Biblioteca;
import br.com.bootcamp.exer4.livro.Livro;

import java.time.LocalDate;

public class Emprestimo {

    private Biblioteca livrosDisponiveis;

    public Emprestimo (Biblioteca livrosDisponiveis) {
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public void emprestar(Aluno aluno, Livro livro, LocalDate data) {
        if (aluno.getIdLivro() == -1 && livro.getQuantidadeEstoque() > 0) {
            int index = 0;
            for (int i = 0; i < livrosDisponiveis.getLivroList().size(); i++) {
                if (livrosDisponiveis.getLivroList().get(i).getNome() == livro.getNome()) {
                    index = i;
                }
            }
            aluno.setIdLivro(index);
            livro.setQuantidadeEstoque(livro.getQuantidadeEstoque() - 1);
            livro.setQuantidade(livro.getQuantidade() + 1);
            aluno.setDataEmprestimo(data);
            System.out.println("Aluno: " + aluno.getNome() + " emprestou o livro: " + retornaNomeLivro(aluno)
                    + " \n na data: " + aluno.getDataEmprestimo());
        } else {
            System.out.println("Aluno: " + aluno.getNome() + " já possui um livro emprestado");
        }
    }

    public String retornaNomeLivro(Aluno aluno) {
        return livrosDisponiveis.getLivroList().get(aluno.getIdLivro()).getNome();
    }
}
