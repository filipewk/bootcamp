package br.com.bootcamp.exer17.excecoes;

public class ItemNaoAtivoException extends RuntimeException {

    public ItemNaoAtivoException(String message) {
        super(message);
    }
}
