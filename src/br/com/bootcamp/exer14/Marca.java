package br.com.bootcamp.exer14;

public class Marca {

    private Integer id;
    private String modelo;
    private String cor;
    private Integer ano;
    private String marca;
    private Integer chassi;

    public Marca(String modelo, String cor, Integer ano, String marca, Integer chassi) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getChassi() {
        return chassi;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", marca='" + marca + '\'' +
                ", chassi=" + chassi +
                '}';
    }
}
