import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;


class LoanTest {
	@Test
	void testLoan(){
		Account account = new Account(UUID.randomUUID(), "tylski");
		Loan loan = new Loan(account.getId(), account,"31.01.2022", "31.05.2022", 6000, 6);
		account.setBalance(10);
		loan.giveLoan(account);
		Assertions.assertEquals(6010, account.getBalance());

	}
}
