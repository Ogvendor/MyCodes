package c6.Method;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class LeapYearTest {
    @Test
    void testLeapYear(){

        assertTrue( LeapYear.isLeapYear(2004));
    }
}
