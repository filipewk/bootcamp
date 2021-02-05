package br.com.bootcamp.exer17.interfaces.service;

import br.com.bootcamp.exer17.models.Pedido;

import java.util.List;

public interface PedidoService {
    List<Pedido> buscarTodos();
    Pedido buscarPorId(Integer id);
    Pedido inserir(Pedido objeto);
    Pedido alterar(Pedido objeto);
    boolean excluir(Integer id);
}
