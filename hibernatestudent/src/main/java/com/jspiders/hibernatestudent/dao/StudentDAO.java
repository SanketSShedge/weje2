package com.jspiders.hibernatestudent.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernatestudent.dto.StudentDTO;

public class StudentDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

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
			
			StudentDTO student = new StudentDTO();
			student.setId(1);
			student.setName("Ajit");
			student.setEmail("ajit@sujit.com");

			manager.persist(student);
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
