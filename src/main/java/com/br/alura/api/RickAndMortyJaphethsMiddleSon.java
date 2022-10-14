package com.br.alura.api;

import java.net.URISyntaxException;

public class RickAndMortyJaphethsMiddleSon implements HttpAdapter {

    @Override
    public void get() throws URISyntaxException {
        new ClientApiAdapter(this).makeRequest("https://rickandmortyapi.com/api/character/676");
    }
}
