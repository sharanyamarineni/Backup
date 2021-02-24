package com.zemoso.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.dao.MembershipDAO;

public class MainDemoApp {
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO theMemberDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
//		theAccountDAO.addAccount();
//		theMemberDAO.addAccount();
//		theMemberDAO.addAcc();
		Account theAccount = new Account();
		theAccountDAO.addAccount2(theAccount,true);
		theAccountDAO.addAccount();
		theAccountDAO.doWork();
		
		theMemberDAO.addAcc();
		theMemberDAO.addAccount();

				
		// close the context
		context.close();
	}
}
