package br.com.bootcamp.exer17.service;

import br.com.bootcamp.exer17.interfaces.dao.PedidoItemDAO;
import br.com.bootcamp.exer17.interfaces.service.PedidoItemService;
import br.com.bootcamp.exer17.models.PedidoItem;

import java.util.List;

public class PedidoItemServiceImpl implements PedidoItemService {

    private PedidoItemDAO dao;

    private PedidoItem pedidoItem;

    public PedidoItemServiceImpl(PedidoItemDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<PedidoItem> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public PedidoItem buscarPorId(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public PedidoItem inserir(PedidoItem objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public PedidoItem alterar(PedidoItem objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public boolean excluir(Integer id) {
        return dao.excluir(id);
    }
}
