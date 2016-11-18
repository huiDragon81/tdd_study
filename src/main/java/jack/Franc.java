package jack;

/**
 * Created by root on 16. 11. 16.
 */
public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return "CHF";
    }
}
