import com.company.Account;
import com.company.Bank;
import com.company.commandPatern.AddMoneyCommand;
import com.company.commandPatern.Command;
import com.company.commandPatern.SendMoneyCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddMoneyCommandTest {
	@Test
	void testSendMoneyCommand(){
		Bank bank = new Bank();
		Account account = new Account(bank.getId(), "tylski");
		account.setBalance(130);
		Command command = new AddMoneyCommand(account,40);
		command.execute();
		Assertions.assertEquals(170, account.getBalance());
	}
}
