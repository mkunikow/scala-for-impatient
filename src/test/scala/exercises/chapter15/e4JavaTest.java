package exercises.chapter15;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by michal on 12/13/14.
 */


public class e4JavaTest {
    @Test
    public void javaSumShouldCalculateSumOfIntArguments() {
        assertEquals(15, new SumForJava().sum(1, 2, 3, 4, 5));
    }
}
