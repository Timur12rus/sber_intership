import models.City;
import utils.CityParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<City> cities = CityParser.parse();
        System.out.println(cities);
    }
}