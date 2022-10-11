package c5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairTaxTest {

    FairTax fairTax;

    @BeforeEach
    void setUp(){
        fairTax = new FairTax();
    }

    @Test
    void testThatFairTaxCanBeCalculated(){
        //given
        Product product = new Product("G-Strings",100.00);
        //when
        double tax = fairTax.calculateTax(product.getPrice());
        //check
        assertEquals(23,fairTax.calculateTax(product.getPrice()));
    }
    @Test
    void testThatProductsTotalPricecCanBeCalculated(){
        //given
       fairTax.setTotalPrice(50.00);
        //when
        double totalPrice = fairTax.calculateToTalPrice(30.00);
        //check
        assertEquals(80.00,totalPrice);
    }
}
