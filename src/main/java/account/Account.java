package account;

/**
 * Created by root on 16. 11. 21.
 */
public class Account {

    private int balance;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }
    public void withdraw(int money) {
        this.balance -= money;
    }
}
