package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

//	/calculadora/somar/10/20
	@GetMapping(path = "/somar/{a}/{b}")
	public String somar(@PathVariable int a, @PathVariable int b) {
		int soma = a+b;
		return "Resultado soma = " + soma;
	}
//	/calculadora/subtrair?a=100&b=39	
	@GetMapping(path = "/subtrair")
	public String subtrair(@RequestParam(name = "a") int a, @RequestParam (name = "b") int b) {
		int subtracao = a-b;
		return "Resultado subtração = " + subtracao;
	}
}
