package The3Plus1_Problem_01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by root on 16. 11. 23.
 */
public class SolutionTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInputPair() {
        Solution solution = new Solution();
        solution.addNumberCount(new Pair(1,1));
        assertEquals(1, solution.getPair(0).getMin());
        assertEquals(1, solution.getPair(0).getMax());
    }

    @Test
    public void testInputValidation() {
        Solution solution = new Solution();
        solution.addNumberCount(new Pair(1,1));
        assertTrue(solution.getPair(0).getMax() > 0);
        assertEquals(solution.getPair(0).getMax() ,1);
        solution = new Solution();
        solution.addNumberCount(new Pair(100000,1000000));
        assertTrue(solution.getPair(0).getMax() < 1000000);
        assertEquals(solution.getPair(0).getMax() ,999999);
    }

    @Test
    public void testPringInputData() {
        assertEquals(Solution.solution(1,10),20);
        assertEquals(Solution.solution(100,200),125);
        assertEquals(Solution.solution(201,210),89);
    }

}