package br.com.bootcamp.exer5;

public class Main {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("José", "312312312", 1500, 100);

        double valor2 = empregado.calculaValorTotalSalario();
        empregado.setNome("Marcio Pereira");
        System.out.println(empregado.getNome());
        System.out.println(valor2);
    }
}
