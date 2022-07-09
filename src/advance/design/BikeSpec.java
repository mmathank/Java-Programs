package core.java.advance.design;

import java.util.ArrayList;
import java.util.List;

public class BikeSpec {

    Company company;
    String model;
    int modelYear;

    public BikeSpec(Company company, Honda model, int modelYear) {
        this.company = company;
        this.model = model.toString();
        this.modelYear = modelYear;
    }

    public BikeSpec(Company company, Yamaha model, int modelYear) {
        this.company = company;
        this.model = model.toString();
        this.modelYear = modelYear;
    }

    public Company getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public static List<Bike> search(BikeSpec spec) {

        List<Bike> matchedBikes = new ArrayList<>();
        List<Bike> availableBikes = BikeInventory.getBikes();
        for (Bike bike : availableBikes) {
            Bike temp = bike;
            if (bike.getBikeSpec().getCompany() == spec.getCompany()) {
                if (bike.getBikeSpec().getModel().equals(spec.getModel())) {
                        matchedBikes.add(temp);
                }
            }
        }
        return matchedBikes;
    }

    @Override
    public String toString() {
        return "BikeSpec{" +
                "company=" + company +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}
