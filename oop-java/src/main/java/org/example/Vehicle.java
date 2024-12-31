package org.example;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private final String make;
    private double baseRentalRate;
    private boolean isAvailable;
    public Vehicle(String vehicleId, String model, String make, double baseRentalRate) {
        if (vehicleId != null && !vehicleId.trim().isEmpty()) {
            this.vehicleId = vehicleId;
        }

        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        }

        if (baseRentalRate > 0) {
            this.baseRentalRate = getBaseRentalRate();
        }
        else{
            throw new IllegalArgumentException("Base rental rate must be positive.");
        }

        this.isAvailable = true;
        this.make = make;
    }



    public abstract double  calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
    public String getMake() {
        return make;
    }
    public String toString() {

        return "Vehicle ID: " + vehicleId + ", Model: " + model +
                ", Base Rate: " + baseRentalRate + ", Available: " + isAvailable;


    }
    public void rent(Customer customer, int days){

    }
    public void returnVehicle() {

    }

}

