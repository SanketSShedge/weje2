package com.jspider.Godown.Main;

import com.jspider.Godown.resource.Godown;
import com.jspider.Godown.thread.Customer;
import com.jspider.Godown.thread.Supplier;

public class Main {
	public static void main(String[] args) {
		Godown godown = new Godown(100);
		Customer customer1 = new Customer(godown, 50);
		Customer customer2 = new Customer(godown, 70);
		Supplier supplier = new Supplier(godown, 50);
		customer1.start();
		customer2.start();
		supplier.start();
	}
}
