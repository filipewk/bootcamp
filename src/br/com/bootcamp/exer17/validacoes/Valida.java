package br.com.bootcamp.exer17.validacoes;

import br.com.bootcamp.exer17.excecoes.DescontoException;
import br.com.bootcamp.exer17.excecoes.ItemNaoAtivoException;
import br.com.bootcamp.exer17.excecoes.SemEstoqueException;
import br.com.bootcamp.exer17.excecoes.ValorUnitarioZeradoException;
import br.com.bootcamp.exer17.models.Item;
import br.com.bootcamp.exer17.models.PedidoItem;

public class Valida {

    private Item item;
    private PedidoItem pedidoItem;

    public Boolean validaValorUnitario() {
        if (item.getValorUnitario() == 0) {
            throw new ValorUnitarioZeradoException("Valor unitario não pode ser zero.");
        }
        return true;
    }

    public Boolean validadeSeTemEstoque() {
        if (pedidoItem.getQuantidade() > item.getQuantidadeEmEstoque()) {
            throw new SemEstoqueException("Produto sem estoque.");
        }
        return true;
    }

    public Boolean validaItemAtivos() {
        if (item.isInativo()) {
            throw new ItemNaoAtivoException("Item está desativado.");
        }
        return true;
    }

    public Boolean validaDesconto() {
        if (pedidoItem.getValorDesconto() >= pedidoItem.getValorTotalSemDesconto()) {
            throw new DescontoException("Desconto maior ou igual a quantidade total.");
        }
        return true;
    }


}
