package c6.Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMethodTest {
    @Test
    void testMaximum(){
        MaxMethod max = new MaxMethod();
        assertEquals(5,max.max(5,2));
    }
}
