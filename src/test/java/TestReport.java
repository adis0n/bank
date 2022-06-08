import com.company.Account;
import com.company.AccountReport;
import com.company.ReportVisitor;
import com.company.commandPatern.BankReport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class TestReport {
	@Test
	void testReport(){
		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account(UUID.randomUUID(), "tylski");
		account.setBalance(911);
		accounts.add(account);
		AccountReport visitor = new AccountReport(accounts);
		account.accept(visitor);
		Assertions.assertEquals("Accounts report:\nowner: tylski balance:911.0", visitor.generateReport());

	}
}
