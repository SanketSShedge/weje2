package com.jspiders.builderpattern.main;

import com.jspiders.builderpattern.object.Mobile;
import com.jspiders.builderpattern.object.MobileBuilder;

public class mobileMain {
	
	public static void main(String[] args) {
		Mobile mobile=new MobileBuilder().price(50000.00).model("S22").brand("Samsung").getMobile();
		System.out.println(mobile);
	}
}
