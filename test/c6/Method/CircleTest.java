package c6.Method;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CircleTest {
    @Test
    void testCircleArea(){

        assertNotNull(Circle.circleArea(12));
    }
}
