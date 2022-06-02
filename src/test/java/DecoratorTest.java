import com.company.Account;
import com.company.Bank;
import com.company.commandPatern.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoratorTest {
	@Test
	void testSendMoneyCommand(){
		Bank bank = new Bank();
		Account account = new Account(bank.getId(), "tylski");
		account.setBalance(130);
		Command command = new DecoratorOverflow(new BasicCommand());
		command.withdrawOverflow(account,170);
		Assertions.assertEquals(-40, account.getBalance());
	}
}
