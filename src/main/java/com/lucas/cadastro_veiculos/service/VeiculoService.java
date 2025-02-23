package com.lucas.cadastro_veiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.lucas.cadastro_veiculos.dto.VeiculoDto;
import com.lucas.cadastro_veiculos.entity.Veiculo;
import com.lucas.cadastro_veiculos.repository.VeiculoRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculRepository;

    private final WebClient webClient;

    String url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=ABC1234";


        //Validacao API externa do licenciamento.
    public Mono<String> validaLicenciamento(String placa){
        return webClient.get()
        .uri(url)
        .retrieve()
        .bodyToMono(String.class);
    }

    public VeiculoDto cadastraVeiculo(Veiculo veiculo){
        
        if(veiculRepository.findByCpf(veiculo.getCpf()).isPresent()){
            
        }
        
    }



}
