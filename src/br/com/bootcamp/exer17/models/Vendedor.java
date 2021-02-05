package br.com.bootcamp.exer17.models;

public class Vendedor {

    private Integer id;
    private String nome;
    private Double percentualComissao;
    private Double percentualDescontoMaximo;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Double getPercentualDescontoMaximo() {
        return percentualDescontoMaximo;
    }

    public void setPercentualDescontoMaximo(Double percentualDescontoMaximo) {
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }
}
