package com.jspiders.manytomanyredundancy.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.manytomanyredundancy.dto.CustomerredDTO;
import com.jspiders.manytomanyredundancy.dto.ProductredDTO;

public class CustomerProductredDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("manytomany");
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
			
			CustomerredDTO customer1 = new CustomerredDTO();
			customer1.setId(1);
			customer1.setName("Virat");
			customer1.setEmail("virat@bcci.com");
			
			CustomerredDTO customer2 = new CustomerredDTO();
			customer2.setId(2);
			customer2.setName("Messi");
			customer2.setEmail("messi@fifa.com");
			
			CustomerredDTO customer3 = new CustomerredDTO();
			customer3.setId(3);
			customer3.setName("Mary Kom");
			customer3.setEmail("mary@bfi.com");
			
			ProductredDTO product1 = new ProductredDTO();
			product1.setId(1);
			product1.setName("Shoes");
			product1.setPrice(80000.00);
			
			ProductredDTO product2 = new ProductredDTO();
			product2.setId(2);
			product2.setName("T-shirts");
			product2.setPrice(999.99);
			
			ProductredDTO product3 = new ProductredDTO();
			product3.setId(3);
			product3.setName("Watch");
			product3.setPrice(5000.00);
			
			List<CustomerredDTO> customers = Arrays.asList(customer1, customer2, customer3);
			List<ProductredDTO> products = Arrays.asList(product1, product2, product3);
			
			customer1.setProducts(products);
			customer1.setProducts(products);
			customer1.setProducts(products);
			customer2.setProducts(products);
			customer2.setProducts(products);
			customer2.setProducts(products);
			customer3.setProducts(products);
			customer3.setProducts(products);
			customer3.setProducts(products);
			
			product1.setCustomers(customers);
			product2.setCustomers(customers);
			product3.setCustomers(customers);
			
			manager.persist(product1);
			manager.persist(product2);
			manager.persist(product3);
			manager.persist(customer1);
			manager.persist(customer2);
			manager.persist(customer3);

			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
