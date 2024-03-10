package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.MyResource;
import com.jspider.multithreading.thread.Mythread6;
import com.jspider.multithreading.thread.Mythread7;

public class ThreadMain5 {

	public static void main(String[] args) {
		 MyResource myResource=new MyResource();
		 
		 Mythread6 mythread6 = new Mythread6(myResource);
		 Mythread7 mythread7 = new Mythread7(myResource);
		 
		 mythread6.start();
		 mythread7.start();
		 

	}

}
