package br.com.bootcamp.exer12;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(10, 10);
        FiguraGeometrica retangulo = new Retangulo(6, 4);
        FiguraGeometrica triagunlo = new Triangulo(5, 4);

        quadrado.getArea();
        retangulo.getArea();
        triagunlo.getArea();
    }
}
