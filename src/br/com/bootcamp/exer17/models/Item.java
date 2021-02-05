package br.com.bootcamp.exer17.models;

public class Item {

    private Integer id;
    private String descricao;
    private boolean inativo = false;
    private Integer quantidadeEmEstoque;
    private Double valorUnitario;

    public Item(String descricao, Integer quantidadeEmEstoque) {
        this.descricao = descricao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", inativo=" + inativo +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
