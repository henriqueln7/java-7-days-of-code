package com.br.alura.api;

import java.net.URISyntaxException;

public class YodaTranslate implements HttpAdapter {
    @Override
    public void get() throws URISyntaxException {
        new ClientApiAdapter(this).makeRequest("https://api.funtranslations.com/translate/yoda.json?text=Master%20Obiwan%20has%20lost%20a%20planet.");
    }
}
