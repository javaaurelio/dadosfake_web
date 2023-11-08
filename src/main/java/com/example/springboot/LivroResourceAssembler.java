package com.example.springboot;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springboot.rest.dto.Livro;
import com.github.javafaker.Faker;

import lombok.Getter;

@Component
@Getter
public class LivroResourceAssembler {

    public LivroResourceAssembler() {
    }

    public Livro toResource() {

    	Faker faker = new Faker(new Locale("pt-BR"));
        Livro bookResource = new Livro();
        bookResource.setAutor(faker.book().author());
        bookResource.setIlustrador(faker.book().author());
        bookResource.setTitulo(faker.book().title());
        bookResource.setResumo(faker.shakespeare().kingRichardIIIQuote());
        return bookResource;
    }
}
