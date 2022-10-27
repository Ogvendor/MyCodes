package c8.Cylinde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
     void testThatCylinderHasBeenCreated(){
        Cylinder cy = new Cylinder();
        assertNotNull(true);
    }
    @Test
    void testThatCylinderVolumeHasBeenCalculated() {
        Cylinder cy = new Cylinder();
        cy.setRadius(12.0);
        cy.setHeight(10.0);
        assertEquals(3.142 * 12.0 * 12.0 * 10.0, cy.calculateVolume());
    }
    @Test
    void testThatCylinderRadiusCannotBeNegative(){
            Cylinder cy = new Cylinder();
            assertThrows(IllegalArgumentException.class, ()->  cy.setRadius(-1.0) );
        }
    @Test
    void testThatCylinderHeightCannotBeNegative() {
        Cylinder cy = new Cylinder();
        assertThrows(IllegalArgumentException.class, () -> cy.setHeight(-1.0));
    }

    }


