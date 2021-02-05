package br.com.bootcamp.exer17.service;

import br.com.bootcamp.exer16.Venda;
import br.com.bootcamp.exer17.dao.ItemDAOImpl;
import br.com.bootcamp.exer17.interfaces.service.ItemService;
import br.com.bootcamp.exer17.models.Item;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    private final ItemDAOImpl dao;

    public ItemServiceImpl(ItemDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public List<Item> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Item buscarPorId(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Item inserir(Item objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Item alterar(Item objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public boolean excluir(Integer id) {
        return dao.excluir(id);
    }
}
