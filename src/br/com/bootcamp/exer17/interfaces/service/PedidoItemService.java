package br.com.bootcamp.exer17.interfaces.service;

import br.com.bootcamp.exer17.models.PedidoItem;

import java.util.List;

public interface PedidoItemService {
    List<PedidoItem> buscarTodos();
    PedidoItem buscarPorId(Integer id);
    PedidoItem inserir(PedidoItem objeto);
    PedidoItem alterar(PedidoItem objeto);
    boolean excluir(Integer id);
}
