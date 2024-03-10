package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.MyResource1;
import com.jspider.multithreading.thread.Mythread8;
import com.jspider.multithreading.thread.Mythread9;

public class ThreadMain6 {

	public static void main(String[] args) {

		MyResource1 myResource1 = new MyResource1();

		Mythread8 myThread8 = new Mythread8(myResource1);
		myThread8.setName("MyThread8");

		Mythread9 myThread9 = new Mythread9(myResource1);
		myThread9.setName("MyThread9");

		myThread8.start();
		myThread9.start();
	}
}
