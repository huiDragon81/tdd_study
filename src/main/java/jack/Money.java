package jack;

/**
 * Created by root on 16. 11. 16.
 */
public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }


    public static Money dollar(int amount) {
        return new Dollar(amount);
    }
    public static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract public Money times(int multiplier);
    abstract public String currency();
}
