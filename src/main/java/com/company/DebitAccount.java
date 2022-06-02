package com.company;

import java.util.UUID;

//self-explaining; able to have debit
public class DebitAccount extends Account{
	int capability;
	public DebitAccount(UUID bankId, String owner) {
		super(bankId, owner);
	}
	public DebitAccount(UUID bankId, String owner, int capability) {
		super(bankId, owner);
		this.capability = capability;
	}
	public void subtractMoney(int amount){
		if (this.balance - amount >= capability){
			this.balance = this.balance - amount;
		}
	}

}
