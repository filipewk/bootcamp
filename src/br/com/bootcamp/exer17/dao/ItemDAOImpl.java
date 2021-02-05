package br.com.bootcamp.exer17.dao;

import br.com.bootcamp.exer17.models.Item;
import br.com.bootcamp.exer17.interfaces.dao.ItemDAO;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

    private List<Item> item = new ArrayList<>();

    @Override
    public List<Item> buscarTodos() {
        return item;
    }

    @Override
    public Item buscar(Integer id) {
        for (int i = 0; i < item.size(); i++) {
            if (this.item.get(i).getId().equals(id)) {
              return item.get(i);
            }
        }
        return null;
    }

    @Override
    public Item inserir(Item objeto) {
        objeto.setId(item.size() + 1);
        item.add(objeto);
        return objeto;
    }

    @Override
    public Item alterar(Item objeto) {
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).equals(objeto.getId())) {
                item.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Integer id) {
        for (int i = 0;i < item.size(); i++) {
            if (item.get(i).getId().equals(id)) {
                return item.remove(id);
            }
        }
        return false;
    }
}
