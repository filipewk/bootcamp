package br.com.bootcamp.exer1.pessoa;

import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.telefone.Telefone;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    private LocalDate dataDeNascimento;
    private List<Endereco> enderecoList;
    private List<Telefone> telefoneList;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", enderecoList=" + enderecoList +
                ", telefoneList=" + telefoneList +
                '}';
    }
}
