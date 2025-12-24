package Arrays;

import java.util.TreeMap;

public class TreemapQu {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("Norway"));
        System.out.println(capitalCities.size());

    }
}
