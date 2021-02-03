package br.com.bootcamp.exer8.conta_bancaria;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    private BigDecimal limite;

    public ContaCorrente(int numeroDaConta, BigDecimal limite) {
        super(numeroDaConta);
        this.limite = limite;
        super.setSaldo(limite);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (valor.compareTo(super.getSaldo()) <= 0) {
            this.limite = valor.subtract(this.limite);
            super.setSaldo(super.getSaldo().subtract(valor));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        super.setSaldo(super.getSaldo().add(valor));
    }

    public BigDecimal getLimite() {
        return limite;
    }
}
