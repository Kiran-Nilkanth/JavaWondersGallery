package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.SingletonLazy;

public class SingletonLazyMain {
	public static void main(String[] args) {
		SingletonLazy singletonLazy1=SingletonLazy.getObject();
		System.out.println(singletonLazy1);
	}
	
}
