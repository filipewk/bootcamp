package br.com.bootcamp.exer11;

import java.math.BigDecimal;

public abstract class Conta implements Imprimivel {
    private int numeroDaConta;
    private BigDecimal saldo = new BigDecimal(0);

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
