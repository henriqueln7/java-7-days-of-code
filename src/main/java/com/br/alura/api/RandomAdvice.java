package com.br.alura.api;

import java.net.URISyntaxException;

public class RandomAdvice implements HttpAdapter {
    @Override
    public void get() throws URISyntaxException {
        new ClientApiAdapter(this).makeRequest("https://api.adviceslip.com/advice");
    }
}
