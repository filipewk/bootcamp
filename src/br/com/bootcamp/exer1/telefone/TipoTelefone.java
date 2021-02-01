package br.com.bootcamp.exer1.telefone;

public enum TipoTelefone {
    COMERCIAL("Telefone Comercial."),
    RESIDENCIAL("Telefone Residencial."),
    CELULAR("Telefone celular.");

    private String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
