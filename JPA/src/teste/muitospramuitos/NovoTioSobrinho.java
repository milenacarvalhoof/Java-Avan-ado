package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
	public static void main(String[] args) {
		
		Tio tia = new Tio("Maria");
		Tio tio = new Tio("João");
		
		Sobrinho sobrinha = new Sobrinho("Davi");
		Sobrinho sobrinho = new Sobrinho("Ana");
		
		tia.getSobrinhos().add(sobrinho);
		tia.getSobrinhos().add(sobrinha);
		
		tio.getSobrinhos().add(sobrinho);
		tio.getSobrinhos().add(sobrinha);
		
		sobrinho.getTios().add(tia);
		sobrinho.getTios().add(tio);
		
		sobrinha.getTios().add(tio);
		sobrinha.getTios().add(tia);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
			.incluir(tia)
			.incluir(tio)
			.incluir(sobrinha)
			.incluir(sobrinho)
			.fecharT()
			.fechar();
	}
}
