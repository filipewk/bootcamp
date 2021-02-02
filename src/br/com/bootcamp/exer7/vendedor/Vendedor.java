package br.com.bootcamp.exer7.vendedor;

import br.com.bootcamp.exer7.empregadoComissionado.EmpregadoComissionado;

public class Vendedor extends EmpregadoComissionado {
    public Vendedor(String nome, String cpf, double valorSalarioBase, double valorImpostos, double percentualComissao, double valorProdutosVendidos) {
        super(nome, cpf, valorSalarioBase, valorImpostos, percentualComissao, valorProdutosVendidos);
    }
}
