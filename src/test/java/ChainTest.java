import com.company.Account;
import com.company.Bank;
import com.company.chainOfResposibility.AuthenticationProcessor;
import com.company.chainOfResposibility.BalanceCheck;
import com.company.chainOfResposibility.IdCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class ChainTest {
    @Test
    void testChain(){
        Bank bank = new Bank();
        Account account = new Account(bank.getId(), "adi");
        bank.createAccount(account);
        Account account2 = new Account(bank.getId(), "maks");
        bank.createAccount(account2);
        account2.setBalance(20);
        AuthenticationProcessor authenticationProcessor = new IdCheck();
        authenticationProcessor.linkWith(new BalanceCheck());
        boolean temp1 = authenticationProcessor.check(account.getId(),account.getBalance(),10);
        Assertions.assertEquals(false,temp1);
    }

    @Test
    void testChain2(){
        Bank bank = new Bank();
        Account account = new Account(bank.getId(), "adi");
        bank.createAccount(account);
        Account account2 = new Account(bank.getId(), "maks");
        bank.createAccount(account2);
        account2.setBalance(20);
        AuthenticationProcessor authenticationProcessor = new IdCheck();
        authenticationProcessor.linkWith(new BalanceCheck());
        boolean temp2 = authenticationProcessor.check(account2.getId(),account2.getBalance(),20);
        Assertions.assertEquals(true, temp2);
    }


}
