package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.MyResource1;

public class Mythread8 extends Thread {

	private MyResource1 myResource1;

	public Mythread8(MyResource1 myResource1) {
		this.myResource1 = myResource1;
	}

	@Override
	public void run() {
		myResource1.resource();
	}

}