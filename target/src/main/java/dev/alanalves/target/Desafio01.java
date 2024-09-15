package dev.alanalves.target;

public class Desafio01 {

    int indice = 13;
    int soma = 0;
    int k = 0;

    public int soma() {
        while (k < indice) {
            k=k+1;
            soma = soma + k;
        }

        //        System.out.println("       Ao final do processamento, a soma é: " + soma );

        return soma;
    }
}
