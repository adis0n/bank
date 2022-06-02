package com.company.commandPatern;

import com.company.Account;

//commander class; overflow used for decorator
public interface Command {
	public void execute();
	public void withdrawOverflow(Account account, double amount);
}
