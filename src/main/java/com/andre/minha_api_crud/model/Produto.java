package com.andre.minha_api_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity // Diz que isso é algo que pode ser salvo no caderninho
@Data // O Lombok ajuda a criar métodos comuns (get, set)
@NoArgsConstructor // Construtor vazio
@AllArgsConstructor // Construtor com todos os campos
public class Produto {
    @Id // Diz que este é o ID único do produto
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o ID automaticamente
    private Long id;
    private String nome;
    private double preco;
}