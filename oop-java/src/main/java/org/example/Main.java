package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a rental agency
        RentalAgency agency = new RentalAgency();

        // Create and add vehicles to the agency's fleet
        Vehicle car1 = RentalAgency.createVehicle("car", "V001", "Camry", "Toyota",4.5);
        Vehicle bike1 = RentalAgency.createVehicle("motorcycle", "M001", "X50", "BMW",3.5);
        Vehicle truck1 = RentalAgency.createVehicle("truck", "T001", " F-150", "Ford",5.8);
        agency.addVehicle(car1);
        agency.addVehicle(bike1);
        agency.addVehicle(truck1);

        // Create a customer
        Customer customer1 = new Customer(3,"John Doe");

        // Rent vehicles
        car1.rent(customer1, 5);  // Rent car for 5 days
        bike1.rent(customer1, 3);  // Rent motorcycle for 3 days

        // Print rental history and costs
        System.out.println("Rental History for " + customer1.getCustomerName() + ":");
        for (RentalTransaction transaction : customer1.getRentalHistory()) {
            System.out.println("Vehicle: " + transaction.getVehicle().getModel() +
                    ", Days: " + transaction.getRentalDays() +
                    ", Cost: $" + transaction.getRentalCost());
        }

        // Return vehicles
        car1.returnVehicle();
        bike1.returnVehicle();




    }

}