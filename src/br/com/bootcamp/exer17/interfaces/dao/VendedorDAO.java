package br.com.bootcamp.exer17.interfaces.dao;

import br.com.bootcamp.exer17.models.Vendedor;

import java.util.List;

public interface VendedorDAO {
    List<Vendedor> buscarTodos();
    Vendedor buscar(Integer id);
    Vendedor inserir(Vendedor objeto);
    Vendedor alterar(Vendedor objeto);
    boolean excluir(Integer id);
}
