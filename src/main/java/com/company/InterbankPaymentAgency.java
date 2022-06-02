package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//mediator class
public class InterbankPaymentAgency {
	public InterbankPaymentAgency(){
		this.banks = new ArrayList<>();
	};
	private List<Bank> banks;
	public List<Bank> getBanks() {
		return banks;
	}
	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}
	public void addBank(Bank bank){
		this.banks.add(bank);
	}
	public void interbankTransfer(Bank bSender, Bank bReceiver, Account sender, Account receiver, double amount){
		bSender.subtractBalanceInterbank(sender, 60);
		bReceiver.addBalanceInterbank(receiver, 60);
	}

}
