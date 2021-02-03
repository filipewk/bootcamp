package br.com.bootcamp.exer12;

public class Retangulo extends FiguraGeometrica {

    public Retangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }

    @Override
    public void getArea() {
        System.out.println(super.getLado1() * super.getLado2());
    }
}
