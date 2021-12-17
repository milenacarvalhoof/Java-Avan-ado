package br.com.coder.app.financeiro;

import java.util.ServiceLoader;

import br.com.coder.app.Calculadora;

public class Teste2 {
	public static void main(String[] args) {
		//usando só a interface
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		
		
		System.out.println(calc.soma(2,3,4));
	}

}
