module app.calculo {	
	//requires é dependencia de um modulo
	//transitive é dependencia automatica dos modulos que o modulo depende
	requires transitive app.logging;
	exports br.com.coder.app.calculo;
	
	//exports to é para só aquele modulo poder acessar se precisar
	exports br.com.coder.app.calculo.interno
		to app.financeiro;//pode por virgula e por mais modulos
	
	//abre modulo para ser alterado por app.financeiro
	opens br.com.coder.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.coder.app.Calculadora
		with br.com.coder.app.calculo.CalculadoraImpl;
}