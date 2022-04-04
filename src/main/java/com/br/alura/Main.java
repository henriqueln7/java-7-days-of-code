package com.br.alura;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.*;

import static java.net.http.HttpRequest.newBuilder;
import static java.text.MessageFormat.format;

public class Main {

    public static final String IMDB_TOP_250_MOVIES_ENDPOINT = "https://imdb-api.com/en/API/Top250Movies/{0}";

    public static void main(String[] args) throws URISyntaxException {
        String apiKey = System.getenv("API_KEY");
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = newBuilder(new URI(format(IMDB_TOP_250_MOVIES_ENDPOINT, apiKey))).GET().build();

        httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                  .thenApply(HttpResponse::body)
                  .thenAccept(System.out::println)
                  .join();

    }
}
