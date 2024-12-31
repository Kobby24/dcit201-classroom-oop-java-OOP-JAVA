package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private List<RentalTransaction> rentalHistory = new ArrayList<>();

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
    public void addRentalHistory(Vehicle vehicle,int days) {
        rentalHistory.add(new RentalTransaction(vehicle,days));
    }
    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getCustomerId() {
        return customerId;
    }

}
