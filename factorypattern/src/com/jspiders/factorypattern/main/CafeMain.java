package com.jspiders.factorypattern.main;

import java.util.Scanner;

import com.jspiders.factorypattern.inter.FastFood;
import com.jspiders.factorypattern.movies.Burger;
import com.jspiders.factorypattern.movies.Fries;
import com.jspiders.factorypattern.movies.Momos;
import com.jspiders.factorypattern.movies.Pizza;

public class CafeMain {
	static boolean loop = true;
	static FastFood fastFood;
	
	public static void main(String[] args) {
		while(loop) {
			try {
				foodFactory().FastFood();
			}catch(NullPointerException e) {
				System.out.println("No order selected.");
			}
		}
	}
	
	public static FastFood foodFactory() {
		System.out.println("Select a food to order:\n"
				+ "1. Pizza \n"
				+ "2. Burgir \n"
				+ "3. Fries \n"
				+ "4. Momos \n");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			fastFood = new Pizza();
			loop = false;
			return fastFood;

		case 2:
			fastFood = new Burger();
			loop = false;
			return fastFood;

		case 3:
			fastFood = new Fries();
			loop = false;
			return fastFood;

		case 4:
			fastFood = new Momos();
			loop = false;
			return fastFood;
			
		default:
			System.out.println("Invalid input.");
			loop = false;
			return fastFood;
		}
	}
}
