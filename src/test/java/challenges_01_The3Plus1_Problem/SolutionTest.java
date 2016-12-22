package challenges_01_The3Plus1_Problem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void testPringInputData() {
        assertEquals(new Pair(1,10).solution(),20);
        assertEquals(new Pair(100,200).solution(),125);
        assertEquals(new Pair(201,210).solution(),89);
    }

}