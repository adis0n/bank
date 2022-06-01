import com.company.*;
import com.company.commandPatern.Command;
import com.company.commandPatern.SendMoneyCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class SendMoneyCommandTest {
	@Test
	void testSendMoneyCommand(){
		Bank bank = new Bank();
		Account accountSender = new Account(bank.getId(), "adi");
		Account accountReceiver = new Account(bank.getId(), "tylski");
		accountSender.setBalance(130);
		accountReceiver.setBalance(70);
		Command command = new SendMoneyCommand(accountSender,accountReceiver,40);
		command.execute();
		Assertions.assertEquals(90, accountSender.getBalance());
		Assertions.assertEquals(110, accountReceiver.getBalance());
	}
}
