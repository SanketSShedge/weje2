package com.jspiders.factorypattern.movies;

import com.jspiders.factorypattern.inter.FastFood;

public class Momos implements FastFood{

	@Override
	public void FastFood() {
		System.out.println("Ordering Momos.");
	}	
}
