package com.jspider.Godown.resource;

public class Godown {
	int noOfProduct;

	public Godown(int noOfProduct) {
		System.out.println(noOfProduct+" products available");
		this.noOfProduct = noOfProduct;
	}
	public int checkProduct() {
		return this.noOfProduct;
	}
	
	public synchronized void orderProduct(int noOfProduct) {
		System.out.println("Ordering "+ noOfProduct+" products");
		if(noOfProduct > checkProduct()) {
			try {
				System.out.println(noOfProduct+ " not available"+" please wait");
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		} 
		this.noOfProduct -= noOfProduct;
		System.out.println("Successfully delivered"+ noOfProduct+"products");
		System.out.println(checkProduct()+"products available");
	}
	public synchronized void restockProduct(int noOfProduct) {
		this.noOfProduct += noOfProduct;
		System.out.println("Supplying "+ noOfProduct+ " products");
		System.out.println(checkProduct()+ " products available");
		this.notify();
	}
}
