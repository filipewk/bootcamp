package br.com.bootcamp.exer4.livro;

public class Livro {

    private String nome;
    private Integer paginas;
    private Integer quantidade = 0;
    private Integer quantidadeEstoque;

    public Livro(String nome, int paginas, int quantidadeEstoque) {
        this.nome = nome;
        this.paginas = paginas;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }


    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
