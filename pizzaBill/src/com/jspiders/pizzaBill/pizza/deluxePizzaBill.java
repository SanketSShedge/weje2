package com.jspiders.pizzaBill.pizza;

public class deluxePizzaBill extends pizzaBill{

	public deluxePizzaBill(boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}
	
	@Override
	public void addExtraCheese() {

	}
	
	@Override
	public void addExtraToppings() {

	}
}
