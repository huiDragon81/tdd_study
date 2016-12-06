package jack;

import java.util.Hashtable;

/**
 * Created by root on 16. 11. 21.
 */
public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this,to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to),new Integer(rate));
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

}
