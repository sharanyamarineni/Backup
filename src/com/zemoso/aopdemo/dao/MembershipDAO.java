package com.zemoso.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println("adding an memebership account");
	}
	public boolean addAcc() {
		System.out.println("adding an memebership acc");
		return true;
	}
}
