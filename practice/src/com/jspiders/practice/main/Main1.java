package com.jspiders.practice.main;

import com.jspiders.practice.objects.Car;
import com.jspiders.practice.objects.CarBuilder;

public class Main1 {
	
	public static void main(String[] args) {
		Car car = new CarBuilder().brand("TATA").model("Safari").tyre(4).getCar();
		System.out.println(car);
	}
}
