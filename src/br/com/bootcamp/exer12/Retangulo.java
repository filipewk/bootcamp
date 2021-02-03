package br.com.bootcamp.exer12;

public class Retangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        super(lado1, lado2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void getArea() {
        System.out.println(lado1 * lado2);
    }
}
