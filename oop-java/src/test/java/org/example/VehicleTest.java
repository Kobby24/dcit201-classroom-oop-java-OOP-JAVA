package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testVehicleConstructor() {
        Vehicle car = new Car("001", "Camry", "Toyota", 4.5,5);
        assertEquals("V001", car.getVehicleId());
        assertEquals("Camry", car.getModel());
        assertEquals("Toyota", car.getMake());
        assertEquals(4.5, car.getBaseRentalRate());
        assertTrue(car.getIsAvailable());
    }

    @Test
    void testSetBaseRentalRate() {
        Vehicle car = new Car("V001", "Camry", "Toyota", 4.5,5);
        car.setBaseRentalRate(5.0);
        assertEquals(5.0, car.getBaseRentalRate());
        assertThrows(IllegalArgumentException.class, () -> car.setBaseRentalRate(-10));
    }

    @Test
    void testToString() {
        Vehicle car = new Car("V001", "Camry", "Toyota", 4.5,5);
        String expected = "Vehicle ID: V001\n Model: Camry\n Base Rate: 4.5\n Available: true\nSitting Capacity: 5";
        assertEquals(expected, car.toString());
    }

    @Test
    void testRentalAvailability() {
        Vehicle car = new Car("V001", "Camry", "Toyota", 4.5,5);
        assertTrue(car.getIsAvailable());
        car.setIsAvailable(false);
        assertFalse(car.getIsAvailable());
    }
}
