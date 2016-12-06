package The3Plus1_Problem_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16. 11. 23.
 */
public class Solution {

    private List<Pair> operations = new ArrayList<Pair>();

    public Solution() {
    }

    public void addNumberCount(Pair pair) {
        operations.add(pair);
    }

    public Pair getPair(int i) {
        return operations.get(i);
    }

    public Pair solution(int i) {
        Pair result = operations.get(i);
        result.solution();
        return result;
    }

    public static int solution(int min, int max) {
        Pair p = new Pair(min,max);
        p.solution();
        return p.getData();
    }
}
