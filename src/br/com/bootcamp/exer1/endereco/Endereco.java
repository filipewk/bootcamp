package br.com.bootcamp.exer1.endereco;

public class Endereco {

    private String endereco;
    private int numero;
    private String bairro;

    public Endereco(String endereco, int numero, String bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
