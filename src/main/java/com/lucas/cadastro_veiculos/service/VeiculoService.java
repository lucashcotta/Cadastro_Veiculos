package com.lucas.cadastro_veiculos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class VeiculoService {

    private final WebClient webClient;

    String url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=ABC1234";


        //Validacao API externa do licenciamento.
    public Mono<String> validaLicenciamento(String placa){
        return webClient.get()
        .uri(url)
        .retrieve()
        .bodyToMono(String.class);
    }

    



}
