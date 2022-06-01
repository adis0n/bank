import com.company.Account;
import com.company.Bank;
import com.company.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BankTest {
	@Test
	void testCreateAccount() {
		Bank bank = new Bank();
		Account account = new Account(bank.getId(), "adi");
		bank.createAccount(account);
		Assertions.assertEquals(account, bank.getAccounts().get(0));
	}
	@Test
	void testDeleteAccount() {
		Bank bank = new Bank();
		Account account = new Account(bank.getId(), "adi2");
		bank.createAccount(account);
		bank.deleteAccount(account.getId());
		Assertions.assertEquals(0, bank.getAccounts().size());
	}
	@Test
	void testTransactionHistory() {
		Bank bank = new Bank();
		Transaction transaction = new Transaction(1, "loan", "31.01.2022", "test loan");
		bank.addTransaction(transaction);
		Assertions.assertEquals(transaction, bank.getTransactions().get(0));
	}
	@Test
	void testTransfer(){
		Bank bank = new Bank();
		Account accountSender = new Account(bank.getId(), "adi");
		Account accountReceiver = new Account(bank.getId(), "tylski");
		accountSender.setBalance(130);
		accountReceiver.setBalance(70);
		bank.sendMoney(accountSender,accountReceiver,50);
		Assertions.assertEquals(80, accountSender.getBalance());
		Assertions.assertEquals(120, accountReceiver.getBalance());
	}
	@Test
	void testDeposit() {
		Bank bank = new Bank();
		Account account = new Account(bank.getId(), "adi");
		bank.createAccount(account);
		account.deposit(account,50);
		Assertions.assertEquals(50, bank.getAccounts().get(0).getBalance());
	}
}