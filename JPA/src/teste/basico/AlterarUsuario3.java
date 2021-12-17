package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario u = em.find(Usuario.class, 4L);
		
		em.detach(u);// impede alteraçoes automaticamente sem pedir
		
		u.setEmail("djalma@djalma.com.br");
		
		// em.merge(u); pede update
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
}
