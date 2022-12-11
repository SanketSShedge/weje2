package com.jspiders.multithread.main;

import com.jspiders.multithread.threads.myThread1;
import com.jspiders.multithread.threads.myThread2;

public class myThreadmain {
	public static void main(String[] args) {
		myThread1 myThread = new myThread1();
		myThread.setName("Thread 1");
		myThread.start();
		
		myThread2 myThread1 = new myThread2();
		Thread thread = new Thread(myThread1);
		thread.setName("Thread 2");
		thread.start();
	}
}
