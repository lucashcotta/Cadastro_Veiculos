package com.lucas.cadastro_veiculos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.cadastro_veiculos.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Long, Veiculo> {
    Optional<Veiculo> findByCpf(String cpf);
    Optional<Veiculo> findByPlaca(String placa);

}
