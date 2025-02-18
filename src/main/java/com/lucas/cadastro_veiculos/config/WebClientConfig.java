package com.lucas.cadastro_veiculos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientConfig {


    @Bean
    public WebClient webClient(){
        return WebClient.builder()
        .baseUrl("https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=ABC1234")
        .build();
    }
}
