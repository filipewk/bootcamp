package br.com.bootcamp.exer11;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Conta contaPoupanca = new ContaPoupanca(123456);
        ContaCorrente contaCorrente = new ContaCorrente(1234999, new BigDecimal("500"));
        ContaCorrente contaCorrente2 = new ContaCorrente(123499887, new BigDecimal("500"));

        Banco banco = new Banco();

        banco.add(contaCorrente);
        banco.add(contaPoupanca);
        banco.add(contaCorrente2);

        // adicinonar mesma conta
        banco.add(contaCorrente);

        System.out.println("");
        System.out.println("Busca: ");
        banco.searchAndShowMessage(123456);



    }
}
