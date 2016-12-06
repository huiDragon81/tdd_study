package The3Plus1_Problem_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16. 12. 2.
 */
public class Pair {
    private int min;
    private int max;
    private List<List<Integer>> results = new ArrayList<>();

    public Pair(int min, int max) {
        setMin(min);
        setMax(max);
    }
    public int getMin() {
        return min;
    }

    private int validate(int i) {
        if (i > 0 && i < 1000000) {
            return i;
        }
        if (i <= 0) {
            return 1;
        }
        if (i >= 1000000) {
            return 999999;
        }
        return 0;
    }

    public void setMin(int min) {
        this.min = validate(min);
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = validate(max);
    }

    public void solution() {
        if (this.results.size() != 0) {
            return;
        }
        for (int i = min; i <= max; ++i) {
            List<Integer> l = new ArrayList<>();
            l.add(i);
            process(i,l);
        }
    }

    private void process(int num,List<Integer> l) {
        int value;
        while(true) {

            value = expression(num);
            if (value == 1) {
                l.add(value);
                break;
            }
            l.add(value);
            num = value;
        }
        this.results.add(l);
    }

    private int expression(int num) {
        if (isOdd(num)) {return num / 2;}
        else {return 3 * num + 1;}
    }

    private boolean isOdd(int num) {
        return num % 2 == 0;
    }

    public int getData() {
        int max = 0;
        for (List<Integer> l : results) {
            if(max < l.size()) {
                max = l.size();
            }
        }
        return max;
    }

}
