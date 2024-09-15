package dev.alanalves.target;

public class Desafio04 {


    double sp = 67836.43;
    double rj = 36678.66;
    double mg = 29229.88;
    double es = 27165.48;
    double outros = 19849.53;

    double soma = sp + rj + mg + es + outros;

    double porcentagemSp = sp/soma*100;
    double porcentagemRj = rj/soma*100;
    double porcentagemMg = mg/soma*100;
    double porcentagemEs = es/soma*100;
    double porcentagemOutros = outros/soma*100;

    public void porcentagens() {
        System.out.printf("       * São Paulo arrecadou %,.2f%% do total de R$ %,.2f", porcentagemSp, soma);
        System.out.printf("\n       * Rio de Janeiro arrecadou %,.2f%% do total de R$ %,.2f", porcentagemRj, soma);
        System.out.printf("\n       * Minas Gerais arrecadou %,.2f%% do total de R$ %,.2f", porcentagemMg, soma);
        System.out.printf("\n       * Espírito Santos arrecadou %,.2f%% do total de R$ %,.2f", porcentagemEs, soma);
        System.out.printf("\n       * Os demais estados arrecaram juntos %,.2f%% do total de R$ %,.2f", porcentagemOutros, soma);
    }
}
