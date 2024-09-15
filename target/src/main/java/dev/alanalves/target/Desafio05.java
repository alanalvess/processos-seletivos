package dev.alanalves.target;

import java.util.Scanner;

public class Desafio05 {

    public String inverter() {
        Scanner scanner = new Scanner(System.in);
        scanner.skip("\\R?");

        String original = scanner.nextLine();


        String inverso = "";


        for (int i = original.length() - 1; i >= 0; i--) {
            inverso += original.charAt(i);
        }

        return "       Caracteres invertidos: " + inverso;
    }

}
