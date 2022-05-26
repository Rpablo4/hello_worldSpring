package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Helloword {
	@GetMapping
	public String home() {
		return "<h1>Hello World!</h1><br><h2>Habilidades:</h2><br>"
				+ "Trabalho em equipe;<br>Atenção aos detalhes;<br>"
				+ "Proatividade;<br>Comunicação.<br><h2>Mentalidades:</h2>"
				+ "Responsabilidade pessoal;<br>Mentalidade de crescimento;"
				+ "<br>Orientação ao futuro;<br>Persistência.";
	}
	
}
