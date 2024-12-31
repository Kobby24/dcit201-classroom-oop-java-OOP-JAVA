package org.example;

public class Motorcycle extends Vehicle implements Rentable{
    private int horsepower;;

    public Motorcycle(String vehicleId, String model, String make, double baseRentalRate, int horsepower) {
        super(vehicleId, model, make, baseRentalRate);
        if (horsepower >= 1 && horsepower <= 310) {
            this.horsepower = horsepower;
        }
    }

    public double calculateRentalCost(int days) {
        return days * super.getBaseRentalRate() + (horsepower>50 ? 10 : 0);
    }


    public boolean isAvailableForRental() {
        return getIsAvailable();
    }
    public int getHorsepower() {
        return horsepower;
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
       return "Vehicle ID: " + getVehicleId() + "\n Model: " + getModel() +"\n Base Rate: " + getBaseRentalRate() + "\n Available: " + getIsAvailable() +"\nHorse Power:" + horsepower;
    }
}
