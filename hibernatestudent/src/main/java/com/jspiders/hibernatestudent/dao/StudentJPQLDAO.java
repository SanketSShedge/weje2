package com.jspiders.hibernatestudent.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;

import com.jspiders.hibernatestudent.dto.StudentJPQLDTO;

public class StudentJPQLDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static String query;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
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
			
			StudentJPQLDTO student1 = new StudentJPQLDTO();
			student1.setId(1);
			student1.setName("Ajit");
			student1.setEmail("ajit@sujit.com");
			
			StudentJPQLDTO student2 = new StudentJPQLDTO();
			student2.setId(2);
			student2.setName("Sujit");
			student2.setEmail("Sujit@ranjit.com");
			
			StudentJPQLDTO student3 = new StudentJPQLDTO();
			student3.setId(3);
			student3.setName("Ranjit");
			student3.setEmail("ranjit@ajit.com");

			manager.persist(student1);
			manager.persist(student2);
			manager.persist(student3);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}	
}
