package jack;

/**
 * Created by root on 16. 11. 16.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String currency() {
        return "USD";
    }
}
