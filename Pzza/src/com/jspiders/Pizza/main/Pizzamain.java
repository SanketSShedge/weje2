package com.jspiders.Pizza.main;

import com.jspiders.Pizza.resource.Pizza;
import com.jspiders.Pizza.threads.Cafe;
import com.jspiders.Pizza.threads.Friends;

public class Pizzamain {
	public static void main(String[] args) {
		Pizza pizza = new Pizza(50);
		Friends friends = new Friends(pizza);
		Cafe cafe = new Cafe(pizza);
		friends.start();
		cafe.start();
	}
}