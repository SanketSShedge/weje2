//ManyToOne unidirectional

package com.jspiders.hibernateprograms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernateprograms.dto.GroupDTO;
import com.jspiders.hibernateprograms.dto.MemberDTO;

public class GroupMemberDAO {
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
			
			GroupDTO group1 = new GroupDTO();
			group1.setId(1);
			group1.setName("Capgemini");
			
			MemberDTO mem1 = new MemberDTO();
			mem1.setId(1);
			mem1.setName("Paresh");
			mem1.setGroup(group1);
			manager.persist(mem1);
			
			MemberDTO mem2 = new MemberDTO();
			mem2.setId(2);
			mem2.setName("Suresh");
			mem2.setGroup(group1);
			manager.persist(mem2);
			
			manager.persist(group1);
			transaction.commit();
 			
		}finally {
			closeConnection();
		}
	}
}
