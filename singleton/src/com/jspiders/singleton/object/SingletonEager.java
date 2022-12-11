package com.jspiders.singleton.object;

public class SingletonEager {
	static SingletonEager singletonEager = new SingletonEager();
	static int objectCount;
	
	private SingletonEager() {
		objectCount++;
	}
	public static SingletonEager getObject() {
		System.out.println("Object created "+objectCount+ " times.");
		return singletonEager;
	}
}
