package com.jspiders.multithread.threads;

public class myThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println("MyThread2 is running....!");
		}
	}
}
