package com.jspiders.multithread.threads;

public class myThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(this.getName());
			System.out.println("MyThread1 is running....!");
		}
	}
}
