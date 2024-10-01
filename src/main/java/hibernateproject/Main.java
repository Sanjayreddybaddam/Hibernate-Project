package hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		HibernateProduct p1 = new HibernateProduct();
		p1.setBrand("samsung");
		p1.setPrice(25000);
		
		et.begin();
		em.persist(p1);
		et.commit();
	}

}
