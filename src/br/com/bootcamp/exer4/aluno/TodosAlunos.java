package br.com.bootcamp.exer4.aluno;

import java.util.ArrayList;
import java.util.List;

public class TodosAlunos {

    private int count;

    private List<Aluno> alunoList = new ArrayList<>();

    public void addAluno(Aluno a) {
        alunoList.add(a);
        count += 1;
        a.setIdAluno(count);
    }

}
