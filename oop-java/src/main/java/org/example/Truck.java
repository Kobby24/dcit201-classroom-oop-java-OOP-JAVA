package org.example;

public class Truck extends Vehicle implements Rentable {
     double maxLoad; // in tons

    public Truck(String vehicleId, String model, String make, double baseRentalRate,double maxLoad) {
        super(vehicleId, model, make, baseRentalRate);
        if (maxLoad > 0){
        this.maxLoad = maxLoad;}
    }

    public double calculateRentalCost(int days) {
        return days * super.getBaseRentalRate() + (maxLoad > 10 ? 60 : 0);
    }


    public boolean isAvailableForRental() {
        return getIsAvailable();

    }
    public double getMaxLoad() {
        return maxLoad;
    }


    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setIsAvailable(false);  // Mark as rented
            customer.addRentalHistory(this, days);
        }

    }

    @Override
    public void returnVehicle() {
        setIsAvailable(true);
    }
    public String toString(){
        return "Vehicle ID: " + getVehicleId() + "\n Model: " + getModel() +"\n Base Rate: " + getBaseRentalRate() + "\n Available: " + getIsAvailable() +"\nMax Load:" + maxLoad;
    }
}
