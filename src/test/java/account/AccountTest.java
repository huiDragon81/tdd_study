package account;

/**
 * Created by root on 16. 11. 21.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class AccountTest {
    @Test
    public void testAccount() {
        Account account = new Account(10000);
        assertNotNull(account);
    }

    @Test
    public void testGetBalance() {
        Account account = new Account(10000);
        assertEquals(account.getBalance(), 10000);
        account = new Account(1000);
        assertEquals(account.getBalance(), 1000);
    }

    @Test
    public void testDeposit() {
        Account account = new Account(10000);
        account.deposit(1000) ;
        assertEquals(account.getBalance(),11000);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account(10000);
        account.withdraw(1000) ;
        assertEquals(account.getBalance(),9000);
    }


}
