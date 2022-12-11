package com.jspiders.Pizza.threads;

import com.jspiders.Pizza.resource.Pizza;

public class Friends extends Thread{
	Pizza pizza;

	public Friends(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	@Override
	public void run() {
		pizza.orderPizza(50);
	}
}
