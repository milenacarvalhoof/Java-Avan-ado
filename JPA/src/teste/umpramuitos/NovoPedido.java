package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Blusa", 19.90);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, p1, 2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(p1)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();			
		
	}
}
