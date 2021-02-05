package br.com.bootcamp.exer17.interfaces.dao;

import br.com.bootcamp.exer17.models.Pedido;

import java.util.List;

public interface PedidoDAO {
    List<Pedido> buscarTodos();
    Pedido buscar(Integer id);
    Pedido inserir(Pedido objeto);
    Pedido alterar(Pedido objeto);
    boolean excluir(Integer id);
}
