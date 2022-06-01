package com.company.commandPatern;

import com.company.Account;

public class AddMoneyCommand implements Command{
	private Account account;
	private double amount;

	public AddMoneyCommand(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void execute() {
		account.addMoney(amount);
	}
}
