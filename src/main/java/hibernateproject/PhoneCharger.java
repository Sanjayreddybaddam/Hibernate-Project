package hibernateproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PhoneCharger {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
//		Charger c = new Charger();
//		c.setWatt(55);
//		
//		Phone p = new Phone();
//		p.setBrand("apple");
//		p.setPrice(80000);
//		p.setC(c);
		
//		et.begin();
//		em.persist(c);
//		em.persist(p);
//		et.commit();
		
//		Phone p = em.find(Phone.class, 3);
//		et.begin();
//		em.remove(p);
//		et.commit();
		
		Query query = em.createQuery("select p from Phone p");
		List<Phone> ph = query.getResultList();
		
		for(Phone phones:ph) {
			System.out.println(phones);
		}
		
		
		
	}

}
