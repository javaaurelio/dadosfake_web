package com.example.springboot;

import java.util.Locale;

import org.springframework.stereotype.Component;

import com.example.springboot.rest.dto.BookResource;
import com.github.javafaker.Faker;

@Component
public class BookResourceAssembler {

    public BookResourceAssembler() {
    }

    public BookResource toResource() {

    	Faker faker = new Faker(new Locale("pt-BR"));
        BookResource bookResource = new BookResource();
        bookResource.setAuthor(faker.book().author());
        bookResource.setPages(faker.phoneNumber().phoneNumber());
        bookResource.setTitle(faker.book().title());
        return bookResource;
    }
}
