package c7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirLineReservationTest {

    AirlineReservation airline;
    @BeforeEach
    void setup(){
        airline = new AirlineReservation();
    }
    @Test
    void testThatAirlineExist() {
        assertTrue(true);
    }



}
