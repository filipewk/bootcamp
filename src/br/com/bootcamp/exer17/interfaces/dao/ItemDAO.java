package br.com.bootcamp.exer17.interfaces.dao;

import br.com.bootcamp.exer17.models.Item;

import java.util.List;

public interface ItemDAO {
    List<Item> buscarTodos();
    Item buscar(Integer id);
    Item inserir(Item objeto);
    Item alterar(Item objeto);
    boolean excluir(Integer id);
}
