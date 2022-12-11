package com.jspiders.pizzaBill.pizza;

public class pizzaBill {
	private double price;
	private boolean veg;
	
	private double extraCheesePrice = 100; 
	private double extraToppingsPrice = 150; 
	private double takeAwayPrice = 20;
		
	private double basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;


	public pizzaBill(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}
	
	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += takeAwayPrice;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra cheese added: "+extraCheesePrice+ "\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra toppings added: "+extraToppingsPrice+ "\n";
		}
		if(isOptedForTakeAway) {
			bill += "Take Away: "+takeAwayPrice+ "\n";
		}
		bill += "Bill: "+this.price + "\n";
		System.out.println(bill);
	}
}
