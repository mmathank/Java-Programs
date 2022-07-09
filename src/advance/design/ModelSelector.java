package core.java.advance.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModelSelector {

    static List<String> models = new ArrayList<>();

    public static List<String> getAvailableModels(Company company) {

        List<String> models = new ArrayList<>();
        switch(company) {
            case YAMAHA:
                models.add("FZ-S");
                models.add("R15");
                break;
            case HERO:
                models.add("Splendor");
                models.add("Passion Pro");
            case HONDA:
                models.add("Shine");
                models.add("CBR");
            case TVS:
                models.add("Apache");
                models.add("Pulsar");
        }
        return Collections.unmodifiableList(models);
    }
}
