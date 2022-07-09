package core.java.advance.design;

public class Bike {

    int id;
    int price;
    BikeSpec bikeSpec;

    public Bike(int id, int price, BikeSpec bikeSpec) {
        this.id = id;
        this.price = price;
        this.bikeSpec = bikeSpec;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public BikeSpec getBikeSpec() {
        return bikeSpec;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", price=" + price +
                ", bikeSpec=" + bikeSpec +
                '}';
    }
}
