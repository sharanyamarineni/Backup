package com.zemoso.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.zemoso.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("adding an account");
	}
	
	public void addAccount2(Account acc,boolean flag) {
		System.out.println("adding an account with acc class parameter");
	}
	
	public void doWork() {
		System.out.println("do some work");
	}

}
