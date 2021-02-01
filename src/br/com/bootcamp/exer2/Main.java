package br.com.bootcamp.exer2;

import br.com.bootcamp.exer2.calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.somar(2, 2));
        System.out.println("Divisão: " + calculadora.dividir(5, 2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(2, 3));
        System.out.println("Substração: " + calculadora.subtrair(5,2));

//        System.out.printlintln(calculadora.getResultado());
    }
}
