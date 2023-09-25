import models.City;
import utils.CityParser;

import java.text.MessageFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<City> cities = CityParser.parse();

        // поиск количества городов в разрезе регионов
        quantityOfCitiesByRegionV1(cities);
    }

    private static void quantityOfCitiesByRegionV1(List<City> cities) {
        Map<String, Integer> regions = new HashMap<>();
        cities.forEach(city -> regions.merge(city.getRegion(), 1, Integer::sum));
        regions.forEach((k, v) -> System.out.println(MessageFormat.format(" {0} = {1}", k, v)));
    }
}