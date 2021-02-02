package br.com.bootcamp.exer7.empregadoComissionado;

import br.com.bootcamp.exer7.empregado.Empregado;

public class EmpregadoComissionado extends Empregado {

    private double valorProdutosVendidos;
    private double percentualComissao;
    private double valorComissao;

    public EmpregadoComissionado(String nome, String cpf,
                                 double valorSalarioBase,
                                 double valorImpostos,
                                 double percentualComissao,
                                 double valorProdutosVendidos) {
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.percentualComissao = percentualComissao;
        this.valorComissao = valorProdutosVendidos * percentualComissao / 100;
    }


    @Override
    public double calculaValorTotalSalario() {
        return super.getValorSalarioBase() + valorComissao - super.getValorImpostos();
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public double getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }
}
