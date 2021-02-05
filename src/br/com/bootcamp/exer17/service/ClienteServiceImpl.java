package br.com.bootcamp.exer17.service;

import br.com.bootcamp.exer17.dao.ClienteDAOImpl;
import br.com.bootcamp.exer17.interfaces.service.ClienteService;
import br.com.bootcamp.exer17.models.Cliente;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    public ClienteDAOImpl dao;

    public ClienteServiceImpl(ClienteDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Cliente alterar(Cliente objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public boolean excluir(Integer id) {
        return dao.excluir(id);
    }
}
