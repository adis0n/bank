package com.company.commandPatern;

import com.company.Account;

public interface Command {
	public void execute();
	public void withdrawOverflow(Account account, double amount);
}
