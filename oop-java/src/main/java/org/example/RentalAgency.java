package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> fleet = new ArrayList<>();

    public static Vehicle createVehicle(String type,String vehicleId, String model, String make, double baseRentalRate) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(vehicleId, model,make,5,6);
            case "motorcycle":
                return new Motorcycle(vehicleId, model,make,4,50);
            case "truck":
                return new Truck(vehicleId, model, make, 10,35);
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle getVehicleById(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null; // Vehicle not found
    }

}



