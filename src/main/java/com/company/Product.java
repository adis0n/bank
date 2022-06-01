package com.company;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Product {
	protected UUID id;
	protected Account account;
	protected String startDate;
	protected String endDate;
	protected double amount;
	protected double interest;

	public Product(UUID id, Account account, String startDate, String endDate, double amount, double interest) {
		this.id = id;
		this.account = account;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.interest = interest;
	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return Double.compare(product.amount, amount) == 0 && Double.compare(product.interest, interest) == 0 && Objects.equals(id, product.id) && Objects.equals(account, product.account) && Objects.equals(startDate, product.startDate) && Objects.equals(endDate, product.endDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, account, startDate, endDate, amount, interest);
	}
}
