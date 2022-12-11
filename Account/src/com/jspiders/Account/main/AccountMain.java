package com.jspiders.Account.main;

import com.jspiders.Account.resource.Account;
import com.jspiders.Account.threads.Husband;
import com.jspiders.Account.threads.Wife;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account(5000);
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		husband.start();
		wife.start();
	}
}
