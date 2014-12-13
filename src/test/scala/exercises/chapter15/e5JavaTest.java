package exercises.chapter15;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by michal on 12/13/14.
 */
public class e5JavaTest {
    @Test
    public void getLinesShouldReturnLinesFromFile() {
        assertEquals("test String",FileUtilityForJava.getFileLines(getClass().getResource("/chapter15/e5.txt").getPath()).trim());
    }
}
