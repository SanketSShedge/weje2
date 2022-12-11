package com.jspiders.serializationdeserialization.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdeserialization.user.User;

public class Main {
	public static void main(String[] args) {
		
		User user = new User(1,"Sanket","Sanket123");
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\file.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
			objectOutputStream.writeObject(user);
			System.out.println("Object written.");
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileIn = new FileInputStream("D:\\file.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileIn);
			User readObject = (User) objectInputStream.readObject();
			System.out.println(readObject);
			objectInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
