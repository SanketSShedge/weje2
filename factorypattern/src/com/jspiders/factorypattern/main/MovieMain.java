package com.jspiders.factorypattern.main;

import java.util.Scanner;

import com.jspiders.factorypattern.inter.Movie;
import com.jspiders.factorypattern.movies.Farzand;
import com.jspiders.factorypattern.movies.Fatteshikast;
import com.jspiders.factorypattern.movies.Pawankhind;
import com.jspiders.factorypattern.movies.SherShivraj;

public class MovieMain {
	static boolean loop = true;
	static Movie movie;
	
	public static void main(String[] args) {
		while(loop) {
			try {
				movieFactory().nowPlaying();
			}catch(NullPointerException e) {
				System.out.println("No movie selected.");
			}
		}
	}
	
	public static Movie movieFactory() {
		System.out.println("Select a movie to watch:\n"
				+ "1. Farzand \n"
				+ "2. Fatteshikast \n"
				+ "3. Pawankhind \n"
				+ "4. SherShivraj \n");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			movie = new Farzand();
			loop = false;
			return movie;

		case 2:
			movie = new Fatteshikast();
			loop = false;
			return movie;

		case 3:
			movie = new Pawankhind();
			loop = false;
			return movie;

		case 4:
			movie = new SherShivraj();
			loop = false;
			return movie;
			
		default:
			System.out.println("Invalid choice.");
			loop = false;
			return movie;
		}
	}
}
