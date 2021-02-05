package br.com.bootcamp.exer17.interfaces.service;

import br.com.bootcamp.exer17.models.Item;

import java.util.List;

public interface ItemService {
    List<Item> buscarTodos();
    Item buscarPorId(Integer id);
    Item inserir(Item objeto);
    Item alterar(Item objeto);
    boolean excluir(Integer id);
}
