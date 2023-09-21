package utils;

import models.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityParser {
    public static List<City> parse() {
        List<City> cities = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/resources/cities.csv"))) {
            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(";");
                String foundation;
                if (values.length < 6) {
                    foundation = "";
                } else {
                    foundation = values[5];
                }
                cities.add(new City(Integer.parseInt(values[0]),
                        values[1],
                        values[2],
                        values[3],
                        Integer.parseInt(values[4]),
                        foundation));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return cities;
    }
}
