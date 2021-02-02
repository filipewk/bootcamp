package br.com.bootcamp.exer8;

import br.com.bootcamp.exer8.conta_bancaria.Conta;
import br.com.bootcamp.exer8.conta_bancaria.ContaPoupanca;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca(123456);
        contaPoupanca.depositar(new BigDecimal(100));
        contaPoupanca.sacar(new BigDecimal(10));

        System.out.println(contaPoupanca.getSaldo());
    }
}
