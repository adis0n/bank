package com.company;

import java.util.UUID;

public class Loan extends Product{
	double loanRepayment;
	InterestRate interestRate;
	public Loan(UUID id, Account account, String startDate, String endDate, double amount, double interest){
		super(id, account,startDate,endDate,amount,interest);
	}

	public void giveLoan(Account account){

		interestRate = new InterestRate(this.interest, this.startDate, this.endDate);
		loanRepayment = interestRate.calculateInterest(this.amount);
		account.addMoney(amount);
	}
}
