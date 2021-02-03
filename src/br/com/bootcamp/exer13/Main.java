package br.com.bootcamp.exer13;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Voo voo = new Voo(1, LocalDateTime.now(), 30);

        voo.primeiroLivre();
        voo.proximoLivre(2);

        voo.ocupa(2);
        voo.ocupa(4);
        voo.ocupa(6);
        voo.ocupa(19);

        System.out.println("");
        System.out.println("-----VERIFICA CADEIRA VAGAS----");
        System.out.println(voo.verifica(3));
        System.out.println(voo.verifica(2));
        System.out.println(voo.verifica(19));

        System.out.println("");
        voo.vagas();
        voo.assentosLivres();
    }
}
