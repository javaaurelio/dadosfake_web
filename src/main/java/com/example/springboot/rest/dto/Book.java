package com.example.springboot.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Integer id;
    private String title;
    private String author;
    private Integer pages;
}
