package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello () {
		return "Hello World!";
	}
	
	@GetMapping("/habilidades")
	public String getHabilidades () {
		return "Persistência para continuar aprendendo, atenção aos detalhes nos exercícios e comunicação para pedir ajuda e também ajudar.";
	}
	
	@GetMapping("/objetivo")
	public String getObjetivo () {
		return "Meu objetivo é realmente aprender e conseguir desenvolver com o conhecimento que tenho junto com o que estou adquirindo.";
	}

}