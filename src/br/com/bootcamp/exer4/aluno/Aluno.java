package br.com.bootcamp.exer4.aluno;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer idAluno = 0;
    private Integer idLivro = -1;
    private LocalDate dataEmprestimo;

    public Aluno(String nome, String sobrenome) {
       this.nome = nome;
       this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
}
