package com.company;

import com.company.commandPatern.BankReport;

import java.util.ArrayList;
import java.util.List;

public class AccountReport implements Report, ReportVisitor {
	List<Account> accounts;
	String content;
	public AccountReport(List<Account> accounts){
		accounts = new ArrayList<Account>();
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
		return content;
	}
}
