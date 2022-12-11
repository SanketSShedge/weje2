package com.jspiders.serializationdeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.jspiders.serializationdeserialization.user.User;

public class Main1 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many record you want to enter in file :- ");
		int noOfRecord = scanner.nextInt();
		for (int i = 1; i <= noOfRecord; i++) {
			System.out.println("Enter " + i + " Record, ");
			System.out.print("Enter ID :- ");
			int id = scanner.nextInt();
			System.out.print("Enter username :- ");
			String userName = scanner.next();
			System.out.print("Enter Password :- ");
			String password = scanner.next();

		User user = new User(id, userName, password);
		File file = new File("D:\\file.txt");
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\file.txt");
			try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
			objectOutputStream.writeObject(user);
//			System.out.println("Object written.");
//			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileIn = new FileInputStream("D:\\file.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileIn);
			User readObject;
			try {
			readObject = (User) objectInputStream.readObject();
			System.out.println(user);
			System.out.println(readObject);
			objectInputStream.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		scanner.close();
	}
}


