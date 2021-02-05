package br.com.bootcamp.exer17.dao;

import br.com.bootcamp.exer17.interfaces.dao.PedidoDAO;
import br.com.bootcamp.exer17.models.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImpl implements PedidoDAO {

    private List<Pedido> pedido = new ArrayList<>();

    @Override
    public List<Pedido> buscarTodos() {
       return pedido;
    }

    @Override
    public Pedido buscar(Integer id) {
        for (int i = 0; i < pedido.size(); i++) {
            if(pedido.get(i).equals(id)) {
                return pedido.get(i);
            }
        }
        return null;
    }

    @Override
    public Pedido inserir(Pedido objeto) {
        objeto.setId(pedido.size() + 1);
        pedido.add(objeto);
        return objeto;
    }

    @Override
    public Pedido alterar(Pedido objeto) {
        for (int i = 0; i < pedido.size(); i++) {
            if (pedido.get(i).equals(objeto.getId())) {
                pedido.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Integer id) {
        for (int i = 0; i< pedido.size(); i++) {
            if (pedido.get(i).equals(id)) {
                return pedido.remove(id);
            }
        }
        return false;
    }
}
