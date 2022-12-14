package com.jspiders.hibernatemanytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernatemanytoone.dto.CompanyDTO;
import com.jspiders.hibernatemanytoone.dto.EmpDTO;

public class CompanyEmpDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("manytoone");
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
		}catch(TransactionException e) {
		System.out.println("Transaction is committed.");
	}
	}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			CompanyDTO company1 = new CompanyDTO();
			company1.setId(1);
			company1.setName("Capgemini");
			company1.setEmail("capg@gmail.com");
			
			manager.persist(company1);
			
			EmpDTO emp1 = new EmpDTO();
			emp1.setId(1);
			emp1.setName("Paresh");
			emp1.setEmail("paresh@capg.com");
			emp1.setCompany(company1);
			
			EmpDTO emp2 = new EmpDTO();
			emp2.setId(2);
			emp2.setName("Suresh");
			emp2.setEmail("suresh@capg.com");
			emp2.setCompany(company1);
			
			EmpDTO emp3 = new EmpDTO();
			emp3.setId(3);
			emp3.setName("Naresh");
			emp3.setEmail("naresh@capg.com");
			emp3.setCompany(company1);
			
			manager.persist(emp1);
			manager.persist(emp2);
			manager.persist(emp3);
			
			transaction.commit();
 			
		}finally {
			closeConnection();
		}
	}
}
