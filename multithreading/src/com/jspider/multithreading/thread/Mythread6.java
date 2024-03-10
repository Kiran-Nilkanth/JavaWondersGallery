package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.MyResource;

public class Mythread6  extends Thread {
	private MyResource myResource;
	
	public Mythread6(MyResource myResource) {
		this.myResource=myResource;
		
	}
	public void run() {
		synchronized (myResource.resource1) {
			System.out.println("lock is applied on Resource1 by Thread6");
			synchronized (myResource.resource2) {
				System.out.println("lock is applied on Resource2 by Thread7");
			
		}

	}
	}

}