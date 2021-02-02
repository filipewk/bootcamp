package br.com.bootcamp.exer8.conta_bancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    private BigDecimal taxaDeOperacao = new BigDecimal(0.01);

    public ContaPoupanca(int numeroDaConta) {
        super(numeroDaConta);
    }

    @Override
    public void sacar(BigDecimal valor) {
       super.setSaldo(super.getSaldo().subtract(valor.multiply(taxaDeOperacao)));
    }

    @Override
    public void depositar(BigDecimal valor) {
       super.setSaldo(valor);
    }
}
