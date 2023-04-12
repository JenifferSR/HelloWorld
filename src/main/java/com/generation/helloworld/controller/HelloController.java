package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62 !</b>";
	}

	@GetMapping("/nome")
	public String meuNome() {
		return "<b> Hello!<br />Jeniffer Souza </b>";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Responsabilidade Pessoal<br />" + "Mentalidade de Crescimento<br />" + "Orientação ao Futuro<br />"
				+ "Persistência<br />" + "Comunicação<br />" + "Orientação aos Detalhes<br />"
				+ "Trabalho em Equipe<br />" + "Proatividade</b>";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivos- Mentalidade de Crescimento<br /><br />"
				+ "<b>Mentalidade de crescimento é a crença de que você pode melhorar ao longo dotempo com a prática.<br />"
				 + "- Aprender o maximo possivel para dominar os assuntos. ";
	}
}
