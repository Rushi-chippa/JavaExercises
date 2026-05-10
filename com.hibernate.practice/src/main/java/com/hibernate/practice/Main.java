package com.hibernate.practice;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-trial");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Gadets g1 = new Gadets("Mobile");
		Gadets g2 = new Gadets("Laptop");
		em.persist(g1);
		em.persist(g2);

		Students s1 = new Students("rushi", List.of(g1, g2));
		em.persist(s1);
		
		tx.commit();
		em.close();

	}

}
