package com.jspider.multithreading.thread;

public class Mythread3 extends Thread {
	public void run() {
		for(int i=1; i<=5;i++)
		{
			System.out.println("hellow from Mythread3");
		}
	}

}