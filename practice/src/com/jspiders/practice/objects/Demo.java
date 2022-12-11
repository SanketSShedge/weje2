package com.jspiders.practice.objects;

public class Demo {
	
	static Demo demo = new Demo();
	static int objectCount;
	
	private Demo() {
		objectCount++;
	}
	
	public static Demo getObject() {
		System.out.println("Object created " +objectCount+ " times.");
		return demo;
	}
}
