package br.com.bootcamp.exer9;

public class Main {

    public static void main(String[] args) {
        Morador morador1 = new Morador("José");
        Morador morador2 = new Morador("Maria");
        Morador morador3 = new Morador("João");
        Morador morador4 = new Morador("Karla");

        Elevador elevador = new Elevador(3, 10);
        elevador.entra(morador1);
        elevador.entra(morador2);
        elevador.entra(morador3);
        elevador.entra(morador4);

        System.out.println(elevador.getMorador().toString());

        System.out.println("");
        elevador.sai(morador1);
        System.out.println(elevador.getMorador().toString());
        elevador.entra(morador4);
        System.out.println(elevador.getMorador().toString());
        System.out.println("");

        elevador.sobe(2);
        elevador.sobe(3);
        elevador.sobe(6);

        System.out.println("");
        elevador.desce(5);
        elevador.desce(2);

        System.out.println("");
        elevador.sobe(2);
        elevador.desce(3);

    }
}
