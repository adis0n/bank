package com.company.commandPatern;

import com.company.Account;

public class SendMoneyCommand implements Command{
	private Account senderAccount;
	private Account receiverAccount;
	private double amount;

	public SendMoneyCommand(Account senderAccount, Account receiverAccount, double amount) {
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.amount = amount;
	}

	@Override
	public void execute() {
		senderAccount.subtractMoney(amount);
		receiverAccount.addMoney(amount);
	}
}
