package com.jspiders.builderpattern.main;

import com.jspiders.builderpattern.object.Laptop;
import com.jspiders.builderpattern.object.LaptopBuilder;

public class laptopMain {
	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().brand("DELL").price(60000.00).getLaptop();
		System.out.println(laptop);
	}
}
