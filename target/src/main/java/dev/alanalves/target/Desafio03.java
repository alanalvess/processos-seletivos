package dev.alanalves.target;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Desafio03 {

    private Integer dia;
    private Double valor;

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void lerJson() {

        Gson gson = new Gson();

        try (FileReader reader = new FileReader("dados.json")) {
            Type listType = new TypeToken<List<Desafio03>>() {}.getType();
            List<Desafio03> dados = gson.fromJson(reader, listType);

            Integer countDia = 0;
            Double soma = 0.0;
            Double media = 0.0;

            Double menorValor = dados.get(0).getValor();
            Double maiorValor = dados.get(0).getValor();

            for (Desafio03 dado : dados) {
                if (dado.getValor() < menorValor && dado.getValor() != 0) {
                    menorValor = dado.getValor();
                }
                if (dado.getValor() > maiorValor) {
                    maiorValor = dado.getValor();
                }
            }

            for (Desafio03 dado : dados) {
                if (dado.getValor() != 0) {
                    countDia ++;
                    soma += dado.getValor();
                    media = soma / countDia;
                }
            }

            System.out.println("       * O menor valor da lista é: R$ " + String.format("%,.2f", menorValor));
            System.out.println("       * O maior valor da lista é: R$ " + String.format("%,.2f", maiorValor));
            System.out.println("       * A media de valores da lista é: " + String.format("%,.2f", media));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
