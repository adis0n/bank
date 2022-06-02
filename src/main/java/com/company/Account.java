package com.company;
import com.company.commandPatern.BankReport;

import java.util.UUID;


public class Account extends AccountReport {
	UUID bankId;
	UUID id;
	long dateOfOpening;
	String owner;
	double balance;

	//for visitor
	public void accept(ReportVisitor visitor){
		visitor.visit(this);
	}


	public UUID getBankId() {
		return bankId;
	}

	public void setBankId(UUID bankId) {
		this.bankId = bankId;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public long getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(long dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(UUID bankId, String owner){
		super();
		this.bankId = bankId;
		this.id = UUID.randomUUID();
		this.dateOfOpening = System.currentTimeMillis();
		this.owner = owner;
		this.balance = 0;
	}
	public void addMoney(double amount){
		this.balance = balance + amount;
	}
	public void subtractMoney(double amount){
		if (this.balance >= amount){
			this.balance = this.balance - amount;
		}
	}
	public void deposit(Account account, int amount){
		Deposit.depositMoney(account,amount);
	}


}
