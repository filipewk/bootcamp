package br.com.bootcamp.exer10;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----CONTA POUPANÇA-----");
        Conta contaPoupanca = new ContaPoupanca(123456);

        contaPoupanca.depositar(new BigDecimal(100));
        contaPoupanca.sacar(new BigDecimal(50));

        System.out.println("Saldo na conta poupança: R$ " + contaPoupanca.getSaldo());

        System.out.println("");
        System.out.println("-----CONTA CORRENTE-----");

        ContaCorrente contaCorrente = new ContaCorrente(1234999, new BigDecimal("500"));
        contaCorrente.depositar(new BigDecimal(500));
        System.out.println("Saldo na conta corrente: R$ " + contaCorrente.getSaldo());
        contaCorrente.sacar(new BigDecimal(700));
        System.out.println("Limite: R$ " + contaCorrente.getSaldoMaisLimite());

        System.out.println("Saldo na conta corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("");

        System.out.println("Sacar mais que o saldo: ");
        contaCorrente.sacar(new BigDecimal(301));
        System.out.println("Saldo na conta corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Limite: R$ " + contaCorrente.getSaldoMaisLimite());

        System.out.println("");
        System.out.println("Sacar tudo: ");
        contaCorrente.sacar(new BigDecimal(300));
        System.out.println("Saldo na conta corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Limite: R$ " + contaCorrente.getSaldoMaisLimite());

        System.out.println("");
        Relatorio relatorio = new Relatorio();
        relatorio.gerar(contaCorrente);
        relatorio.gerar(contaPoupanca);
    }
}
