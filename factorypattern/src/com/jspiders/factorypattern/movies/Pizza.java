package com.jspiders.factorypattern.movies;

import com.jspiders.factorypattern.inter.FastFood;

public class Pizza implements FastFood{

	@Override
	public void FastFood() {
		System.out.println("Ordering Pizza.");
	}
}
