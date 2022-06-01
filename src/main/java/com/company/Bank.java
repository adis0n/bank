package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Bank {
	UUID id;
	String name;
	String address;
	List<Account> accounts;
	List<Transaction> transactions;
	public Bank(){
		this.id = UUID.randomUUID();
		this.accounts = new ArrayList<>();
		this.transactions = new ArrayList<>();
	}

	public void createAccount(Account account){
		this.accounts.add(account);
	}
	public void deleteAccount(UUID id){
		this.accounts.removeIf(i -> i.getId().equals(id));
	}
	public void addTransaction(Transaction transaction){
		this.transactions.add(transaction);
	}
	public void sendMoney(Account sender, Account receiver, int amount) {
		sender.subtractMoney(amount);
		receiver.addMoney(amount);
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bank bank = (Bank) o;
		return id == bank.id && Objects.equals(name, bank.name) && Objects.equals(address, bank.address) && Objects.equals(accounts, bank.accounts);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, address, accounts);
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
