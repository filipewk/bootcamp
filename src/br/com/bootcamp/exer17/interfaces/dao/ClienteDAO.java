package br.com.bootcamp.exer17.interfaces.dao;


import br.com.bootcamp.exer17.models.Cliente;

import java.util.List;

public interface ClienteDAO {
    List<Cliente> buscarTodos();

    Cliente buscar(Integer id);

    Cliente inserir(Cliente objeto);

    Cliente alterar(Cliente objeto);

    boolean excluir(Integer id);
}
