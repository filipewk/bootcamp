package br.com.bootcamp.exer13;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Voo voo = new Voo(1, LocalDateTime.now(), 30);

        System.out.println("----INFORMACOES VOO----");
        System.out.println("ID Voo: " + voo.getIdVoo());
        System.out.println("Data/hora Voo: " + voo.getDataHora());
        System.out.println("");

        voo.primeiroLivre();
        voo.proximoLivre(2);

        voo.ocupa(2);
        voo.ocupa(4);
        voo.ocupa(6);
        voo.ocupa(30);

        System.out.println("");
        System.out.println("-----VERIFICA CADEIRA VAGAS----");
        System.out.println(voo.verifica(3));
        System.out.println(voo.verifica(2));

        System.out.println("");
        System.out.println("----ASSENTOS----");
        voo.vagas();
        voo.assentosLivres();
    }
}
