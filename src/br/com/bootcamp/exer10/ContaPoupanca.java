package br.com.bootcamp.exer10;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    private final BigDecimal taxaDeOperacao = new BigDecimal("0.01");

    public ContaPoupanca(int numeroDaConta) {
        super(numeroDaConta);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (super.getSaldo().compareTo(valor) > 0) {
            super.setSaldo(super.getSaldo().subtract(valor).subtract(valor.multiply(taxaDeOperacao)));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        super.setSaldo(super.getSaldo().add(valor));
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "taxaDeOperacao=" + taxaDeOperacao +
                '}';
    }
}
