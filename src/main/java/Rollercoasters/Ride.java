package Rollercoasters;

import Customers.Customer;

import java.util.ArrayList;

public abstract class Ride {
    private String name;
    private double price;
    private int minAge;
    private int minHeight;
    private int maxHeight;
    private ArrayList<Customer> passengers;

    public Ride(String name, double price, int minAge, int minHeight, int maxHeight) {
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.passengers = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
// common methods
    public boolean canRideHeightCheck(Customer customer){
        int height = customer.getHeight();
        return height >= this.minHeight && height <= this.maxHeight;
    }

    public void admit(Customer customer1){

    };
}
