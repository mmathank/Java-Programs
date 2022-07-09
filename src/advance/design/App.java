package core.java.advance.design;

import java.util.List;

public class App {

    public static void main(String[] args) {

        BikeSpec spec1 = new BikeSpec(Company.YAMAHA,Yamaha.FZS,2021);
        BikeSpec spec2 = new BikeSpec(Company.YAMAHA,Yamaha.R15,2021);
        BikeSpec spec3 = new BikeSpec(Company.YAMAHA,Yamaha.R15,2020);
        Bike fzs = new Bike(01,80000,spec1);
        Bike r15 = new Bike(02,100000,spec2);
        Bike r15_2 = new Bike(03,95000,spec3);

        BikeSpec spec4 = new BikeSpec(Company.HONDA,Honda.SHINE,2021);
        BikeSpec spec5 = new BikeSpec(Company.HONDA,Honda.CBR,2021);
        Bike shine = new Bike(04,75000,spec4);
        Bike cbr = new Bike(05,125000,spec5);

        BikeInventory.addBike(fzs);
        BikeInventory.addBike(r15);
        BikeInventory.addBike(r15_2);
        BikeInventory.addBike(shine);
        BikeInventory.addBike(cbr);

        List<Bike> availableBikes = BikeInventory.getBikes();
        availableBikes.forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        BikeSpec enquiry = new BikeSpec(Company.HONDA, Honda.CBR, 2021);
        List<Bike> found = BikeSpec.search(enquiry);
        if (found.size() != 0) {
            found.forEach(System.out::println);
        } else {
            System.out.println("Bike is not available");
        }


    }
}
