package br.com.bootcamp.exer2.calculadora;

public class Calculadora {

    private Integer numero1;
    private Integer numero2;
    private Integer resultado;

    public Integer somar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    public Integer subtrair(Integer numero1, Integer numero2) {
        return numero1 - numero2;
    }

    public Integer multiplicar(Integer numero1, Integer numero2) {
        return numero1 * numero2;
    }

    public Double dividir(Integer numero1, Integer numero2) {
        return (double) numero1 / numero2;
    }

    public Integer getResultado() {
        return resultado;
    }
}
