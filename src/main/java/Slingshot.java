public class Slingshot extends Ride{
    private int height;
    private int speed;

    public Slingshot(double price, int minAge, int minHeight, int maxHeight, int height, int speed) {
        super(price, minAge, minHeight, maxHeight);
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
