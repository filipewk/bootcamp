package br.com.bootcamp.exer17.interfaces.dao;

import br.com.bootcamp.exer17.models.PedidoItem;

import java.util.List;

public interface PedidoItemDAO {
    List<PedidoItem> buscarTodos();
    PedidoItem buscar(Integer id);
    PedidoItem inserir(PedidoItem objeto);
    PedidoItem alterar(PedidoItem objeto);
    boolean excluir(Integer id);
}
