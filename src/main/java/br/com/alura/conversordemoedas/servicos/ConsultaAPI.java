package br.com.alura.conversordemoedas.servicos;

import br.com.alura.conversordemoedas.modelos.ExchangeResponse;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    private static final String API_KEY = System.getenv("EXCHANGE_RATE_API_KEY");
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public ExchangeResponse buscarCotacao(String moedaBase) {
        String url = BASE_URL + API_KEY + "/latest/" + moedaBase;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ExchangeResponse.class);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar API: " + e.getMessage());
        }
    }
}

