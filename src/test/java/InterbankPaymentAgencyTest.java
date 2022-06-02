import com.company.Account;
import com.company.Bank;
import com.company.InterbankPaymentAgency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InterbankPaymentAgencyTest {
	@Test
	void testInterbankTransfer(){
		InterbankPaymentAgency interbankPaymentAgency = new InterbankPaymentAgency();
		Bank bankSender = new Bank();
		Bank bankReceiver = new Bank();
		interbankPaymentAgency.addBank(bankSender);
		interbankPaymentAgency.addBank(bankReceiver);
		Account accountSender = new Account(bankSender.getId(), "adi");
		accountSender.setBalance(100);
		Account accountReceiver = new Account(bankReceiver.getId(), "tylski");
		accountReceiver.setBalance(100);
		interbankPaymentAgency.interbankTransfer(bankSender,bankReceiver,accountSender,accountReceiver,60);
		Assertions.assertEquals(160, accountReceiver.getBalance());
		Assertions.assertEquals(40, accountSender.getBalance());

	}
}
