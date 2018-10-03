package Rollercoasters;

public class Rollercoaster extends Ride {
    private int height;
    private int speed;

    public Rollercoaster(String name, double price, int minAge, int minHeight, int maxHeight, int height, int speed) {
        super(name, price, minAge, minHeight, maxHeight);
        this.height = height;
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }
}
