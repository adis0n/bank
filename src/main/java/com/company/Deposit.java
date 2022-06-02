package com.company;

import java.util.UUID;

//depositing money
public class Deposit extends Product {
	public Deposit(UUID id, Account account, String startDate, String endDate, double amount, double interest) {
		super(id, account, startDate, endDate, amount, interest);
	}

	public static void depositMoney(Account account, double amount){
		account.setBalance(account.getBalance()+amount);
	}

}
