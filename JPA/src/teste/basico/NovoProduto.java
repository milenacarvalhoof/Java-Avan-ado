package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		
		Produto p = new Produto("monitor", 179.89);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		dao.incluirAtomico(p);
		
	}

}
