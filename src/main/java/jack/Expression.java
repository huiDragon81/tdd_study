package jack;

/**
 * Created by root on 16. 11. 21.
 */
public interface Expression {
    Money reduce(Bank bank,String to);

    Expression plus(Expression addened);

    Expression times(int multiplier);
}
