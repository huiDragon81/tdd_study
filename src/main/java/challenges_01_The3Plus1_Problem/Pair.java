package challenges_01_The3Plus1_Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16. 12. 2.
 */
public class Pair {
    private int min;
    private int max;

    public Pair(int min, int max) {
        setMin(min);
        setMax(max);
    }

    private int validate(int i) {
        if (i > 0 && i < 1000000) {return i;}
        if (i <= 0) {return 1;}
        if (i >= 1000000) {return 999999;}
        return 0;
    }

    public void setMin(int min) {
        this.min = validate(min);
    }
    public void setMax(int max) {
        this.max = validate(max);
    }

    public int solution() {
        int maxLength = 0;
        for (int i = min; i <= max; ++i) {
            List<Integer> l = new ArrayList<>();
            l.add(i);
            process(i,l);
            if(maxLength < l.size()) {
                maxLength = l.size();
            }
        }
        return maxLength;
    }

    private void process(int num,List<Integer> l) {
        int value;
        while(true) {
            value = expression(num);
            if (value == 1) {
                l.add(value);break;
            }
            l.add(value);
            num = value;
        }
    }

    private int expression(int num) {
        if (isOdd(num)) {return num / 2;}
        else {return 3 * num + 1;}
    }

    private boolean isOdd(int num) {
        return num % 2 == 0;
    }

}
