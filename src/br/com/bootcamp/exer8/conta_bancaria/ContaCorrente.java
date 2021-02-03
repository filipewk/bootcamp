package br.com.bootcamp.exer8.conta_bancaria;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    private int limite;

    public ContaCorrente(int numeroDaConta) {
        super(numeroDaConta);
    }

    @Override
    public void sacar(BigDecimal valor) {

    }

    @Override
    public void depositar(BigDecimal valor) {

    }
}
