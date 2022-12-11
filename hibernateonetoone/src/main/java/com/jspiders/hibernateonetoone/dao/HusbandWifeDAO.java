package com.jspiders.hibernateonetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernateonetoone.dto.HusbandDTO;
import com.jspiders.hibernateonetoone.dto.WifeDTO;

public class HusbandWifeDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("onetoone");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	public static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("Transaction is committed.");
			}
			}
		}
			
	public static void main(String[] args) {
		try {
			
			openConnection();
			transaction.begin();
			
			WifeDTO wife = new WifeDTO();
			wife.setId(1);
			wife.setName("Daya");
			wife.setEmail("daya@123.com");
						
			HusbandDTO husband = new HusbandDTO();
			husband.setId(1);
			husband.setName("Jethalal");
			husband.setEmail("jetha@gada.com");
			
			husband.setWife(wife);
			
			manager.persist(wife);
			manager.persist(husband);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
