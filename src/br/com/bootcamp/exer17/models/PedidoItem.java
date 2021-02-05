package br.com.bootcamp.exer17.models;

import java.util.ArrayList;
import java.util.List;

public class PedidoItem {

    private Integer id;
    private Item item;
    private List<Item> itens = new ArrayList<>();
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorDesconto;

    public PedidoItem(Integer id, Item item, Integer quantidade, Double valorUnitario, Double valorDesconto) {
        this.id = id;
        this.item = item;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorDesconto = valorDesconto;
    }

    public Double getValorTotal() {
        this.itens.add(item);
        double total = 0;
        for (int i = 0; i < this.itens.size(); i++) {
             total += this.quantidade * this.itens.get(i).getValorUnitario();
        }
        return total;
    }

    public Double getValorTotalSemDesconto() {
        this.itens.add(item);
        double total = 0;
        for (int i = 0; i < this.itens.size(); i++) {
            total += this.quantidade * this.itens.get(i).getValorUnitario() - this.valorDesconto;
        }
        return total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public String toString() {
        return "PedidoItem{" +
                "id=" + id +
                ", item=" + item +
                ", itens=" + itens +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", valorDesconto=" + valorDesconto +
                '}';
    }
}
