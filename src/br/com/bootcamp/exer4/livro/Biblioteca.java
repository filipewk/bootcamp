package br.com.bootcamp.exer4.livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livroList = new ArrayList<>();

    public void addLivro(Livro l) {
        livroList.add(l);
    }

    public List<Livro> getLivroList() {
        return livroList;
    }
}
