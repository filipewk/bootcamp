package br.com.bootcamp.exer13;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {

    private Integer idVoo;
    private LocalDateTime dataHora;
    private Integer numeroMaxPassageiro;
    private List<Integer> assento = new ArrayList<>();

    public Voo(Integer idVoo, LocalDateTime dataHora, Integer numeroMaxPassageiro) {
        this.idVoo = idVoo;
        this.dataHora = dataHora;
        this.numeroMaxPassageiro = numeroMaxPassageiro;
    }

    public void primeiroLivre() {
        int count = 0;
        int assentoLivre = 0;
        for (int i = 0; i <= assento.size(); i++) {
            count += 1;
            if (count <= this.numeroMaxPassageiro) {
                assento.add(count);
                assentoLivre = assento.get(0);
            }
        }
        System.out.println("Primeiro assento livre: " + assentoLivre);
    }

    public void proximoLivre(int assento) {
        System.out.println("Proximo assento livre:" + this.assento.get(assento));
    }

    public void ocupa(int assento) {
        this.assento.remove(assento - 1);
    }

    public boolean verifica(int assento) {
        for (int i = 0; i < this.assento.size(); i++) {
            if (this.assento.get(i) == assento) {
                return true;
            }
        }
        return false;
    }

   public void vagas() {
       System.out.println("Numeros de vagas disponiveis: " + this.assento.size());
   }

    public List<Integer> getAssento() {
        return assento;
    }

    public void assentosLivres() {
        System.out.println("Numeros de cadeiras livres: \n" + getAssento());
    }

    public Integer getIdVoo() {
        return idVoo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
