package com.jspiders.serializationdeserialization.user;

import java.io.Serializable;
import java.util.Scanner;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 714698928019828243L;
	
	int id;
	String userName;
	String password;
	
	Scanner scanner = new Scanner("Enter username?");
	Scanner scanner1 = new Scanner("Enter password?");
	
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User[ id= " + id + ", userName = "+ userName +", password = " + password +" ]";
	}
}
