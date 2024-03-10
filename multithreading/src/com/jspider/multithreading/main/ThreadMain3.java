package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.Mythread3;
import com.jspider.multithreading.thread.Mythread4;

public class ThreadMain3 {

	public static void main(String[] args) {
		Mythread3 mythread3=new Mythread3();
		Mythread4 mythread4=new Mythread4();
		mythread3.start();
		mythread4.start();

	}

}
