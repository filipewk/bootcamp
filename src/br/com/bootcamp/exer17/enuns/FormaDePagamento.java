package br.com.bootcamp.exer17.enuns;

public enum FormaDePagamento {

    DINHEIRO(0),
    BOLETO(3),
    CARTAO(2);

    private final Integer label;

    FormaDePagamento(Integer label) {
        this.label = label;
    }
}
