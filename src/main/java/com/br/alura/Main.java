package com.br.alura;

import com.br.alura.api.ClientApiAdapter;
import com.br.alura.api.YodaTranslate;
import com.br.alura.api.RandomAdvice;
import com.br.alura.api.RickAndMortyJaphethsMiddleSon;

import java.net.URISyntaxException;

public class Main {
        public static void main(String[] args) throws URISyntaxException {
            YodaTranslate yodaTranslate = new YodaTranslate();
            new ClientApiAdapter(yodaTranslate);

            yodaTranslate.get();

            RandomAdvice randomAdvice = new RandomAdvice();
            new ClientApiAdapter(randomAdvice);

            randomAdvice.get();

            RickAndMortyJaphethsMiddleSon rickAndMortyJaphethsMiddleSon = new RickAndMortyJaphethsMiddleSon();
            new ClientApiAdapter(rickAndMortyJaphethsMiddleSon);

            rickAndMortyJaphethsMiddleSon.get();
    }
}
