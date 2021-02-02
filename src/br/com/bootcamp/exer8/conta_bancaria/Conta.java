package br.com.bootcamp.exer8.conta_bancaria;

import java.math.BigDecimal;

public abstract class Conta {
    private int numeroDaConta;
    private BigDecimal saldo;

    public Conta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public abstract void sacar(BigDecimal valor);
    public abstract void depositar(BigDecimal valor);

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
