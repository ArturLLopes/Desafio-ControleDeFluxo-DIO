package com.projeto.domain;

import com.projeto.domain.exception.ParametrosInvalidosException;

public class Contador {

    public void executarContagem(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        validarParametros(primeiroParametro, segundoParametro);
        imprimirContagem(primeiroParametro, segundoParametro);
    }

    private void validarParametros(int primeiro, int segundo) throws ParametrosInvalidosException {
        if (primeiro >= segundo) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    private void imprimirContagem(int inicio, int fim) {
        int total = fim - inicio;

        for (int i = 1; i <= total; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
