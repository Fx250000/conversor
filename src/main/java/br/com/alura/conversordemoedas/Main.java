package br.com.alura.conversordemoedas;

import br.com.alura.conversordemoedas.servicos.ConsultaAPI;
import br.com.alura.conversordemoedas.servicos.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Conversor de Moedas ===");
        var resp = new ConsultaAPI().buscarCotacao("USD");

        ConversorMoeda conversor = new ConversorMoeda();
        double resultado = conversor.converter("USD", "BRL", 100.0);
        System.out.printf("100 USD = %.2f BRL%n", resultado);


    }
}
