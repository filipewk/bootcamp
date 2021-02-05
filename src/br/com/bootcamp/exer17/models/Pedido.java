package br.com.bootcamp.exer17.models;

import br.com.bootcamp.exer17.enuns.FormaDePagamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private Integer id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataDeCadastro;
    private LocalDate dataDeValidade;
    private LocalDate dataDePrevisaoEntrega;
    private String observacao;
    private FormaDePagamento formaDePagamento;
    private List<PedidoItem> item;

    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, LocalDateTime dataDeCadastro, FormaDePagamento formaDePagamento, List<PedidoItem> item) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataDeCadastro = dataDeCadastro;
        this.formaDePagamento = formaDePagamento;
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public LocalDate getDataDePrevisaoEntrega() {
        return dataDePrevisaoEntrega;
    }

    public void setDataDePrevisaoEntrega(LocalDate dataDePrevisaoEntrega) {
        this.dataDePrevisaoEntrega = dataDePrevisaoEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public List<PedidoItem> getItem() {
        return item;
    }

    public void setItem(List<PedidoItem> item) {
        this.item = item;
    }

    public void resumo() {
        double total = 0;
        System.out.println("-----RESUMO NFE-----");
        System.out.println("DADOS CLIENTE.");
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("CPF: " + this.cliente.getCpf());
        System.out.println("e-mail: " + this.cliente.getEmail());
        System.out.println("DADOS VENDEDOR");
        System.out.println("Nome: " + this.vendedor.getNome());
        System.out.println("----PRODUTOS----");
        for (int i = 0; i < this.item.size(); i++) {
            System.out.println("Valor unitario: " + this.item.get(i).getValorUnitario());
            System.out.println("-----------------");
            total += this.item.get(i).getValorUnitario();
        }
        System.out.println("Valor total do pedido: R$ " + total);


    }
}
