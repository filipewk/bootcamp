package br.com.bootcamp.exer17.dao;

import br.com.bootcamp.exer17.interfaces.dao.PedidoItemDAO;
import br.com.bootcamp.exer17.models.PedidoItem;

import java.util.ArrayList;
import java.util.List;

public class PedidoItemImpl implements PedidoItemDAO {

    private List<PedidoItem> pedidoItem = new ArrayList<>();

    @Override
    public List<PedidoItem> buscarTodos() {
        return pedidoItem;
    }

    @Override
    public PedidoItem buscar(Integer id) {
        for (int i = 0; i < this.pedidoItem.size(); i++) {
            if (this.pedidoItem.get(i).equals(id)) {
                return pedidoItem.get(i);
            }
        }
        return null;
    }

    @Override
    public PedidoItem inserir(PedidoItem objeto) {
        objeto.setId(pedidoItem.size() + 1);
        pedidoItem.add(objeto);
        return objeto;
    }

    @Override
    public PedidoItem alterar(PedidoItem objeto) {
        for (int i = 0; i < pedidoItem.size(); i++) {
            if (pedidoItem.get(i).equals(objeto.getId())) {
                pedidoItem.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Integer id) {
        for (int i = 0; i < pedidoItem.size(); i++) {
            if (pedidoItem.get(i).equals(id)) {
                return pedidoItem.remove(id);
            }
        }
        return false;
    }
}
