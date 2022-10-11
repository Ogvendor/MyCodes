package c7Funmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolStationTest {
    @Test
    void checkThatPetrolStationExists(){
        PetrolStation petrol = new PetrolStation("Herbert Macaulay",2.0,10,2.0);
        assertNotNull(true);
    }
    @Test
    void checkThatPetrolHasBeenPurchased(){
        PetrolStation petrol = new PetrolStation("Herbert Macaulay",2.0,200,10.0);
        assertEquals(180.0,petrol.getPetrolPurchase());
    }

    }


