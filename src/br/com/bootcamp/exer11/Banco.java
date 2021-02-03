package br.com.bootcamp.exer11;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> conta = new ArrayList<>();


    public void add(Conta c) {
        if (!this.search(c.getNumeroDaConta())){
            conta.add(c);
            System.out.println("Conta :" + c.getNumeroDaConta() + " adicinada com sucesso.");
        } else {
            System.out.println("Conta ja existe na lista.");
        }
    }

    public void remove(Conta c) {
        conta.remove(c);
    }

    public boolean search(int n) {
        for (int i = 0; i < conta.size(); i++) {
            if (conta.get(i).getNumeroDaConta() == n) {
                return true;
            }
        }
        return false;
    }

    public void searchAndShowMessage (int n) {
        for (int i = 0; i < conta.size(); i++) {
            if (conta.get(i).getNumeroDaConta() == n) {
                System.out.println(conta.get(i));
            }
        }
    }
}
