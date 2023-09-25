import models.City;
import utils.CityParser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<City> cities = CityParser.parse();

        City[] citiesArray = cities.toArray(new City[0]);
        int maxPopulation = 0;
        int indexOfMaxPopulation = 0;
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].getPopulation() > maxPopulation) {
                maxPopulation = citiesArray[i].getPopulation();
                indexOfMaxPopulation = i;
            }
        }

        System.out.println("[" + indexOfMaxPopulation + "] = " + maxPopulation);
    }
}