package br.com.alura.conversordemoedas.principal;

import br.com.alura.conversordemoedas.servicos.ConversorMoeda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();
        int opcao;

        do {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("1) Dólar → Real brasileiro");
            System.out.println("2) Real brasileiro → Dólar");
            System.out.println("3) Dólar → Peso argentino");
            System.out.println("4) Peso argentino → Dólar");
            System.out.println("5) Dólar → Peso colombiano");
            System.out.println("6) Peso colombiano → Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.print("Digite o valor a converter: ");
                double valor = scanner.nextDouble();
                String origem = "";
                String destino = "";

                switch (opcao) {
                    case 1 -> { origem = "USD"; destino = "BRL"; }
                    case 2 -> { origem = "BRL"; destino = "USD"; }
                    case 3 -> { origem = "USD"; destino = "ARS"; }
                    case 4 -> { origem = "ARS"; destino = "USD"; }
                    case 5 -> { origem = "USD"; destino = "COP"; }
                    case 6 -> { origem = "COP"; destino = "USD"; }
                }

                try {
                    double resultado = conversor.converter(origem, destino, valor);
                    System.out.printf("%.2f %s = %.2f %s%n", valor, origem, resultado, destino);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } else if (opcao == 7) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 7);

        scanner.close();
    }
}

