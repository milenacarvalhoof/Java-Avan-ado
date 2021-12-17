package HerancaJPA;

import java.util.List;

import infra.DAO;

public class Teste {
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<Object>();
		
		ClienteD c = new ClienteD("@c", "end", "123");
		c.setNome("milena");
		
		UsuarioD u = new UsuarioD("of", "456");
		u.setNome("carvalho");
		
		dao.abrirT()
			.incluir(c)
			.incluir(u)
			.fecharT()
			.fechar();
		
		
	}
}
