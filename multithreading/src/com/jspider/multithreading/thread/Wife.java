package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.Account;

public class Wife extends Thread{
	private Account account;
	
	public Wife(Account account) {
		this.account=account;
	}
	public void run() {
		account.deposit(2000);
		account.withdraw(5000);

	}

}
