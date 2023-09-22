import models.City;
import utils.CityParser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<City> cities = CityParser.parse();
        Collections.sort(cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(cities);
    }
}