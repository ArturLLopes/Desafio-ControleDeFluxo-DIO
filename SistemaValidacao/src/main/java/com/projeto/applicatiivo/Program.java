package com.projeto.applicatiivo;

import com.projeto.domain.Contador;
import com.projeto.domain.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int primeiroParametro = lerInteiro(scanner, "Digite o primeiro número: ");
            int segundoParametro = lerInteiro(scanner, "Digite o segundo número: ");

            Contador contador = new Contador();
            contador.executarContagem(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
}

