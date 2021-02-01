package br.com.bootcamp.exer1.telefone;

public class Telefone {

    private TipoTelefone tipoTelefone;
    private int ddd;
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public int getNumero() {
        return numero;
    }

    public int getDdd() {
        return ddd;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tipoTelefone=" + tipoTelefone.getDescricao() +
                ", ddd=" + ddd +
                ", numero=" + numero +
                '}';
    }
}
