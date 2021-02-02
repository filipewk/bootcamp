package br.com.bootcamp.exer6;

import br.com.bootcamp.exer6.empregado.Empregado;
import br.com.bootcamp.exer6.empregadoComissionado.EmpregadoComissionado;

public class Main {

    public static void main(String[] args) {
        //empregado normal
        Empregado empregado = new Empregado("José", "312312312", 1500, 100);
        double salarioEmpregado = empregado.calculaValorTotalSalario();
        System.out.println("Salario empregado: " + salarioEmpregado);

        //empregado comissionadoJ
        Empregado comissionado = new EmpregadoComissionado(
                "marlon", "654234", 100, 20, 10, 500);
        double salarioComissionado = comissionado.calculaValorTotalSalario();
        System.out.println("Salario comissionado: " + salarioComissionado);
    }
}
