package com.br.alura.api;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpRequest.newBuilder;
import static java.text.MessageFormat.format;

public class ClientApiAdapter {
    private final HttpAdapter httpAdapter;

    public ClientApiAdapter(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void makeRequest(String url) throws URISyntaxException {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = newBuilder(new URI(format(url))).GET().build();

        httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
