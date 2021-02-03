package br.com.bootcamp.exer8.conta_bancaria;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    private BigDecimal saldoMaisLimite;
    private BigDecimal limite;

    public ContaCorrente(int numeroDaConta, BigDecimal limite) {
        super(numeroDaConta);
        this.limite = limite;

    }

    public BigDecimal getSaldoMaisLimite() {
        return saldoMaisLimite;
    }

    @Override
    public void sacar(BigDecimal valor) {
        this.saldoMaisLimite = super.getSaldo().add(this.limite);
        if (valor.compareTo(this.saldoMaisLimite) <= 0) {
            if (this.limite.compareTo(new BigDecimal(0)) == 0) {
                this.limite = valor.subtract(valor);
            }
            this.saldoMaisLimite = this.saldoMaisLimite.subtract(valor);
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
