package br.com.bootcamp.exer7.gerente;

import br.com.bootcamp.exer7.empregadoComissionado.EmpregadoComissionado;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends EmpregadoComissionado {

    private double ajudaDeCusto;

    private List<EmpregadoComissionado> listaVendedor = new ArrayList<>();

    public Gerente(String nome, String cpf,
                   double valorSalarioBase,
                   double valorImpostos,
                   double percentualComissao,
                   List<EmpregadoComissionado> listaVendedor,
                   double ajudaDeCusto
    ) {
        super(nome, cpf, valorSalarioBase, valorImpostos, percentualComissao, totalVendaVendedor(listaVendedor));
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public static double totalVendaVendedor(List<EmpregadoComissionado> listaVendedor) {
        double totalVendido = 0;
        for (int i = 0; i < listaVendedor.size(); i++) {
            totalVendido += listaVendedor.get(i).getValorProdutosVendidos();
        }
        return totalVendido;
    }

    @Override
    public double calculaValorTotalSalario() {
        return (super.getValorSalarioBase() + ajudaDeCusto + super.getValorComissao()) - super.getValorImpostos();
    }
}
