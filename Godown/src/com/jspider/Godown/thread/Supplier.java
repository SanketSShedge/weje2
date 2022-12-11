package com.jspider.Godown.thread;

import com.jspider.Godown.resource.Godown;

public class Supplier extends Thread {
	Godown godown;
	int products;
	
	public Supplier(Godown godown, int products) {
		super();
		this.godown = godown;
		this.products = products;
	}

	@Override
	public void run() {
		godown.restockProduct(products);
	}
}

