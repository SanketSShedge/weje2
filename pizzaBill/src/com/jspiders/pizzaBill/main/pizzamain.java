package com.jspiders.pizzaBill.main;

import com.jspiders.pizzaBill.pizza.deluxePizzaBill;
import com.jspiders.pizzaBill.pizza.pizzaBill;

public class pizzamain {
	
	public static void main(String[] args) {
		pizzaBill basePizza = new pizzaBill(false);
		//basePizza.addExtraCheese();
		//basePizza.addExtraToppings();
		basePizza.takeAway();
		basePizza.getBill();
		
		deluxePizzaBill deluxePizza = new deluxePizzaBill(false);
		deluxePizza.takeAway();
		deluxePizza.getBill();

	}	
}
