package br.com.bootcamp.exer17.service;

import br.com.bootcamp.exer17.dao.VendedorDAOImpl;
import br.com.bootcamp.exer17.interfaces.service.VendedorService;
import br.com.bootcamp.exer17.models.Vendedor;

import java.util.List;

public class VendedorServiceImpl implements VendedorService {

    private VendedorDAOImpl dao;

    public VendedorServiceImpl(VendedorDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public List<Vendedor> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Vendedor buscarPorId(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Vendedor inserir(Vendedor objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Vendedor alterar(Vendedor objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public boolean excluir(Integer id) {
        return dao.excluir(id);
    }
}
