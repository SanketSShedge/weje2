//ManyToMany unidirectional

package com.jspiders.hibernateprograms.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernateprograms.dto.PlayeruniDTO;
import com.jspiders.hibernateprograms.dto.TeamuniDTO;

public class TeamPlayeruniDAO {
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
				factory.close();
			} catch(TransactionException e) {
				System.out.println("Transaction is committed.");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			TeamuniDTO team1 = new TeamuniDTO();
			team1.setId(1);
			team1.setName("Cricket");
			
			TeamuniDTO team2 = new TeamuniDTO();
			team2.setId(2);
			team2.setName("Kabaddi");
			
			PlayeruniDTO player1 = new PlayeruniDTO();
			player1.setId(1);
			player1.setName("Ramesh");
			
			PlayeruniDTO player2 = new PlayeruniDTO();
			player2.setId(2);
			player2.setName("Suresh");
			
			List<PlayeruniDTO> player = Arrays.asList(player1, player2);
			
			team1.setPlayer(player);
			team2.setPlayer(player);
			
			manager.persist(player1);
			manager.persist(player2);
			manager.persist(team1);
			manager.persist(team2);
			
			transaction.commit();
			
		}finally {
			closeConnection();
		}
	}
}
