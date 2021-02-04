package br.com.bootcamp.exer16;

import java.time.LocalDate;
import java.time.Month;

public class exer16service {

    public static void main(String[] args) {
        VendaService vendaService = new VendaServiceImpl(new VendaDAOImpl());

        //vendas janeiro
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 1)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 2)));

        //vendas fevereiro
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 3)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 4)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 5)));

        //vendas de março
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 6)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 7)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 8)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 9)));

        LocalDate dataInicial = LocalDate.of(2021, Month.FEBRUARY, 1);
        LocalDate dataFinal = LocalDate.of(2021, Month.FEBRUARY, 28);

        Long totalVendas = vendaService.totalVendas(dataInicial, dataFinal);

        System.out.println("Foram feitas " + totalVendas + " vendas em fevereiro.");
    }
}
