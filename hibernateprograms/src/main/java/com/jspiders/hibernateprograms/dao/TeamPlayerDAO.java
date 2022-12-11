//ManyToMany bidirectional(avoided redundancy)

package com.jspiders.hibernateprograms.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernateprograms.dto.PlayerDTO;
import com.jspiders.hibernateprograms.dto.TeamDTO;

public class TeamPlayerDAO {
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
			
			TeamDTO team1 = new TeamDTO();
			team1.setId(1);
			team1.setName("Cricket");
			
			TeamDTO team2 = new TeamDTO();
			team2.setId(2);
			team2.setName("Kabaddi");
			
			PlayerDTO player1 = new PlayerDTO();
			player1.setId(1);
			player1.setName("Ramesh");
			
			PlayerDTO player2 = new PlayerDTO();
			player2.setId(2);
			player2.setName("Suresh");
			
			List<TeamDTO> team = Arrays.asList(team1, team2);
			List<PlayerDTO> player = Arrays.asList(player1, player2);
			
			player1.setTeam(team);
			player1.setTeam(team);
			player2.setTeam(team);
			player2.setTeam(team);
			
			team1.setPlayer(player);
			team2.setPlayer(player);
			
			manager.persist(team1);
			manager.persist(team2);
			manager.persist(player1);
			manager.persist(player2);
			
			transaction.commit();
			
		}finally {
			closeConnection();
		}
	}
}