package org.example;

public class Car extends Vehicle implements Rentable{
    private int sittingCapacity;

    public Car(String vehicleId, String model, String make, double baseRentalRate,int sittingCapacity) {
        super(vehicleId, model, make, baseRentalRate);
        if (sittingCapacity > 0){
        this.sittingCapacity = sittingCapacity;
        }
    }



    public int getSittingCapacity() {
        return sittingCapacity;
    }

    public double calculateRentalCost(int days) {
        // Discounts for longer rentals
        return days * super.getBaseRentalRate() + (days>7 ? 20 : 0);
    }
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }





    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setIsAvailable(false);
            customer.addRentalHistory(this,days);
        }
    }

    @Override
    public void returnVehicle() {
        setIsAvailable(true);
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + getVehicleId() + "\n Model: " + getModel() +"\n Base Rate: " + getBaseRentalRate() + "\n Available: " + getIsAvailable() +"\nSitting Capacity:" + sittingCapacity;
    }
}
