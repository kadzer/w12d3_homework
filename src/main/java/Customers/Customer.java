package Customers;

public class Customer {
    private String name;
    private int age;
    private int height;
    private double money;

    public Customer(String name, int age, int height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
    public void payForRide(double money){
        this.money -= money;
    }
}
