package br.com.coder.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritimeticas {
	
	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (total, atual) -> total + atual);
	}
}
