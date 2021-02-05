package br.com.bootcamp.exer17.dao;

import br.com.bootcamp.exer17.interfaces.dao.VendedorDAO;
import br.com.bootcamp.exer17.models.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class VendedorDAOImpl implements VendedorDAO {

    List<Vendedor> vendedor = new ArrayList<>();

    @Override
    public List<Vendedor> buscarTodos() {
        return vendedor;
    }

    @Override
    public Vendedor buscar(Integer id) {
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).equals(id)) {
                return vendedor.get(i);
            }
        }
        return null;
    }

    @Override
    public Vendedor inserir(Vendedor objeto) {
        objeto.setId(vendedor.size() +1);
        vendedor.add(objeto);
        return objeto;
    }

    @Override
    public Vendedor alterar(Vendedor objeto) {
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).equals(objeto.getId())) {
                vendedor.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Integer id) {
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).equals(id)) {
                return vendedor.remove(id);
            }
        }
        return false;
    }
}
