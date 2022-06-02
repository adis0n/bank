package com.company.commandPatern;

import com.company.Account;
//commander pattern
public class AddMoneyCommand implements Command{
	private Account account;
	private double amount;

	public AddMoneyCommand(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	//commander-managed method
	@Override
	public void execute() {
		account.addMoney(amount);
	}


	//used for decorator; useless here
	@Override
	public void withdrawOverflow(Account account, double amount) {

	}
}
