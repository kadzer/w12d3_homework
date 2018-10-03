public class StarFlyer extends Ride {
    private int height;
    private int rotationalSpeed;
    private int verticalSpeed;

    public StarFlyer(double price, int minAge, int minHeight, int maxHeight, int height, int rotationalSpeed, int verticalSpeed) {
        super(price, minAge, minHeight, maxHeight);
        this.height = height;
        this.rotationalSpeed = rotationalSpeed;
        this.verticalSpeed = verticalSpeed;
    }

    public int getHeight() {
        return height;
    }

    public int getRotationalSpeed() {
        return rotationalSpeed;
    }

    public int getVerticalSpeed() {
        return verticalSpeed;
    }
}
