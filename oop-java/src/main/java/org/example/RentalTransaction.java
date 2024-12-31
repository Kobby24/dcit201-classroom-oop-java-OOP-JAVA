package org.example;

public class RentalTransaction {
    private final Vehicle vehicle;
    private final int rentalDays;

    public RentalTransaction(Vehicle vehicle, int rentalDays) {
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getRentalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }
}

