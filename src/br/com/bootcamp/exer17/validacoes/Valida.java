package br.com.bootcamp.exer17.validacoes;

import br.com.bootcamp.exer17.excecoes.DescontoException;
import br.com.bootcamp.exer17.excecoes.ItemNaoAtivoException;
import br.com.bootcamp.exer17.excecoes.SemEstoqueException;
import br.com.bootcamp.exer17.excecoes.ValorUnitarioZeradoException;
import br.com.bootcamp.exer17.models.Pedido;
import br.com.bootcamp.exer17.models.PedidoItem;

public class Valida {

    private Pedido pedido;
    private PedidoItem pedidoItem;

    public Valida(Pedido pedido) {
        this.pedido = pedido;
    }

    public Boolean validaValorUnitario() {
        for (int i = 0; i < pedido.getItem().size(); i++)  {
            if (pedido.getItem().get(i).getValorUnitario() == 0) {
                throw new ValorUnitarioZeradoException("Valor unitario não pode ser zero.");
            }
        }
        return true;
    }

    public Boolean validadeSeTemEstoque() {
        for (int i = 0; i < pedido.getItem().size(); i++) {
           if(pedido.getItem().get(i).getQuantidade() >  pedido.getItem().get(i).getItem().getQuantidadeEmEstoque()) {
               throw new SemEstoqueException("Produto sem estoque.");
           }
        }
        return true;
    }

    public Boolean validaItemAtivos() {
        for (int i = 0; i < pedido.getItem().size(); i++) {
            if (pedido.getItem().get(i).getItem().isInativo()) {
                throw new ItemNaoAtivoException("Item está desativado.");
            }
        }
        return true;
    }
}
