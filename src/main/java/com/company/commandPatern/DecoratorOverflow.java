package com.company.commandPatern;

import com.company.Account;

//decorator that actually adds something
public class DecoratorOverflow extends CommandDecorator{
	public DecoratorOverflow(Command command) {
		super(command);
	}
	@Override
	public void withdrawOverflow(Account account, double amount) {
		account.setBalance(account.getBalance()-amount);
	}
}
