package br.com.bootcamp.exer9;

import java.util.ArrayList;
import java.util.List;

public class Elevador {

    private final Integer capacidade;
    private final Integer totalAndares;
    private Integer andar = 0;
    private final List<Morador> morador  = new ArrayList<>();

    public Elevador (Integer capacidade, Integer totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public void entra(Morador m) {
        if (morador.size() == 0  || morador.size() < capacidade) {
            morador.add(m);
            System.out.println("Morador " + m.getNome() + " entrou no elevador.");
        } else {
            System.out.println("Desculpe " + m.getNome() + " elevador está cheio.");
        }
    }

    public void sai(Morador m) {
        if (morador.size() != 0) {
            morador.remove(m);
            System.out.println("Morador " + m.getNome() + " saiu do elevador.");
        } else {
            System.out.println("Elevador está vazio.");
        }
    }

    public void sobe(Integer andar) {
        try {
            if (this.andar + andar < this.totalAndares) {
                this.andar += andar;
                System.out.println("Elevador subiu " + andar + " andares e está no andar: " + this.andar);
            } else {
                throw new RuntimeException("Erro ao subir.");
            }

        } catch (RuntimeException e) {
            System.out.println("Elevador está no andar: " + this.andar + " não é possivel subir "
                    + andar + " andares, o predio tem " + this.totalAndares + " andares.");
        }
    }

    public void desce(Integer andar) {
        try {
            if (this.andar + andar > 0 && this.andar - andar >= 0) {
                this.andar -= andar;
                System.out.println("Elevador desceu " + andar + " andares e está no andar: " + this.andar);
            } else {
                throw new RuntimeException("Erro ao descer.");
            }
        } catch (RuntimeException e) {
            System.out.println("Elevador está no andar: " + this.andar + " não é possivel descer " + andar + " andares");
        }
    }

    public List<Morador> getMorador() {
        return morador;
    }
}
