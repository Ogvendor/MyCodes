package c7Funmi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarApplicationTest {


    @Test
    void testThatCarExist(){
            //given
            Car car1 = new Car("Lexus","2022",200.00, 5.0);
            //when
            double result = car1.calculatePurchaseAmount();
            //assert
            Assertions.assertEquals(190, result);
    }
    @Test
    void testThatThereAreDifferentCars(){
        //given
        Car car2 = new Car("Lexus","2022",200.00, 7.0);
        //when
        double result = car2.calculatePurchaseAmount();
        //assert
        Assertions.assertEquals(186, result);
    }
    




}
