package edu.maximo.fernandez;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NotSoRandomTest {

    @Test
    public void testNotSoRandom() {
        assertEquals("Black", NotSoRandom.notSoRandom(1, 1));
        assertEquals("White", NotSoRandom.notSoRandom(2, 1));
        assertEquals("Black", NotSoRandom.notSoRandom(1, 2));
        assertEquals("White", NotSoRandom.notSoRandom(2, 2));
        assertEquals("White", NotSoRandom.notSoRandom(6, 9));
        assertEquals("White", NotSoRandom.notSoRandom(10000, 10000));
        assertEquals("Black", NotSoRandom.notSoRandom(11111, 22222));
    }
}