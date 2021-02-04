package br.com.bootcamp.exer14;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco(
                "Rua 2", "Jardim ipe", 873, "Pato Branco", "PR", 85856178);
        Proprietario proprietario = new Proprietario("Filipe", "1231231", "32123", endereco);
        Marca marca = new Marca("Corsa", "Branco", 2000, "Chevrolet", 978841752);
        Carro carro = new Carro(50, marca, proprietario);

        carro.setNumeroDemarcha(5);
        carro.setNumeroDePortas(4);
        carro.setVelocidadeMaxima(120);

        System.out.println(carro.getMarca());
        System.out.println(carro.getProprietario());

        System.out.println("");
        System.out.println("ACELERA:");
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();

        System.out.println("");
        carro.trocaMarcha();
        carro.reduzMarcha();

        System.out.println("");
        carro.freia();
        carro.acelera();
        carro.marchaRe(); // reduzir acelerado

        System.out.println("");
        carro.autonomia(8);

    }
}
