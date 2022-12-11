package com.jspiders.practice.objects;

public class Car {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int tyre;
	
	public Car(String brand, String model, String color, double price, int tyre) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.tyre = tyre;
	}
	
	@Override
	public String toString() {
		return "Car[brand= " +brand+
				",model= " +model+
				",color= " +color+
				",price= " +price+
				",tyre= " +tyre+"]";
	}
}
