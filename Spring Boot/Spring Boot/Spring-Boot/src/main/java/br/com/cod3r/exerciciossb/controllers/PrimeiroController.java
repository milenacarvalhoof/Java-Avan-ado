package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	// ex: localhost:8080/ola
	// pode colocar mais de uma string que pode ser utilizada
	// @RequestMapping(method = RequestMethod.GET, path = "/ola") pode ser essa
	@GetMapping(path = { "/ola", "/saudacao"})//ou essa
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	//Não pode ter url repetida nos metodos
//	@GetMapping(path = {"/saudacao" })
//	public String saudacao() {
//		return "Olá Spring Boot!";
//	}
	
//	@PostMapping pode repetir mas depende do GetMapping

}
