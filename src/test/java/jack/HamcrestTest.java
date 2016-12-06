package jack;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by root on 16. 11. 21.
 */
public class HamcrestTest {
    @Test
    public void testArray() {
        assertThat("Start Date compare", "2010/02/03", is("2010/02/04"));
    }
}
