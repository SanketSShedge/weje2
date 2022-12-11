package com.jspider.Godown.thread;

import com.jspider.Godown.resource.Godown;

public class Customer extends Thread {
	Godown godown;
	int products;

	public Customer(Godown godown, int products) {
		super();
		this.godown = godown;
		this.products = products;
	}

	@Override
	public void run() {
		godown.orderProduct(products);
	}
}
