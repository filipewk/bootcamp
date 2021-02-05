package br.com.bootcamp.exer17;

import br.com.bootcamp.exer17.dao.*;
import br.com.bootcamp.exer17.enuns.FormaDePagamento;
import br.com.bootcamp.exer17.models.*;
import br.com.bootcamp.exer17.service.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //CLIENTE
        Cliente cliente = new Cliente("José", "35344124", "jose@pecas.com.br");

        //VENDEDOR
        Vendedor vendedor = new Vendedor("Marlon");

        // ITENS
        Item parafuso = new Item("Parafuso", 5);
        Item prego = new Item("Prego", 3);
        Item martelo = new Item("Martelo", 8);
        Item chaveDeFenda = new Item("Chave de Fenda", 7);
        Item chave = new Item("Chave", 2);
        Item peca = new Item("Peça", 18);

        //PEDIDOS ITENS
        PedidoItem pedidoItem = new PedidoItem(parafuso, 2, 3.50, 1.0);
        PedidoItem pedidoItem2 = new PedidoItem( prego, 3, 1.50, 0.50);
        PedidoItem pedidoItem3 = new PedidoItem(martelo, 5, 23.50, 10.0);
        PedidoItem pedidoItem4 = new PedidoItem(chaveDeFenda, 1, 13.00, 2.0);
        PedidoItem pedidoItem5 = new PedidoItem(chave, 1, 10.0, 1.0);
        PedidoItem pedidoItem6 = new PedidoItem(peca, 10, 11.20, 2.0);

        //EMAIL
        Email email = new Email();

        //DAOS
        ItemDAOImpl daoItem = new ItemDAOImpl();
        PedidoDAOImpl daoPedido = new PedidoDAOImpl();
        PedidoItemImpl daoPedidoItem = new PedidoItemImpl();
        VendedorDAOImpl daoVendedor = new VendedorDAOImpl();
        ClienteDAOImpl daoCliente = new ClienteDAOImpl();

        //SERVICES
        ClienteServiceImpl clienteService = new ClienteServiceImpl(daoCliente);
        EmailServiceImpl emailService = new EmailServiceImpl(email);
        ItemServiceImpl itemService = new ItemServiceImpl(daoItem);
        PedidoItemServiceImpl pedidoItemService = new PedidoItemServiceImpl(daoPedidoItem);
        PedidoServiceImpl pedidoService = new PedidoServiceImpl(daoPedido);
        VendedorServiceImpl vendedorService = new VendedorServiceImpl(daoVendedor);

        //VENDEDOR CLIENTE
        vendedorService.inserir(vendedor);
        clienteService.inserir(cliente);

        // ADICIONAR ITEM
        itemService.inserir(parafuso);
        itemService.inserir(prego);
        itemService.inserir(martelo);
        itemService.inserir(chaveDeFenda);
        itemService.inserir(chave);
        itemService.inserir(peca);

        //ADICIONAR PEDIDO ITEM
        pedidoItemService.inserir(pedidoItem);
        pedidoItemService.inserir(pedidoItem2);
        pedidoItemService.inserir(pedidoItem3);
        pedidoItemService.inserir(pedidoItem4);
        pedidoItemService.inserir(pedidoItem5);
        pedidoItemService.inserir(pedidoItem6);

        // PEDIDOS
        Pedido pedido = new Pedido(cliente, vendedor, LocalDateTime.now(),
                FormaDePagamento.DINHEIRO, pedidoItemService.buscarTodos());

        //ADICIONAR PEDIDO
        pedidoService.inserir(pedido);

        System.out.println(pedidoItemService.buscarTodos());
    }
}
