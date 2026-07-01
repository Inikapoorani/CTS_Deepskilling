package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator cal = new Calculator();

        assertEquals(5, cal.add(2, 3));

    }
}
