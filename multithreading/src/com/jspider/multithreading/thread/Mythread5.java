package com.jspider.multithreading.thread;

public class Mythread5 extends Thread{
	public void run() {
		System.out.println("Hello from MyThread5");
		System.out.println("id:"+this.getId());
		System.out.println("Name:"+this.getName());
		System.out.println("priority"+this.getPriority());

	}

}
