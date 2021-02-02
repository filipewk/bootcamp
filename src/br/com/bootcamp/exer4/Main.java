package br.com.bootcamp.exer4;

import br.com.bootcamp.exer4.aluno.Aluno;
import br.com.bootcamp.exer4.aluno.TodosAlunos;
import br.com.bootcamp.exer4.emprestimo.Emprestimo;
import br.com.bootcamp.exer4.livro.Biblioteca;
import br.com.bootcamp.exer4.livro.Livro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("");

        Aluno aluno1 = new Aluno("Filipe", "Oliveira");
        Aluno aluno2 = new Aluno("Jose", "Silva");
        Aluno aluno3 = new Aluno("Maria", "Santos");
        Aluno aluno4 = new Aluno("Mateus", "Santos");


        TodosAlunos alunos = new TodosAlunos();
        alunos.addAluno(aluno1);
        alunos.addAluno(aluno2);
        alunos.addAluno(aluno3);

        Livro livro1 = new Livro("JavaScript modulo 1", 300, 3);
        Livro livro2 = new Livro("Java SE 2020", 250, 2);
        Livro livro3 = new Livro("Python 2021", 400, 10);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addLivro(livro3);

        Emprestimo emprestimo = new Emprestimo(biblioteca);

        // emprestimos
        emprestimo.emprestar(aluno1, livro1, LocalDate.of(2021, 12,31));
        emprestimo.emprestar(aluno2, livro3, LocalDate.of(2020, 7,10));
        emprestimo.emprestar(aluno3, livro2, LocalDate.of(2019, 3,5));
        emprestimo.emprestar(aluno4, livro2, LocalDate.of(2019, 3,2));


        System.out.println("");
        // mesmo aluno emprestando outro livro
        emprestimo.emprestar(aluno1, livro3, LocalDate.of(2021, 1,5));

        System.out.println("");
        //quantidade de livros em estoque.
        System.out.println("Estoque livro 1: " + livro1.getQuantidadeEstoque());
        System.out.println("Estoque livro 2: " + livro2.getQuantidadeEstoque());
        System.out.println("Estoque livro 3: " + livro3.getQuantidadeEstoque());

        System.out.println("");
        //quantidade de livros emprestado
        System.out.println("Livro 1: " + livro1.getQuantidade() + " Emprestados.");
        System.out.println("Livro 2: " + livro2.getQuantidade() + " Emprestados.");
        System.out.println("Livro 3: " + livro3.getQuantidade() + " Emprestados.");
    }
}
