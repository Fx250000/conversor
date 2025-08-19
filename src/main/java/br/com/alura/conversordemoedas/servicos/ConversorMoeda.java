package br.com.alura.conversordemoedas.servicos;

import br.com.alura.conversordemoedas.modelos.ExchangeResponse;

public class ConversorMoeda {
    private ConsultaAPI consultaAPI;

    public ConversorMoeda() {
        this.consultaAPI = new ConsultaAPI();
    }

    /**
     * Converte um valor de moedaOrigem para moedaDestino.
     */
    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        ExchangeResponse response = consultaAPI.buscarCotacao(moedaOrigem);

        if (response.getConversion_rates().containsKey(moedaDestino)) {
            double taxa = response.getConversion_rates().get(moedaDestino);
            return valor * taxa;
        }
        throw new IllegalArgumentException("Moeda não encontrada: " + moedaDestino);
    }
}
