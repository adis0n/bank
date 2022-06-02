package com.company;

import com.company.commandPatern.BankReport;

import java.util.ArrayList;
import java.util.List;

public class AccountReport implements Report, ReportVisitor {
	List<Account> accounts;
	String content = "Accounts report:\n";
	public AccountReport(List<Account> accounts){
		this.accounts = new ArrayList<Account>();
		this.accounts=accounts;
	}

	public AccountReport() {

	}

	@Override
	public void visit(BankReport report) {
	}

	@Override
	public void visit(AccountReport report) {
		content=accounts.toString();
	}


	@Override
	public String generateReport() {
		for (Account i : accounts){
			content = content + "owner: " + i.owner + " balance:" + i.getBalance();
		}
		return content;
	}
}
