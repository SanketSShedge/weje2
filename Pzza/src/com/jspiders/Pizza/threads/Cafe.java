package com.jspiders.Pizza.threads;

import com.jspiders.Pizza.resource.Pizza;

public class Cafe extends Thread{
	Pizza pizza;

	public Cafe(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	@Override
	public void run() {
		pizza.bakePizza(30);
	}
}
