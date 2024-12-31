package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    @Test
    void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("V001", "Camry", "Toyota", 4.5,5);
        agency.addVehicle(car);
        assertEquals(agency.getVehicleById("V001"), car);
    }

    @Test
    void testCreateVehicle() {
        Vehicle car = RentalAgency.createVehicle("car", "V001", "Camry", "Toyota", 4.5);
        assertNotNull(car);
        assertEquals("Camry", car.getModel());
    }
}
