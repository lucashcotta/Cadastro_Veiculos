package com.lucas.cadastro_veiculos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Veiculo {

    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="ID")
    private long id;

    @Column(name="Proprietário",nullable=false)
    private String proprietario;


    @Column(name="CPF",nullable=false)
    private String cpf;

    @Column(name="Placa",nullable=false)
    private String placa;


    @Column(name="Chassi", nullable = true)
    private String chassi;

    @Column(name="Marca", nullable=true)
    private String marca;

    @Column(name="Modelo", nullable=true)
    private String modelo;

    @Column(name="Licenciamento", nullable=false)
    private boolean licenciamento;




}
