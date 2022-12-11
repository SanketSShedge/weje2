package com.jspiders.builderpattern.object;

public class Laptop {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int ram;
	
	public Laptop(String brand, String model, String color, double price, int ram) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Laptop[brand=" +brand+ ",model=" +model+ ",color=" +color+ ",price=" +price+ ",ram=" +ram+"]";
	}
}
