package br.com.bootcamp.exer17.excecoes;

public class SemEstoqueException extends RuntimeException {

    public SemEstoqueException(String message) {
        super(message);
    }
}
