package com.jspider.multithreading.thread;

public class Mythread11 extends Thread{
	@Override
	public void run() {
		String msg="Java is Programming language";
		char[] charArray=msg.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}