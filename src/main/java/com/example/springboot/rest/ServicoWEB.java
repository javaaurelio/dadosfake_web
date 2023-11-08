package com.example.springboot.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.LivroResourceAssembler;
import com.example.springboot.rest.dto.Livro;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1/fake/dados")
public class ServicoWEB {

	private final LivroResourceAssembler livroResourceAssembler;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/livro", method = RequestMethod.GET)
	public Livro gerarDadosLivro(HttpServletResponse response) {

		Livro resource = livroResourceAssembler.toResource();

		response.addHeader("versao", livroResourceAssembler.getVersao());
		response.addHeader("Processamento", LocalDateTime.now().toString());
		System.out.println("--:" + LocalDateTime.now() + " - " + resource);
		return resource;
	}

}
