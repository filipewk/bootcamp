package br.com.bootcamp.exer17.interfaces.service;



import br.com.bootcamp.exer17.models.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> buscarTodos();
    Cliente buscarPorId(Integer id);
    Cliente inserir(Cliente objeto);
    Cliente alterar(Cliente objeto);
    boolean excluir(Integer id);
}
