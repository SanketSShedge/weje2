package com.jspiders.builderpattern.object;

public class LaptopBuilder {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int ram;
	
	public LaptopBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	
	public LaptopBuilder model(String model) {
		this.model=model;
		return this;
	}
	
	public LaptopBuilder color(String color) {
		this.color=color;
		return this;
	}
	
	public LaptopBuilder price(double price) {
		this.price=price;
		return this;
	}
	
	public LaptopBuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	
	public Laptop getLaptop() {
		Laptop laptop=new Laptop(this.brand, this.model, this.color, this.price, this.ram);
		return laptop;
	}
}
