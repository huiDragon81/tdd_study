package jack;

/**
 * Created by root on 16. 11. 21.
 */
public class Sum implements Expression {
    Expression augend;
    Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank,String to) {
        int amount = augend.reduce(bank,to).amount + addend.reduce(bank,to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addened) {
        return new Sum(this,addened);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier),addend.times(multiplier));
    }
}
