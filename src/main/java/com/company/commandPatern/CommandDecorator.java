package com.company.commandPatern;

import com.company.Account;

//main decorator
public class CommandDecorator implements Command{
	protected Command command;
	public CommandDecorator(Command command){
		this.command = command;
	}
	@Override
	public void execute() {

	}

	@Override
	public void withdrawOverflow(Account account, double amount) {
		System.out.println("i wont be used anyway");
	}
}
