package br.com.coder.app.calculo;

import br.com.coder.app.Calculadora;
import br.com.coder.app.calculo.interno.OperacoesAritimeticas;
import br.com.coder.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private int id = 123;
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritimeticas.soma(nums);
	}
	
	

}
