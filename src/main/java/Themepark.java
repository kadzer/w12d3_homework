import rides.Ride;

import java.util.ArrayList;

public class Themepark {
    private String name;
    private ArrayList<Ride> rides;

    public Themepark(String name) {
        this.name = name;
        this.rides = new ArrayList<>();
    }
}
