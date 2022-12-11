// OneToMany unidirectional

package com.jspiders.hibernateprograms.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernateprograms.dto.StudDTO;
import com.jspiders.hibernateprograms.dto.TeacherDTO;

public class TeacherStudDAO {
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
		}catch(TransactionException e) {
		System.out.println("Transaction is committed.");
	}
	}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			TeacherDTO teacher1 = new TeacherDTO();
			teacher1.setId(1);
			teacher1.setName("Tukaram");
			
			StudDTO stud1 = new StudDTO();
			stud1.setId(1);
			stud1.setName("Atmaram");
			
			manager.persist(stud1);
			
			StudDTO stud2 = new StudDTO();
			stud2.setId(2);
			stud2.setName("Chhota Bheem");
			
			manager.persist(stud2);
			
			List<StudDTO> student = Arrays.asList(stud1, stud2);
			teacher1.setStudents(student);
			
			manager.persist(teacher1);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
