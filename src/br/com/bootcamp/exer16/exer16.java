package br.com.bootcamp.exer16;

import java.time.LocalDate;
import java.time.Month;

public class exer16 {

    public static void main(String[] args) {
        VendaDAO dao = new VendaDAOImpl();

        //vendas janeiro
        dao.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 1)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 2)));

        //vendas fevereiro
        dao.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 3)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 4)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 5)));

        //vendas de março
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 6)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 7)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 8)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 9)));

        LocalDate dataInicial = LocalDate.of(2021, Month.FEBRUARY, 1);
        LocalDate dataFinal = LocalDate.of(2021, Month.FEBRUARY, 28);

        Long totalVendas = dao.totalVendas(dataInicial, dataFinal);

        System.out.println("Foram feitas " + totalVendas + " vendas em fevereiro.");
    }
}
