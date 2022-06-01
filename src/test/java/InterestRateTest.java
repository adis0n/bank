import com.company.Account;
import com.company.Bank;
import com.company.InterestRate;
import com.company.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
class InterestRateTest {
	@Test
	void calculateTimeTest(){
		InterestRate interestRate = new InterestRate(5, "31.01.2022", "31.04.2022");
		int months = interestRate.calculateTime();
		Assertions.assertEquals(3, months);
	}
	@Test
	void calculateAmountTest(){
		InterestRate interestRate = new InterestRate(5, "31.01.2022", "31.04.2022");
		double result = interestRate.calculateInterest(1000);
		Assertions.assertEquals(1157.6250000000002, result);
	}
}
