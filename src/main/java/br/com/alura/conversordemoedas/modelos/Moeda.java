package br.com.alura.conversordemoedas.modelos;

public class Moeda {
    private String codigo;
    private String nome;
    private double valor;

    public Moeda(String codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
