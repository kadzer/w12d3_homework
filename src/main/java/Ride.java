public abstract class Ride {
    private double price;
    private int minAge;
    private int minHeight;
    private int maxHeight;

    public Ride(double price, int minAge, int minHeight, int maxHeight) {
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
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
}
