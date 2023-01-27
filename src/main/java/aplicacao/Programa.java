package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

//Inserindo dados no banco de dados
public class Programa {

	public static void main(String[] args) {
		 
		Pessoa p1 = new Pessoa(null, " Verena Farias", " verenafarias@gmail.com");
		Pessoa p2 = new Pessoa(null, " Maria", " maria@gmail.com");
		Pessoa p3 = new Pessoa(null, " Rosane", " rosane@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
