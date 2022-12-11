package com.jspiders.practice.objects;

public class CarBuilder {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int tyre;
	
	public CarBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public CarBuilder model(String model) {
		this.model = model;
		return this;
	}
	
	public CarBuilder color(String color) {
		this.color = color;
		return this;
	}
	
	public CarBuilder price(double price) {
		this.price = price;
		return this;
	}
	
	public CarBuilder tyre(int tyre) {
		this.tyre = tyre;
		return this;
	}
	
	public Car getCar() {
		Car car = new Car(this.brand, this.model, this.color, this.price, this.tyre);
		return car;
	}
}
