package br.com.coder.app.financeiro;

import java.lang.reflect.Field;

import br.com.coder.app.calculo.CalculadoraImpl;
import br.com.coder.app.calculo.interno.OperacoesAritimeticas;

public class Teste {
	
	public static void main(String[] args) {
		
		CalculadoraImpl calc = new CalculadoraImpl();
		System.out.println(calc.soma(2, 3, 4));
		
		OperacoesAritimeticas op = new OperacoesAritimeticas();
		System.out.println(op.soma(4,5,6));
		
		try {
			Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, 456);
			System.out.println(fieldId.get(calc));
			fieldId.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
