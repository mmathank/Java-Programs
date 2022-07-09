package core.java.advance.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BikeInventory {

    static List<Bike> bikes = new ArrayList<>();

    public static void addBike(Bike bike) {
        bikes.add(bike);
    }

    public static List<Bike> getBikes() {
        return Collections.unmodifiableList(bikes);
    }
}
