package com.example.springboot.rest.dto;

import lombok.Data;

@Data
public class Livro {

    private String titulo;
    private String autor;
    private String ilustrador;
    private String resumo;
}
