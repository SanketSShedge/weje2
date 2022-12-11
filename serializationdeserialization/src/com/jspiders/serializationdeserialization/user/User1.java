package com.jspiders.serializationdeserialization.user;

import java.io.Serializable;

public class User1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 714698928019828243L;
	
	int id;
	String userName;
	String password;
	
	public User1(int id, String userName, String password) {
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
