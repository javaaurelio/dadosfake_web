package com.example.springboot.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.BookResourceAssembler;
import com.example.springboot.rest.dto.BookResource;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1/fake/dados")
public class ServicoWEB {

    private final BookResourceAssembler bookResourceAssembler;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/livro", method = RequestMethod.GET)
    public BookResource getById() {
        return bookResourceAssembler.toResource();
    }

}
