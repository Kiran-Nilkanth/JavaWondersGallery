package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.Mythread1;

public class ThreadMain1 {
public static void main(String args[]) {
	Mythread1 mythread =new Mythread1();
			mythread.start();
}
}