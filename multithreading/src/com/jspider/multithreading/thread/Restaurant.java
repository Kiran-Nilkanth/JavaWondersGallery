package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.Food;

public class Restaurant extends Thread {
	private Food food;
	
	public Restaurant(Food food) {
		this.food=food;
		
	}
	@Override
	public void run() {
		food.prepare();
	}

}
