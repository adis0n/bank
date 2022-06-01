import com.company.Account;
import com.company.DebitAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;

class AccountTest {
	Account account;
	DebitAccount debitAccount;
	@BeforeEach
	void setUp() {
		account = new Account(UUID.randomUUID(), "tylski");
		debitAccount = new DebitAccount(UUID.randomUUID(), "maks", 40);
	}
	@Test
	void testAddMoney(){
		account.addMoney(20);
		Assertions.assertEquals(20, account.getBalance());
	}
	@Test
	void testSubtractMoney(){
		account.setBalance(30);
		account.subtractMoney(20);
		Assertions.assertEquals(10, account.getBalance());
	}
	@Test
	void testSubtractMoneyDebit(){
		debitAccount.setBalance(10);
		debitAccount.subtractMoney(30);
		Assertions.assertEquals(10, debitAccount.getBalance());
	}
	@Test
	void testSubtractMoneyDebitLimitExceeded(){
		debitAccount.setBalance(10);
		debitAccount.subtractMoney(70);
		Assertions.assertEquals(10, debitAccount.getBalance());
	}


}
