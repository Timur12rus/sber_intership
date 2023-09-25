import models.City;
import utils.CityParser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<City> cities = CityParser.parse();

//      сортируем по названию города по убыванию в алфавитном порядке (реализация Comparator)
        Collections.sort(cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(cities);

//      сортируем по названию города по убыванию в алфавитном порядке (реализация Lambda)
        cities.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println(cities);

//      сортируем по двум полям справочника – федеральному округу и наименованию города:
        Collections.sort(cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                int cmp1 = o1.getDistrict().compareTo(o2.getDistrict());
                if (cmp1 == 0) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return cmp1;
                }
            }
        });
        System.out.println(cities);

//      сортируем по двум полям справочника – федеральному округу и наименованию города(реализация Lambda):
        cities.sort((o1, o2) ->
        {
            int cmp1 = o1.getDistrict().compareTo(o2.getDistrict());
            if (cmp1 == 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return cmp1;
            }
        });
        System.out.println(cities);
    }
}