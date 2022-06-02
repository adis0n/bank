package com.company.commandPatern;

import com.company.Account;


//just for test
public class BasicCommand implements Command{
	@Override
	public void execute() {

	}

	@Override
	public void withdrawOverflow(Account account, double amount) {
		System.out.println("i wont be used anyway");
	}

}
