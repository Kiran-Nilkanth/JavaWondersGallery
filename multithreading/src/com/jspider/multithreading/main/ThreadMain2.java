package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.Mythread2;

public class ThreadMain2 {

	public static void main(String[] args) {
		Mythread2 mythread2= new Mythread2();
		Thread thread=new Thread(mythread2);
		thread.start();
		

	}

}
