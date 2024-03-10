package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.Mythread5;

public class ThreadMain4 {

	public static void main(String[] args) {
		Mythread5 mythread5=new Mythread5();
		mythread5.setName("Mythread5");
		mythread5.getPriority();
		mythread5.start();

	}

}