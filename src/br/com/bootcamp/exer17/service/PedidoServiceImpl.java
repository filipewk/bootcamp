package br.com.bootcamp.exer17.service;

import br.com.bootcamp.exer17.interfaces.dao.PedidoDAO;
import br.com.bootcamp.exer17.interfaces.service.PedidoService;
import br.com.bootcamp.exer17.models.Pedido;
import br.com.bootcamp.exer17.models.PedidoItem;
import br.com.bootcamp.exer17.validacoes.Valida;

import java.util.List;

public class PedidoServiceImpl implements PedidoService {

    private PedidoDAO dao;

    public PedidoServiceImpl(PedidoDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Pedido> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Pedido buscarPorId(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Pedido inserir(Pedido objeto) {
        preInserir(objeto);
        return dao.inserir(objeto);
    }

    @Override
    public Pedido alterar(Pedido objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public boolean excluir(Integer id) {
        return dao.excluir(id);
    }

    private void preInserir(Pedido objeto) {
        new Valida(objeto).validaDesconto();
        new Valida(objeto).validaItemAtivos();
        new Valida(objeto).validadeSeTemEstoque();
        new Valida(objeto).validaValorUnitario();
    }
}
