package c7Funmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarBuyingTest {
    @Test
    void testThatCarOneIsBought(){
        Carz car1 = new Carz();
        assertNotNull(car1);
    }
    @Test
    void testThatSecondCarIsBought(){
        Carz car2 = new Carz();
        assertNotNull(car2);
    }
    
}
