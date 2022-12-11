// OneToOne unidirectional

package com.jspiders.hibernateprograms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernateprograms.dto.KinguniDTO;
import com.jspiders.hibernateprograms.dto.QueenuniDTO;

public class KingQueenuniDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("state");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory != null) {
			factory.close();
		}
		if(manager != null) {
			manager.close();
		}
		if(transaction != null) {
			try {
				transaction.rollback();
			} catch(TransactionException e) {
				System.out.println("Transaction is committed.");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			QueenuniDTO queenuni = new QueenuniDTO();
			queenuni.setId(1);
			queenuni.setName("Devsena");
			
			manager.persist(queenuni);
			
			KinguniDTO kinguni = new KinguniDTO();
			kinguni.setId(1);
			kinguni.setName("Bahubali");
			
			manager.persist(kinguni);
			
			kinguni.setQueen(queenuni);
			
			transaction.commit();

		} finally {
			closeConnection();
		}
	}
}
