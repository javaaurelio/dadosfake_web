package com.example.springboot.rest.dto;

import lombok.Data;

@Data
public class BookResource {

    private String title;
    private String author;
    private String pages;
}
