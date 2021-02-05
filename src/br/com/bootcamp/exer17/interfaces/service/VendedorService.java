package br.com.bootcamp.exer17.interfaces.service;

import br.com.bootcamp.exer17.models.Vendedor;

import java.util.List;

public interface VendedorService {
    List<Vendedor> buscarTodos();
    Vendedor buscarPorId(Integer id);
    Vendedor inserir(Vendedor objeto);
    Vendedor alterar(Vendedor objeto);
    boolean excluir(Integer id);
}
