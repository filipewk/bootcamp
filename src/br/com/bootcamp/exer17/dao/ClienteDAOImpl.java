package br.com.bootcamp.exer17.dao;

import br.com.bootcamp.exer17.interfaces.dao.ClienteDAO;
import br.com.bootcamp.exer17.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private List<Cliente> cliente = new ArrayList<>();

    @Override
    public List<Cliente> buscarTodos() {
        return cliente;
    }

    @Override
    public Cliente buscar(Integer id) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).equals(id)) {
                return cliente.get(i);
            }
        }
        return null;
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        objeto.setId(cliente.size() + 1);
        cliente.add(objeto);
        return objeto;
    }

    @Override
    public Cliente alterar(Cliente objeto) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).equals(objeto.getId())) {
                cliente.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Integer id) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).equals(id)) {
             return cliente.remove(id);
            }
        }
        return false;
    }
}
