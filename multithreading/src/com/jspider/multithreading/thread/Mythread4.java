package com.jspider.multithreading.thread;

public class Mythread4 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello from Mythread4");	
		}
	}

}
