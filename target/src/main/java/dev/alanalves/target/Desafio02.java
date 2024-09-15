package dev.alanalves.target;

import dev.alanalves.target.utils.Cores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio02 {

    Scanner scanner = new Scanner(System.in);

    long n1 = 0;
    long n2 = 1;
    long n3 = 0;
    boolean entradaValida;
    boolean pertence;

    public void fibonacci() {

        while (!entradaValida) {
            System.out.print("       Digite o número que deseja conferir: ");

            try {
                long valorDigitado = scanner.nextLong();
                entradaValida = true;
                pertence = false;

                for (long i = 0; i <= valorDigitado; i++) {
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;

                    if (n3 == valorDigitado) {
                        pertence = true;
                        break;
                    }
                }

                if (pertence) {
                    System.out.printf("       O número %d pertence à sequência de Fibonacci.", valorDigitado);
                } else {
                    System.out.printf("       O número %d não pertence à sequência de Fibonacci.", valorDigitado);
                }

            } catch (InputMismatchException e) {
                System.out.println("       Por favor digite um número inteiro\n");
                scanner.nextLine();
            }
        }
    }
}
