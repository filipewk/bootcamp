package br.com.bootcamp.exer14;

import br.com.bootcamp.exer14.exception.AceleracaoException;
import br.com.bootcamp.exer14.exception.CarroTrocaMarchaException;

public class Carro {

    private Proprietario proprietario;
    private Marca marca;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual = 0;
    private Integer numeroDePortas;
    private Integer numeroDemarcha;
    private Integer marchaAtual;
    private Integer quantidadeCombustivel;

    public Carro(Integer quantidadeCombustivel, Marca marca, Proprietario proprietario) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.marca = marca;
        this.proprietario = proprietario;
    }

    public void acelera() {
        if (this.velocidadeAtual < this.velocidadeMaxima) {
            this.velocidadeAtual += + 1;
            this.marchaAtual = 1;
            System.out.println("Velocidade atual KM/H: " + this.getVelocidadeAtual());
        } else {
            throw new AceleracaoException("Velocidade maxima atingida");
        }
    }

    public void freia() {
        if (this.velocidadeAtual != 0) {
            this.setVelocidadeAtual(0);
            this.marchaAtual = 0;
            System.out.println("Carro freiado velocidade atual KM/H: " + this.getVelocidadeAtual());
        } else {
            System.out.println("Carro ja está parado.");
        }
    }

    public void trocaMarcha() {
        if (this.marchaAtual < this.numeroDemarcha) {
            this.marchaAtual += 1;
            System.out.println("Marcha trocada para: " + this.getMarchaAtual());
        } else {
            throw new CarroTrocaMarchaException("Ultrapassou o limite da marcha");
        }
    }

    public void reduzMarcha() {
        if (this.marchaAtual > 0) {
            this.marchaAtual -= 1;
            System.out.println("Marcha reduzida para: " + this.getMarchaAtual());
        } else {
            throw new CarroTrocaMarchaException("Não foi possivel reduzir");
        }
    }

    public void marchaRe() {
        if (this.marchaAtual == 0) {
            this.marchaAtual = -1;
            System.out.println("Marcha ré.");
        } else {
            throw new AceleracaoException("Precisa reduzir a marcha");
        }
    }

    public void autonomia(Integer consumoMedio) {
        System.out.println("Autonomia de: " + consumoMedio * this.quantidadeCombustivel + " KMS");
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroDemarcha() {
        return numeroDemarcha;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void setNumeroDemarcha(Integer numeroDemarcha) {
        this.numeroDemarcha = numeroDemarcha;
    }

    public void setMarchaAtual(Integer marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public Integer getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Integer quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "proprietario=" + proprietario +
                ", marca=" + marca +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                ", numeroDePortas=" + numeroDePortas +
                ", numeroDemarcha=" + numeroDemarcha +
                ", marchaAtual=" + marchaAtual +
                ", quantidadeCombustivel=" + quantidadeCombustivel +
                '}';
    }
}
