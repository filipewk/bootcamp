package br.com.bootcamp.exer7;

import br.com.bootcamp.exer7.empregado.Empregado;
import br.com.bootcamp.exer7.empregadoComissionado.EmpregadoComissionado;
import br.com.bootcamp.exer7.gerente.Gerente;
import br.com.bootcamp.exer7.vendedor.Vendedor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //empregado normal
        Empregado empregado = new Empregado("José", "312312312", 1500, 100);
        double salarioEmpregado = empregado.calculaValorTotalSalario();
        System.out.println("Salario empregado: " + salarioEmpregado);

        //empregado comissionado
        Empregado comissionado = new EmpregadoComissionado(
                "Marlon", "654234", 100, 20, 10, 500);
        double salarioComissionado = comissionado.calculaValorTotalSalario();
        System.out.println("Salario comissionado: " + salarioComissionado);


        //vendedor
        EmpregadoComissionado vendedor1 = new Vendedor(
                "Maria", "654234", 100, 20, 10, 500);

        EmpregadoComissionado vendedor2 = new Vendedor(
                "Marcelo", "654234", 100, 20, 10, 500);

        System.out.println("");
        System.out.println("Comissão vendedor 1: " + vendedor1.getValorComissao());
        System.out.println("Comissão vendedor 2: " + vendedor2.getValorComissao());

        //Gerente
        Gerente gerente = new Gerente(
                "Marcio",
                "123",
                100,
                20,
                10,
                Arrays.asList(vendedor1, vendedor2),
                100
        );

        double salarioGerente = gerente.calculaValorTotalSalario();
        System.out.println("Salario gerente: " + salarioGerente);
    }
}
